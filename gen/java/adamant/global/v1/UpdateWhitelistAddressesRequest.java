// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
 * Protobuf type {@code adamant.global.v1.UpdateWhitelistAddressesRequest}
 */
public  final class UpdateWhitelistAddressesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.UpdateWhitelistAddressesRequest)
    UpdateWhitelistAddressesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateWhitelistAddressesRequest.newBuilder() to construct.
  private UpdateWhitelistAddressesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateWhitelistAddressesRequest() {
    whitelistId_ = "";
    addressIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateWhitelistAddressesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateWhitelistAddressesRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            whitelistId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              addressIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            addressIds_.add(s);
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
        addressIds_ = addressIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_UpdateWhitelistAddressesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_UpdateWhitelistAddressesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            adamant.global.v1.UpdateWhitelistAddressesRequest.class, adamant.global.v1.UpdateWhitelistAddressesRequest.Builder.class);
  }

  public static final int WHITELIST_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object whitelistId_;
  /**
   * <code>string whitelist_id = 1 [(.validate.rules) = { ... }</code>
   */
  public java.lang.String getWhitelistId() {
    java.lang.Object ref = whitelistId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      whitelistId_ = s;
      return s;
    }
  }
  /**
   * <code>string whitelist_id = 1 [(.validate.rules) = { ... }</code>
   */
  public com.google.protobuf.ByteString
      getWhitelistIdBytes() {
    java.lang.Object ref = whitelistId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      whitelistId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADDRESS_IDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList addressIds_;
  /**
   * <code>repeated string address_ids = 2 [(.validate.rules) = { ... }</code>
   */
  public com.google.protobuf.ProtocolStringList
      getAddressIdsList() {
    return addressIds_;
  }
  /**
   * <code>repeated string address_ids = 2 [(.validate.rules) = { ... }</code>
   */
  public int getAddressIdsCount() {
    return addressIds_.size();
  }
  /**
   * <code>repeated string address_ids = 2 [(.validate.rules) = { ... }</code>
   */
  public java.lang.String getAddressIds(int index) {
    return addressIds_.get(index);
  }
  /**
   * <code>repeated string address_ids = 2 [(.validate.rules) = { ... }</code>
   */
  public com.google.protobuf.ByteString
      getAddressIdsBytes(int index) {
    return addressIds_.getByteString(index);
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
    if (!getWhitelistIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, whitelistId_);
    }
    for (int i = 0; i < addressIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, addressIds_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getWhitelistIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, whitelistId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < addressIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(addressIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAddressIdsList().size();
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
    if (!(obj instanceof adamant.global.v1.UpdateWhitelistAddressesRequest)) {
      return super.equals(obj);
    }
    adamant.global.v1.UpdateWhitelistAddressesRequest other = (adamant.global.v1.UpdateWhitelistAddressesRequest) obj;

    if (!getWhitelistId()
        .equals(other.getWhitelistId())) return false;
    if (!getAddressIdsList()
        .equals(other.getAddressIdsList())) return false;
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
    hash = (37 * hash) + WHITELIST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getWhitelistId().hashCode();
    if (getAddressIdsCount() > 0) {
      hash = (37 * hash) + ADDRESS_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getAddressIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static adamant.global.v1.UpdateWhitelistAddressesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.UpdateWhitelistAddressesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.UpdateWhitelistAddressesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.UpdateWhitelistAddressesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.UpdateWhitelistAddressesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.UpdateWhitelistAddressesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.UpdateWhitelistAddressesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.UpdateWhitelistAddressesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.UpdateWhitelistAddressesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static adamant.global.v1.UpdateWhitelistAddressesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.UpdateWhitelistAddressesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.UpdateWhitelistAddressesRequest parseFrom(
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
  public static Builder newBuilder(adamant.global.v1.UpdateWhitelistAddressesRequest prototype) {
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
   * Protobuf type {@code adamant.global.v1.UpdateWhitelistAddressesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.UpdateWhitelistAddressesRequest)
      adamant.global.v1.UpdateWhitelistAddressesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_UpdateWhitelistAddressesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_UpdateWhitelistAddressesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              adamant.global.v1.UpdateWhitelistAddressesRequest.class, adamant.global.v1.UpdateWhitelistAddressesRequest.Builder.class);
    }

    // Construct using adamant.global.v1.UpdateWhitelistAddressesRequest.newBuilder()
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
      whitelistId_ = "";

      addressIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_UpdateWhitelistAddressesRequest_descriptor;
    }

    @java.lang.Override
    public adamant.global.v1.UpdateWhitelistAddressesRequest getDefaultInstanceForType() {
      return adamant.global.v1.UpdateWhitelistAddressesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public adamant.global.v1.UpdateWhitelistAddressesRequest build() {
      adamant.global.v1.UpdateWhitelistAddressesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public adamant.global.v1.UpdateWhitelistAddressesRequest buildPartial() {
      adamant.global.v1.UpdateWhitelistAddressesRequest result = new adamant.global.v1.UpdateWhitelistAddressesRequest(this);
      int from_bitField0_ = bitField0_;
      result.whitelistId_ = whitelistId_;
      if (((bitField0_ & 0x00000001) != 0)) {
        addressIds_ = addressIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.addressIds_ = addressIds_;
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
      if (other instanceof adamant.global.v1.UpdateWhitelistAddressesRequest) {
        return mergeFrom((adamant.global.v1.UpdateWhitelistAddressesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(adamant.global.v1.UpdateWhitelistAddressesRequest other) {
      if (other == adamant.global.v1.UpdateWhitelistAddressesRequest.getDefaultInstance()) return this;
      if (!other.getWhitelistId().isEmpty()) {
        whitelistId_ = other.whitelistId_;
        onChanged();
      }
      if (!other.addressIds_.isEmpty()) {
        if (addressIds_.isEmpty()) {
          addressIds_ = other.addressIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAddressIdsIsMutable();
          addressIds_.addAll(other.addressIds_);
        }
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
      adamant.global.v1.UpdateWhitelistAddressesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (adamant.global.v1.UpdateWhitelistAddressesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object whitelistId_ = "";
    /**
     * <code>string whitelist_id = 1 [(.validate.rules) = { ... }</code>
     */
    public java.lang.String getWhitelistId() {
      java.lang.Object ref = whitelistId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        whitelistId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string whitelist_id = 1 [(.validate.rules) = { ... }</code>
     */
    public com.google.protobuf.ByteString
        getWhitelistIdBytes() {
      java.lang.Object ref = whitelistId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        whitelistId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string whitelist_id = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setWhitelistId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      whitelistId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string whitelist_id = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearWhitelistId() {
      
      whitelistId_ = getDefaultInstance().getWhitelistId();
      onChanged();
      return this;
    }
    /**
     * <code>string whitelist_id = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setWhitelistIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      whitelistId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList addressIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAddressIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        addressIds_ = new com.google.protobuf.LazyStringArrayList(addressIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string address_ids = 2 [(.validate.rules) = { ... }</code>
     */
    public com.google.protobuf.ProtocolStringList
        getAddressIdsList() {
      return addressIds_.getUnmodifiableView();
    }
    /**
     * <code>repeated string address_ids = 2 [(.validate.rules) = { ... }</code>
     */
    public int getAddressIdsCount() {
      return addressIds_.size();
    }
    /**
     * <code>repeated string address_ids = 2 [(.validate.rules) = { ... }</code>
     */
    public java.lang.String getAddressIds(int index) {
      return addressIds_.get(index);
    }
    /**
     * <code>repeated string address_ids = 2 [(.validate.rules) = { ... }</code>
     */
    public com.google.protobuf.ByteString
        getAddressIdsBytes(int index) {
      return addressIds_.getByteString(index);
    }
    /**
     * <code>repeated string address_ids = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setAddressIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAddressIdsIsMutable();
      addressIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string address_ids = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder addAddressIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAddressIdsIsMutable();
      addressIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string address_ids = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder addAllAddressIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureAddressIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, addressIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string address_ids = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder clearAddressIds() {
      addressIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string address_ids = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder addAddressIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureAddressIdsIsMutable();
      addressIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.UpdateWhitelistAddressesRequest)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.UpdateWhitelistAddressesRequest)
  private static final adamant.global.v1.UpdateWhitelistAddressesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new adamant.global.v1.UpdateWhitelistAddressesRequest();
  }

  public static adamant.global.v1.UpdateWhitelistAddressesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateWhitelistAddressesRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateWhitelistAddressesRequest>() {
    @java.lang.Override
    public UpdateWhitelistAddressesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateWhitelistAddressesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateWhitelistAddressesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateWhitelistAddressesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public adamant.global.v1.UpdateWhitelistAddressesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

