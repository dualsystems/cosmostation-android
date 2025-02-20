// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iris_mod/record/genesis.proto

package irismod.record;

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
      // @@protoc_insertion_point(interface_extends:irismod.record.GenesisState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
     */
    java.util.List<irismod.record.RecordOuterClass.Record> 
        getRecordsList();
    /**
     * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
     */
    irismod.record.RecordOuterClass.Record getRecords(int index);
    /**
     * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
     */
    int getRecordsCount();
    /**
     * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
     */
    java.util.List<? extends irismod.record.RecordOuterClass.RecordOrBuilder> 
        getRecordsOrBuilderList();
    /**
     * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
     */
    irismod.record.RecordOuterClass.RecordOrBuilder getRecordsOrBuilder(
        int index);
  }
  /**
   * <pre>
   * GenesisState defines the record module's genesis state
   * </pre>
   *
   * Protobuf type {@code irismod.record.GenesisState}
   */
  public static final class GenesisState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:irismod.record.GenesisState)
      GenesisStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenesisState.newBuilder() to construct.
    private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenesisState() {
      records_ = java.util.Collections.emptyList();
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
                records_ = new java.util.ArrayList<irismod.record.RecordOuterClass.Record>();
                mutable_bitField0_ |= 0x00000001;
              }
              records_.add(
                  input.readMessage(irismod.record.RecordOuterClass.Record.parser(), extensionRegistry));
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
          records_ = java.util.Collections.unmodifiableList(records_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return irismod.record.Genesis.internal_static_irismod_record_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return irismod.record.Genesis.internal_static_irismod_record_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              irismod.record.Genesis.GenesisState.class, irismod.record.Genesis.GenesisState.Builder.class);
    }

    public static final int RECORDS_FIELD_NUMBER = 1;
    private java.util.List<irismod.record.RecordOuterClass.Record> records_;
    /**
     * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public java.util.List<irismod.record.RecordOuterClass.Record> getRecordsList() {
      return records_;
    }
    /**
     * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public java.util.List<? extends irismod.record.RecordOuterClass.RecordOrBuilder> 
        getRecordsOrBuilderList() {
      return records_;
    }
    /**
     * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public int getRecordsCount() {
      return records_.size();
    }
    /**
     * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public irismod.record.RecordOuterClass.Record getRecords(int index) {
      return records_.get(index);
    }
    /**
     * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public irismod.record.RecordOuterClass.RecordOrBuilder getRecordsOrBuilder(
        int index) {
      return records_.get(index);
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
      for (int i = 0; i < records_.size(); i++) {
        output.writeMessage(1, records_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < records_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, records_.get(i));
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
      if (!(obj instanceof irismod.record.Genesis.GenesisState)) {
        return super.equals(obj);
      }
      irismod.record.Genesis.GenesisState other = (irismod.record.Genesis.GenesisState) obj;

      if (!getRecordsList()
          .equals(other.getRecordsList())) return false;
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
      if (getRecordsCount() > 0) {
        hash = (37 * hash) + RECORDS_FIELD_NUMBER;
        hash = (53 * hash) + getRecordsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static irismod.record.Genesis.GenesisState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static irismod.record.Genesis.GenesisState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static irismod.record.Genesis.GenesisState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static irismod.record.Genesis.GenesisState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static irismod.record.Genesis.GenesisState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static irismod.record.Genesis.GenesisState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static irismod.record.Genesis.GenesisState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static irismod.record.Genesis.GenesisState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static irismod.record.Genesis.GenesisState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static irismod.record.Genesis.GenesisState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static irismod.record.Genesis.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static irismod.record.Genesis.GenesisState parseFrom(
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
    public static Builder newBuilder(irismod.record.Genesis.GenesisState prototype) {
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
     * GenesisState defines the record module's genesis state
     * </pre>
     *
     * Protobuf type {@code irismod.record.GenesisState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:irismod.record.GenesisState)
        irismod.record.Genesis.GenesisStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return irismod.record.Genesis.internal_static_irismod_record_GenesisState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return irismod.record.Genesis.internal_static_irismod_record_GenesisState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                irismod.record.Genesis.GenesisState.class, irismod.record.Genesis.GenesisState.Builder.class);
      }

      // Construct using irismod.record.Genesis.GenesisState.newBuilder()
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
          getRecordsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (recordsBuilder_ == null) {
          records_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          recordsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return irismod.record.Genesis.internal_static_irismod_record_GenesisState_descriptor;
      }

      @java.lang.Override
      public irismod.record.Genesis.GenesisState getDefaultInstanceForType() {
        return irismod.record.Genesis.GenesisState.getDefaultInstance();
      }

      @java.lang.Override
      public irismod.record.Genesis.GenesisState build() {
        irismod.record.Genesis.GenesisState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public irismod.record.Genesis.GenesisState buildPartial() {
        irismod.record.Genesis.GenesisState result = new irismod.record.Genesis.GenesisState(this);
        int from_bitField0_ = bitField0_;
        if (recordsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            records_ = java.util.Collections.unmodifiableList(records_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.records_ = records_;
        } else {
          result.records_ = recordsBuilder_.build();
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
        if (other instanceof irismod.record.Genesis.GenesisState) {
          return mergeFrom((irismod.record.Genesis.GenesisState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(irismod.record.Genesis.GenesisState other) {
        if (other == irismod.record.Genesis.GenesisState.getDefaultInstance()) return this;
        if (recordsBuilder_ == null) {
          if (!other.records_.isEmpty()) {
            if (records_.isEmpty()) {
              records_ = other.records_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRecordsIsMutable();
              records_.addAll(other.records_);
            }
            onChanged();
          }
        } else {
          if (!other.records_.isEmpty()) {
            if (recordsBuilder_.isEmpty()) {
              recordsBuilder_.dispose();
              recordsBuilder_ = null;
              records_ = other.records_;
              bitField0_ = (bitField0_ & ~0x00000001);
              recordsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRecordsFieldBuilder() : null;
            } else {
              recordsBuilder_.addAllMessages(other.records_);
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
        irismod.record.Genesis.GenesisState parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (irismod.record.Genesis.GenesisState) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<irismod.record.RecordOuterClass.Record> records_ =
        java.util.Collections.emptyList();
      private void ensureRecordsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          records_ = new java.util.ArrayList<irismod.record.RecordOuterClass.Record>(records_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          irismod.record.RecordOuterClass.Record, irismod.record.RecordOuterClass.Record.Builder, irismod.record.RecordOuterClass.RecordOrBuilder> recordsBuilder_;

      /**
       * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<irismod.record.RecordOuterClass.Record> getRecordsList() {
        if (recordsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(records_);
        } else {
          return recordsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
       */
      public int getRecordsCount() {
        if (recordsBuilder_ == null) {
          return records_.size();
        } else {
          return recordsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
       */
      public irismod.record.RecordOuterClass.Record getRecords(int index) {
        if (recordsBuilder_ == null) {
          return records_.get(index);
        } else {
          return recordsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setRecords(
          int index, irismod.record.RecordOuterClass.Record value) {
        if (recordsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecordsIsMutable();
          records_.set(index, value);
          onChanged();
        } else {
          recordsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setRecords(
          int index, irismod.record.RecordOuterClass.Record.Builder builderForValue) {
        if (recordsBuilder_ == null) {
          ensureRecordsIsMutable();
          records_.set(index, builderForValue.build());
          onChanged();
        } else {
          recordsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addRecords(irismod.record.RecordOuterClass.Record value) {
        if (recordsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecordsIsMutable();
          records_.add(value);
          onChanged();
        } else {
          recordsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addRecords(
          int index, irismod.record.RecordOuterClass.Record value) {
        if (recordsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecordsIsMutable();
          records_.add(index, value);
          onChanged();
        } else {
          recordsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addRecords(
          irismod.record.RecordOuterClass.Record.Builder builderForValue) {
        if (recordsBuilder_ == null) {
          ensureRecordsIsMutable();
          records_.add(builderForValue.build());
          onChanged();
        } else {
          recordsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addRecords(
          int index, irismod.record.RecordOuterClass.Record.Builder builderForValue) {
        if (recordsBuilder_ == null) {
          ensureRecordsIsMutable();
          records_.add(index, builderForValue.build());
          onChanged();
        } else {
          recordsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addAllRecords(
          java.lang.Iterable<? extends irismod.record.RecordOuterClass.Record> values) {
        if (recordsBuilder_ == null) {
          ensureRecordsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, records_);
          onChanged();
        } else {
          recordsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder clearRecords() {
        if (recordsBuilder_ == null) {
          records_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          recordsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder removeRecords(int index) {
        if (recordsBuilder_ == null) {
          ensureRecordsIsMutable();
          records_.remove(index);
          onChanged();
        } else {
          recordsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
       */
      public irismod.record.RecordOuterClass.Record.Builder getRecordsBuilder(
          int index) {
        return getRecordsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
       */
      public irismod.record.RecordOuterClass.RecordOrBuilder getRecordsOrBuilder(
          int index) {
        if (recordsBuilder_ == null) {
          return records_.get(index);  } else {
          return recordsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<? extends irismod.record.RecordOuterClass.RecordOrBuilder> 
           getRecordsOrBuilderList() {
        if (recordsBuilder_ != null) {
          return recordsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(records_);
        }
      }
      /**
       * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
       */
      public irismod.record.RecordOuterClass.Record.Builder addRecordsBuilder() {
        return getRecordsFieldBuilder().addBuilder(
            irismod.record.RecordOuterClass.Record.getDefaultInstance());
      }
      /**
       * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
       */
      public irismod.record.RecordOuterClass.Record.Builder addRecordsBuilder(
          int index) {
        return getRecordsFieldBuilder().addBuilder(
            index, irismod.record.RecordOuterClass.Record.getDefaultInstance());
      }
      /**
       * <code>repeated .irismod.record.Record records = 1 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<irismod.record.RecordOuterClass.Record.Builder> 
           getRecordsBuilderList() {
        return getRecordsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          irismod.record.RecordOuterClass.Record, irismod.record.RecordOuterClass.Record.Builder, irismod.record.RecordOuterClass.RecordOrBuilder> 
          getRecordsFieldBuilder() {
        if (recordsBuilder_ == null) {
          recordsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              irismod.record.RecordOuterClass.Record, irismod.record.RecordOuterClass.Record.Builder, irismod.record.RecordOuterClass.RecordOrBuilder>(
                  records_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          records_ = null;
        }
        return recordsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:irismod.record.GenesisState)
    }

    // @@protoc_insertion_point(class_scope:irismod.record.GenesisState)
    private static final irismod.record.Genesis.GenesisState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new irismod.record.Genesis.GenesisState();
    }

    public static irismod.record.Genesis.GenesisState getDefaultInstance() {
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
    public irismod.record.Genesis.GenesisState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_irismod_record_GenesisState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_irismod_record_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035iris_mod/record/genesis.proto\022\016irismod" +
      ".record\032\024gogoproto/gogo.proto\032\034iris_mod/" +
      "record/record.proto\"=\n\014GenesisState\022-\n\007r" +
      "ecords\030\001 \003(\0132\026.irismod.record.RecordB\004\310\336" +
      "\037\000B1Z/github.com/irisnet/irismod/modules" +
      "/record/typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
          irismod.record.RecordOuterClass.getDescriptor(),
        });
    internal_static_irismod_record_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_irismod_record_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_irismod_record_GenesisState_descriptor,
        new java.lang.String[] { "Records", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    irismod.record.RecordOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
