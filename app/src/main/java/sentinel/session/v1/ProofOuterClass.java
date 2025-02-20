// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/session/v1/proof.proto

package sentinel.session.v1;

public final class ProofOuterClass {
  private ProofOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ProofOrBuilder extends
      // @@protoc_insertion_point(interface_extends:sentinel.session.v1.Proof)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 id = 1;</code>
     * @return The id.
     */
    long getId();

    /**
     * <code>.google.protobuf.Duration duration = 2 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return Whether the duration field is set.
     */
    boolean hasDuration();
    /**
     * <code>.google.protobuf.Duration duration = 2 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return The duration.
     */
    com.google.protobuf.Duration getDuration();
    /**
     * <code>.google.protobuf.Duration duration = 2 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    com.google.protobuf.DurationOrBuilder getDurationOrBuilder();

    /**
     * <code>.sentinel.types.v1.Bandwidth bandwidth = 3 [(.gogoproto.nullable) = false];</code>
     * @return Whether the bandwidth field is set.
     */
    boolean hasBandwidth();
    /**
     * <code>.sentinel.types.v1.Bandwidth bandwidth = 3 [(.gogoproto.nullable) = false];</code>
     * @return The bandwidth.
     */
    sentinel.types.v1.BandwidthOuterClass.Bandwidth getBandwidth();
    /**
     * <code>.sentinel.types.v1.Bandwidth bandwidth = 3 [(.gogoproto.nullable) = false];</code>
     */
    sentinel.types.v1.BandwidthOuterClass.BandwidthOrBuilder getBandwidthOrBuilder();
  }
  /**
   * Protobuf type {@code sentinel.session.v1.Proof}
   */
  public static final class Proof extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:sentinel.session.v1.Proof)
      ProofOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Proof.newBuilder() to construct.
    private Proof(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Proof() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Proof();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Proof(
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
            case 8: {

              id_ = input.readUInt64();
              break;
            }
            case 18: {
              com.google.protobuf.Duration.Builder subBuilder = null;
              if (duration_ != null) {
                subBuilder = duration_.toBuilder();
              }
              duration_ = input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(duration_);
                duration_ = subBuilder.buildPartial();
              }

              break;
            }
            case 26: {
              sentinel.types.v1.BandwidthOuterClass.Bandwidth.Builder subBuilder = null;
              if (bandwidth_ != null) {
                subBuilder = bandwidth_.toBuilder();
              }
              bandwidth_ = input.readMessage(sentinel.types.v1.BandwidthOuterClass.Bandwidth.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(bandwidth_);
                bandwidth_ = subBuilder.buildPartial();
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
      return sentinel.session.v1.ProofOuterClass.internal_static_sentinel_session_v1_Proof_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sentinel.session.v1.ProofOuterClass.internal_static_sentinel_session_v1_Proof_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sentinel.session.v1.ProofOuterClass.Proof.class, sentinel.session.v1.ProofOuterClass.Proof.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <code>uint64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }

    public static final int DURATION_FIELD_NUMBER = 2;
    private com.google.protobuf.Duration duration_;
    /**
     * <code>.google.protobuf.Duration duration = 2 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return Whether the duration field is set.
     */
    @java.lang.Override
    public boolean hasDuration() {
      return duration_ != null;
    }
    /**
     * <code>.google.protobuf.Duration duration = 2 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return The duration.
     */
    @java.lang.Override
    public com.google.protobuf.Duration getDuration() {
      return duration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : duration_;
    }
    /**
     * <code>.google.protobuf.Duration duration = 2 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    @java.lang.Override
    public com.google.protobuf.DurationOrBuilder getDurationOrBuilder() {
      return getDuration();
    }

    public static final int BANDWIDTH_FIELD_NUMBER = 3;
    private sentinel.types.v1.BandwidthOuterClass.Bandwidth bandwidth_;
    /**
     * <code>.sentinel.types.v1.Bandwidth bandwidth = 3 [(.gogoproto.nullable) = false];</code>
     * @return Whether the bandwidth field is set.
     */
    @java.lang.Override
    public boolean hasBandwidth() {
      return bandwidth_ != null;
    }
    /**
     * <code>.sentinel.types.v1.Bandwidth bandwidth = 3 [(.gogoproto.nullable) = false];</code>
     * @return The bandwidth.
     */
    @java.lang.Override
    public sentinel.types.v1.BandwidthOuterClass.Bandwidth getBandwidth() {
      return bandwidth_ == null ? sentinel.types.v1.BandwidthOuterClass.Bandwidth.getDefaultInstance() : bandwidth_;
    }
    /**
     * <code>.sentinel.types.v1.Bandwidth bandwidth = 3 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public sentinel.types.v1.BandwidthOuterClass.BandwidthOrBuilder getBandwidthOrBuilder() {
      return getBandwidth();
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
      if (id_ != 0L) {
        output.writeUInt64(1, id_);
      }
      if (duration_ != null) {
        output.writeMessage(2, getDuration());
      }
      if (bandwidth_ != null) {
        output.writeMessage(3, getBandwidth());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, id_);
      }
      if (duration_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getDuration());
      }
      if (bandwidth_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getBandwidth());
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
      if (!(obj instanceof sentinel.session.v1.ProofOuterClass.Proof)) {
        return super.equals(obj);
      }
      sentinel.session.v1.ProofOuterClass.Proof other = (sentinel.session.v1.ProofOuterClass.Proof) obj;

      if (getId()
          != other.getId()) return false;
      if (hasDuration() != other.hasDuration()) return false;
      if (hasDuration()) {
        if (!getDuration()
            .equals(other.getDuration())) return false;
      }
      if (hasBandwidth() != other.hasBandwidth()) return false;
      if (hasBandwidth()) {
        if (!getBandwidth()
            .equals(other.getBandwidth())) return false;
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
      if (hasDuration()) {
        hash = (37 * hash) + DURATION_FIELD_NUMBER;
        hash = (53 * hash) + getDuration().hashCode();
      }
      if (hasBandwidth()) {
        hash = (37 * hash) + BANDWIDTH_FIELD_NUMBER;
        hash = (53 * hash) + getBandwidth().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static sentinel.session.v1.ProofOuterClass.Proof parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sentinel.session.v1.ProofOuterClass.Proof parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sentinel.session.v1.ProofOuterClass.Proof parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sentinel.session.v1.ProofOuterClass.Proof parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sentinel.session.v1.ProofOuterClass.Proof parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sentinel.session.v1.ProofOuterClass.Proof parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sentinel.session.v1.ProofOuterClass.Proof parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sentinel.session.v1.ProofOuterClass.Proof parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static sentinel.session.v1.ProofOuterClass.Proof parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static sentinel.session.v1.ProofOuterClass.Proof parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static sentinel.session.v1.ProofOuterClass.Proof parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sentinel.session.v1.ProofOuterClass.Proof parseFrom(
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
    public static Builder newBuilder(sentinel.session.v1.ProofOuterClass.Proof prototype) {
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
     * Protobuf type {@code sentinel.session.v1.Proof}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:sentinel.session.v1.Proof)
        sentinel.session.v1.ProofOuterClass.ProofOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return sentinel.session.v1.ProofOuterClass.internal_static_sentinel_session_v1_Proof_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return sentinel.session.v1.ProofOuterClass.internal_static_sentinel_session_v1_Proof_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                sentinel.session.v1.ProofOuterClass.Proof.class, sentinel.session.v1.ProofOuterClass.Proof.Builder.class);
      }

      // Construct using sentinel.session.v1.ProofOuterClass.Proof.newBuilder()
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
        id_ = 0L;

        if (durationBuilder_ == null) {
          duration_ = null;
        } else {
          duration_ = null;
          durationBuilder_ = null;
        }
        if (bandwidthBuilder_ == null) {
          bandwidth_ = null;
        } else {
          bandwidth_ = null;
          bandwidthBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return sentinel.session.v1.ProofOuterClass.internal_static_sentinel_session_v1_Proof_descriptor;
      }

      @java.lang.Override
      public sentinel.session.v1.ProofOuterClass.Proof getDefaultInstanceForType() {
        return sentinel.session.v1.ProofOuterClass.Proof.getDefaultInstance();
      }

      @java.lang.Override
      public sentinel.session.v1.ProofOuterClass.Proof build() {
        sentinel.session.v1.ProofOuterClass.Proof result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public sentinel.session.v1.ProofOuterClass.Proof buildPartial() {
        sentinel.session.v1.ProofOuterClass.Proof result = new sentinel.session.v1.ProofOuterClass.Proof(this);
        result.id_ = id_;
        if (durationBuilder_ == null) {
          result.duration_ = duration_;
        } else {
          result.duration_ = durationBuilder_.build();
        }
        if (bandwidthBuilder_ == null) {
          result.bandwidth_ = bandwidth_;
        } else {
          result.bandwidth_ = bandwidthBuilder_.build();
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
        if (other instanceof sentinel.session.v1.ProofOuterClass.Proof) {
          return mergeFrom((sentinel.session.v1.ProofOuterClass.Proof)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(sentinel.session.v1.ProofOuterClass.Proof other) {
        if (other == sentinel.session.v1.ProofOuterClass.Proof.getDefaultInstance()) return this;
        if (other.getId() != 0L) {
          setId(other.getId());
        }
        if (other.hasDuration()) {
          mergeDuration(other.getDuration());
        }
        if (other.hasBandwidth()) {
          mergeBandwidth(other.getBandwidth());
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
        sentinel.session.v1.ProofOuterClass.Proof parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (sentinel.session.v1.ProofOuterClass.Proof) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long id_ ;
      /**
       * <code>uint64 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public long getId() {
        return id_;
      }
      /**
       * <code>uint64 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(long value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.Duration duration_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> durationBuilder_;
      /**
       * <code>.google.protobuf.Duration duration = 2 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       * @return Whether the duration field is set.
       */
      public boolean hasDuration() {
        return durationBuilder_ != null || duration_ != null;
      }
      /**
       * <code>.google.protobuf.Duration duration = 2 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       * @return The duration.
       */
      public com.google.protobuf.Duration getDuration() {
        if (durationBuilder_ == null) {
          return duration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : duration_;
        } else {
          return durationBuilder_.getMessage();
        }
      }
      /**
       * <code>.google.protobuf.Duration duration = 2 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      public Builder setDuration(com.google.protobuf.Duration value) {
        if (durationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          duration_ = value;
          onChanged();
        } else {
          durationBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Duration duration = 2 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      public Builder setDuration(
          com.google.protobuf.Duration.Builder builderForValue) {
        if (durationBuilder_ == null) {
          duration_ = builderForValue.build();
          onChanged();
        } else {
          durationBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Duration duration = 2 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      public Builder mergeDuration(com.google.protobuf.Duration value) {
        if (durationBuilder_ == null) {
          if (duration_ != null) {
            duration_ =
              com.google.protobuf.Duration.newBuilder(duration_).mergeFrom(value).buildPartial();
          } else {
            duration_ = value;
          }
          onChanged();
        } else {
          durationBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Duration duration = 2 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      public Builder clearDuration() {
        if (durationBuilder_ == null) {
          duration_ = null;
          onChanged();
        } else {
          duration_ = null;
          durationBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Duration duration = 2 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      public com.google.protobuf.Duration.Builder getDurationBuilder() {
        
        onChanged();
        return getDurationFieldBuilder().getBuilder();
      }
      /**
       * <code>.google.protobuf.Duration duration = 2 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      public com.google.protobuf.DurationOrBuilder getDurationOrBuilder() {
        if (durationBuilder_ != null) {
          return durationBuilder_.getMessageOrBuilder();
        } else {
          return duration_ == null ?
              com.google.protobuf.Duration.getDefaultInstance() : duration_;
        }
      }
      /**
       * <code>.google.protobuf.Duration duration = 2 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
          getDurationFieldBuilder() {
        if (durationBuilder_ == null) {
          durationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                  getDuration(),
                  getParentForChildren(),
                  isClean());
          duration_ = null;
        }
        return durationBuilder_;
      }

      private sentinel.types.v1.BandwidthOuterClass.Bandwidth bandwidth_;
      private com.google.protobuf.SingleFieldBuilderV3<
          sentinel.types.v1.BandwidthOuterClass.Bandwidth, sentinel.types.v1.BandwidthOuterClass.Bandwidth.Builder, sentinel.types.v1.BandwidthOuterClass.BandwidthOrBuilder> bandwidthBuilder_;
      /**
       * <code>.sentinel.types.v1.Bandwidth bandwidth = 3 [(.gogoproto.nullable) = false];</code>
       * @return Whether the bandwidth field is set.
       */
      public boolean hasBandwidth() {
        return bandwidthBuilder_ != null || bandwidth_ != null;
      }
      /**
       * <code>.sentinel.types.v1.Bandwidth bandwidth = 3 [(.gogoproto.nullable) = false];</code>
       * @return The bandwidth.
       */
      public sentinel.types.v1.BandwidthOuterClass.Bandwidth getBandwidth() {
        if (bandwidthBuilder_ == null) {
          return bandwidth_ == null ? sentinel.types.v1.BandwidthOuterClass.Bandwidth.getDefaultInstance() : bandwidth_;
        } else {
          return bandwidthBuilder_.getMessage();
        }
      }
      /**
       * <code>.sentinel.types.v1.Bandwidth bandwidth = 3 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setBandwidth(sentinel.types.v1.BandwidthOuterClass.Bandwidth value) {
        if (bandwidthBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          bandwidth_ = value;
          onChanged();
        } else {
          bandwidthBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.sentinel.types.v1.Bandwidth bandwidth = 3 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setBandwidth(
          sentinel.types.v1.BandwidthOuterClass.Bandwidth.Builder builderForValue) {
        if (bandwidthBuilder_ == null) {
          bandwidth_ = builderForValue.build();
          onChanged();
        } else {
          bandwidthBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.sentinel.types.v1.Bandwidth bandwidth = 3 [(.gogoproto.nullable) = false];</code>
       */
      public Builder mergeBandwidth(sentinel.types.v1.BandwidthOuterClass.Bandwidth value) {
        if (bandwidthBuilder_ == null) {
          if (bandwidth_ != null) {
            bandwidth_ =
              sentinel.types.v1.BandwidthOuterClass.Bandwidth.newBuilder(bandwidth_).mergeFrom(value).buildPartial();
          } else {
            bandwidth_ = value;
          }
          onChanged();
        } else {
          bandwidthBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.sentinel.types.v1.Bandwidth bandwidth = 3 [(.gogoproto.nullable) = false];</code>
       */
      public Builder clearBandwidth() {
        if (bandwidthBuilder_ == null) {
          bandwidth_ = null;
          onChanged();
        } else {
          bandwidth_ = null;
          bandwidthBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.sentinel.types.v1.Bandwidth bandwidth = 3 [(.gogoproto.nullable) = false];</code>
       */
      public sentinel.types.v1.BandwidthOuterClass.Bandwidth.Builder getBandwidthBuilder() {
        
        onChanged();
        return getBandwidthFieldBuilder().getBuilder();
      }
      /**
       * <code>.sentinel.types.v1.Bandwidth bandwidth = 3 [(.gogoproto.nullable) = false];</code>
       */
      public sentinel.types.v1.BandwidthOuterClass.BandwidthOrBuilder getBandwidthOrBuilder() {
        if (bandwidthBuilder_ != null) {
          return bandwidthBuilder_.getMessageOrBuilder();
        } else {
          return bandwidth_ == null ?
              sentinel.types.v1.BandwidthOuterClass.Bandwidth.getDefaultInstance() : bandwidth_;
        }
      }
      /**
       * <code>.sentinel.types.v1.Bandwidth bandwidth = 3 [(.gogoproto.nullable) = false];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          sentinel.types.v1.BandwidthOuterClass.Bandwidth, sentinel.types.v1.BandwidthOuterClass.Bandwidth.Builder, sentinel.types.v1.BandwidthOuterClass.BandwidthOrBuilder> 
          getBandwidthFieldBuilder() {
        if (bandwidthBuilder_ == null) {
          bandwidthBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              sentinel.types.v1.BandwidthOuterClass.Bandwidth, sentinel.types.v1.BandwidthOuterClass.Bandwidth.Builder, sentinel.types.v1.BandwidthOuterClass.BandwidthOrBuilder>(
                  getBandwidth(),
                  getParentForChildren(),
                  isClean());
          bandwidth_ = null;
        }
        return bandwidthBuilder_;
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


      // @@protoc_insertion_point(builder_scope:sentinel.session.v1.Proof)
    }

    // @@protoc_insertion_point(class_scope:sentinel.session.v1.Proof)
    private static final sentinel.session.v1.ProofOuterClass.Proof DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new sentinel.session.v1.ProofOuterClass.Proof();
    }

    public static sentinel.session.v1.ProofOuterClass.Proof getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Proof>
        PARSER = new com.google.protobuf.AbstractParser<Proof>() {
      @java.lang.Override
      public Proof parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Proof(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Proof> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Proof> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public sentinel.session.v1.ProofOuterClass.Proof getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sentinel_session_v1_Proof_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sentinel_session_v1_Proof_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037sentinel/session/v1/proof.proto\022\023senti" +
      "nel.session.v1\032\024gogoproto/gogo.proto\032\036go" +
      "ogle/protobuf/duration.proto\032!sentinel/t" +
      "ypes/v1/bandwidth.proto\"\201\001\n\005Proof\022\n\n\002id\030" +
      "\001 \001(\004\0225\n\010duration\030\002 \001(\0132\031.google.protobu" +
      "f.DurationB\010\230\337\037\001\310\336\037\000\0225\n\tbandwidth\030\003 \001(\0132" +
      "\034.sentinel.types.v1.BandwidthB\004\310\336\037\000B:Z0g" +
      "ithub.com/sentinel-official/hub/x/sessio" +
      "n/types\250\342\036\000\310\341\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          sentinel.types.v1.BandwidthOuterClass.getDescriptor(),
        });
    internal_static_sentinel_session_v1_Proof_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sentinel_session_v1_Proof_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sentinel_session_v1_Proof_descriptor,
        new java.lang.String[] { "Id", "Duration", "Bandwidth", });
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
    sentinel.types.v1.BandwidthOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
