// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/session/v1/params.proto

package sentinel.session.v1;

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
      // @@protoc_insertion_point(interface_extends:sentinel.session.v1.Params)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.google.protobuf.Duration inactive_duration = 1 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return Whether the inactiveDuration field is set.
     */
    boolean hasInactiveDuration();
    /**
     * <code>.google.protobuf.Duration inactive_duration = 1 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return The inactiveDuration.
     */
    com.google.protobuf.Duration getInactiveDuration();
    /**
     * <code>.google.protobuf.Duration inactive_duration = 1 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    com.google.protobuf.DurationOrBuilder getInactiveDurationOrBuilder();

    /**
     * <code>bool proof_verification_enabled = 2;</code>
     * @return The proofVerificationEnabled.
     */
    boolean getProofVerificationEnabled();
  }
  /**
   * Protobuf type {@code sentinel.session.v1.Params}
   */
  public static final class Params extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:sentinel.session.v1.Params)
      ParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Params.newBuilder() to construct.
    private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Params() {
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
              com.google.protobuf.Duration.Builder subBuilder = null;
              if (inactiveDuration_ != null) {
                subBuilder = inactiveDuration_.toBuilder();
              }
              inactiveDuration_ = input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(inactiveDuration_);
                inactiveDuration_ = subBuilder.buildPartial();
              }

              break;
            }
            case 16: {

              proofVerificationEnabled_ = input.readBool();
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
      return sentinel.session.v1.ParamsOuterClass.internal_static_sentinel_session_v1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sentinel.session.v1.ParamsOuterClass.internal_static_sentinel_session_v1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sentinel.session.v1.ParamsOuterClass.Params.class, sentinel.session.v1.ParamsOuterClass.Params.Builder.class);
    }

    public static final int INACTIVE_DURATION_FIELD_NUMBER = 1;
    private com.google.protobuf.Duration inactiveDuration_;
    /**
     * <code>.google.protobuf.Duration inactive_duration = 1 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return Whether the inactiveDuration field is set.
     */
    @java.lang.Override
    public boolean hasInactiveDuration() {
      return inactiveDuration_ != null;
    }
    /**
     * <code>.google.protobuf.Duration inactive_duration = 1 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return The inactiveDuration.
     */
    @java.lang.Override
    public com.google.protobuf.Duration getInactiveDuration() {
      return inactiveDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : inactiveDuration_;
    }
    /**
     * <code>.google.protobuf.Duration inactive_duration = 1 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    @java.lang.Override
    public com.google.protobuf.DurationOrBuilder getInactiveDurationOrBuilder() {
      return getInactiveDuration();
    }

    public static final int PROOF_VERIFICATION_ENABLED_FIELD_NUMBER = 2;
    private boolean proofVerificationEnabled_;
    /**
     * <code>bool proof_verification_enabled = 2;</code>
     * @return The proofVerificationEnabled.
     */
    @java.lang.Override
    public boolean getProofVerificationEnabled() {
      return proofVerificationEnabled_;
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
      if (inactiveDuration_ != null) {
        output.writeMessage(1, getInactiveDuration());
      }
      if (proofVerificationEnabled_ != false) {
        output.writeBool(2, proofVerificationEnabled_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (inactiveDuration_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getInactiveDuration());
      }
      if (proofVerificationEnabled_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, proofVerificationEnabled_);
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
      if (!(obj instanceof sentinel.session.v1.ParamsOuterClass.Params)) {
        return super.equals(obj);
      }
      sentinel.session.v1.ParamsOuterClass.Params other = (sentinel.session.v1.ParamsOuterClass.Params) obj;

      if (hasInactiveDuration() != other.hasInactiveDuration()) return false;
      if (hasInactiveDuration()) {
        if (!getInactiveDuration()
            .equals(other.getInactiveDuration())) return false;
      }
      if (getProofVerificationEnabled()
          != other.getProofVerificationEnabled()) return false;
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
      if (hasInactiveDuration()) {
        hash = (37 * hash) + INACTIVE_DURATION_FIELD_NUMBER;
        hash = (53 * hash) + getInactiveDuration().hashCode();
      }
      hash = (37 * hash) + PROOF_VERIFICATION_ENABLED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getProofVerificationEnabled());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static sentinel.session.v1.ParamsOuterClass.Params parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sentinel.session.v1.ParamsOuterClass.Params parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sentinel.session.v1.ParamsOuterClass.Params parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sentinel.session.v1.ParamsOuterClass.Params parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sentinel.session.v1.ParamsOuterClass.Params parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sentinel.session.v1.ParamsOuterClass.Params parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sentinel.session.v1.ParamsOuterClass.Params parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sentinel.session.v1.ParamsOuterClass.Params parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static sentinel.session.v1.ParamsOuterClass.Params parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static sentinel.session.v1.ParamsOuterClass.Params parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static sentinel.session.v1.ParamsOuterClass.Params parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sentinel.session.v1.ParamsOuterClass.Params parseFrom(
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
    public static Builder newBuilder(sentinel.session.v1.ParamsOuterClass.Params prototype) {
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
     * Protobuf type {@code sentinel.session.v1.Params}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:sentinel.session.v1.Params)
        sentinel.session.v1.ParamsOuterClass.ParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return sentinel.session.v1.ParamsOuterClass.internal_static_sentinel_session_v1_Params_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return sentinel.session.v1.ParamsOuterClass.internal_static_sentinel_session_v1_Params_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                sentinel.session.v1.ParamsOuterClass.Params.class, sentinel.session.v1.ParamsOuterClass.Params.Builder.class);
      }

      // Construct using sentinel.session.v1.ParamsOuterClass.Params.newBuilder()
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
        if (inactiveDurationBuilder_ == null) {
          inactiveDuration_ = null;
        } else {
          inactiveDuration_ = null;
          inactiveDurationBuilder_ = null;
        }
        proofVerificationEnabled_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return sentinel.session.v1.ParamsOuterClass.internal_static_sentinel_session_v1_Params_descriptor;
      }

      @java.lang.Override
      public sentinel.session.v1.ParamsOuterClass.Params getDefaultInstanceForType() {
        return sentinel.session.v1.ParamsOuterClass.Params.getDefaultInstance();
      }

      @java.lang.Override
      public sentinel.session.v1.ParamsOuterClass.Params build() {
        sentinel.session.v1.ParamsOuterClass.Params result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public sentinel.session.v1.ParamsOuterClass.Params buildPartial() {
        sentinel.session.v1.ParamsOuterClass.Params result = new sentinel.session.v1.ParamsOuterClass.Params(this);
        if (inactiveDurationBuilder_ == null) {
          result.inactiveDuration_ = inactiveDuration_;
        } else {
          result.inactiveDuration_ = inactiveDurationBuilder_.build();
        }
        result.proofVerificationEnabled_ = proofVerificationEnabled_;
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
        if (other instanceof sentinel.session.v1.ParamsOuterClass.Params) {
          return mergeFrom((sentinel.session.v1.ParamsOuterClass.Params)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(sentinel.session.v1.ParamsOuterClass.Params other) {
        if (other == sentinel.session.v1.ParamsOuterClass.Params.getDefaultInstance()) return this;
        if (other.hasInactiveDuration()) {
          mergeInactiveDuration(other.getInactiveDuration());
        }
        if (other.getProofVerificationEnabled() != false) {
          setProofVerificationEnabled(other.getProofVerificationEnabled());
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
        sentinel.session.v1.ParamsOuterClass.Params parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (sentinel.session.v1.ParamsOuterClass.Params) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.Duration inactiveDuration_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> inactiveDurationBuilder_;
      /**
       * <code>.google.protobuf.Duration inactive_duration = 1 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       * @return Whether the inactiveDuration field is set.
       */
      public boolean hasInactiveDuration() {
        return inactiveDurationBuilder_ != null || inactiveDuration_ != null;
      }
      /**
       * <code>.google.protobuf.Duration inactive_duration = 1 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       * @return The inactiveDuration.
       */
      public com.google.protobuf.Duration getInactiveDuration() {
        if (inactiveDurationBuilder_ == null) {
          return inactiveDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : inactiveDuration_;
        } else {
          return inactiveDurationBuilder_.getMessage();
        }
      }
      /**
       * <code>.google.protobuf.Duration inactive_duration = 1 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      public Builder setInactiveDuration(com.google.protobuf.Duration value) {
        if (inactiveDurationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          inactiveDuration_ = value;
          onChanged();
        } else {
          inactiveDurationBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Duration inactive_duration = 1 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      public Builder setInactiveDuration(
          com.google.protobuf.Duration.Builder builderForValue) {
        if (inactiveDurationBuilder_ == null) {
          inactiveDuration_ = builderForValue.build();
          onChanged();
        } else {
          inactiveDurationBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Duration inactive_duration = 1 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      public Builder mergeInactiveDuration(com.google.protobuf.Duration value) {
        if (inactiveDurationBuilder_ == null) {
          if (inactiveDuration_ != null) {
            inactiveDuration_ =
              com.google.protobuf.Duration.newBuilder(inactiveDuration_).mergeFrom(value).buildPartial();
          } else {
            inactiveDuration_ = value;
          }
          onChanged();
        } else {
          inactiveDurationBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Duration inactive_duration = 1 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      public Builder clearInactiveDuration() {
        if (inactiveDurationBuilder_ == null) {
          inactiveDuration_ = null;
          onChanged();
        } else {
          inactiveDuration_ = null;
          inactiveDurationBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Duration inactive_duration = 1 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      public com.google.protobuf.Duration.Builder getInactiveDurationBuilder() {
        
        onChanged();
        return getInactiveDurationFieldBuilder().getBuilder();
      }
      /**
       * <code>.google.protobuf.Duration inactive_duration = 1 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      public com.google.protobuf.DurationOrBuilder getInactiveDurationOrBuilder() {
        if (inactiveDurationBuilder_ != null) {
          return inactiveDurationBuilder_.getMessageOrBuilder();
        } else {
          return inactiveDuration_ == null ?
              com.google.protobuf.Duration.getDefaultInstance() : inactiveDuration_;
        }
      }
      /**
       * <code>.google.protobuf.Duration inactive_duration = 1 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
          getInactiveDurationFieldBuilder() {
        if (inactiveDurationBuilder_ == null) {
          inactiveDurationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                  getInactiveDuration(),
                  getParentForChildren(),
                  isClean());
          inactiveDuration_ = null;
        }
        return inactiveDurationBuilder_;
      }

      private boolean proofVerificationEnabled_ ;
      /**
       * <code>bool proof_verification_enabled = 2;</code>
       * @return The proofVerificationEnabled.
       */
      @java.lang.Override
      public boolean getProofVerificationEnabled() {
        return proofVerificationEnabled_;
      }
      /**
       * <code>bool proof_verification_enabled = 2;</code>
       * @param value The proofVerificationEnabled to set.
       * @return This builder for chaining.
       */
      public Builder setProofVerificationEnabled(boolean value) {
        
        proofVerificationEnabled_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool proof_verification_enabled = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearProofVerificationEnabled() {
        
        proofVerificationEnabled_ = false;
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


      // @@protoc_insertion_point(builder_scope:sentinel.session.v1.Params)
    }

    // @@protoc_insertion_point(class_scope:sentinel.session.v1.Params)
    private static final sentinel.session.v1.ParamsOuterClass.Params DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new sentinel.session.v1.ParamsOuterClass.Params();
    }

    public static sentinel.session.v1.ParamsOuterClass.Params getDefaultInstance() {
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
    public sentinel.session.v1.ParamsOuterClass.Params getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sentinel_session_v1_Params_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sentinel_session_v1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n sentinel/session/v1/params.proto\022\023sent" +
      "inel.session.v1\032\024gogoproto/gogo.proto\032\036g" +
      "oogle/protobuf/duration.proto\"l\n\006Params\022" +
      ">\n\021inactive_duration\030\001 \001(\0132\031.google.prot" +
      "obuf.DurationB\010\310\336\037\000\230\337\037\001\022\"\n\032proof_verific" +
      "ation_enabled\030\002 \001(\010B:Z0github.com/sentin" +
      "el-official/hub/x/session/types\250\342\036\000\310\341\036\000b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_sentinel_session_v1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sentinel_session_v1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sentinel_session_v1_Params_descriptor,
        new java.lang.String[] { "InactiveDuration", "ProofVerificationEnabled", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.equalAll);
    registry.add(com.google.protobuf.GoGoProtos.goprotoGettersAll);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    registry.add(com.google.protobuf.GoGoProtos.stdduration);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
