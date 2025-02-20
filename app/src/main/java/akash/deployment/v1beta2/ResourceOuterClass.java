// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/deployment/v1beta2/resource.proto

package akash.deployment.v1beta2;

public final class ResourceOuterClass {
  private ResourceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ResourceOrBuilder extends
      // @@protoc_insertion_point(interface_extends:akash.deployment.v1beta2.Resource)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.akash.base.v1beta2.ResourceUnits resources = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
     * @return Whether the resources field is set.
     */
    boolean hasResources();
    /**
     * <code>.akash.base.v1beta2.ResourceUnits resources = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
     * @return The resources.
     */
    akash.base.v1beta2.Resourceunits.ResourceUnits getResources();
    /**
     * <code>.akash.base.v1beta2.ResourceUnits resources = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
     */
    akash.base.v1beta2.Resourceunits.ResourceUnitsOrBuilder getResourcesOrBuilder();

    /**
     * <code>uint32 count = 2 [(.gogoproto.jsontag) = "count", (.gogoproto.moretags) = "yaml:&#92;"count&#92;""];</code>
     * @return The count.
     */
    int getCount();

    /**
     * <code>.cosmos.base.v1beta1.DecCoin price = 3 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
     * @return Whether the price field is set.
     */
    boolean hasPrice();
    /**
     * <code>.cosmos.base.v1beta1.DecCoin price = 3 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
     * @return The price.
     */
    cosmos.base.v1beta1.CoinOuterClass.DecCoin getPrice();
    /**
     * <code>.cosmos.base.v1beta1.DecCoin price = 3 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
     */
    cosmos.base.v1beta1.CoinOuterClass.DecCoinOrBuilder getPriceOrBuilder();
  }
  /**
   * <pre>
   * Resource stores unit, total count and price of resource
   * </pre>
   *
   * Protobuf type {@code akash.deployment.v1beta2.Resource}
   */
  public static final class Resource extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:akash.deployment.v1beta2.Resource)
      ResourceOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Resource.newBuilder() to construct.
    private Resource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Resource() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Resource();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Resource(
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
              akash.base.v1beta2.Resourceunits.ResourceUnits.Builder subBuilder = null;
              if (resources_ != null) {
                subBuilder = resources_.toBuilder();
              }
              resources_ = input.readMessage(akash.base.v1beta2.Resourceunits.ResourceUnits.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(resources_);
                resources_ = subBuilder.buildPartial();
              }

              break;
            }
            case 16: {

              count_ = input.readUInt32();
              break;
            }
            case 26: {
              cosmos.base.v1beta1.CoinOuterClass.DecCoin.Builder subBuilder = null;
              if (price_ != null) {
                subBuilder = price_.toBuilder();
              }
              price_ = input.readMessage(cosmos.base.v1beta1.CoinOuterClass.DecCoin.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(price_);
                price_ = subBuilder.buildPartial();
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
      return akash.deployment.v1beta2.ResourceOuterClass.internal_static_akash_deployment_v1beta2_Resource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return akash.deployment.v1beta2.ResourceOuterClass.internal_static_akash_deployment_v1beta2_Resource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              akash.deployment.v1beta2.ResourceOuterClass.Resource.class, akash.deployment.v1beta2.ResourceOuterClass.Resource.Builder.class);
    }

    public static final int RESOURCES_FIELD_NUMBER = 1;
    private akash.base.v1beta2.Resourceunits.ResourceUnits resources_;
    /**
     * <code>.akash.base.v1beta2.ResourceUnits resources = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
     * @return Whether the resources field is set.
     */
    @java.lang.Override
    public boolean hasResources() {
      return resources_ != null;
    }
    /**
     * <code>.akash.base.v1beta2.ResourceUnits resources = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
     * @return The resources.
     */
    @java.lang.Override
    public akash.base.v1beta2.Resourceunits.ResourceUnits getResources() {
      return resources_ == null ? akash.base.v1beta2.Resourceunits.ResourceUnits.getDefaultInstance() : resources_;
    }
    /**
     * <code>.akash.base.v1beta2.ResourceUnits resources = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
     */
    @java.lang.Override
    public akash.base.v1beta2.Resourceunits.ResourceUnitsOrBuilder getResourcesOrBuilder() {
      return getResources();
    }

    public static final int COUNT_FIELD_NUMBER = 2;
    private int count_;
    /**
     * <code>uint32 count = 2 [(.gogoproto.jsontag) = "count", (.gogoproto.moretags) = "yaml:&#92;"count&#92;""];</code>
     * @return The count.
     */
    @java.lang.Override
    public int getCount() {
      return count_;
    }

    public static final int PRICE_FIELD_NUMBER = 3;
    private cosmos.base.v1beta1.CoinOuterClass.DecCoin price_;
    /**
     * <code>.cosmos.base.v1beta1.DecCoin price = 3 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
     * @return Whether the price field is set.
     */
    @java.lang.Override
    public boolean hasPrice() {
      return price_ != null;
    }
    /**
     * <code>.cosmos.base.v1beta1.DecCoin price = 3 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
     * @return The price.
     */
    @java.lang.Override
    public cosmos.base.v1beta1.CoinOuterClass.DecCoin getPrice() {
      return price_ == null ? cosmos.base.v1beta1.CoinOuterClass.DecCoin.getDefaultInstance() : price_;
    }
    /**
     * <code>.cosmos.base.v1beta1.DecCoin price = 3 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
     */
    @java.lang.Override
    public cosmos.base.v1beta1.CoinOuterClass.DecCoinOrBuilder getPriceOrBuilder() {
      return getPrice();
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
      if (resources_ != null) {
        output.writeMessage(1, getResources());
      }
      if (count_ != 0) {
        output.writeUInt32(2, count_);
      }
      if (price_ != null) {
        output.writeMessage(3, getPrice());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (resources_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getResources());
      }
      if (count_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, count_);
      }
      if (price_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getPrice());
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
      if (!(obj instanceof akash.deployment.v1beta2.ResourceOuterClass.Resource)) {
        return super.equals(obj);
      }
      akash.deployment.v1beta2.ResourceOuterClass.Resource other = (akash.deployment.v1beta2.ResourceOuterClass.Resource) obj;

      if (hasResources() != other.hasResources()) return false;
      if (hasResources()) {
        if (!getResources()
            .equals(other.getResources())) return false;
      }
      if (getCount()
          != other.getCount()) return false;
      if (hasPrice() != other.hasPrice()) return false;
      if (hasPrice()) {
        if (!getPrice()
            .equals(other.getPrice())) return false;
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
      if (hasResources()) {
        hash = (37 * hash) + RESOURCES_FIELD_NUMBER;
        hash = (53 * hash) + getResources().hashCode();
      }
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCount();
      if (hasPrice()) {
        hash = (37 * hash) + PRICE_FIELD_NUMBER;
        hash = (53 * hash) + getPrice().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static akash.deployment.v1beta2.ResourceOuterClass.Resource parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static akash.deployment.v1beta2.ResourceOuterClass.Resource parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static akash.deployment.v1beta2.ResourceOuterClass.Resource parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static akash.deployment.v1beta2.ResourceOuterClass.Resource parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static akash.deployment.v1beta2.ResourceOuterClass.Resource parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static akash.deployment.v1beta2.ResourceOuterClass.Resource parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static akash.deployment.v1beta2.ResourceOuterClass.Resource parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static akash.deployment.v1beta2.ResourceOuterClass.Resource parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static akash.deployment.v1beta2.ResourceOuterClass.Resource parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static akash.deployment.v1beta2.ResourceOuterClass.Resource parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static akash.deployment.v1beta2.ResourceOuterClass.Resource parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static akash.deployment.v1beta2.ResourceOuterClass.Resource parseFrom(
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
    public static Builder newBuilder(akash.deployment.v1beta2.ResourceOuterClass.Resource prototype) {
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
     * Resource stores unit, total count and price of resource
     * </pre>
     *
     * Protobuf type {@code akash.deployment.v1beta2.Resource}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:akash.deployment.v1beta2.Resource)
        akash.deployment.v1beta2.ResourceOuterClass.ResourceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return akash.deployment.v1beta2.ResourceOuterClass.internal_static_akash_deployment_v1beta2_Resource_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return akash.deployment.v1beta2.ResourceOuterClass.internal_static_akash_deployment_v1beta2_Resource_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                akash.deployment.v1beta2.ResourceOuterClass.Resource.class, akash.deployment.v1beta2.ResourceOuterClass.Resource.Builder.class);
      }

      // Construct using akash.deployment.v1beta2.ResourceOuterClass.Resource.newBuilder()
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
        if (resourcesBuilder_ == null) {
          resources_ = null;
        } else {
          resources_ = null;
          resourcesBuilder_ = null;
        }
        count_ = 0;

        if (priceBuilder_ == null) {
          price_ = null;
        } else {
          price_ = null;
          priceBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return akash.deployment.v1beta2.ResourceOuterClass.internal_static_akash_deployment_v1beta2_Resource_descriptor;
      }

      @java.lang.Override
      public akash.deployment.v1beta2.ResourceOuterClass.Resource getDefaultInstanceForType() {
        return akash.deployment.v1beta2.ResourceOuterClass.Resource.getDefaultInstance();
      }

      @java.lang.Override
      public akash.deployment.v1beta2.ResourceOuterClass.Resource build() {
        akash.deployment.v1beta2.ResourceOuterClass.Resource result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public akash.deployment.v1beta2.ResourceOuterClass.Resource buildPartial() {
        akash.deployment.v1beta2.ResourceOuterClass.Resource result = new akash.deployment.v1beta2.ResourceOuterClass.Resource(this);
        if (resourcesBuilder_ == null) {
          result.resources_ = resources_;
        } else {
          result.resources_ = resourcesBuilder_.build();
        }
        result.count_ = count_;
        if (priceBuilder_ == null) {
          result.price_ = price_;
        } else {
          result.price_ = priceBuilder_.build();
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
        if (other instanceof akash.deployment.v1beta2.ResourceOuterClass.Resource) {
          return mergeFrom((akash.deployment.v1beta2.ResourceOuterClass.Resource)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(akash.deployment.v1beta2.ResourceOuterClass.Resource other) {
        if (other == akash.deployment.v1beta2.ResourceOuterClass.Resource.getDefaultInstance()) return this;
        if (other.hasResources()) {
          mergeResources(other.getResources());
        }
        if (other.getCount() != 0) {
          setCount(other.getCount());
        }
        if (other.hasPrice()) {
          mergePrice(other.getPrice());
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
        akash.deployment.v1beta2.ResourceOuterClass.Resource parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (akash.deployment.v1beta2.ResourceOuterClass.Resource) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private akash.base.v1beta2.Resourceunits.ResourceUnits resources_;
      private com.google.protobuf.SingleFieldBuilderV3<
          akash.base.v1beta2.Resourceunits.ResourceUnits, akash.base.v1beta2.Resourceunits.ResourceUnits.Builder, akash.base.v1beta2.Resourceunits.ResourceUnitsOrBuilder> resourcesBuilder_;
      /**
       * <code>.akash.base.v1beta2.ResourceUnits resources = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
       * @return Whether the resources field is set.
       */
      public boolean hasResources() {
        return resourcesBuilder_ != null || resources_ != null;
      }
      /**
       * <code>.akash.base.v1beta2.ResourceUnits resources = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
       * @return The resources.
       */
      public akash.base.v1beta2.Resourceunits.ResourceUnits getResources() {
        if (resourcesBuilder_ == null) {
          return resources_ == null ? akash.base.v1beta2.Resourceunits.ResourceUnits.getDefaultInstance() : resources_;
        } else {
          return resourcesBuilder_.getMessage();
        }
      }
      /**
       * <code>.akash.base.v1beta2.ResourceUnits resources = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
       */
      public Builder setResources(akash.base.v1beta2.Resourceunits.ResourceUnits value) {
        if (resourcesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          resources_ = value;
          onChanged();
        } else {
          resourcesBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.akash.base.v1beta2.ResourceUnits resources = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
       */
      public Builder setResources(
          akash.base.v1beta2.Resourceunits.ResourceUnits.Builder builderForValue) {
        if (resourcesBuilder_ == null) {
          resources_ = builderForValue.build();
          onChanged();
        } else {
          resourcesBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.akash.base.v1beta2.ResourceUnits resources = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
       */
      public Builder mergeResources(akash.base.v1beta2.Resourceunits.ResourceUnits value) {
        if (resourcesBuilder_ == null) {
          if (resources_ != null) {
            resources_ =
              akash.base.v1beta2.Resourceunits.ResourceUnits.newBuilder(resources_).mergeFrom(value).buildPartial();
          } else {
            resources_ = value;
          }
          onChanged();
        } else {
          resourcesBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.akash.base.v1beta2.ResourceUnits resources = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
       */
      public Builder clearResources() {
        if (resourcesBuilder_ == null) {
          resources_ = null;
          onChanged();
        } else {
          resources_ = null;
          resourcesBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.akash.base.v1beta2.ResourceUnits resources = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
       */
      public akash.base.v1beta2.Resourceunits.ResourceUnits.Builder getResourcesBuilder() {
        
        onChanged();
        return getResourcesFieldBuilder().getBuilder();
      }
      /**
       * <code>.akash.base.v1beta2.ResourceUnits resources = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
       */
      public akash.base.v1beta2.Resourceunits.ResourceUnitsOrBuilder getResourcesOrBuilder() {
        if (resourcesBuilder_ != null) {
          return resourcesBuilder_.getMessageOrBuilder();
        } else {
          return resources_ == null ?
              akash.base.v1beta2.Resourceunits.ResourceUnits.getDefaultInstance() : resources_;
        }
      }
      /**
       * <code>.akash.base.v1beta2.ResourceUnits resources = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          akash.base.v1beta2.Resourceunits.ResourceUnits, akash.base.v1beta2.Resourceunits.ResourceUnits.Builder, akash.base.v1beta2.Resourceunits.ResourceUnitsOrBuilder> 
          getResourcesFieldBuilder() {
        if (resourcesBuilder_ == null) {
          resourcesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              akash.base.v1beta2.Resourceunits.ResourceUnits, akash.base.v1beta2.Resourceunits.ResourceUnits.Builder, akash.base.v1beta2.Resourceunits.ResourceUnitsOrBuilder>(
                  getResources(),
                  getParentForChildren(),
                  isClean());
          resources_ = null;
        }
        return resourcesBuilder_;
      }

      private int count_ ;
      /**
       * <code>uint32 count = 2 [(.gogoproto.jsontag) = "count", (.gogoproto.moretags) = "yaml:&#92;"count&#92;""];</code>
       * @return The count.
       */
      @java.lang.Override
      public int getCount() {
        return count_;
      }
      /**
       * <code>uint32 count = 2 [(.gogoproto.jsontag) = "count", (.gogoproto.moretags) = "yaml:&#92;"count&#92;""];</code>
       * @param value The count to set.
       * @return This builder for chaining.
       */
      public Builder setCount(int value) {
        
        count_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 count = 2 [(.gogoproto.jsontag) = "count", (.gogoproto.moretags) = "yaml:&#92;"count&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearCount() {
        
        count_ = 0;
        onChanged();
        return this;
      }

      private cosmos.base.v1beta1.CoinOuterClass.DecCoin price_;
      private com.google.protobuf.SingleFieldBuilderV3<
          cosmos.base.v1beta1.CoinOuterClass.DecCoin, cosmos.base.v1beta1.CoinOuterClass.DecCoin.Builder, cosmos.base.v1beta1.CoinOuterClass.DecCoinOrBuilder> priceBuilder_;
      /**
       * <code>.cosmos.base.v1beta1.DecCoin price = 3 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
       * @return Whether the price field is set.
       */
      public boolean hasPrice() {
        return priceBuilder_ != null || price_ != null;
      }
      /**
       * <code>.cosmos.base.v1beta1.DecCoin price = 3 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
       * @return The price.
       */
      public cosmos.base.v1beta1.CoinOuterClass.DecCoin getPrice() {
        if (priceBuilder_ == null) {
          return price_ == null ? cosmos.base.v1beta1.CoinOuterClass.DecCoin.getDefaultInstance() : price_;
        } else {
          return priceBuilder_.getMessage();
        }
      }
      /**
       * <code>.cosmos.base.v1beta1.DecCoin price = 3 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
       */
      public Builder setPrice(cosmos.base.v1beta1.CoinOuterClass.DecCoin value) {
        if (priceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          price_ = value;
          onChanged();
        } else {
          priceBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.cosmos.base.v1beta1.DecCoin price = 3 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
       */
      public Builder setPrice(
          cosmos.base.v1beta1.CoinOuterClass.DecCoin.Builder builderForValue) {
        if (priceBuilder_ == null) {
          price_ = builderForValue.build();
          onChanged();
        } else {
          priceBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.cosmos.base.v1beta1.DecCoin price = 3 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
       */
      public Builder mergePrice(cosmos.base.v1beta1.CoinOuterClass.DecCoin value) {
        if (priceBuilder_ == null) {
          if (price_ != null) {
            price_ =
              cosmos.base.v1beta1.CoinOuterClass.DecCoin.newBuilder(price_).mergeFrom(value).buildPartial();
          } else {
            price_ = value;
          }
          onChanged();
        } else {
          priceBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.cosmos.base.v1beta1.DecCoin price = 3 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
       */
      public Builder clearPrice() {
        if (priceBuilder_ == null) {
          price_ = null;
          onChanged();
        } else {
          price_ = null;
          priceBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.cosmos.base.v1beta1.DecCoin price = 3 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
       */
      public cosmos.base.v1beta1.CoinOuterClass.DecCoin.Builder getPriceBuilder() {
        
        onChanged();
        return getPriceFieldBuilder().getBuilder();
      }
      /**
       * <code>.cosmos.base.v1beta1.DecCoin price = 3 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
       */
      public cosmos.base.v1beta1.CoinOuterClass.DecCoinOrBuilder getPriceOrBuilder() {
        if (priceBuilder_ != null) {
          return priceBuilder_.getMessageOrBuilder();
        } else {
          return price_ == null ?
              cosmos.base.v1beta1.CoinOuterClass.DecCoin.getDefaultInstance() : price_;
        }
      }
      /**
       * <code>.cosmos.base.v1beta1.DecCoin price = 3 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          cosmos.base.v1beta1.CoinOuterClass.DecCoin, cosmos.base.v1beta1.CoinOuterClass.DecCoin.Builder, cosmos.base.v1beta1.CoinOuterClass.DecCoinOrBuilder> 
          getPriceFieldBuilder() {
        if (priceBuilder_ == null) {
          priceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              cosmos.base.v1beta1.CoinOuterClass.DecCoin, cosmos.base.v1beta1.CoinOuterClass.DecCoin.Builder, cosmos.base.v1beta1.CoinOuterClass.DecCoinOrBuilder>(
                  getPrice(),
                  getParentForChildren(),
                  isClean());
          price_ = null;
        }
        return priceBuilder_;
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


      // @@protoc_insertion_point(builder_scope:akash.deployment.v1beta2.Resource)
    }

    // @@protoc_insertion_point(class_scope:akash.deployment.v1beta2.Resource)
    private static final akash.deployment.v1beta2.ResourceOuterClass.Resource DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new akash.deployment.v1beta2.ResourceOuterClass.Resource();
    }

    public static akash.deployment.v1beta2.ResourceOuterClass.Resource getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Resource>
        PARSER = new com.google.protobuf.AbstractParser<Resource>() {
      @java.lang.Override
      public Resource parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Resource(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Resource> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Resource> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public akash.deployment.v1beta2.ResourceOuterClass.Resource getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_deployment_v1beta2_Resource_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_deployment_v1beta2_Resource_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'akash/deployment/v1beta2/resource.prot" +
      "o\022\030akash.deployment.v1beta2\032\024gogoproto/g" +
      "ogo.proto\032&akash/base/v1beta2/resourceun" +
      "its.proto\032\036cosmos/base/v1beta1/coin.prot" +
      "o\"\331\001\n\010Resource\022Q\n\tresources\030\001 \001(\0132!.akas" +
      "h.base.v1beta2.ResourceUnitsB\033\310\336\037\000\352\336\037\004un" +
      "it\362\336\037\013yaml:\"unit\"\022(\n\005count\030\002 \001(\rB\031\352\336\037\005co" +
      "unt\362\336\037\014yaml:\"count\"\022J\n\005price\030\003 \001(\0132\034.cos" +
      "mos.base.v1beta1.DecCoinB\035\310\336\037\000\352\336\037\005price\362" +
      "\336\037\014yaml:\"price\":\004\350\240\037\000B4Z2github.com/ovrc" +
      "lk/akash/x/deployment/types/v1beta2b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
          akash.base.v1beta2.Resourceunits.getDescriptor(),
          cosmos.base.v1beta1.CoinOuterClass.getDescriptor(),
        });
    internal_static_akash_deployment_v1beta2_Resource_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_akash_deployment_v1beta2_Resource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_deployment_v1beta2_Resource_descriptor,
        new java.lang.String[] { "Resources", "Count", "Price", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.equal);
    registry.add(com.google.protobuf.GoGoProtos.jsontag);
    registry.add(com.google.protobuf.GoGoProtos.moretags);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    akash.base.v1beta2.Resourceunits.getDescriptor();
    cosmos.base.v1beta1.CoinOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
