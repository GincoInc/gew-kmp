// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package java.adamant.global.v1;

/**
 * Protobuf type {@code adamant.global.v1.ListUncheckedTransfersByFilterRequest}
 */
public final class ListUncheckedTransfersByFilterRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.ListUncheckedTransfersByFilterRequest)
    ListUncheckedTransfersByFilterRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListUncheckedTransfersByFilterRequest.newBuilder() to construct.
  private ListUncheckedTransfersByFilterRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListUncheckedTransfersByFilterRequest() {
    walletType_ = java.util.Collections.emptyList();
    pageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListUncheckedTransfersByFilterRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListUncheckedTransfersByFilterRequest(
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
          case 8: {

            hasChecked_ = input.readBool();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              walletType_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            walletType_.add(rawValue);
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                walletType_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              walletType_.add(rawValue);
            }
            input.popLimit(oldLimit);
            break;
          }
          case 24: {

            pageSize_ = input.readUInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            pageToken_ = s;
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
        walletType_ = java.util.Collections.unmodifiableList(walletType_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return java.adamant.global.v1.GlobalApiProto.internal_static_adamant_global_v1_ListUncheckedTransfersByFilterRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return java.adamant.global.v1.GlobalApiProto.internal_static_adamant_global_v1_ListUncheckedTransfersByFilterRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            java.adamant.global.v1.ListUncheckedTransfersByFilterRequest.class, java.adamant.global.v1.ListUncheckedTransfersByFilterRequest.Builder.class);
  }

  public static final int HAS_CHECKED_FIELD_NUMBER = 1;
  private boolean hasChecked_;
  /**
   * <code>bool has_checked = 1 [json_name = "hasChecked"];</code>
   * @return The hasChecked.
   */
  @java.lang.Override
  public boolean getHasChecked() {
    return hasChecked_;
  }

  public static final int WALLET_TYPE_FIELD_NUMBER = 2;
  private java.util.List<java.lang.Integer> walletType_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, java.adamant.global.v1.WalletType> walletType_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, java.adamant.global.v1.WalletType>() {
            public java.adamant.global.v1.WalletType convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              java.adamant.global.v1.WalletType result = java.adamant.global.v1.WalletType.valueOf(from);
              return result == null ? java.adamant.global.v1.WalletType.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .adamant.global.v1.WalletType wallet_type = 2 [json_name = "walletType"];</code>
   * @return A list containing the walletType.
   */
  @java.lang.Override
  public java.util.List<java.adamant.global.v1.WalletType> getWalletTypeList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, java.adamant.global.v1.WalletType>(walletType_, walletType_converter_);
  }
  /**
   * <code>repeated .adamant.global.v1.WalletType wallet_type = 2 [json_name = "walletType"];</code>
   * @return The count of walletType.
   */
  @java.lang.Override
  public int getWalletTypeCount() {
    return walletType_.size();
  }
  /**
   * <code>repeated .adamant.global.v1.WalletType wallet_type = 2 [json_name = "walletType"];</code>
   * @param index The index of the element to return.
   * @return The walletType at the given index.
   */
  @java.lang.Override
  public java.adamant.global.v1.WalletType getWalletType(int index) {
    return walletType_converter_.convert(walletType_.get(index));
  }
  /**
   * <code>repeated .adamant.global.v1.WalletType wallet_type = 2 [json_name = "walletType"];</code>
   * @return A list containing the enum numeric values on the wire for walletType.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getWalletTypeValueList() {
    return walletType_;
  }
  /**
   * <code>repeated .adamant.global.v1.WalletType wallet_type = 2 [json_name = "walletType"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of walletType at the given index.
   */
  @java.lang.Override
  public int getWalletTypeValue(int index) {
    return walletType_.get(index);
  }
  private int walletTypeMemoizedSerializedSize;

  public static final int PAGE_SIZE_FIELD_NUMBER = 3;
  private int pageSize_;
  /**
   * <pre>
   * indicate how many objects to return in a single response
   * </pre>
   *
   * <code>uint32 page_size = 3 [json_name = "pageSize", (.validate.rules) = { ... }</code>
   * @return The pageSize.
   */
  @java.lang.Override
  public int getPageSize() {
    return pageSize_;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 4;
  private volatile java.lang.Object pageToken_;
  /**
   * <pre>
   * retrieve the next page
   * </pre>
   *
   * <code>string page_token = 4 [json_name = "pageToken", (.validate.rules) = { ... }</code>
   * @return The pageToken.
   */
  @java.lang.Override
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * retrieve the next page
   * </pre>
   *
   * <code>string page_token = 4 [json_name = "pageToken", (.validate.rules) = { ... }</code>
   * @return The bytes for pageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pageToken_ = b;
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
    getSerializedSize();
    if (hasChecked_ != false) {
      output.writeBool(1, hasChecked_);
    }
    if (getWalletTypeList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(walletTypeMemoizedSerializedSize);
    }
    for (int i = 0; i < walletType_.size(); i++) {
      output.writeEnumNoTag(walletType_.get(i));
    }
    if (pageSize_ != 0) {
      output.writeUInt32(3, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, pageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hasChecked_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, hasChecked_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < walletType_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(walletType_.get(i));
      }
      size += dataSize;
      if (!getWalletTypeList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }walletTypeMemoizedSerializedSize = dataSize;
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, pageToken_);
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
    if (!(obj instanceof java.adamant.global.v1.ListUncheckedTransfersByFilterRequest)) {
      return super.equals(obj);
    }
    java.adamant.global.v1.ListUncheckedTransfersByFilterRequest other = (java.adamant.global.v1.ListUncheckedTransfersByFilterRequest) obj;

    if (getHasChecked()
        != other.getHasChecked()) return false;
    if (!walletType_.equals(other.walletType_)) return false;
    if (getPageSize()
        != other.getPageSize()) return false;
    if (!getPageToken()
        .equals(other.getPageToken())) return false;
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
    hash = (37 * hash) + HAS_CHECKED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHasChecked());
    if (getWalletTypeCount() > 0) {
      hash = (37 * hash) + WALLET_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + walletType_.hashCode();
    }
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static java.adamant.global.v1.ListUncheckedTransfersByFilterRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static java.adamant.global.v1.ListUncheckedTransfersByFilterRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static java.adamant.global.v1.ListUncheckedTransfersByFilterRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static java.adamant.global.v1.ListUncheckedTransfersByFilterRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static java.adamant.global.v1.ListUncheckedTransfersByFilterRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static java.adamant.global.v1.ListUncheckedTransfersByFilterRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static java.adamant.global.v1.ListUncheckedTransfersByFilterRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static java.adamant.global.v1.ListUncheckedTransfersByFilterRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static java.adamant.global.v1.ListUncheckedTransfersByFilterRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static java.adamant.global.v1.ListUncheckedTransfersByFilterRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static java.adamant.global.v1.ListUncheckedTransfersByFilterRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static java.adamant.global.v1.ListUncheckedTransfersByFilterRequest parseFrom(
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
  public static Builder newBuilder(java.adamant.global.v1.ListUncheckedTransfersByFilterRequest prototype) {
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
   * Protobuf type {@code adamant.global.v1.ListUncheckedTransfersByFilterRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.ListUncheckedTransfersByFilterRequest)
      java.adamant.global.v1.ListUncheckedTransfersByFilterRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return java.adamant.global.v1.GlobalApiProto.internal_static_adamant_global_v1_ListUncheckedTransfersByFilterRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return java.adamant.global.v1.GlobalApiProto.internal_static_adamant_global_v1_ListUncheckedTransfersByFilterRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              java.adamant.global.v1.ListUncheckedTransfersByFilterRequest.class, java.adamant.global.v1.ListUncheckedTransfersByFilterRequest.Builder.class);
    }

    // Construct using java.adamant.global.v1.ListUncheckedTransfersByFilterRequest.newBuilder()
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
      hasChecked_ = false;

      walletType_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      pageSize_ = 0;

      pageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return java.adamant.global.v1.GlobalApiProto.internal_static_adamant_global_v1_ListUncheckedTransfersByFilterRequest_descriptor;
    }

    @java.lang.Override
    public java.adamant.global.v1.ListUncheckedTransfersByFilterRequest getDefaultInstanceForType() {
      return java.adamant.global.v1.ListUncheckedTransfersByFilterRequest.getDefaultInstance();
    }

    @java.lang.Override
    public java.adamant.global.v1.ListUncheckedTransfersByFilterRequest build() {
      java.adamant.global.v1.ListUncheckedTransfersByFilterRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public java.adamant.global.v1.ListUncheckedTransfersByFilterRequest buildPartial() {
      java.adamant.global.v1.ListUncheckedTransfersByFilterRequest result = new java.adamant.global.v1.ListUncheckedTransfersByFilterRequest(this);
      int from_bitField0_ = bitField0_;
      result.hasChecked_ = hasChecked_;
      if (((bitField0_ & 0x00000001) != 0)) {
        walletType_ = java.util.Collections.unmodifiableList(walletType_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.walletType_ = walletType_;
      result.pageSize_ = pageSize_;
      result.pageToken_ = pageToken_;
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
      if (other instanceof java.adamant.global.v1.ListUncheckedTransfersByFilterRequest) {
        return mergeFrom((java.adamant.global.v1.ListUncheckedTransfersByFilterRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(java.adamant.global.v1.ListUncheckedTransfersByFilterRequest other) {
      if (other == java.adamant.global.v1.ListUncheckedTransfersByFilterRequest.getDefaultInstance()) return this;
      if (other.getHasChecked() != false) {
        setHasChecked(other.getHasChecked());
      }
      if (!other.walletType_.isEmpty()) {
        if (walletType_.isEmpty()) {
          walletType_ = other.walletType_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureWalletTypeIsMutable();
          walletType_.addAll(other.walletType_);
        }
        onChanged();
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
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
      java.adamant.global.v1.ListUncheckedTransfersByFilterRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (java.adamant.global.v1.ListUncheckedTransfersByFilterRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean hasChecked_ ;
    /**
     * <code>bool has_checked = 1 [json_name = "hasChecked"];</code>
     * @return The hasChecked.
     */
    @java.lang.Override
    public boolean getHasChecked() {
      return hasChecked_;
    }
    /**
     * <code>bool has_checked = 1 [json_name = "hasChecked"];</code>
     * @param value The hasChecked to set.
     * @return This builder for chaining.
     */
    public Builder setHasChecked(boolean value) {
      
      hasChecked_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool has_checked = 1 [json_name = "hasChecked"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHasChecked() {
      
      hasChecked_ = false;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> walletType_ =
      java.util.Collections.emptyList();
    private void ensureWalletTypeIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        walletType_ = new java.util.ArrayList<java.lang.Integer>(walletType_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .adamant.global.v1.WalletType wallet_type = 2 [json_name = "walletType"];</code>
     * @return A list containing the walletType.
     */
    public java.util.List<java.adamant.global.v1.WalletType> getWalletTypeList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, java.adamant.global.v1.WalletType>(walletType_, walletType_converter_);
    }
    /**
     * <code>repeated .adamant.global.v1.WalletType wallet_type = 2 [json_name = "walletType"];</code>
     * @return The count of walletType.
     */
    public int getWalletTypeCount() {
      return walletType_.size();
    }
    /**
     * <code>repeated .adamant.global.v1.WalletType wallet_type = 2 [json_name = "walletType"];</code>
     * @param index The index of the element to return.
     * @return The walletType at the given index.
     */
    public java.adamant.global.v1.WalletType getWalletType(int index) {
      return walletType_converter_.convert(walletType_.get(index));
    }
    /**
     * <code>repeated .adamant.global.v1.WalletType wallet_type = 2 [json_name = "walletType"];</code>
     * @param index The index to set the value at.
     * @param value The walletType to set.
     * @return This builder for chaining.
     */
    public Builder setWalletType(
        int index, java.adamant.global.v1.WalletType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureWalletTypeIsMutable();
      walletType_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.WalletType wallet_type = 2 [json_name = "walletType"];</code>
     * @param value The walletType to add.
     * @return This builder for chaining.
     */
    public Builder addWalletType(java.adamant.global.v1.WalletType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureWalletTypeIsMutable();
      walletType_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.WalletType wallet_type = 2 [json_name = "walletType"];</code>
     * @param values The walletType to add.
     * @return This builder for chaining.
     */
    public Builder addAllWalletType(
        java.lang.Iterable<? extends java.adamant.global.v1.WalletType> values) {
      ensureWalletTypeIsMutable();
      for (java.adamant.global.v1.WalletType value : values) {
        walletType_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.WalletType wallet_type = 2 [json_name = "walletType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWalletType() {
      walletType_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.WalletType wallet_type = 2 [json_name = "walletType"];</code>
     * @return A list containing the enum numeric values on the wire for walletType.
     */
    public java.util.List<java.lang.Integer>
    getWalletTypeValueList() {
      return java.util.Collections.unmodifiableList(walletType_);
    }
    /**
     * <code>repeated .adamant.global.v1.WalletType wallet_type = 2 [json_name = "walletType"];</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of walletType at the given index.
     */
    public int getWalletTypeValue(int index) {
      return walletType_.get(index);
    }
    /**
     * <code>repeated .adamant.global.v1.WalletType wallet_type = 2 [json_name = "walletType"];</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of walletType at the given index.
     * @return This builder for chaining.
     */
    public Builder setWalletTypeValue(
        int index, int value) {
      ensureWalletTypeIsMutable();
      walletType_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.WalletType wallet_type = 2 [json_name = "walletType"];</code>
     * @param value The enum numeric value on the wire for walletType to add.
     * @return This builder for chaining.
     */
    public Builder addWalletTypeValue(int value) {
      ensureWalletTypeIsMutable();
      walletType_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.WalletType wallet_type = 2 [json_name = "walletType"];</code>
     * @param values The enum numeric values on the wire for walletType to add.
     * @return This builder for chaining.
     */
    public Builder addAllWalletTypeValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureWalletTypeIsMutable();
      for (int value : values) {
        walletType_.add(value);
      }
      onChanged();
      return this;
    }

    private int pageSize_ ;
    /**
     * <pre>
     * indicate how many objects to return in a single response
     * </pre>
     *
     * <code>uint32 page_size = 3 [json_name = "pageSize", (.validate.rules) = { ... }</code>
     * @return The pageSize.
     */
    @java.lang.Override
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <pre>
     * indicate how many objects to return in a single response
     * </pre>
     *
     * <code>uint32 page_size = 3 [json_name = "pageSize", (.validate.rules) = { ... }</code>
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * indicate how many objects to return in a single response
     * </pre>
     *
     * <code>uint32 page_size = 3 [json_name = "pageSize", (.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     * <pre>
     * retrieve the next page
     * </pre>
     *
     * <code>string page_token = 4 [json_name = "pageToken", (.validate.rules) = { ... }</code>
     * @return The pageToken.
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * retrieve the next page
     * </pre>
     *
     * <code>string page_token = 4 [json_name = "pageToken", (.validate.rules) = { ... }</code>
     * @return The bytes for pageToken.
     */
    public com.google.protobuf.ByteString
        getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * retrieve the next page
     * </pre>
     *
     * <code>string page_token = 4 [json_name = "pageToken", (.validate.rules) = { ... }</code>
     * @param value The pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * retrieve the next page
     * </pre>
     *
     * <code>string page_token = 4 [json_name = "pageToken", (.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearPageToken() {
      
      pageToken_ = getDefaultInstance().getPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * retrieve the next page
     * </pre>
     *
     * <code>string page_token = 4 [json_name = "pageToken", (.validate.rules) = { ... }</code>
     * @param value The bytes for pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.ListUncheckedTransfersByFilterRequest)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.ListUncheckedTransfersByFilterRequest)
  private static final java.adamant.global.v1.ListUncheckedTransfersByFilterRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new java.adamant.global.v1.ListUncheckedTransfersByFilterRequest();
  }

  public static java.adamant.global.v1.ListUncheckedTransfersByFilterRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListUncheckedTransfersByFilterRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListUncheckedTransfersByFilterRequest>() {
    @java.lang.Override
    public ListUncheckedTransfersByFilterRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListUncheckedTransfersByFilterRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListUncheckedTransfersByFilterRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListUncheckedTransfersByFilterRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public java.adamant.global.v1.ListUncheckedTransfersByFilterRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
