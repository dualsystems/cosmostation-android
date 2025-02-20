// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/types/v1beta1/account.proto

package injective.types.v1beta1;

public final class Account {
  private Account() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EthAccountOrBuilder extends
      // @@protoc_insertion_point(interface_extends:injective.types.v1beta1.EthAccount)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
     * @return Whether the baseAccount field is set.
     */
    boolean hasBaseAccount();
    /**
     * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
     * @return The baseAccount.
     */
    cosmos.auth.v1beta1.Auth.BaseAccount getBaseAccount();
    /**
     * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
     */
    cosmos.auth.v1beta1.Auth.BaseAccountOrBuilder getBaseAccountOrBuilder();

    /**
     * <code>bytes code_hash = 2 [(.gogoproto.moretags) = "yaml:&#92;"code_hash&#92;""];</code>
     * @return The codeHash.
     */
    com.google.protobuf.ByteString getCodeHash();
  }
  /**
   * <pre>
   * EthAccount implements the authtypes.AccountI interface and embeds an
   * authtypes.BaseAccount type. It is compatible with the auth AccountKeeper.
   * </pre>
   *
   * Protobuf type {@code injective.types.v1beta1.EthAccount}
   */
  public static final class EthAccount extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:injective.types.v1beta1.EthAccount)
      EthAccountOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EthAccount.newBuilder() to construct.
    private EthAccount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EthAccount() {
      codeHash_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EthAccount();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EthAccount(
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
              cosmos.auth.v1beta1.Auth.BaseAccount.Builder subBuilder = null;
              if (baseAccount_ != null) {
                subBuilder = baseAccount_.toBuilder();
              }
              baseAccount_ = input.readMessage(cosmos.auth.v1beta1.Auth.BaseAccount.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(baseAccount_);
                baseAccount_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {

              codeHash_ = input.readBytes();
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
      return injective.types.v1beta1.Account.internal_static_injective_types_v1beta1_EthAccount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return injective.types.v1beta1.Account.internal_static_injective_types_v1beta1_EthAccount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              injective.types.v1beta1.Account.EthAccount.class, injective.types.v1beta1.Account.EthAccount.Builder.class);
    }

    public static final int BASE_ACCOUNT_FIELD_NUMBER = 1;
    private cosmos.auth.v1beta1.Auth.BaseAccount baseAccount_;
    /**
     * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
     * @return Whether the baseAccount field is set.
     */
    @java.lang.Override
    public boolean hasBaseAccount() {
      return baseAccount_ != null;
    }
    /**
     * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
     * @return The baseAccount.
     */
    @java.lang.Override
    public cosmos.auth.v1beta1.Auth.BaseAccount getBaseAccount() {
      return baseAccount_ == null ? cosmos.auth.v1beta1.Auth.BaseAccount.getDefaultInstance() : baseAccount_;
    }
    /**
     * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
     */
    @java.lang.Override
    public cosmos.auth.v1beta1.Auth.BaseAccountOrBuilder getBaseAccountOrBuilder() {
      return getBaseAccount();
    }

    public static final int CODE_HASH_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString codeHash_;
    /**
     * <code>bytes code_hash = 2 [(.gogoproto.moretags) = "yaml:&#92;"code_hash&#92;""];</code>
     * @return The codeHash.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getCodeHash() {
      return codeHash_;
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
      if (baseAccount_ != null) {
        output.writeMessage(1, getBaseAccount());
      }
      if (!codeHash_.isEmpty()) {
        output.writeBytes(2, codeHash_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (baseAccount_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getBaseAccount());
      }
      if (!codeHash_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, codeHash_);
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
      if (!(obj instanceof injective.types.v1beta1.Account.EthAccount)) {
        return super.equals(obj);
      }
      injective.types.v1beta1.Account.EthAccount other = (injective.types.v1beta1.Account.EthAccount) obj;

      if (hasBaseAccount() != other.hasBaseAccount()) return false;
      if (hasBaseAccount()) {
        if (!getBaseAccount()
            .equals(other.getBaseAccount())) return false;
      }
      if (!getCodeHash()
          .equals(other.getCodeHash())) return false;
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
      if (hasBaseAccount()) {
        hash = (37 * hash) + BASE_ACCOUNT_FIELD_NUMBER;
        hash = (53 * hash) + getBaseAccount().hashCode();
      }
      hash = (37 * hash) + CODE_HASH_FIELD_NUMBER;
      hash = (53 * hash) + getCodeHash().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static injective.types.v1beta1.Account.EthAccount parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static injective.types.v1beta1.Account.EthAccount parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static injective.types.v1beta1.Account.EthAccount parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static injective.types.v1beta1.Account.EthAccount parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static injective.types.v1beta1.Account.EthAccount parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static injective.types.v1beta1.Account.EthAccount parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static injective.types.v1beta1.Account.EthAccount parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static injective.types.v1beta1.Account.EthAccount parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static injective.types.v1beta1.Account.EthAccount parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static injective.types.v1beta1.Account.EthAccount parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static injective.types.v1beta1.Account.EthAccount parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static injective.types.v1beta1.Account.EthAccount parseFrom(
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
    public static Builder newBuilder(injective.types.v1beta1.Account.EthAccount prototype) {
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
     * <pre>
     * EthAccount implements the authtypes.AccountI interface and embeds an
     * authtypes.BaseAccount type. It is compatible with the auth AccountKeeper.
     * </pre>
     *
     * Protobuf type {@code injective.types.v1beta1.EthAccount}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:injective.types.v1beta1.EthAccount)
        injective.types.v1beta1.Account.EthAccountOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return injective.types.v1beta1.Account.internal_static_injective_types_v1beta1_EthAccount_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return injective.types.v1beta1.Account.internal_static_injective_types_v1beta1_EthAccount_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                injective.types.v1beta1.Account.EthAccount.class, injective.types.v1beta1.Account.EthAccount.Builder.class);
      }

      // Construct using injective.types.v1beta1.Account.EthAccount.newBuilder()
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
        if (baseAccountBuilder_ == null) {
          baseAccount_ = null;
        } else {
          baseAccount_ = null;
          baseAccountBuilder_ = null;
        }
        codeHash_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return injective.types.v1beta1.Account.internal_static_injective_types_v1beta1_EthAccount_descriptor;
      }

      @java.lang.Override
      public injective.types.v1beta1.Account.EthAccount getDefaultInstanceForType() {
        return injective.types.v1beta1.Account.EthAccount.getDefaultInstance();
      }

      @java.lang.Override
      public injective.types.v1beta1.Account.EthAccount build() {
        injective.types.v1beta1.Account.EthAccount result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public injective.types.v1beta1.Account.EthAccount buildPartial() {
        injective.types.v1beta1.Account.EthAccount result = new injective.types.v1beta1.Account.EthAccount(this);
        if (baseAccountBuilder_ == null) {
          result.baseAccount_ = baseAccount_;
        } else {
          result.baseAccount_ = baseAccountBuilder_.build();
        }
        result.codeHash_ = codeHash_;
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
        if (other instanceof injective.types.v1beta1.Account.EthAccount) {
          return mergeFrom((injective.types.v1beta1.Account.EthAccount)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(injective.types.v1beta1.Account.EthAccount other) {
        if (other == injective.types.v1beta1.Account.EthAccount.getDefaultInstance()) return this;
        if (other.hasBaseAccount()) {
          mergeBaseAccount(other.getBaseAccount());
        }
        if (other.getCodeHash() != com.google.protobuf.ByteString.EMPTY) {
          setCodeHash(other.getCodeHash());
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
        injective.types.v1beta1.Account.EthAccount parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (injective.types.v1beta1.Account.EthAccount) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private cosmos.auth.v1beta1.Auth.BaseAccount baseAccount_;
      private com.google.protobuf.SingleFieldBuilderV3<
          cosmos.auth.v1beta1.Auth.BaseAccount, cosmos.auth.v1beta1.Auth.BaseAccount.Builder, cosmos.auth.v1beta1.Auth.BaseAccountOrBuilder> baseAccountBuilder_;
      /**
       * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
       * @return Whether the baseAccount field is set.
       */
      public boolean hasBaseAccount() {
        return baseAccountBuilder_ != null || baseAccount_ != null;
      }
      /**
       * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
       * @return The baseAccount.
       */
      public cosmos.auth.v1beta1.Auth.BaseAccount getBaseAccount() {
        if (baseAccountBuilder_ == null) {
          return baseAccount_ == null ? cosmos.auth.v1beta1.Auth.BaseAccount.getDefaultInstance() : baseAccount_;
        } else {
          return baseAccountBuilder_.getMessage();
        }
      }
      /**
       * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
       */
      public Builder setBaseAccount(cosmos.auth.v1beta1.Auth.BaseAccount value) {
        if (baseAccountBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          baseAccount_ = value;
          onChanged();
        } else {
          baseAccountBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
       */
      public Builder setBaseAccount(
          cosmos.auth.v1beta1.Auth.BaseAccount.Builder builderForValue) {
        if (baseAccountBuilder_ == null) {
          baseAccount_ = builderForValue.build();
          onChanged();
        } else {
          baseAccountBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
       */
      public Builder mergeBaseAccount(cosmos.auth.v1beta1.Auth.BaseAccount value) {
        if (baseAccountBuilder_ == null) {
          if (baseAccount_ != null) {
            baseAccount_ =
              cosmos.auth.v1beta1.Auth.BaseAccount.newBuilder(baseAccount_).mergeFrom(value).buildPartial();
          } else {
            baseAccount_ = value;
          }
          onChanged();
        } else {
          baseAccountBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
       */
      public Builder clearBaseAccount() {
        if (baseAccountBuilder_ == null) {
          baseAccount_ = null;
          onChanged();
        } else {
          baseAccount_ = null;
          baseAccountBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
       */
      public cosmos.auth.v1beta1.Auth.BaseAccount.Builder getBaseAccountBuilder() {
        
        onChanged();
        return getBaseAccountFieldBuilder().getBuilder();
      }
      /**
       * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
       */
      public cosmos.auth.v1beta1.Auth.BaseAccountOrBuilder getBaseAccountOrBuilder() {
        if (baseAccountBuilder_ != null) {
          return baseAccountBuilder_.getMessageOrBuilder();
        } else {
          return baseAccount_ == null ?
              cosmos.auth.v1beta1.Auth.BaseAccount.getDefaultInstance() : baseAccount_;
        }
      }
      /**
       * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          cosmos.auth.v1beta1.Auth.BaseAccount, cosmos.auth.v1beta1.Auth.BaseAccount.Builder, cosmos.auth.v1beta1.Auth.BaseAccountOrBuilder> 
          getBaseAccountFieldBuilder() {
        if (baseAccountBuilder_ == null) {
          baseAccountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              cosmos.auth.v1beta1.Auth.BaseAccount, cosmos.auth.v1beta1.Auth.BaseAccount.Builder, cosmos.auth.v1beta1.Auth.BaseAccountOrBuilder>(
                  getBaseAccount(),
                  getParentForChildren(),
                  isClean());
          baseAccount_ = null;
        }
        return baseAccountBuilder_;
      }

      private com.google.protobuf.ByteString codeHash_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes code_hash = 2 [(.gogoproto.moretags) = "yaml:&#92;"code_hash&#92;""];</code>
       * @return The codeHash.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getCodeHash() {
        return codeHash_;
      }
      /**
       * <code>bytes code_hash = 2 [(.gogoproto.moretags) = "yaml:&#92;"code_hash&#92;""];</code>
       * @param value The codeHash to set.
       * @return This builder for chaining.
       */
      public Builder setCodeHash(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        codeHash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes code_hash = 2 [(.gogoproto.moretags) = "yaml:&#92;"code_hash&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearCodeHash() {
        
        codeHash_ = getDefaultInstance().getCodeHash();
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


      // @@protoc_insertion_point(builder_scope:injective.types.v1beta1.EthAccount)
    }

    // @@protoc_insertion_point(class_scope:injective.types.v1beta1.EthAccount)
    private static final injective.types.v1beta1.Account.EthAccount DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new injective.types.v1beta1.Account.EthAccount();
    }

    public static injective.types.v1beta1.Account.EthAccount getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EthAccount>
        PARSER = new com.google.protobuf.AbstractParser<EthAccount>() {
      @java.lang.Override
      public EthAccount parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EthAccount(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EthAccount> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EthAccount> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public injective.types.v1beta1.Account.EthAccount getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_types_v1beta1_EthAccount_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_types_v1beta1_EthAccount_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%injective/types/v1beta1/account.proto\022" +
      "\027injective.types.v1beta1\032\036cosmos/auth/v1" +
      "beta1/auth.proto\032\031cosmos_proto/cosmos.pr" +
      "oto\032\024gogoproto/gogo.proto\"\316\001\n\nEthAccount" +
      "\022S\n\014base_account\030\001 \001(\0132 .cosmos.auth.v1b" +
      "eta1.BaseAccountB\033\320\336\037\001\362\336\037\023yaml:\"base_acc" +
      "ount\"\022\'\n\tcode_hash\030\002 \001(\014B\024\362\336\037\020yaml:\"code" +
      "_hash\":B\210\240\037\000\230\240\037\000\350\240\037\000\312\264-2github.com/cosmo" +
      "s/cosmos-sdk/x/auth/types.AccountIB?Z=gi" +
      "thub.com/InjectiveLabs/injective-core/in" +
      "jective-chain/typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cosmos.auth.v1beta1.Auth.getDescriptor(),
          cosmos_proto.Cosmos.getDescriptor(),
          com.google.protobuf.GoGoProtos.getDescriptor(),
        });
    internal_static_injective_types_v1beta1_EthAccount_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_injective_types_v1beta1_EthAccount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_types_v1beta1_EthAccount_descriptor,
        new java.lang.String[] { "BaseAccount", "CodeHash", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(cosmos_proto.Cosmos.implementsInterface);
    registry.add(com.google.protobuf.GoGoProtos.embed);
    registry.add(com.google.protobuf.GoGoProtos.equal);
    registry.add(com.google.protobuf.GoGoProtos.goprotoGetters);
    registry.add(com.google.protobuf.GoGoProtos.goprotoStringer);
    registry.add(com.google.protobuf.GoGoProtos.moretags);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    cosmos.auth.v1beta1.Auth.getDescriptor();
    cosmos_proto.Cosmos.getDescriptor();
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
