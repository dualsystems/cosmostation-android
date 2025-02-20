// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/fees/v1beta1/params.proto

package desmos.fees.v1beta1;

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
      // @@protoc_insertion_point(interface_extends:desmos.fees.v1beta1.Params)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
     */
    java.util.List<desmos.fees.v1beta1.MinFeeOuterClass.MinFee> 
        getMinFeesList();
    /**
     * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
     */
    desmos.fees.v1beta1.MinFeeOuterClass.MinFee getMinFees(int index);
    /**
     * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
     */
    int getMinFeesCount();
    /**
     * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
     */
    java.util.List<? extends desmos.fees.v1beta1.MinFeeOuterClass.MinFeeOrBuilder> 
        getMinFeesOrBuilderList();
    /**
     * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
     */
    desmos.fees.v1beta1.MinFeeOuterClass.MinFeeOrBuilder getMinFeesOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Params contains the parameters for the fees module
   * </pre>
   *
   * Protobuf type {@code desmos.fees.v1beta1.Params}
   */
  public static final class Params extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:desmos.fees.v1beta1.Params)
      ParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Params.newBuilder() to construct.
    private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Params() {
      minFees_ = java.util.Collections.emptyList();
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
      int mutable_bitField0_ = 0;
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                minFees_ = new java.util.ArrayList<desmos.fees.v1beta1.MinFeeOuterClass.MinFee>();
                mutable_bitField0_ |= 0x00000001;
              }
              minFees_.add(
                  input.readMessage(desmos.fees.v1beta1.MinFeeOuterClass.MinFee.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          minFees_ = java.util.Collections.unmodifiableList(minFees_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return desmos.fees.v1beta1.ParamsOuterClass.internal_static_desmos_fees_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return desmos.fees.v1beta1.ParamsOuterClass.internal_static_desmos_fees_v1beta1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              desmos.fees.v1beta1.ParamsOuterClass.Params.class, desmos.fees.v1beta1.ParamsOuterClass.Params.Builder.class);
    }

    public static final int MIN_FEES_FIELD_NUMBER = 1;
    private java.util.List<desmos.fees.v1beta1.MinFeeOuterClass.MinFee> minFees_;
    /**
     * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
     */
    @java.lang.Override
    public java.util.List<desmos.fees.v1beta1.MinFeeOuterClass.MinFee> getMinFeesList() {
      return minFees_;
    }
    /**
     * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
     */
    @java.lang.Override
    public java.util.List<? extends desmos.fees.v1beta1.MinFeeOuterClass.MinFeeOrBuilder> 
        getMinFeesOrBuilderList() {
      return minFees_;
    }
    /**
     * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
     */
    @java.lang.Override
    public int getMinFeesCount() {
      return minFees_.size();
    }
    /**
     * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
     */
    @java.lang.Override
    public desmos.fees.v1beta1.MinFeeOuterClass.MinFee getMinFees(int index) {
      return minFees_.get(index);
    }
    /**
     * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
     */
    @java.lang.Override
    public desmos.fees.v1beta1.MinFeeOuterClass.MinFeeOrBuilder getMinFeesOrBuilder(
        int index) {
      return minFees_.get(index);
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
      for (int i = 0; i < minFees_.size(); i++) {
        output.writeMessage(1, minFees_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < minFees_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, minFees_.get(i));
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
      if (!(obj instanceof desmos.fees.v1beta1.ParamsOuterClass.Params)) {
        return super.equals(obj);
      }
      desmos.fees.v1beta1.ParamsOuterClass.Params other = (desmos.fees.v1beta1.ParamsOuterClass.Params) obj;

      if (!getMinFeesList()
          .equals(other.getMinFeesList())) return false;
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
      if (getMinFeesCount() > 0) {
        hash = (37 * hash) + MIN_FEES_FIELD_NUMBER;
        hash = (53 * hash) + getMinFeesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static desmos.fees.v1beta1.ParamsOuterClass.Params parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static desmos.fees.v1beta1.ParamsOuterClass.Params parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static desmos.fees.v1beta1.ParamsOuterClass.Params parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static desmos.fees.v1beta1.ParamsOuterClass.Params parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static desmos.fees.v1beta1.ParamsOuterClass.Params parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static desmos.fees.v1beta1.ParamsOuterClass.Params parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static desmos.fees.v1beta1.ParamsOuterClass.Params parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static desmos.fees.v1beta1.ParamsOuterClass.Params parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static desmos.fees.v1beta1.ParamsOuterClass.Params parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static desmos.fees.v1beta1.ParamsOuterClass.Params parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static desmos.fees.v1beta1.ParamsOuterClass.Params parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static desmos.fees.v1beta1.ParamsOuterClass.Params parseFrom(
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
    public static Builder newBuilder(desmos.fees.v1beta1.ParamsOuterClass.Params prototype) {
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
     * Params contains the parameters for the fees module
     * </pre>
     *
     * Protobuf type {@code desmos.fees.v1beta1.Params}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:desmos.fees.v1beta1.Params)
        desmos.fees.v1beta1.ParamsOuterClass.ParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return desmos.fees.v1beta1.ParamsOuterClass.internal_static_desmos_fees_v1beta1_Params_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return desmos.fees.v1beta1.ParamsOuterClass.internal_static_desmos_fees_v1beta1_Params_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                desmos.fees.v1beta1.ParamsOuterClass.Params.class, desmos.fees.v1beta1.ParamsOuterClass.Params.Builder.class);
      }

      // Construct using desmos.fees.v1beta1.ParamsOuterClass.Params.newBuilder()
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
          getMinFeesFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (minFeesBuilder_ == null) {
          minFees_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          minFeesBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return desmos.fees.v1beta1.ParamsOuterClass.internal_static_desmos_fees_v1beta1_Params_descriptor;
      }

      @java.lang.Override
      public desmos.fees.v1beta1.ParamsOuterClass.Params getDefaultInstanceForType() {
        return desmos.fees.v1beta1.ParamsOuterClass.Params.getDefaultInstance();
      }

      @java.lang.Override
      public desmos.fees.v1beta1.ParamsOuterClass.Params build() {
        desmos.fees.v1beta1.ParamsOuterClass.Params result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public desmos.fees.v1beta1.ParamsOuterClass.Params buildPartial() {
        desmos.fees.v1beta1.ParamsOuterClass.Params result = new desmos.fees.v1beta1.ParamsOuterClass.Params(this);
        int from_bitField0_ = bitField0_;
        if (minFeesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            minFees_ = java.util.Collections.unmodifiableList(minFees_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.minFees_ = minFees_;
        } else {
          result.minFees_ = minFeesBuilder_.build();
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
        if (other instanceof desmos.fees.v1beta1.ParamsOuterClass.Params) {
          return mergeFrom((desmos.fees.v1beta1.ParamsOuterClass.Params)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(desmos.fees.v1beta1.ParamsOuterClass.Params other) {
        if (other == desmos.fees.v1beta1.ParamsOuterClass.Params.getDefaultInstance()) return this;
        if (minFeesBuilder_ == null) {
          if (!other.minFees_.isEmpty()) {
            if (minFees_.isEmpty()) {
              minFees_ = other.minFees_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMinFeesIsMutable();
              minFees_.addAll(other.minFees_);
            }
            onChanged();
          }
        } else {
          if (!other.minFees_.isEmpty()) {
            if (minFeesBuilder_.isEmpty()) {
              minFeesBuilder_.dispose();
              minFeesBuilder_ = null;
              minFees_ = other.minFees_;
              bitField0_ = (bitField0_ & ~0x00000001);
              minFeesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMinFeesFieldBuilder() : null;
            } else {
              minFeesBuilder_.addAllMessages(other.minFees_);
            }
          }
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
        desmos.fees.v1beta1.ParamsOuterClass.Params parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (desmos.fees.v1beta1.ParamsOuterClass.Params) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<desmos.fees.v1beta1.MinFeeOuterClass.MinFee> minFees_ =
        java.util.Collections.emptyList();
      private void ensureMinFeesIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          minFees_ = new java.util.ArrayList<desmos.fees.v1beta1.MinFeeOuterClass.MinFee>(minFees_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          desmos.fees.v1beta1.MinFeeOuterClass.MinFee, desmos.fees.v1beta1.MinFeeOuterClass.MinFee.Builder, desmos.fees.v1beta1.MinFeeOuterClass.MinFeeOrBuilder> minFeesBuilder_;

      /**
       * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
       */
      public java.util.List<desmos.fees.v1beta1.MinFeeOuterClass.MinFee> getMinFeesList() {
        if (minFeesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(minFees_);
        } else {
          return minFeesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
       */
      public int getMinFeesCount() {
        if (minFeesBuilder_ == null) {
          return minFees_.size();
        } else {
          return minFeesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
       */
      public desmos.fees.v1beta1.MinFeeOuterClass.MinFee getMinFees(int index) {
        if (minFeesBuilder_ == null) {
          return minFees_.get(index);
        } else {
          return minFeesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
       */
      public Builder setMinFees(
          int index, desmos.fees.v1beta1.MinFeeOuterClass.MinFee value) {
        if (minFeesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMinFeesIsMutable();
          minFees_.set(index, value);
          onChanged();
        } else {
          minFeesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
       */
      public Builder setMinFees(
          int index, desmos.fees.v1beta1.MinFeeOuterClass.MinFee.Builder builderForValue) {
        if (minFeesBuilder_ == null) {
          ensureMinFeesIsMutable();
          minFees_.set(index, builderForValue.build());
          onChanged();
        } else {
          minFeesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
       */
      public Builder addMinFees(desmos.fees.v1beta1.MinFeeOuterClass.MinFee value) {
        if (minFeesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMinFeesIsMutable();
          minFees_.add(value);
          onChanged();
        } else {
          minFeesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
       */
      public Builder addMinFees(
          int index, desmos.fees.v1beta1.MinFeeOuterClass.MinFee value) {
        if (minFeesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMinFeesIsMutable();
          minFees_.add(index, value);
          onChanged();
        } else {
          minFeesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
       */
      public Builder addMinFees(
          desmos.fees.v1beta1.MinFeeOuterClass.MinFee.Builder builderForValue) {
        if (minFeesBuilder_ == null) {
          ensureMinFeesIsMutable();
          minFees_.add(builderForValue.build());
          onChanged();
        } else {
          minFeesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
       */
      public Builder addMinFees(
          int index, desmos.fees.v1beta1.MinFeeOuterClass.MinFee.Builder builderForValue) {
        if (minFeesBuilder_ == null) {
          ensureMinFeesIsMutable();
          minFees_.add(index, builderForValue.build());
          onChanged();
        } else {
          minFeesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
       */
      public Builder addAllMinFees(
          java.lang.Iterable<? extends desmos.fees.v1beta1.MinFeeOuterClass.MinFee> values) {
        if (minFeesBuilder_ == null) {
          ensureMinFeesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, minFees_);
          onChanged();
        } else {
          minFeesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
       */
      public Builder clearMinFees() {
        if (minFeesBuilder_ == null) {
          minFees_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          minFeesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
       */
      public Builder removeMinFees(int index) {
        if (minFeesBuilder_ == null) {
          ensureMinFeesIsMutable();
          minFees_.remove(index);
          onChanged();
        } else {
          minFeesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
       */
      public desmos.fees.v1beta1.MinFeeOuterClass.MinFee.Builder getMinFeesBuilder(
          int index) {
        return getMinFeesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
       */
      public desmos.fees.v1beta1.MinFeeOuterClass.MinFeeOrBuilder getMinFeesOrBuilder(
          int index) {
        if (minFeesBuilder_ == null) {
          return minFees_.get(index);  } else {
          return minFeesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
       */
      public java.util.List<? extends desmos.fees.v1beta1.MinFeeOuterClass.MinFeeOrBuilder> 
           getMinFeesOrBuilderList() {
        if (minFeesBuilder_ != null) {
          return minFeesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(minFees_);
        }
      }
      /**
       * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
       */
      public desmos.fees.v1beta1.MinFeeOuterClass.MinFee.Builder addMinFeesBuilder() {
        return getMinFeesFieldBuilder().addBuilder(
            desmos.fees.v1beta1.MinFeeOuterClass.MinFee.getDefaultInstance());
      }
      /**
       * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
       */
      public desmos.fees.v1beta1.MinFeeOuterClass.MinFee.Builder addMinFeesBuilder(
          int index) {
        return getMinFeesFieldBuilder().addBuilder(
            index, desmos.fees.v1beta1.MinFeeOuterClass.MinFee.getDefaultInstance());
      }
      /**
       * <code>repeated .desmos.fees.v1beta1.MinFee min_fees = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_fees&#92;""];</code>
       */
      public java.util.List<desmos.fees.v1beta1.MinFeeOuterClass.MinFee.Builder> 
           getMinFeesBuilderList() {
        return getMinFeesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          desmos.fees.v1beta1.MinFeeOuterClass.MinFee, desmos.fees.v1beta1.MinFeeOuterClass.MinFee.Builder, desmos.fees.v1beta1.MinFeeOuterClass.MinFeeOrBuilder> 
          getMinFeesFieldBuilder() {
        if (minFeesBuilder_ == null) {
          minFeesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              desmos.fees.v1beta1.MinFeeOuterClass.MinFee, desmos.fees.v1beta1.MinFeeOuterClass.MinFee.Builder, desmos.fees.v1beta1.MinFeeOuterClass.MinFeeOrBuilder>(
                  minFees_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          minFees_ = null;
        }
        return minFeesBuilder_;
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


      // @@protoc_insertion_point(builder_scope:desmos.fees.v1beta1.Params)
    }

    // @@protoc_insertion_point(class_scope:desmos.fees.v1beta1.Params)
    private static final desmos.fees.v1beta1.ParamsOuterClass.Params DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new desmos.fees.v1beta1.ParamsOuterClass.Params();
    }

    public static desmos.fees.v1beta1.ParamsOuterClass.Params getDefaultInstance() {
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
    public desmos.fees.v1beta1.ParamsOuterClass.Params getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_fees_v1beta1_Params_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_fees_v1beta1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n desmos/fees/v1beta1/params.proto\022\023desm" +
      "os.fees.v1beta1\032\024gogoproto/gogo.proto\032!d" +
      "esmos/fees/v1beta1/min_fee.proto\"P\n\006Para" +
      "ms\022F\n\010min_fees\030\001 \003(\0132\033.desmos.fees.v1bet" +
      "a1.MinFeeB\027\310\336\037\000\362\336\037\017yaml:\"min_fees\"B7Z5gi" +
      "thub.com/desmos-labs/desmos/v2/x/staging" +
      "/fees/typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
          desmos.fees.v1beta1.MinFeeOuterClass.getDescriptor(),
        });
    internal_static_desmos_fees_v1beta1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_desmos_fees_v1beta1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_fees_v1beta1_Params_descriptor,
        new java.lang.String[] { "MinFees", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.moretags);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    desmos.fees.v1beta1.MinFeeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
