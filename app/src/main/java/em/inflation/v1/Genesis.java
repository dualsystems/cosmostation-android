// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: em/inflation/v1/genesis.proto

package em.inflation.v1;

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
      // @@protoc_insertion_point(interface_extends:em.inflation.v1.GenesisState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * todo (reviewer): yaml naming is a bit inconsistent. state contains assets
     * </pre>
     *
     * <code>.em.inflation.v1.InflationState assets = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "InflationState", (.gogoproto.moretags) = "yaml:&#92;"assets&#92;""];</code>
     * @return Whether the assets field is set.
     */
    boolean hasAssets();
    /**
     * <pre>
     * todo (reviewer): yaml naming is a bit inconsistent. state contains assets
     * </pre>
     *
     * <code>.em.inflation.v1.InflationState assets = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "InflationState", (.gogoproto.moretags) = "yaml:&#92;"assets&#92;""];</code>
     * @return The assets.
     */
    em.inflation.v1.Inflation.InflationState getAssets();
    /**
     * <pre>
     * todo (reviewer): yaml naming is a bit inconsistent. state contains assets
     * </pre>
     *
     * <code>.em.inflation.v1.InflationState assets = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "InflationState", (.gogoproto.moretags) = "yaml:&#92;"assets&#92;""];</code>
     */
    em.inflation.v1.Inflation.InflationStateOrBuilder getAssetsOrBuilder();
  }
  /**
   * Protobuf type {@code em.inflation.v1.GenesisState}
   */
  public static final class GenesisState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:em.inflation.v1.GenesisState)
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
            case 10: {
              em.inflation.v1.Inflation.InflationState.Builder subBuilder = null;
              if (assets_ != null) {
                subBuilder = assets_.toBuilder();
              }
              assets_ = input.readMessage(em.inflation.v1.Inflation.InflationState.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(assets_);
                assets_ = subBuilder.buildPartial();
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
      return em.inflation.v1.Genesis.internal_static_em_inflation_v1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return em.inflation.v1.Genesis.internal_static_em_inflation_v1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              em.inflation.v1.Genesis.GenesisState.class, em.inflation.v1.Genesis.GenesisState.Builder.class);
    }

    public static final int ASSETS_FIELD_NUMBER = 1;
    private em.inflation.v1.Inflation.InflationState assets_;
    /**
     * <pre>
     * todo (reviewer): yaml naming is a bit inconsistent. state contains assets
     * </pre>
     *
     * <code>.em.inflation.v1.InflationState assets = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "InflationState", (.gogoproto.moretags) = "yaml:&#92;"assets&#92;""];</code>
     * @return Whether the assets field is set.
     */
    @java.lang.Override
    public boolean hasAssets() {
      return assets_ != null;
    }
    /**
     * <pre>
     * todo (reviewer): yaml naming is a bit inconsistent. state contains assets
     * </pre>
     *
     * <code>.em.inflation.v1.InflationState assets = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "InflationState", (.gogoproto.moretags) = "yaml:&#92;"assets&#92;""];</code>
     * @return The assets.
     */
    @java.lang.Override
    public em.inflation.v1.Inflation.InflationState getAssets() {
      return assets_ == null ? em.inflation.v1.Inflation.InflationState.getDefaultInstance() : assets_;
    }
    /**
     * <pre>
     * todo (reviewer): yaml naming is a bit inconsistent. state contains assets
     * </pre>
     *
     * <code>.em.inflation.v1.InflationState assets = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "InflationState", (.gogoproto.moretags) = "yaml:&#92;"assets&#92;""];</code>
     */
    @java.lang.Override
    public em.inflation.v1.Inflation.InflationStateOrBuilder getAssetsOrBuilder() {
      return getAssets();
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
      if (assets_ != null) {
        output.writeMessage(1, getAssets());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (assets_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getAssets());
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
      if (!(obj instanceof em.inflation.v1.Genesis.GenesisState)) {
        return super.equals(obj);
      }
      em.inflation.v1.Genesis.GenesisState other = (em.inflation.v1.Genesis.GenesisState) obj;

      if (hasAssets() != other.hasAssets()) return false;
      if (hasAssets()) {
        if (!getAssets()
            .equals(other.getAssets())) return false;
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
      if (hasAssets()) {
        hash = (37 * hash) + ASSETS_FIELD_NUMBER;
        hash = (53 * hash) + getAssets().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static em.inflation.v1.Genesis.GenesisState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static em.inflation.v1.Genesis.GenesisState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static em.inflation.v1.Genesis.GenesisState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static em.inflation.v1.Genesis.GenesisState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static em.inflation.v1.Genesis.GenesisState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static em.inflation.v1.Genesis.GenesisState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static em.inflation.v1.Genesis.GenesisState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static em.inflation.v1.Genesis.GenesisState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static em.inflation.v1.Genesis.GenesisState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static em.inflation.v1.Genesis.GenesisState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static em.inflation.v1.Genesis.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static em.inflation.v1.Genesis.GenesisState parseFrom(
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
    public static Builder newBuilder(em.inflation.v1.Genesis.GenesisState prototype) {
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
     * Protobuf type {@code em.inflation.v1.GenesisState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:em.inflation.v1.GenesisState)
        em.inflation.v1.Genesis.GenesisStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return em.inflation.v1.Genesis.internal_static_em_inflation_v1_GenesisState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return em.inflation.v1.Genesis.internal_static_em_inflation_v1_GenesisState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                em.inflation.v1.Genesis.GenesisState.class, em.inflation.v1.Genesis.GenesisState.Builder.class);
      }

      // Construct using em.inflation.v1.Genesis.GenesisState.newBuilder()
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
        if (assetsBuilder_ == null) {
          assets_ = null;
        } else {
          assets_ = null;
          assetsBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return em.inflation.v1.Genesis.internal_static_em_inflation_v1_GenesisState_descriptor;
      }

      @java.lang.Override
      public em.inflation.v1.Genesis.GenesisState getDefaultInstanceForType() {
        return em.inflation.v1.Genesis.GenesisState.getDefaultInstance();
      }

      @java.lang.Override
      public em.inflation.v1.Genesis.GenesisState build() {
        em.inflation.v1.Genesis.GenesisState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public em.inflation.v1.Genesis.GenesisState buildPartial() {
        em.inflation.v1.Genesis.GenesisState result = new em.inflation.v1.Genesis.GenesisState(this);
        if (assetsBuilder_ == null) {
          result.assets_ = assets_;
        } else {
          result.assets_ = assetsBuilder_.build();
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
        if (other instanceof em.inflation.v1.Genesis.GenesisState) {
          return mergeFrom((em.inflation.v1.Genesis.GenesisState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(em.inflation.v1.Genesis.GenesisState other) {
        if (other == em.inflation.v1.Genesis.GenesisState.getDefaultInstance()) return this;
        if (other.hasAssets()) {
          mergeAssets(other.getAssets());
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
        em.inflation.v1.Genesis.GenesisState parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (em.inflation.v1.Genesis.GenesisState) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private em.inflation.v1.Inflation.InflationState assets_;
      private com.google.protobuf.SingleFieldBuilderV3<
          em.inflation.v1.Inflation.InflationState, em.inflation.v1.Inflation.InflationState.Builder, em.inflation.v1.Inflation.InflationStateOrBuilder> assetsBuilder_;
      /**
       * <pre>
       * todo (reviewer): yaml naming is a bit inconsistent. state contains assets
       * </pre>
       *
       * <code>.em.inflation.v1.InflationState assets = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "InflationState", (.gogoproto.moretags) = "yaml:&#92;"assets&#92;""];</code>
       * @return Whether the assets field is set.
       */
      public boolean hasAssets() {
        return assetsBuilder_ != null || assets_ != null;
      }
      /**
       * <pre>
       * todo (reviewer): yaml naming is a bit inconsistent. state contains assets
       * </pre>
       *
       * <code>.em.inflation.v1.InflationState assets = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "InflationState", (.gogoproto.moretags) = "yaml:&#92;"assets&#92;""];</code>
       * @return The assets.
       */
      public em.inflation.v1.Inflation.InflationState getAssets() {
        if (assetsBuilder_ == null) {
          return assets_ == null ? em.inflation.v1.Inflation.InflationState.getDefaultInstance() : assets_;
        } else {
          return assetsBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * todo (reviewer): yaml naming is a bit inconsistent. state contains assets
       * </pre>
       *
       * <code>.em.inflation.v1.InflationState assets = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "InflationState", (.gogoproto.moretags) = "yaml:&#92;"assets&#92;""];</code>
       */
      public Builder setAssets(em.inflation.v1.Inflation.InflationState value) {
        if (assetsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          assets_ = value;
          onChanged();
        } else {
          assetsBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * todo (reviewer): yaml naming is a bit inconsistent. state contains assets
       * </pre>
       *
       * <code>.em.inflation.v1.InflationState assets = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "InflationState", (.gogoproto.moretags) = "yaml:&#92;"assets&#92;""];</code>
       */
      public Builder setAssets(
          em.inflation.v1.Inflation.InflationState.Builder builderForValue) {
        if (assetsBuilder_ == null) {
          assets_ = builderForValue.build();
          onChanged();
        } else {
          assetsBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * todo (reviewer): yaml naming is a bit inconsistent. state contains assets
       * </pre>
       *
       * <code>.em.inflation.v1.InflationState assets = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "InflationState", (.gogoproto.moretags) = "yaml:&#92;"assets&#92;""];</code>
       */
      public Builder mergeAssets(em.inflation.v1.Inflation.InflationState value) {
        if (assetsBuilder_ == null) {
          if (assets_ != null) {
            assets_ =
              em.inflation.v1.Inflation.InflationState.newBuilder(assets_).mergeFrom(value).buildPartial();
          } else {
            assets_ = value;
          }
          onChanged();
        } else {
          assetsBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * todo (reviewer): yaml naming is a bit inconsistent. state contains assets
       * </pre>
       *
       * <code>.em.inflation.v1.InflationState assets = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "InflationState", (.gogoproto.moretags) = "yaml:&#92;"assets&#92;""];</code>
       */
      public Builder clearAssets() {
        if (assetsBuilder_ == null) {
          assets_ = null;
          onChanged();
        } else {
          assets_ = null;
          assetsBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * todo (reviewer): yaml naming is a bit inconsistent. state contains assets
       * </pre>
       *
       * <code>.em.inflation.v1.InflationState assets = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "InflationState", (.gogoproto.moretags) = "yaml:&#92;"assets&#92;""];</code>
       */
      public em.inflation.v1.Inflation.InflationState.Builder getAssetsBuilder() {
        
        onChanged();
        return getAssetsFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * todo (reviewer): yaml naming is a bit inconsistent. state contains assets
       * </pre>
       *
       * <code>.em.inflation.v1.InflationState assets = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "InflationState", (.gogoproto.moretags) = "yaml:&#92;"assets&#92;""];</code>
       */
      public em.inflation.v1.Inflation.InflationStateOrBuilder getAssetsOrBuilder() {
        if (assetsBuilder_ != null) {
          return assetsBuilder_.getMessageOrBuilder();
        } else {
          return assets_ == null ?
              em.inflation.v1.Inflation.InflationState.getDefaultInstance() : assets_;
        }
      }
      /**
       * <pre>
       * todo (reviewer): yaml naming is a bit inconsistent. state contains assets
       * </pre>
       *
       * <code>.em.inflation.v1.InflationState assets = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "InflationState", (.gogoproto.moretags) = "yaml:&#92;"assets&#92;""];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          em.inflation.v1.Inflation.InflationState, em.inflation.v1.Inflation.InflationState.Builder, em.inflation.v1.Inflation.InflationStateOrBuilder> 
          getAssetsFieldBuilder() {
        if (assetsBuilder_ == null) {
          assetsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              em.inflation.v1.Inflation.InflationState, em.inflation.v1.Inflation.InflationState.Builder, em.inflation.v1.Inflation.InflationStateOrBuilder>(
                  getAssets(),
                  getParentForChildren(),
                  isClean());
          assets_ = null;
        }
        return assetsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:em.inflation.v1.GenesisState)
    }

    // @@protoc_insertion_point(class_scope:em.inflation.v1.GenesisState)
    private static final em.inflation.v1.Genesis.GenesisState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new em.inflation.v1.Genesis.GenesisState();
    }

    public static em.inflation.v1.Genesis.GenesisState getDefaultInstance() {
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
    public em.inflation.v1.Genesis.GenesisState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_em_inflation_v1_GenesisState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_em_inflation_v1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035em/inflation/v1/genesis.proto\022\017em.infl" +
      "ation.v1\032\024gogoproto/gogo.proto\032\037em/infla" +
      "tion/v1/inflation.proto\"h\n\014GenesisState\022" +
      "X\n\006assets\030\001 \001(\0132\037.em.inflation.v1.Inflat" +
      "ionStateB\'\342\336\037\016InflationState\362\336\037\ryaml:\"as" +
      "sets\"\310\336\037\000B0Z.github.com/e-money/em-ledge" +
      "r/x/inflation/typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
          em.inflation.v1.Inflation.getDescriptor(),
        });
    internal_static_em_inflation_v1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_em_inflation_v1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_em_inflation_v1_GenesisState_descriptor,
        new java.lang.String[] { "Assets", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.customname);
    registry.add(com.google.protobuf.GoGoProtos.moretags);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    em.inflation.v1.Inflation.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
