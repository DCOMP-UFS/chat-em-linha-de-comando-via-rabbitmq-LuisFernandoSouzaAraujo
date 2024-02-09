// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/mensagem.proto

package br.ufs.dcomp.ChatRabbitMQ;

public final class MensagemProto {
  private MensagemProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MensagemOrBuilder extends
      // @@protoc_insertion_point(interface_extends:br.ufs.dcomp.ChatRabbitMQ.Mensagem)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string emissor = 1;</code>
     * @return The emissor.
     */
    java.lang.String getEmissor();
    /**
     * <code>string emissor = 1;</code>
     * @return The bytes for emissor.
     */
    com.google.protobuf.ByteString
        getEmissorBytes();

    /**
     * <code>string data = 2;</code>
     * @return The data.
     */
    java.lang.String getData();
    /**
     * <code>string data = 2;</code>
     * @return The bytes for data.
     */
    com.google.protobuf.ByteString
        getDataBytes();

    /**
     * <code>string hora = 3;</code>
     * @return The hora.
     */
    java.lang.String getHora();
    /**
     * <code>string hora = 3;</code>
     * @return The bytes for hora.
     */
    com.google.protobuf.ByteString
        getHoraBytes();

    /**
     * <code>string grupo = 4;</code>
     * @return The grupo.
     */
    java.lang.String getGrupo();
    /**
     * <code>string grupo = 4;</code>
     * @return The bytes for grupo.
     */
    com.google.protobuf.ByteString
        getGrupoBytes();

    /**
     * <code>string mensagem = 5;</code>
     * @return The mensagem.
     */
    java.lang.String getMensagem();
    /**
     * <code>string mensagem = 5;</code>
     * @return The bytes for mensagem.
     */
    com.google.protobuf.ByteString
        getMensagemBytes();
  }
  /**
   * Protobuf type {@code br.ufs.dcomp.ChatRabbitMQ.Mensagem}
   */
  public static final class Mensagem extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:br.ufs.dcomp.ChatRabbitMQ.Mensagem)
      MensagemOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Mensagem.newBuilder() to construct.
    private Mensagem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Mensagem() {
      emissor_ = "";
      data_ = "";
      hora_ = "";
      grupo_ = "";
      mensagem_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Mensagem();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Mensagem(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              emissor_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              data_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              hora_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              grupo_ = s;
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              mensagem_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.ufs.dcomp.ChatRabbitMQ.MensagemProto.internal_static_br_ufs_dcomp_ChatRabbitMQ_Mensagem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.ufs.dcomp.ChatRabbitMQ.MensagemProto.internal_static_br_ufs_dcomp_ChatRabbitMQ_Mensagem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem.class, br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem.Builder.class);
    }

    public static final int EMISSOR_FIELD_NUMBER = 1;
    private volatile java.lang.Object emissor_;
    /**
     * <code>string emissor = 1;</code>
     * @return The emissor.
     */
    @java.lang.Override
    public java.lang.String getEmissor() {
      java.lang.Object ref = emissor_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        emissor_ = s;
        return s;
      }
    }
    /**
     * <code>string emissor = 1;</code>
     * @return The bytes for emissor.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEmissorBytes() {
      java.lang.Object ref = emissor_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        emissor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DATA_FIELD_NUMBER = 2;
    private volatile java.lang.Object data_;
    /**
     * <code>string data = 2;</code>
     * @return The data.
     */
    @java.lang.Override
    public java.lang.String getData() {
      java.lang.Object ref = data_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        data_ = s;
        return s;
      }
    }
    /**
     * <code>string data = 2;</code>
     * @return The bytes for data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDataBytes() {
      java.lang.Object ref = data_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        data_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int HORA_FIELD_NUMBER = 3;
    private volatile java.lang.Object hora_;
    /**
     * <code>string hora = 3;</code>
     * @return The hora.
     */
    @java.lang.Override
    public java.lang.String getHora() {
      java.lang.Object ref = hora_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hora_ = s;
        return s;
      }
    }
    /**
     * <code>string hora = 3;</code>
     * @return The bytes for hora.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getHoraBytes() {
      java.lang.Object ref = hora_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hora_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int GRUPO_FIELD_NUMBER = 4;
    private volatile java.lang.Object grupo_;
    /**
     * <code>string grupo = 4;</code>
     * @return The grupo.
     */
    @java.lang.Override
    public java.lang.String getGrupo() {
      java.lang.Object ref = grupo_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        grupo_ = s;
        return s;
      }
    }
    /**
     * <code>string grupo = 4;</code>
     * @return The bytes for grupo.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getGrupoBytes() {
      java.lang.Object ref = grupo_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        grupo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MENSAGEM_FIELD_NUMBER = 5;
    private volatile java.lang.Object mensagem_;
    /**
     * <code>string mensagem = 5;</code>
     * @return The mensagem.
     */
    @java.lang.Override
    public java.lang.String getMensagem() {
      java.lang.Object ref = mensagem_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mensagem_ = s;
        return s;
      }
    }
    /**
     * <code>string mensagem = 5;</code>
     * @return The bytes for mensagem.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMensagemBytes() {
      java.lang.Object ref = mensagem_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mensagem_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getEmissorBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, emissor_);
      }
      if (!getDataBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, data_);
      }
      if (!getHoraBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, hora_);
      }
      if (!getGrupoBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, grupo_);
      }
      if (!getMensagemBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, mensagem_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getEmissorBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, emissor_);
      }
      if (!getDataBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, data_);
      }
      if (!getHoraBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, hora_);
      }
      if (!getGrupoBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, grupo_);
      }
      if (!getMensagemBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, mensagem_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem)) {
        return super.equals(obj);
      }
      br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem other = (br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem) obj;

      if (!getEmissor()
          .equals(other.getEmissor())) return false;
      if (!getData()
          .equals(other.getData())) return false;
      if (!getHora()
          .equals(other.getHora())) return false;
      if (!getGrupo()
          .equals(other.getGrupo())) return false;
      if (!getMensagem()
          .equals(other.getMensagem())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + EMISSOR_FIELD_NUMBER;
      hash = (53 * hash) + getEmissor().hashCode();
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
      hash = (37 * hash) + HORA_FIELD_NUMBER;
      hash = (53 * hash) + getHora().hashCode();
      hash = (37 * hash) + GRUPO_FIELD_NUMBER;
      hash = (53 * hash) + getGrupo().hashCode();
      hash = (37 * hash) + MENSAGEM_FIELD_NUMBER;
      hash = (53 * hash) + getMensagem().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code br.ufs.dcomp.ChatRabbitMQ.Mensagem}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:br.ufs.dcomp.ChatRabbitMQ.Mensagem)
        br.ufs.dcomp.ChatRabbitMQ.MensagemProto.MensagemOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return br.ufs.dcomp.ChatRabbitMQ.MensagemProto.internal_static_br_ufs_dcomp_ChatRabbitMQ_Mensagem_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return br.ufs.dcomp.ChatRabbitMQ.MensagemProto.internal_static_br_ufs_dcomp_ChatRabbitMQ_Mensagem_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem.class, br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem.Builder.class);
      }

      // Construct using br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        emissor_ = "";

        data_ = "";

        hora_ = "";

        grupo_ = "";

        mensagem_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return br.ufs.dcomp.ChatRabbitMQ.MensagemProto.internal_static_br_ufs_dcomp_ChatRabbitMQ_Mensagem_descriptor;
      }

      @java.lang.Override
      public br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem getDefaultInstanceForType() {
        return br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem.getDefaultInstance();
      }

      @java.lang.Override
      public br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem build() {
        br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem buildPartial() {
        br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem result = new br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem(this);
        result.emissor_ = emissor_;
        result.data_ = data_;
        result.hora_ = hora_;
        result.grupo_ = grupo_;
        result.mensagem_ = mensagem_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem) {
          return mergeFrom((br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem other) {
        if (other == br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem.getDefaultInstance()) return this;
        if (!other.getEmissor().isEmpty()) {
          emissor_ = other.emissor_;
          onChanged();
        }
        if (!other.getData().isEmpty()) {
          data_ = other.data_;
          onChanged();
        }
        if (!other.getHora().isEmpty()) {
          hora_ = other.hora_;
          onChanged();
        }
        if (!other.getGrupo().isEmpty()) {
          grupo_ = other.grupo_;
          onChanged();
        }
        if (!other.getMensagem().isEmpty()) {
          mensagem_ = other.mensagem_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object emissor_ = "";
      /**
       * <code>string emissor = 1;</code>
       * @return The emissor.
       */
      public java.lang.String getEmissor() {
        java.lang.Object ref = emissor_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          emissor_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string emissor = 1;</code>
       * @return The bytes for emissor.
       */
      public com.google.protobuf.ByteString
          getEmissorBytes() {
        java.lang.Object ref = emissor_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          emissor_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string emissor = 1;</code>
       * @param value The emissor to set.
       * @return This builder for chaining.
       */
      public Builder setEmissor(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        emissor_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string emissor = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEmissor() {
        
        emissor_ = getDefaultInstance().getEmissor();
        onChanged();
        return this;
      }
      /**
       * <code>string emissor = 1;</code>
       * @param value The bytes for emissor to set.
       * @return This builder for chaining.
       */
      public Builder setEmissorBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        emissor_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object data_ = "";
      /**
       * <code>string data = 2;</code>
       * @return The data.
       */
      public java.lang.String getData() {
        java.lang.Object ref = data_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          data_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string data = 2;</code>
       * @return The bytes for data.
       */
      public com.google.protobuf.ByteString
          getDataBytes() {
        java.lang.Object ref = data_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          data_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string data = 2;</code>
       * @param value The data to set.
       * @return This builder for chaining.
       */
      public Builder setData(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string data = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearData() {
        
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }
      /**
       * <code>string data = 2;</code>
       * @param value The bytes for data to set.
       * @return This builder for chaining.
       */
      public Builder setDataBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        data_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object hora_ = "";
      /**
       * <code>string hora = 3;</code>
       * @return The hora.
       */
      public java.lang.String getHora() {
        java.lang.Object ref = hora_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          hora_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string hora = 3;</code>
       * @return The bytes for hora.
       */
      public com.google.protobuf.ByteString
          getHoraBytes() {
        java.lang.Object ref = hora_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          hora_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string hora = 3;</code>
       * @param value The hora to set.
       * @return This builder for chaining.
       */
      public Builder setHora(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        hora_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string hora = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearHora() {
        
        hora_ = getDefaultInstance().getHora();
        onChanged();
        return this;
      }
      /**
       * <code>string hora = 3;</code>
       * @param value The bytes for hora to set.
       * @return This builder for chaining.
       */
      public Builder setHoraBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        hora_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object grupo_ = "";
      /**
       * <code>string grupo = 4;</code>
       * @return The grupo.
       */
      public java.lang.String getGrupo() {
        java.lang.Object ref = grupo_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          grupo_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string grupo = 4;</code>
       * @return The bytes for grupo.
       */
      public com.google.protobuf.ByteString
          getGrupoBytes() {
        java.lang.Object ref = grupo_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          grupo_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string grupo = 4;</code>
       * @param value The grupo to set.
       * @return This builder for chaining.
       */
      public Builder setGrupo(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        grupo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string grupo = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearGrupo() {
        
        grupo_ = getDefaultInstance().getGrupo();
        onChanged();
        return this;
      }
      /**
       * <code>string grupo = 4;</code>
       * @param value The bytes for grupo to set.
       * @return This builder for chaining.
       */
      public Builder setGrupoBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        grupo_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object mensagem_ = "";
      /**
       * <code>string mensagem = 5;</code>
       * @return The mensagem.
       */
      public java.lang.String getMensagem() {
        java.lang.Object ref = mensagem_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          mensagem_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string mensagem = 5;</code>
       * @return The bytes for mensagem.
       */
      public com.google.protobuf.ByteString
          getMensagemBytes() {
        java.lang.Object ref = mensagem_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          mensagem_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string mensagem = 5;</code>
       * @param value The mensagem to set.
       * @return This builder for chaining.
       */
      public Builder setMensagem(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        mensagem_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string mensagem = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearMensagem() {
        
        mensagem_ = getDefaultInstance().getMensagem();
        onChanged();
        return this;
      }
      /**
       * <code>string mensagem = 5;</code>
       * @param value The bytes for mensagem to set.
       * @return This builder for chaining.
       */
      public Builder setMensagemBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        mensagem_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:br.ufs.dcomp.ChatRabbitMQ.Mensagem)
    }

    // @@protoc_insertion_point(class_scope:br.ufs.dcomp.ChatRabbitMQ.Mensagem)
    private static final br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem();
    }

    public static br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Mensagem>
        PARSER = new com.google.protobuf.AbstractParser<Mensagem>() {
      @java.lang.Override
      public Mensagem parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Mensagem(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Mensagem> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Mensagem> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public br.ufs.dcomp.ChatRabbitMQ.MensagemProto.Mensagem getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_ufs_dcomp_ChatRabbitMQ_Mensagem_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_ufs_dcomp_ChatRabbitMQ_Mensagem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035src/main/proto/mensagem.proto\022\031br.ufs." +
      "dcomp.ChatRabbitMQ\"X\n\010Mensagem\022\017\n\007emisso" +
      "r\030\001 \001(\t\022\014\n\004data\030\002 \001(\t\022\014\n\004hora\030\003 \001(\t\022\r\n\005g" +
      "rupo\030\004 \001(\t\022\020\n\010mensagem\030\005 \001(\tB\017B\rMensagem" +
      "Protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_br_ufs_dcomp_ChatRabbitMQ_Mensagem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_br_ufs_dcomp_ChatRabbitMQ_Mensagem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_ufs_dcomp_ChatRabbitMQ_Mensagem_descriptor,
        new java.lang.String[] { "Emissor", "Data", "Hora", "Grupo", "Mensagem", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
