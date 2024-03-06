package br.ufs.dcomp.ChatRabbitMQ;

import com.rabbitmq.client.*;
import java.io.*;
import java.nio.file.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import com.google.protobuf.ByteString;


public class Chat {
    private static final String EXCHANGE_NAME = "direct_logs";
    private static Channel channel;
    private static Channel channelArq;
    private static String currentUser;
    private static String targetUser = "";
    private static String targetGroup = "";
    public static void main(String[] argv) throws Exception {
        // Configuração inicial
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("172.31.79.74");
        factory.setUsername("admin");
        factory.setPassword("password");
        Connection connection = factory.newConnection();
        channel = connection.createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);
        channelArq = connection.createChannel();
        channelArq.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);
        
        // Captura do nome de usuário
        System.out.print("User: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        currentUser = reader.readLine();
        
        
        String queueName = channel.queueDeclare(currentUser, false, false, false, null).getQueue();
        channel.queueBind(queueName, EXCHANGE_NAME, currentUser);
        channelArq.queueBind(queueName, EXCHANGE_NAME, currentUser);

        Consumer consumer = new DefaultConsumer(channel) {
        public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                
                MensagemProto.Mensagem mensagemBody = MensagemProto.Mensagem.parseFrom(body);
                
                String emissor = mensagemBody.getEmissor();
                String data = mensagemBody.getData();
                String grupo = mensagemBody.getGrupo();
                String mensagem = mensagemBody.getMensagem();
                printReceivedMessage(emissor, mensagem, data, grupo);
            }
        };
        channel.basicConsume(queueName, true, consumer);
        
        Consumer consumerArq = new DefaultConsumer(channelArq) {
        public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                MensagemProto.Mensagem mensagemBody = MensagemProto.Mensagem.parseFrom(body);
                
                String emissor = mensagemBody.getEmissor();
                String data = mensagemBody.getData();
                String grupo = mensagemBody.getGrupo();
                String mensagem = mensagemBody.getMensagem();
                String nomeArquivo = mensagemBody.getNomeArquivo();
                byte[] conteudoArquivo = mensagemBody.getConteudoArquivo().toByteArray();
                String tipoMime = mensagemBody.getTipoMime();
                if (!nomeArquivo.isEmpty()) {
                    saveFile(conteudoArquivo, nomeArquivo);
                    printReceivedArq(emissor, nomeArquivo, data, grupo);
                }
            }
        };
        channelArq.basicConsume(queueName, true, consumerArq);
        
        
        while (true) {
            String input = targetUser.isEmpty() ? ">> " : "@" + targetUser + ">> ";
            input = targetGroup.isEmpty() ? input : "#" + targetGroup + ">> ";
            System.out.print(input);
            String message = reader.readLine();

            // Verifica se é um comando para mudar o destinatário, criar grupo, adicionar ou remover usuário
            if (message.startsWith("@")) {
                targetUser = message.substring(1);
                targetGroup = ""; // Limpa o grupo ao enviar DMs
            } else if (message.startsWith("!addGroup ")) {
                String groupName = message.substring(10);
                createGroup(groupName);
            } else if (message.startsWith("!addUser ")) {
                String[] parts = message.split(" ");
                addUserToGroup(parts[1], parts[2]);
            } else if (message.startsWith("!delFromGroup ")) {
                String[] parts = message.split(" ");
                removeUserGroup(parts[1], parts[2]);
            } else if (message.startsWith("!removeGroup ")) {
                String[] parts = message.split(" ");
                removeGroup(parts[1]);
            } else if (message.startsWith("!upload ")) {
                String[] parts = message.split(" ");
                new Thread(() -> {
                    try {
                        uploadFile(parts[1]);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }).start();
                System.out.println("Enviando " + parts[1] + " para " + (targetUser.isEmpty() ? "#" + targetGroup : "@" + targetUser));
            } else if (message.startsWith("#")) {
                targetGroup = message.substring(1);
                targetUser = ""; // Limpa o usuário ao enviar para o grupo
            } else {
                sendMessage(message);
            }
        }
    }
    
    private static void saveFile(byte[] file, String nomeArquivo) {
        String directoryPath = "/home/ubuntu/environment/salvar/";

        String[] nomeArquivoPathList = nomeArquivo.split("/");
        String nomeArquivoSemPath = nomeArquivoPathList[nomeArquivoPathList.length - 1];

        File directory = new File(directoryPath);
        if (!directory.exists()) {
            boolean dirCreated = directory.mkdirs();
        }

        // Criando e escrevendo no arquivo
        File outputFile = new File(directoryPath + nomeArquivoSemPath);
        try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {
            fileOutputStream.write(file);
        //System.out.println("Arquivo salvo com sucesso: " + outputFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar o arquivo: " + e.getMessage());
        }
    }
    
    private static void uploadFile(String filePath) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy 'às' HH:mm");
        String dateString = formatter.format(new Date());
        Path path = Paths.get(filePath);
        String mimeType = Files.probeContentType(path);
        byte[] fileContent = Files.readAllBytes(path);
    
        MensagemProto.Mensagem mensagem = MensagemProto.Mensagem.newBuilder()
            .setEmissor(currentUser)
            .setData(dateString)
            .setGrupo(targetGroup)
            .setNomeArquivo(path.getFileName().toString())
            .setConteudoArquivo(ByteString.copyFrom(fileContent))
            .setTipoMime(mimeType)
            .build();
    
        // Envia para um grupo ou usuário específico
        if (!targetGroup.isEmpty()) {
            channelArq.basicPublish(targetGroup, "", null, mensagem.toByteArray());
            System.out.println("Arquivo \"" + path + "\" foi enviado para #" + targetGroup + "!");
        } else if (!targetUser.isEmpty()) {
            channelArq.basicPublish(EXCHANGE_NAME, targetUser, null, mensagem.toByteArray());
            System.out.println("Arquivo \"" + path + "\" foi enviado para @" + targetUser + "!");
        }
    }
    
    private static void sendMessage(String messageText) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy 'às' HH:mm");
        String dateString = formatter.format(new Date());

        MensagemProto.Mensagem mensagemBuild = MensagemProto.Mensagem.newBuilder()
            .setEmissor(currentUser)
            .setData(dateString)
            .setGrupo(targetGroup)
            .setMensagem(messageText)
            .build();

        byte[] messageBytes = mensagemBuild.toByteArray();

        if (!targetGroup.isEmpty()) {
            // Envia para um grupo (exchange do tipo fanout)
            channel.basicPublish(targetGroup, "", null, messageBytes);
        } else if (!targetUser.isEmpty()) {
            // Envia para um usuário específico
            channel.basicPublish(EXCHANGE_NAME, targetUser, null, messageBytes);
        }
    }
    
    private static void createGroup(String groupName) throws IOException {
        
        channel.exchangeDeclare(groupName, "fanout");
        channelArq.exchangeDeclare(groupName, "fanout");
        
        System.out.println("Grupo '" + groupName + "' criado.");
        
        // O usuário que cria o grupo é automaticamente adicionado ao mesmo
        addUserToGroup(currentUser, groupName);
    }
    
    private static void addUserToGroup(String userName, String groupName) throws IOException {
        // Vincula a fila do usuário ao exchange do grupo
        String queueName = channel.queueDeclare(userName, false, false, false, null).getQueue();
        String queueNameArq = channelArq.queueDeclare(userName, false, false, false, null).getQueue();
        channel.queueBind(queueName, groupName, "");
        channelArq.queueBind(queueName, groupName, "");
        System.out.println("Usuário '" + userName + "' adicionado ao grupo '" + groupName + "'.");
    }
    
    private static void removeUserGroup(String userName, String groupName) throws IOException {
        channel.queueUnbind(userName, groupName, "");
        channelArq.queueUnbind(userName, groupName, "");
        
    }
    
    private static void removeGroup(String groupName) throws IOException {
        channel.exchangeDelete(groupName);
        channelArq.exchangeDelete(groupName);
    }
    
    private static void printReceivedArq(String emissor, String mensagem, String data, String grupo) {
        // SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy 'às' HH:mm");
        // String dateString = formatter.format(new Date());
        if (grupo == "") {
            System.out.println("(" + data + ") Arquivo \"" + mensagem + "\" recebido de @" + emissor + "!");
        } else {
            System.out.println("(" + data + ") Arquivo \"" + mensagem + "\" recebido de @" + emissor + "#" + grupo + "!");
        }
        
        System.out.print(targetUser.isEmpty() ? ">> " : "@" + targetUser + ">> ");
    }
    
    private static void printReceivedMessage(String emissor, String nomeArquivo, String data, String grupo) {
        // SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy 'às' HH:mm");
        // String dateString = formatter.format(new Date());
        if (grupo == "") {
            System.out.println("(" + data + ") " + emissor + " enviou: " + nomeArquivo);
        } else {
            System.out.println("(" + data + ") " + emissor + "#" + grupo + " enviou: " + nomeArquivo);
        }
        
        System.out.print(targetUser.isEmpty() ? ">> " : "@" + targetUser + ">> ");
    }
}
