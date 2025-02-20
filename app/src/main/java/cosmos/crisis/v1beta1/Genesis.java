// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/crisis/v1beta1/genesis.proto

package cosmos.crisis.v1beta1;

public final class Genesis {
  private Genesis() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GenesisStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:cosmos.crisis.v1beta1.GenesisState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * constant_fee is the fee used to verify the invariant in the crisis
     * module.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin constant_fee = 3 [(.gogoproto.nullable) = false];</code>
     * @return Whether the constantFee field is set.
     */
    boolean hasConstantFee();
    /**
     * <pre>
     * constant_fee is the fee used to verify the invariant in the crisis
     * module.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin constant_fee = 3 [(.gogoproto.nullable) = false];</code>
     * @return The constantFee.
     */
    cosmos.base.v1beta1.CoinOuterClass.Coin getConstantFee();
    /**
     * <pre>
     * constant_fee is the fee used to verify the invariant in the crisis
     * module.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin constant_fee = 3 [(.gogoproto.nullable) = false];</code>
     */
    cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getConstantFeeOrBuilder();
  }
  /**
   * <pre>
   * GenesisState defines the crisis module's genesis state.
   * </pre>
   *
   * Protobuf type {@code cosmos.crisis.v1beta1.GenesisState}
   */
  public static final class GenesisState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:cosmos.crisis.v1beta1.GenesisState)
      GenesisStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenesisState.newBuilder() to construct.
    private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenesisState() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GenesisState();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GenesisState(
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
            case 26: {
              cosmos.base.v1beta1.CoinOuterClass.Coin.Builder subBuilder = null;
              if (constantFee_ != null) {
                subBuilder = constantFee_.toBuilder();
              }
              constantFee_ = input.readMessage(cosmos.base.v1beta1.CoinOuterClass.Coin.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(constantFee_);
                constantFee_ = subBuilder.buildPartial();
              }

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
      return cosmos.crisis.v1beta1.Genesis.internal_static_cosmos_crisis_v1beta1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.crisis.v1beta1.Genesis.internal_static_cosmos_crisis_v1beta1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.crisis.v1beta1.Genesis.GenesisState.class, cosmos.crisis.v1beta1.Genesis.GenesisState.Builder.class);
    }

    public static final int CONSTANT_FEE_FIELD_NUMBER = 3;
    private cosmos.base.v1beta1.CoinOuterClass.Coin constantFee_;
    /**
     * <pre>
     * constant_fee is the fee used to verify the invariant in the crisis
     * module.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin constant_fee = 3 [(.gogoproto.nullable) = false];</code>
     * @return Whether the constantFee field is set.
     */
    @java.lang.Override
    public boolean hasConstantFee() {
      return constantFee_ != null;
    }
    /**
     * <pre>
     * constant_fee is the fee used to verify the invariant in the crisis
     * module.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin constant_fee = 3 [(.gogoproto.nullable) = false];</code>
     * @return The constantFee.
     */
    @java.lang.Override
    public cosmos.base.v1beta1.CoinOuterClass.Coin getConstantFee() {
      return constantFee_ == null ? cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance() : constantFee_;
    }
    /**
     * <pre>
     * constant_fee is the fee used to verify the invariant in the crisis
     * module.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin constant_fee = 3 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getConstantFeeOrBuilder() {
      return getConstantFee();
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
      if (constantFee_ != null) {
        output.writeMessage(3, getConstantFee());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (constantFee_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getConstantFee());
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
      if (!(obj instanceof cosmos.crisis.v1beta1.Genesis.GenesisState)) {
        return super.equals(obj);
      }
      cosmos.crisis.v1beta1.Genesis.GenesisState other = (cosmos.crisis.v1beta1.Genesis.GenesisState) obj;

      if (hasConstantFee() != other.hasConstantFee()) return false;
      if (hasConstantFee()) {
        if (!getConstantFee()
            .equals(other.getConstantFee())) return false;
      }
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
      if (hasConstantFee()) {
        hash = (37 * hash) + CONSTANT_FEE_FIELD_NUMBER;
        hash = (53 * hash) + getConstantFee().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static cosmos.crisis.v1beta1.Genesis.GenesisState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.crisis.v1beta1.Genesis.GenesisState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.crisis.v1beta1.Genesis.GenesisState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.crisis.v1beta1.Genesis.GenesisState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.crisis.v1beta1.Genesis.GenesisState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.crisis.v1beta1.Genesis.GenesisState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.crisis.v1beta1.Genesis.GenesisState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.crisis.v1beta1.Genesis.GenesisState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.crisis.v1beta1.Genesis.GenesisState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static cosmos.crisis.v1beta1.Genesis.GenesisState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.crisis.v1beta1.Genesis.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.crisis.v1beta1.Genesis.GenesisState parseFrom(
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
    public static Builder newBuilder(cosmos.crisis.v1beta1.Genesis.GenesisState prototype) {
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
     * GenesisState defines the crisis module's genesis state.
     * </pre>
     *
     * Protobuf type {@code cosmos.crisis.v1beta1.GenesisState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:cosmos.crisis.v1beta1.GenesisState)
        cosmos.crisis.v1beta1.Genesis.GenesisStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cosmos.crisis.v1beta1.Genesis.internal_static_cosmos_crisis_v1beta1_GenesisState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cosmos.crisis.v1beta1.Genesis.internal_static_cosmos_crisis_v1beta1_GenesisState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cosmos.crisis.v1beta1.Genesis.GenesisState.class, cosmos.crisis.v1beta1.Genesis.GenesisState.Builder.class);
      }

      // Construct using cosmos.crisis.v1beta1.Genesis.GenesisState.newBuilder()
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
        if (constantFeeBuilder_ == null) {
          constantFee_ = null;
        } else {
          constantFee_ = null;
          constantFeeBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cosmos.crisis.v1beta1.Genesis.internal_static_cosmos_crisis_v1beta1_GenesisState_descriptor;
      }

      @java.lang.Override
      public cosmos.crisis.v1beta1.Genesis.GenesisState getDefaultInstanceForType() {
        return cosmos.crisis.v1beta1.Genesis.GenesisState.getDefaultInstance();
      }

      @java.lang.Override
      public cosmos.crisis.v1beta1.Genesis.GenesisState build() {
        cosmos.crisis.v1beta1.Genesis.GenesisState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public cosmos.crisis.v1beta1.Genesis.GenesisState buildPartial() {
        cosmos.crisis.v1beta1.Genesis.GenesisState result = new cosmos.crisis.v1beta1.Genesis.GenesisState(this);
        if (constantFeeBuilder_ == null) {
          result.constantFee_ = constantFee_;
        } else {
          result.constantFee_ = constantFeeBuilder_.build();
        }
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
        if (other instanceof cosmos.crisis.v1beta1.Genesis.GenesisState) {
          return mergeFrom((cosmos.crisis.v1beta1.Genesis.GenesisState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cosmos.crisis.v1beta1.Genesis.GenesisState other) {
        if (other == cosmos.crisis.v1beta1.Genesis.GenesisState.getDefaultInstance()) return this;
        if (other.hasConstantFee()) {
          mergeConstantFee(other.getConstantFee());
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
        cosmos.crisis.v1beta1.Genesis.GenesisState parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cosmos.crisis.v1beta1.Genesis.GenesisState) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private cosmos.base.v1beta1.CoinOuterClass.Coin constantFee_;
      private com.google.protobuf.SingleFieldBuilderV3<
          cosmos.base.v1beta1.CoinOuterClass.Coin, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder, cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder> constantFeeBuilder_;
      /**
       * <pre>
       * constant_fee is the fee used to verify the invariant in the crisis
       * module.
       * </pre>
       *
       * <code>.cosmos.base.v1beta1.Coin constant_fee = 3 [(.gogoproto.nullable) = false];</code>
       * @return Whether the constantFee field is set.
       */
      public boolean hasConstantFee() {
        return constantFeeBuilder_ != null || constantFee_ != null;
      }
      /**
       * <pre>
       * constant_fee is the fee used to verify the invariant in the crisis
       * module.
       * </pre>
       *
       * <code>.cosmos.base.v1beta1.Coin constant_fee = 3 [(.gogoproto.nullable) = false];</code>
       * @return The constantFee.
       */
      public cosmos.base.v1beta1.CoinOuterClass.Coin getConstantFee() {
        if (constantFeeBuilder_ == null) {
          return constantFee_ == null ? cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance() : constantFee_;
        } else {
          return constantFeeBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * constant_fee is the fee used to verify the invariant in the crisis
       * module.
       * </pre>
       *
       * <code>.cosmos.base.v1beta1.Coin constant_fee = 3 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setConstantFee(cosmos.base.v1beta1.CoinOuterClass.Coin value) {
        if (constantFeeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          constantFee_ = value;
          onChanged();
        } else {
          constantFeeBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * constant_fee is the fee used to verify the invariant in the crisis
       * module.
       * </pre>
       *
       * <code>.cosmos.base.v1beta1.Coin constant_fee = 3 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setConstantFee(
          cosmos.base.v1beta1.CoinOuterClass.Coin.Builder builderForValue) {
        if (constantFeeBuilder_ == null) {
          constantFee_ = builderForValue.build();
          onChanged();
        } else {
          constantFeeBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * constant_fee is the fee used to verify the invariant in the crisis
       * module.
       * </pre>
       *
       * <code>.cosmos.base.v1beta1.Coin constant_fee = 3 [(.gogoproto.nullable) = false];</code>
       */
      public Builder mergeConstantFee(cosmos.base.v1beta1.CoinOuterClass.Coin value) {
        if (constantFeeBuilder_ == null) {
          if (constantFee_ != null) {
            constantFee_ =
              cosmos.base.v1beta1.CoinOuterClass.Coin.newBuilder(constantFee_).mergeFrom(value).buildPartial();
          } else {
            constantFee_ = value;
          }
          onChanged();
        } else {
          constantFeeBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * constant_fee is the fee used to verify the invariant in the crisis
       * module.
       * </pre>
       *
       * <code>.cosmos.base.v1beta1.Coin constant_fee = 3 [(.gogoproto.nullable) = false];</code>
       */
      public Builder clearConstantFee() {
        if (constantFeeBuilder_ == null) {
          constantFee_ = null;
          onChanged();
        } else {
          constantFee_ = null;
          constantFeeBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * constant_fee is the fee used to verify the invariant in the crisis
       * module.
       * </pre>
       *
       * <code>.cosmos.base.v1beta1.Coin constant_fee = 3 [(.gogoproto.nullable) = false];</code>
       */
      public cosmos.base.v1beta1.CoinOuterClass.Coin.Builder getConstantFeeBuilder() {
        
        onChanged();
        return getConstantFeeFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * constant_fee is the fee used to verify the invariant in the crisis
       * module.
       * </pre>
       *
       * <code>.cosmos.base.v1beta1.Coin constant_fee = 3 [(.gogoproto.nullable) = false];</code>
       */
      public cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getConstantFeeOrBuilder() {
        if (constantFeeBuilder_ != null) {
          return constantFeeBuilder_.getMessageOrBuilder();
        } else {
          return constantFee_ == null ?
              cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance() : constantFee_;
        }
      }
      /**
       * <pre>
       * constant_fee is the fee used to verify the invariant in the crisis
       * module.
       * </pre>
       *
       * <code>.cosmos.base.v1beta1.Coin constant_fee = 3 [(.gogoproto.nullable) = false];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          cosmos.base.v1beta1.CoinOuterClass.Coin, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder, cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder> 
          getConstantFeeFieldBuilder() {
        if (constantFeeBuilder_ == null) {
          constantFeeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              cosmos.base.v1beta1.CoinOuterClass.Coin, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder, cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder>(
                  getConstantFee(),
                  getParentForChildren(),
                  isClean());
          constantFee_ = null;
        }
        return constantFeeBuilder_;
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


      // @@protoc_insertion_point(builder_scope:cosmos.crisis.v1beta1.GenesisState)
    }

    // @@protoc_insertion_point(class_scope:cosmos.crisis.v1beta1.GenesisState)
    private static final cosmos.crisis.v1beta1.Genesis.GenesisState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new cosmos.crisis.v1beta1.Genesis.GenesisState();
    }

    public static cosmos.crisis.v1beta1.Genesis.GenesisState getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GenesisState>
        PARSER = new com.google.protobuf.AbstractParser<GenesisState>() {
      @java.lang.Override
      public GenesisState parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GenesisState(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GenesisState> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GenesisState> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public cosmos.crisis.v1beta1.Genesis.GenesisState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_crisis_v1beta1_GenesisState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_crisis_v1beta1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#cosmos/crisis/v1beta1/genesis.proto\022\025c" +
      "osmos.crisis.v1beta1\032\024gogoproto/gogo.pro" +
      "to\032\036cosmos/base/v1beta1/coin.proto\"E\n\014Ge" +
      "nesisState\0225\n\014constant_fee\030\003 \001(\0132\031.cosmo" +
      "s.base.v1beta1.CoinB\004\310\336\037\000B-Z+github.com/" +
      "cosmos/cosmos-sdk/x/crisis/typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
          cosmos.base.v1beta1.CoinOuterClass.getDescriptor(),
        });
    internal_static_cosmos_crisis_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_crisis_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_crisis_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "ConstantFee", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    cosmos.base.v1beta1.CoinOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
