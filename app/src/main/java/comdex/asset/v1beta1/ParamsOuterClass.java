// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/asset/v1beta1/params.proto

package comdex.asset.v1beta1;

public final class ParamsOuterClass {
  private ParamsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:comdex.asset.v1beta1.Params)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string admin = 1 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     * @return The admin.
     */
    java.lang.String getAdmin();
    /**
     * <code>string admin = 1 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     * @return The bytes for admin.
     */
    com.google.protobuf.ByteString
        getAdminBytes();
  }
  /**
   * Protobuf type {@code comdex.asset.v1beta1.Params}
   */
  public static final class Params extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:comdex.asset.v1beta1.Params)
      ParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Params.newBuilder() to construct.
    private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Params() {
      admin_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Params();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Params(
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

              admin_ = s;
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
      return comdex.asset.v1beta1.ParamsOuterClass.internal_static_comdex_asset_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return comdex.asset.v1beta1.ParamsOuterClass.internal_static_comdex_asset_v1beta1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              comdex.asset.v1beta1.ParamsOuterClass.Params.class, comdex.asset.v1beta1.ParamsOuterClass.Params.Builder.class);
    }

    public static final int ADMIN_FIELD_NUMBER = 1;
    private volatile java.lang.Object admin_;
    /**
     * <code>string admin = 1 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     * @return The admin.
     */
    @java.lang.Override
    public java.lang.String getAdmin() {
      java.lang.Object ref = admin_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        admin_ = s;
        return s;
      }
    }
    /**
     * <code>string admin = 1 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     * @return The bytes for admin.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAdminBytes() {
      java.lang.Object ref = admin_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        admin_ = b;
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
      if (!getAdminBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, admin_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getAdminBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, admin_);
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
      if (!(obj instanceof comdex.asset.v1beta1.ParamsOuterClass.Params)) {
        return super.equals(obj);
      }
      comdex.asset.v1beta1.ParamsOuterClass.Params other = (comdex.asset.v1beta1.ParamsOuterClass.Params) obj;

      if (!getAdmin()
          .equals(other.getAdmin())) return false;
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
      hash = (37 * hash) + ADMIN_FIELD_NUMBER;
      hash = (53 * hash) + getAdmin().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static comdex.asset.v1beta1.ParamsOuterClass.Params parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static comdex.asset.v1beta1.ParamsOuterClass.Params parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static comdex.asset.v1beta1.ParamsOuterClass.Params parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static comdex.asset.v1beta1.ParamsOuterClass.Params parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static comdex.asset.v1beta1.ParamsOuterClass.Params parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static comdex.asset.v1beta1.ParamsOuterClass.Params parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static comdex.asset.v1beta1.ParamsOuterClass.Params parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static comdex.asset.v1beta1.ParamsOuterClass.Params parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static comdex.asset.v1beta1.ParamsOuterClass.Params parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static comdex.asset.v1beta1.ParamsOuterClass.Params parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static comdex.asset.v1beta1.ParamsOuterClass.Params parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static comdex.asset.v1beta1.ParamsOuterClass.Params parseFrom(
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
    public static Builder newBuilder(comdex.asset.v1beta1.ParamsOuterClass.Params prototype) {
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
     * Protobuf type {@code comdex.asset.v1beta1.Params}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:comdex.asset.v1beta1.Params)
        comdex.asset.v1beta1.ParamsOuterClass.ParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return comdex.asset.v1beta1.ParamsOuterClass.internal_static_comdex_asset_v1beta1_Params_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return comdex.asset.v1beta1.ParamsOuterClass.internal_static_comdex_asset_v1beta1_Params_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                comdex.asset.v1beta1.ParamsOuterClass.Params.class, comdex.asset.v1beta1.ParamsOuterClass.Params.Builder.class);
      }

      // Construct using comdex.asset.v1beta1.ParamsOuterClass.Params.newBuilder()
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
        admin_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return comdex.asset.v1beta1.ParamsOuterClass.internal_static_comdex_asset_v1beta1_Params_descriptor;
      }

      @java.lang.Override
      public comdex.asset.v1beta1.ParamsOuterClass.Params getDefaultInstanceForType() {
        return comdex.asset.v1beta1.ParamsOuterClass.Params.getDefaultInstance();
      }

      @java.lang.Override
      public comdex.asset.v1beta1.ParamsOuterClass.Params build() {
        comdex.asset.v1beta1.ParamsOuterClass.Params result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public comdex.asset.v1beta1.ParamsOuterClass.Params buildPartial() {
        comdex.asset.v1beta1.ParamsOuterClass.Params result = new comdex.asset.v1beta1.ParamsOuterClass.Params(this);
        result.admin_ = admin_;
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
        if (other instanceof comdex.asset.v1beta1.ParamsOuterClass.Params) {
          return mergeFrom((comdex.asset.v1beta1.ParamsOuterClass.Params)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(comdex.asset.v1beta1.ParamsOuterClass.Params other) {
        if (other == comdex.asset.v1beta1.ParamsOuterClass.Params.getDefaultInstance()) return this;
        if (!other.getAdmin().isEmpty()) {
          admin_ = other.admin_;
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
        comdex.asset.v1beta1.ParamsOuterClass.Params parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (comdex.asset.v1beta1.ParamsOuterClass.Params) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object admin_ = "";
      /**
       * <code>string admin = 1 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
       * @return The admin.
       */
      public java.lang.String getAdmin() {
        java.lang.Object ref = admin_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          admin_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string admin = 1 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
       * @return The bytes for admin.
       */
      public com.google.protobuf.ByteString
          getAdminBytes() {
        java.lang.Object ref = admin_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          admin_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string admin = 1 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
       * @param value The admin to set.
       * @return This builder for chaining.
       */
      public Builder setAdmin(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        admin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string admin = 1 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearAdmin() {
        
        admin_ = getDefaultInstance().getAdmin();
        onChanged();
        return this;
      }
      /**
       * <code>string admin = 1 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
       * @param value The bytes for admin to set.
       * @return This builder for chaining.
       */
      public Builder setAdminBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        admin_ = value;
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


      // @@protoc_insertion_point(builder_scope:comdex.asset.v1beta1.Params)
    }

    // @@protoc_insertion_point(class_scope:comdex.asset.v1beta1.Params)
    private static final comdex.asset.v1beta1.ParamsOuterClass.Params DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new comdex.asset.v1beta1.ParamsOuterClass.Params();
    }

    public static comdex.asset.v1beta1.ParamsOuterClass.Params getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Params>
        PARSER = new com.google.protobuf.AbstractParser<Params>() {
      @java.lang.Override
      public Params parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Params(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Params> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Params> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public comdex.asset.v1beta1.ParamsOuterClass.Params getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_comdex_asset_v1beta1_Params_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_comdex_asset_v1beta1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!comdex/asset/v1beta1/params.proto\022\024com" +
      "dex.asset.v1beta1\032\024gogoproto/gogo.proto\"" +
      ")\n\006Params\022\037\n\005admin\030\001 \001(\tB\020\362\336\037\014yaml:\"admi" +
      "n\"B9Z/github.com/comdex-official/comdex/" +
      "x/asset/types\250\342\036\000\310\341\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
        });
    internal_static_comdex_asset_v1beta1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_comdex_asset_v1beta1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_comdex_asset_v1beta1_Params_descriptor,
        new java.lang.String[] { "Admin", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.equalAll);
    registry.add(com.google.protobuf.GoGoProtos.goprotoGettersAll);
    registry.add(com.google.protobuf.GoGoProtos.moretags);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
