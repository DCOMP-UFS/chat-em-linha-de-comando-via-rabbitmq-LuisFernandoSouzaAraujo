package br.ufs.dcomp.ChatRabbitMQ;

import com.rabbitmq.client.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Chat {
    private static final String EXCHANGE_NAME = "direct_logs";
    private static Channel channel;
    private static String currentUser;
    private static String targetUser = "";

    public static void main(String[] argv) throws Exception {
        // Configuração inicial
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("172.31.79.74");
        factory.setUsername("admin");
        factory.setPassword("password");
        Connection connection = factory.newConnection();
        channel = connection.createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);

        // Captura do nome de usuário
        System.out.print("User: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        currentUser = reader.readLine();

        // Declaração da fila do usuário atual
        String queueName = channel.queueDeclare(currentUser, false, false, false, null).getQueue();
        channel.queueBind(queueName, EXCHANGE_NAME, currentUser);

        // Consumidor para receber mensagens
        Consumer consumer = new DefaultConsumer(channel) {
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body)
                    throws IOException {
                String message = new String(body, "UTF-8");
                String sender = envelope.getRoutingKey();
                printReceivedMessage(sender, message);
            }
        };
        channel.basicConsume(queueName, true, consumer);

        // Loop de envio de mensagens
        while (true) {
            System.out.print(targetUser.isEmpty() ? ">> " : "@" + targetUser + ">> ");
            String message = reader.readLine();
            
            // Verifica se é um comando para mudar o destinatário
            if (message.startsWith("@")) {
                targetUser = message.substring(1);
                continue;
            }
                
            // Envia a mensagem para o destinatário atual
            if (!targetUser.isEmpty()) {
                channel.basicPublish(EXCHANGE_NAME, targetUser, null, message.getBytes("UTF-8"));
            }
        }
    }

    private static void printReceivedMessage(String sender, String message) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy 'às' HH:mm");
        String dateString = formatter.format(new Date());
        System.out.println("(" + dateString + ") " + sender + " diz: " + message);
        System.out.print(targetUser.isEmpty() ? ">> " : "@" + targetUser + ">> ");
    }
}