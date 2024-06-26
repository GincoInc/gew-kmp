// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
 * <pre>
 * -----------------------------------------------------------------------------
 * ETH
 * </pre>
 *
 * Protobuf type {@code adamant.global.v1.ExitEthereumStakingValidatorsRequest}
 */
public final class ExitEthereumStakingValidatorsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.ExitEthereumStakingValidatorsRequest)
    ExitEthereumStakingValidatorsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExitEthereumStakingValidatorsRequest.newBuilder() to construct.
  private ExitEthereumStakingValidatorsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExitEthereumStakingValidatorsRequest() {
    validatorIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    walletId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExitEthereumStakingValidatorsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ExitEthereumStakingValidatorsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ExitEthereumStakingValidatorsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            adamant.global.v1.ExitEthereumStakingValidatorsRequest.class, adamant.global.v1.ExitEthereumStakingValidatorsRequest.Builder.class);
  }

  public static final int VALIDATOR_IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList validatorIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string validator_ids = 1 [json_name = "validatorIds"];</code>
   * @return A list containing the validatorIds.
   */
  public com.google.protobuf.ProtocolStringList
      getValidatorIdsList() {
    return validatorIds_;
  }
  /**
   * <code>repeated string validator_ids = 1 [json_name = "validatorIds"];</code>
   * @return The count of validatorIds.
   */
  public int getValidatorIdsCount() {
    return validatorIds_.size();
  }
  /**
   * <code>repeated string validator_ids = 1 [json_name = "validatorIds"];</code>
   * @param index The index of the element to return.
   * @return The validatorIds at the given index.
   */
  public java.lang.String getValidatorIds(int index) {
    return validatorIds_.get(index);
  }
  /**
   * <code>repeated string validator_ids = 1 [json_name = "validatorIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the validatorIds at the given index.
   */
  public com.google.protobuf.ByteString
      getValidatorIdsBytes(int index) {
    return validatorIds_.getByteString(index);
  }

  public static final int WALLET_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object walletId_ = "";
  /**
   * <code>string wallet_id = 2 [json_name = "walletId", (.validate.rules) = { ... }</code>
   * @return The walletId.
   */
  @java.lang.Override
  public java.lang.String getWalletId() {
    java.lang.Object ref = walletId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      walletId_ = s;
      return s;
    }
  }
  /**
   * <code>string wallet_id = 2 [json_name = "walletId", (.validate.rules) = { ... }</code>
   * @return The bytes for walletId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWalletIdBytes() {
    java.lang.Object ref = walletId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      walletId_ = b;
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
    for (int i = 0; i < validatorIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, validatorIds_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(walletId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, walletId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < validatorIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(validatorIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getValidatorIdsList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(walletId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, walletId_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof adamant.global.v1.ExitEthereumStakingValidatorsRequest)) {
      return super.equals(obj);
    }
    adamant.global.v1.ExitEthereumStakingValidatorsRequest other = (adamant.global.v1.ExitEthereumStakingValidatorsRequest) obj;

    if (!getValidatorIdsList()
        .equals(other.getValidatorIdsList())) return false;
    if (!getWalletId()
        .equals(other.getWalletId())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getValidatorIdsCount() > 0) {
      hash = (37 * hash) + VALIDATOR_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getValidatorIdsList().hashCode();
    }
    hash = (37 * hash) + WALLET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getWalletId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static adamant.global.v1.ExitEthereumStakingValidatorsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ExitEthereumStakingValidatorsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ExitEthereumStakingValidatorsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ExitEthereumStakingValidatorsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ExitEthereumStakingValidatorsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ExitEthereumStakingValidatorsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ExitEthereumStakingValidatorsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ExitEthereumStakingValidatorsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static adamant.global.v1.ExitEthereumStakingValidatorsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static adamant.global.v1.ExitEthereumStakingValidatorsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.ExitEthereumStakingValidatorsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ExitEthereumStakingValidatorsRequest parseFrom(
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
  public static Builder newBuilder(adamant.global.v1.ExitEthereumStakingValidatorsRequest prototype) {
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
   * -----------------------------------------------------------------------------
   * ETH
   * </pre>
   *
   * Protobuf type {@code adamant.global.v1.ExitEthereumStakingValidatorsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.ExitEthereumStakingValidatorsRequest)
      adamant.global.v1.ExitEthereumStakingValidatorsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ExitEthereumStakingValidatorsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ExitEthereumStakingValidatorsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              adamant.global.v1.ExitEthereumStakingValidatorsRequest.class, adamant.global.v1.ExitEthereumStakingValidatorsRequest.Builder.class);
    }

    // Construct using adamant.global.v1.ExitEthereumStakingValidatorsRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      validatorIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      walletId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ExitEthereumStakingValidatorsRequest_descriptor;
    }

    @java.lang.Override
    public adamant.global.v1.ExitEthereumStakingValidatorsRequest getDefaultInstanceForType() {
      return adamant.global.v1.ExitEthereumStakingValidatorsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public adamant.global.v1.ExitEthereumStakingValidatorsRequest build() {
      adamant.global.v1.ExitEthereumStakingValidatorsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public adamant.global.v1.ExitEthereumStakingValidatorsRequest buildPartial() {
      adamant.global.v1.ExitEthereumStakingValidatorsRequest result = new adamant.global.v1.ExitEthereumStakingValidatorsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(adamant.global.v1.ExitEthereumStakingValidatorsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        validatorIds_.makeImmutable();
        result.validatorIds_ = validatorIds_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.walletId_ = walletId_;
      }
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
      if (other instanceof adamant.global.v1.ExitEthereumStakingValidatorsRequest) {
        return mergeFrom((adamant.global.v1.ExitEthereumStakingValidatorsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(adamant.global.v1.ExitEthereumStakingValidatorsRequest other) {
      if (other == adamant.global.v1.ExitEthereumStakingValidatorsRequest.getDefaultInstance()) return this;
      if (!other.validatorIds_.isEmpty()) {
        if (validatorIds_.isEmpty()) {
          validatorIds_ = other.validatorIds_;
          bitField0_ |= 0x00000001;
        } else {
          ensureValidatorIdsIsMutable();
          validatorIds_.addAll(other.validatorIds_);
        }
        onChanged();
      }
      if (!other.getWalletId().isEmpty()) {
        walletId_ = other.walletId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
              ensureValidatorIdsIsMutable();
              validatorIds_.add(s);
              break;
            } // case 10
            case 18: {
              walletId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringArrayList validatorIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureValidatorIdsIsMutable() {
      if (!validatorIds_.isModifiable()) {
        validatorIds_ = new com.google.protobuf.LazyStringArrayList(validatorIds_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string validator_ids = 1 [json_name = "validatorIds"];</code>
     * @return A list containing the validatorIds.
     */
    public com.google.protobuf.ProtocolStringList
        getValidatorIdsList() {
      validatorIds_.makeImmutable();
      return validatorIds_;
    }
    /**
     * <code>repeated string validator_ids = 1 [json_name = "validatorIds"];</code>
     * @return The count of validatorIds.
     */
    public int getValidatorIdsCount() {
      return validatorIds_.size();
    }
    /**
     * <code>repeated string validator_ids = 1 [json_name = "validatorIds"];</code>
     * @param index The index of the element to return.
     * @return The validatorIds at the given index.
     */
    public java.lang.String getValidatorIds(int index) {
      return validatorIds_.get(index);
    }
    /**
     * <code>repeated string validator_ids = 1 [json_name = "validatorIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the validatorIds at the given index.
     */
    public com.google.protobuf.ByteString
        getValidatorIdsBytes(int index) {
      return validatorIds_.getByteString(index);
    }
    /**
     * <code>repeated string validator_ids = 1 [json_name = "validatorIds"];</code>
     * @param index The index to set the value at.
     * @param value The validatorIds to set.
     * @return This builder for chaining.
     */
    public Builder setValidatorIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureValidatorIdsIsMutable();
      validatorIds_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string validator_ids = 1 [json_name = "validatorIds"];</code>
     * @param value The validatorIds to add.
     * @return This builder for chaining.
     */
    public Builder addValidatorIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureValidatorIdsIsMutable();
      validatorIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string validator_ids = 1 [json_name = "validatorIds"];</code>
     * @param values The validatorIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllValidatorIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureValidatorIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, validatorIds_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string validator_ids = 1 [json_name = "validatorIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValidatorIds() {
      validatorIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string validator_ids = 1 [json_name = "validatorIds"];</code>
     * @param value The bytes of the validatorIds to add.
     * @return This builder for chaining.
     */
    public Builder addValidatorIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureValidatorIdsIsMutable();
      validatorIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object walletId_ = "";
    /**
     * <code>string wallet_id = 2 [json_name = "walletId", (.validate.rules) = { ... }</code>
     * @return The walletId.
     */
    public java.lang.String getWalletId() {
      java.lang.Object ref = walletId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        walletId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string wallet_id = 2 [json_name = "walletId", (.validate.rules) = { ... }</code>
     * @return The bytes for walletId.
     */
    public com.google.protobuf.ByteString
        getWalletIdBytes() {
      java.lang.Object ref = walletId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        walletId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string wallet_id = 2 [json_name = "walletId", (.validate.rules) = { ... }</code>
     * @param value The walletId to set.
     * @return This builder for chaining.
     */
    public Builder setWalletId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      walletId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string wallet_id = 2 [json_name = "walletId", (.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearWalletId() {
      walletId_ = getDefaultInstance().getWalletId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string wallet_id = 2 [json_name = "walletId", (.validate.rules) = { ... }</code>
     * @param value The bytes for walletId to set.
     * @return This builder for chaining.
     */
    public Builder setWalletIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      walletId_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.ExitEthereumStakingValidatorsRequest)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.ExitEthereumStakingValidatorsRequest)
  private static final adamant.global.v1.ExitEthereumStakingValidatorsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new adamant.global.v1.ExitEthereumStakingValidatorsRequest();
  }

  public static adamant.global.v1.ExitEthereumStakingValidatorsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExitEthereumStakingValidatorsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ExitEthereumStakingValidatorsRequest>() {
    @java.lang.Override
    public ExitEthereumStakingValidatorsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ExitEthereumStakingValidatorsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExitEthereumStakingValidatorsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public adamant.global.v1.ExitEthereumStakingValidatorsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

