// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iris/guardian/guardian.proto

package irishub.guardian;

public final class Guardian {
  private Guardian() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * AccountType defines the super account type
   * </pre>
   *
   * Protobuf enum {@code irishub.guardian.AccountType}
   */
  public enum AccountType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * GENESIS defines a genesis account type
     * </pre>
     *
     * <code>GENESIS = 0 [(.gogoproto.enumvalue_customname) = "Genesis"];</code>
     */
    GENESIS(0),
    /**
     * <pre>
     * ORDINARY defines a ordinary account type
     * </pre>
     *
     * <code>ORDINARY = 1 [(.gogoproto.enumvalue_customname) = "Ordinary"];</code>
     */
    ORDINARY(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * GENESIS defines a genesis account type
     * </pre>
     *
     * <code>GENESIS = 0 [(.gogoproto.enumvalue_customname) = "Genesis"];</code>
     */
    public static final int GENESIS_VALUE = 0;
    /**
     * <pre>
     * ORDINARY defines a ordinary account type
     * </pre>
     *
     * <code>ORDINARY = 1 [(.gogoproto.enumvalue_customname) = "Ordinary"];</code>
     */
    public static final int ORDINARY_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AccountType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AccountType forNumber(int value) {
      switch (value) {
        case 0: return GENESIS;
        case 1: return ORDINARY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AccountType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AccountType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AccountType>() {
            public AccountType findValueByNumber(int number) {
              return AccountType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return irishub.guardian.Guardian.getDescriptor().getEnumTypes().get(0);
    }

    private static final AccountType[] VALUES = values();

    public static AccountType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AccountType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:irishub.guardian.AccountType)
  }

  public interface SuperOrBuilder extends
      // @@protoc_insertion_point(interface_extends:irishub.guardian.Super)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string description = 1;</code>
     * @return The description.
     */
    java.lang.String getDescription();
    /**
     * <code>string description = 1;</code>
     * @return The bytes for description.
     */
    com.google.protobuf.ByteString
        getDescriptionBytes();

    /**
     * <code>.irishub.guardian.AccountType account_type = 2 [(.gogoproto.moretags) = "yaml:&#92;"account_type&#92;""];</code>
     * @return The enum numeric value on the wire for accountType.
     */
    int getAccountTypeValue();
    /**
     * <code>.irishub.guardian.AccountType account_type = 2 [(.gogoproto.moretags) = "yaml:&#92;"account_type&#92;""];</code>
     * @return The accountType.
     */
    irishub.guardian.Guardian.AccountType getAccountType();

    /**
     * <code>string address = 3;</code>
     * @return The address.
     */
    java.lang.String getAddress();
    /**
     * <code>string address = 3;</code>
     * @return The bytes for address.
     */
    com.google.protobuf.ByteString
        getAddressBytes();

    /**
     * <code>string added_by = 4;</code>
     * @return The addedBy.
     */
    java.lang.String getAddedBy();
    /**
     * <code>string added_by = 4;</code>
     * @return The bytes for addedBy.
     */
    com.google.protobuf.ByteString
        getAddedByBytes();
  }
  /**
   * <pre>
   * Super defines the super standard
   * </pre>
   *
   * Protobuf type {@code irishub.guardian.Super}
   */
  public static final class Super extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:irishub.guardian.Super)
      SuperOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Super.newBuilder() to construct.
    private Super(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Super() {
      description_ = "";
      accountType_ = 0;
      address_ = "";
      addedBy_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Super();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Super(
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

              description_ = s;
              break;
            }
            case 16: {
              int rawValue = input.readEnum();

              accountType_ = rawValue;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              address_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              addedBy_ = s;
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
      return irishub.guardian.Guardian.internal_static_irishub_guardian_Super_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return irishub.guardian.Guardian.internal_static_irishub_guardian_Super_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              irishub.guardian.Guardian.Super.class, irishub.guardian.Guardian.Super.Builder.class);
    }

    public static final int DESCRIPTION_FIELD_NUMBER = 1;
    private volatile java.lang.Object description_;
    /**
     * <code>string description = 1;</code>
     * @return The description.
     */
    @java.lang.Override
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      }
    }
    /**
     * <code>string description = 1;</code>
     * @return The bytes for description.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ACCOUNT_TYPE_FIELD_NUMBER = 2;
    private int accountType_;
    /**
     * <code>.irishub.guardian.AccountType account_type = 2 [(.gogoproto.moretags) = "yaml:&#92;"account_type&#92;""];</code>
     * @return The enum numeric value on the wire for accountType.
     */
    @java.lang.Override public int getAccountTypeValue() {
      return accountType_;
    }
    /**
     * <code>.irishub.guardian.AccountType account_type = 2 [(.gogoproto.moretags) = "yaml:&#92;"account_type&#92;""];</code>
     * @return The accountType.
     */
    @java.lang.Override public irishub.guardian.Guardian.AccountType getAccountType() {
      @SuppressWarnings("deprecation")
      irishub.guardian.Guardian.AccountType result = irishub.guardian.Guardian.AccountType.valueOf(accountType_);
      return result == null ? irishub.guardian.Guardian.AccountType.UNRECOGNIZED : result;
    }

    public static final int ADDRESS_FIELD_NUMBER = 3;
    private volatile java.lang.Object address_;
    /**
     * <code>string address = 3;</code>
     * @return The address.
     */
    @java.lang.Override
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      }
    }
    /**
     * <code>string address = 3;</code>
     * @return The bytes for address.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ADDED_BY_FIELD_NUMBER = 4;
    private volatile java.lang.Object addedBy_;
    /**
     * <code>string added_by = 4;</code>
     * @return The addedBy.
     */
    @java.lang.Override
    public java.lang.String getAddedBy() {
      java.lang.Object ref = addedBy_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        addedBy_ = s;
        return s;
      }
    }
    /**
     * <code>string added_by = 4;</code>
     * @return The bytes for addedBy.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAddedByBytes() {
      java.lang.Object ref = addedBy_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        addedBy_ = b;
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
      if (!getDescriptionBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, description_);
      }
      if (accountType_ != irishub.guardian.Guardian.AccountType.GENESIS.getNumber()) {
        output.writeEnum(2, accountType_);
      }
      if (!getAddressBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, address_);
      }
      if (!getAddedByBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, addedBy_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getDescriptionBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, description_);
      }
      if (accountType_ != irishub.guardian.Guardian.AccountType.GENESIS.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, accountType_);
      }
      if (!getAddressBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, address_);
      }
      if (!getAddedByBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, addedBy_);
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
      if (!(obj instanceof irishub.guardian.Guardian.Super)) {
        return super.equals(obj);
      }
      irishub.guardian.Guardian.Super other = (irishub.guardian.Guardian.Super) obj;

      if (!getDescription()
          .equals(other.getDescription())) return false;
      if (accountType_ != other.accountType_) return false;
      if (!getAddress()
          .equals(other.getAddress())) return false;
      if (!getAddedBy()
          .equals(other.getAddedBy())) return false;
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
      hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getDescription().hashCode();
      hash = (37 * hash) + ACCOUNT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + accountType_;
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
      hash = (37 * hash) + ADDED_BY_FIELD_NUMBER;
      hash = (53 * hash) + getAddedBy().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static irishub.guardian.Guardian.Super parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static irishub.guardian.Guardian.Super parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static irishub.guardian.Guardian.Super parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static irishub.guardian.Guardian.Super parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static irishub.guardian.Guardian.Super parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static irishub.guardian.Guardian.Super parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static irishub.guardian.Guardian.Super parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static irishub.guardian.Guardian.Super parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static irishub.guardian.Guardian.Super parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static irishub.guardian.Guardian.Super parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static irishub.guardian.Guardian.Super parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static irishub.guardian.Guardian.Super parseFrom(
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
    public static Builder newBuilder(irishub.guardian.Guardian.Super prototype) {
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
     * Super defines the super standard
     * </pre>
     *
     * Protobuf type {@code irishub.guardian.Super}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:irishub.guardian.Super)
        irishub.guardian.Guardian.SuperOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return irishub.guardian.Guardian.internal_static_irishub_guardian_Super_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return irishub.guardian.Guardian.internal_static_irishub_guardian_Super_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                irishub.guardian.Guardian.Super.class, irishub.guardian.Guardian.Super.Builder.class);
      }

      // Construct using irishub.guardian.Guardian.Super.newBuilder()
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
        description_ = "";

        accountType_ = 0;

        address_ = "";

        addedBy_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return irishub.guardian.Guardian.internal_static_irishub_guardian_Super_descriptor;
      }

      @java.lang.Override
      public irishub.guardian.Guardian.Super getDefaultInstanceForType() {
        return irishub.guardian.Guardian.Super.getDefaultInstance();
      }

      @java.lang.Override
      public irishub.guardian.Guardian.Super build() {
        irishub.guardian.Guardian.Super result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public irishub.guardian.Guardian.Super buildPartial() {
        irishub.guardian.Guardian.Super result = new irishub.guardian.Guardian.Super(this);
        result.description_ = description_;
        result.accountType_ = accountType_;
        result.address_ = address_;
        result.addedBy_ = addedBy_;
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
        if (other instanceof irishub.guardian.Guardian.Super) {
          return mergeFrom((irishub.guardian.Guardian.Super)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(irishub.guardian.Guardian.Super other) {
        if (other == irishub.guardian.Guardian.Super.getDefaultInstance()) return this;
        if (!other.getDescription().isEmpty()) {
          description_ = other.description_;
          onChanged();
        }
        if (other.accountType_ != 0) {
          setAccountTypeValue(other.getAccountTypeValue());
        }
        if (!other.getAddress().isEmpty()) {
          address_ = other.address_;
          onChanged();
        }
        if (!other.getAddedBy().isEmpty()) {
          addedBy_ = other.addedBy_;
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
        irishub.guardian.Guardian.Super parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (irishub.guardian.Guardian.Super) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object description_ = "";
      /**
       * <code>string description = 1;</code>
       * @return The description.
       */
      public java.lang.String getDescription() {
        java.lang.Object ref = description_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          description_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string description = 1;</code>
       * @return The bytes for description.
       */
      public com.google.protobuf.ByteString
          getDescriptionBytes() {
        java.lang.Object ref = description_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          description_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string description = 1;</code>
       * @param value The description to set.
       * @return This builder for chaining.
       */
      public Builder setDescription(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        description_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string description = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDescription() {
        
        description_ = getDefaultInstance().getDescription();
        onChanged();
        return this;
      }
      /**
       * <code>string description = 1;</code>
       * @param value The bytes for description to set.
       * @return This builder for chaining.
       */
      public Builder setDescriptionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        description_ = value;
        onChanged();
        return this;
      }

      private int accountType_ = 0;
      /**
       * <code>.irishub.guardian.AccountType account_type = 2 [(.gogoproto.moretags) = "yaml:&#92;"account_type&#92;""];</code>
       * @return The enum numeric value on the wire for accountType.
       */
      @java.lang.Override public int getAccountTypeValue() {
        return accountType_;
      }
      /**
       * <code>.irishub.guardian.AccountType account_type = 2 [(.gogoproto.moretags) = "yaml:&#92;"account_type&#92;""];</code>
       * @param value The enum numeric value on the wire for accountType to set.
       * @return This builder for chaining.
       */
      public Builder setAccountTypeValue(int value) {
        
        accountType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.irishub.guardian.AccountType account_type = 2 [(.gogoproto.moretags) = "yaml:&#92;"account_type&#92;""];</code>
       * @return The accountType.
       */
      @java.lang.Override
      public irishub.guardian.Guardian.AccountType getAccountType() {
        @SuppressWarnings("deprecation")
        irishub.guardian.Guardian.AccountType result = irishub.guardian.Guardian.AccountType.valueOf(accountType_);
        return result == null ? irishub.guardian.Guardian.AccountType.UNRECOGNIZED : result;
      }
      /**
       * <code>.irishub.guardian.AccountType account_type = 2 [(.gogoproto.moretags) = "yaml:&#92;"account_type&#92;""];</code>
       * @param value The accountType to set.
       * @return This builder for chaining.
       */
      public Builder setAccountType(irishub.guardian.Guardian.AccountType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        accountType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.irishub.guardian.AccountType account_type = 2 [(.gogoproto.moretags) = "yaml:&#92;"account_type&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearAccountType() {
        
        accountType_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object address_ = "";
      /**
       * <code>string address = 3;</code>
       * @return The address.
       */
      public java.lang.String getAddress() {
        java.lang.Object ref = address_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          address_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string address = 3;</code>
       * @return The bytes for address.
       */
      public com.google.protobuf.ByteString
          getAddressBytes() {
        java.lang.Object ref = address_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          address_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string address = 3;</code>
       * @param value The address to set.
       * @return This builder for chaining.
       */
      public Builder setAddress(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        address_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string address = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAddress() {
        
        address_ = getDefaultInstance().getAddress();
        onChanged();
        return this;
      }
      /**
       * <code>string address = 3;</code>
       * @param value The bytes for address to set.
       * @return This builder for chaining.
       */
      public Builder setAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        address_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object addedBy_ = "";
      /**
       * <code>string added_by = 4;</code>
       * @return The addedBy.
       */
      public java.lang.String getAddedBy() {
        java.lang.Object ref = addedBy_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          addedBy_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string added_by = 4;</code>
       * @return The bytes for addedBy.
       */
      public com.google.protobuf.ByteString
          getAddedByBytes() {
        java.lang.Object ref = addedBy_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          addedBy_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string added_by = 4;</code>
       * @param value The addedBy to set.
       * @return This builder for chaining.
       */
      public Builder setAddedBy(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        addedBy_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string added_by = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearAddedBy() {
        
        addedBy_ = getDefaultInstance().getAddedBy();
        onChanged();
        return this;
      }
      /**
       * <code>string added_by = 4;</code>
       * @param value The bytes for addedBy to set.
       * @return This builder for chaining.
       */
      public Builder setAddedByBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        addedBy_ = value;
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


      // @@protoc_insertion_point(builder_scope:irishub.guardian.Super)
    }

    // @@protoc_insertion_point(class_scope:irishub.guardian.Super)
    private static final irishub.guardian.Guardian.Super DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new irishub.guardian.Guardian.Super();
    }

    public static irishub.guardian.Guardian.Super getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Super>
        PARSER = new com.google.protobuf.AbstractParser<Super>() {
      @java.lang.Override
      public Super parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Super(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Super> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Super> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public irishub.guardian.Guardian.Super getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_irishub_guardian_Super_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_irishub_guardian_Super_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034iris/guardian/guardian.proto\022\020irishub." +
      "guardian\032\024gogoproto/gogo.proto\"\215\001\n\005Super" +
      "\022\023\n\013description\030\001 \001(\t\022L\n\014account_type\030\002 " +
      "\001(\0162\035.irishub.guardian.AccountTypeB\027\362\336\037\023" +
      "yaml:\"account_type\"\022\017\n\007address\030\003 \001(\t\022\020\n\010" +
      "added_by\030\004 \001(\t*I\n\013AccountType\022\030\n\007GENESIS" +
      "\020\000\032\013\212\235 \007Genesis\022\032\n\010ORDINARY\020\001\032\014\212\235 \010Ordin" +
      "ary\032\004\210\243\036\000B3Z1github.com/irisnet/irishub/" +
      "modules/guardian/typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
        });
    internal_static_irishub_guardian_Super_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_irishub_guardian_Super_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_irishub_guardian_Super_descriptor,
        new java.lang.String[] { "Description", "AccountType", "Address", "AddedBy", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.enumvalueCustomname);
    registry.add(com.google.protobuf.GoGoProtos.goprotoEnumPrefix);
    registry.add(com.google.protobuf.GoGoProtos.moretags);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
