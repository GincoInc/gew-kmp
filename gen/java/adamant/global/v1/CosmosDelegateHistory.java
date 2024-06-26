// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
 * Protobuf type {@code adamant.global.v1.CosmosDelegateHistory}
 */
public final class CosmosDelegateHistory extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.CosmosDelegateHistory)
    CosmosDelegateHistoryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CosmosDelegateHistory.newBuilder() to construct.
  private CosmosDelegateHistory(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CosmosDelegateHistory() {
    txId_ = "";
    walletId_ = "";
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CosmosDelegateHistory();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_CosmosDelegateHistory_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_CosmosDelegateHistory_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            adamant.global.v1.CosmosDelegateHistory.class, adamant.global.v1.CosmosDelegateHistory.Builder.class);
  }

  public static final int TX_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object txId_ = "";
  /**
   * <code>string tx_id = 1 [json_name = "txId"];</code>
   * @return The txId.
   */
  @java.lang.Override
  public java.lang.String getTxId() {
    java.lang.Object ref = txId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      txId_ = s;
      return s;
    }
  }
  /**
   * <code>string tx_id = 1 [json_name = "txId"];</code>
   * @return The bytes for txId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTxIdBytes() {
    java.lang.Object ref = txId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      txId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WALLET_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object walletId_ = "";
  /**
   * <code>string wallet_id = 2 [json_name = "walletId"];</code>
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
   * <code>string wallet_id = 2 [json_name = "walletId"];</code>
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

  public static final int TYPE_FIELD_NUMBER = 3;
  private int type_ = 0;
  /**
   * <code>.gincoinc.global.v1.CosmosMsgType type = 3 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.gincoinc.global.v1.CosmosMsgType type = 3 [json_name = "type"];</code>
   * @return The type.
   */
  @java.lang.Override public gincoinc.global.v1.Enum.CosmosMsgType getType() {
    gincoinc.global.v1.Enum.CosmosMsgType result = gincoinc.global.v1.Enum.CosmosMsgType.forNumber(type_);
    return result == null ? gincoinc.global.v1.Enum.CosmosMsgType.UNRECOGNIZED : result;
  }

  public static final int DELEGATE_AMOUNT_FIELD_NUMBER = 4;
  private double delegateAmount_ = 0D;
  /**
   * <code>double delegate_amount = 4 [json_name = "delegateAmount"];</code>
   * @return The delegateAmount.
   */
  @java.lang.Override
  public double getDelegateAmount() {
    return delegateAmount_;
  }

  public static final int REWARD_AMOUNT_FIELD_NUMBER = 5;
  private double rewardAmount_ = 0D;
  /**
   * <code>double reward_amount = 5 [json_name = "rewardAmount"];</code>
   * @return The rewardAmount.
   */
  @java.lang.Override
  public double getRewardAmount() {
    return rewardAmount_;
  }

  public static final int TIME_FIELD_NUMBER = 6;
  private com.google.protobuf.Timestamp time_;
  /**
   * <code>.google.protobuf.Timestamp time = 6 [json_name = "time"];</code>
   * @return Whether the time field is set.
   */
  @java.lang.Override
  public boolean hasTime() {
    return time_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp time = 6 [json_name = "time"];</code>
   * @return The time.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getTime() {
    return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
  }
  /**
   * <code>.google.protobuf.Timestamp time = 6 [json_name = "time"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTimeOrBuilder() {
    return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(txId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, txId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(walletId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, walletId_);
    }
    if (type_ != gincoinc.global.v1.Enum.CosmosMsgType.COSMOS_MSG_TYPE_INVALID.getNumber()) {
      output.writeEnum(3, type_);
    }
    if (java.lang.Double.doubleToRawLongBits(delegateAmount_) != 0) {
      output.writeDouble(4, delegateAmount_);
    }
    if (java.lang.Double.doubleToRawLongBits(rewardAmount_) != 0) {
      output.writeDouble(5, rewardAmount_);
    }
    if (time_ != null) {
      output.writeMessage(6, getTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(txId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, txId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(walletId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, walletId_);
    }
    if (type_ != gincoinc.global.v1.Enum.CosmosMsgType.COSMOS_MSG_TYPE_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, type_);
    }
    if (java.lang.Double.doubleToRawLongBits(delegateAmount_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, delegateAmount_);
    }
    if (java.lang.Double.doubleToRawLongBits(rewardAmount_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, rewardAmount_);
    }
    if (time_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getTime());
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
    if (!(obj instanceof adamant.global.v1.CosmosDelegateHistory)) {
      return super.equals(obj);
    }
    adamant.global.v1.CosmosDelegateHistory other = (adamant.global.v1.CosmosDelegateHistory) obj;

    if (!getTxId()
        .equals(other.getTxId())) return false;
    if (!getWalletId()
        .equals(other.getWalletId())) return false;
    if (type_ != other.type_) return false;
    if (java.lang.Double.doubleToLongBits(getDelegateAmount())
        != java.lang.Double.doubleToLongBits(
            other.getDelegateAmount())) return false;
    if (java.lang.Double.doubleToLongBits(getRewardAmount())
        != java.lang.Double.doubleToLongBits(
            other.getRewardAmount())) return false;
    if (hasTime() != other.hasTime()) return false;
    if (hasTime()) {
      if (!getTime()
          .equals(other.getTime())) return false;
    }
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
    hash = (37 * hash) + TX_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTxId().hashCode();
    hash = (37 * hash) + WALLET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getWalletId().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + DELEGATE_AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getDelegateAmount()));
    hash = (37 * hash) + REWARD_AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getRewardAmount()));
    if (hasTime()) {
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static adamant.global.v1.CosmosDelegateHistory parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.CosmosDelegateHistory parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.CosmosDelegateHistory parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.CosmosDelegateHistory parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.CosmosDelegateHistory parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.CosmosDelegateHistory parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.CosmosDelegateHistory parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.CosmosDelegateHistory parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static adamant.global.v1.CosmosDelegateHistory parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static adamant.global.v1.CosmosDelegateHistory parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.CosmosDelegateHistory parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.CosmosDelegateHistory parseFrom(
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
  public static Builder newBuilder(adamant.global.v1.CosmosDelegateHistory prototype) {
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
   * Protobuf type {@code adamant.global.v1.CosmosDelegateHistory}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.CosmosDelegateHistory)
      adamant.global.v1.CosmosDelegateHistoryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_CosmosDelegateHistory_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_CosmosDelegateHistory_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              adamant.global.v1.CosmosDelegateHistory.class, adamant.global.v1.CosmosDelegateHistory.Builder.class);
    }

    // Construct using adamant.global.v1.CosmosDelegateHistory.newBuilder()
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
      txId_ = "";
      walletId_ = "";
      type_ = 0;
      delegateAmount_ = 0D;
      rewardAmount_ = 0D;
      time_ = null;
      if (timeBuilder_ != null) {
        timeBuilder_.dispose();
        timeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_CosmosDelegateHistory_descriptor;
    }

    @java.lang.Override
    public adamant.global.v1.CosmosDelegateHistory getDefaultInstanceForType() {
      return adamant.global.v1.CosmosDelegateHistory.getDefaultInstance();
    }

    @java.lang.Override
    public adamant.global.v1.CosmosDelegateHistory build() {
      adamant.global.v1.CosmosDelegateHistory result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public adamant.global.v1.CosmosDelegateHistory buildPartial() {
      adamant.global.v1.CosmosDelegateHistory result = new adamant.global.v1.CosmosDelegateHistory(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(adamant.global.v1.CosmosDelegateHistory result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.txId_ = txId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.walletId_ = walletId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.delegateAmount_ = delegateAmount_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.rewardAmount_ = rewardAmount_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.time_ = timeBuilder_ == null
            ? time_
            : timeBuilder_.build();
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
      if (other instanceof adamant.global.v1.CosmosDelegateHistory) {
        return mergeFrom((adamant.global.v1.CosmosDelegateHistory)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(adamant.global.v1.CosmosDelegateHistory other) {
      if (other == adamant.global.v1.CosmosDelegateHistory.getDefaultInstance()) return this;
      if (!other.getTxId().isEmpty()) {
        txId_ = other.txId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getWalletId().isEmpty()) {
        walletId_ = other.walletId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getDelegateAmount() != 0D) {
        setDelegateAmount(other.getDelegateAmount());
      }
      if (other.getRewardAmount() != 0D) {
        setRewardAmount(other.getRewardAmount());
      }
      if (other.hasTime()) {
        mergeTime(other.getTime());
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
              txId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              walletId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              type_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 33: {
              delegateAmount_ = input.readDouble();
              bitField0_ |= 0x00000008;
              break;
            } // case 33
            case 41: {
              rewardAmount_ = input.readDouble();
              bitField0_ |= 0x00000010;
              break;
            } // case 41
            case 50: {
              input.readMessage(
                  getTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000020;
              break;
            } // case 50
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

    private java.lang.Object txId_ = "";
    /**
     * <code>string tx_id = 1 [json_name = "txId"];</code>
     * @return The txId.
     */
    public java.lang.String getTxId() {
      java.lang.Object ref = txId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        txId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string tx_id = 1 [json_name = "txId"];</code>
     * @return The bytes for txId.
     */
    public com.google.protobuf.ByteString
        getTxIdBytes() {
      java.lang.Object ref = txId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        txId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string tx_id = 1 [json_name = "txId"];</code>
     * @param value The txId to set.
     * @return This builder for chaining.
     */
    public Builder setTxId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      txId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string tx_id = 1 [json_name = "txId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTxId() {
      txId_ = getDefaultInstance().getTxId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string tx_id = 1 [json_name = "txId"];</code>
     * @param value The bytes for txId to set.
     * @return This builder for chaining.
     */
    public Builder setTxIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      txId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object walletId_ = "";
    /**
     * <code>string wallet_id = 2 [json_name = "walletId"];</code>
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
     * <code>string wallet_id = 2 [json_name = "walletId"];</code>
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
     * <code>string wallet_id = 2 [json_name = "walletId"];</code>
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
     * <code>string wallet_id = 2 [json_name = "walletId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWalletId() {
      walletId_ = getDefaultInstance().getWalletId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string wallet_id = 2 [json_name = "walletId"];</code>
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

    private int type_ = 0;
    /**
     * <code>.gincoinc.global.v1.CosmosMsgType type = 3 [json_name = "type"];</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.gincoinc.global.v1.CosmosMsgType type = 3 [json_name = "type"];</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.gincoinc.global.v1.CosmosMsgType type = 3 [json_name = "type"];</code>
     * @return The type.
     */
    @java.lang.Override
    public gincoinc.global.v1.Enum.CosmosMsgType getType() {
      gincoinc.global.v1.Enum.CosmosMsgType result = gincoinc.global.v1.Enum.CosmosMsgType.forNumber(type_);
      return result == null ? gincoinc.global.v1.Enum.CosmosMsgType.UNRECOGNIZED : result;
    }
    /**
     * <code>.gincoinc.global.v1.CosmosMsgType type = 3 [json_name = "type"];</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(gincoinc.global.v1.Enum.CosmosMsgType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.gincoinc.global.v1.CosmosMsgType type = 3 [json_name = "type"];</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      type_ = 0;
      onChanged();
      return this;
    }

    private double delegateAmount_ ;
    /**
     * <code>double delegate_amount = 4 [json_name = "delegateAmount"];</code>
     * @return The delegateAmount.
     */
    @java.lang.Override
    public double getDelegateAmount() {
      return delegateAmount_;
    }
    /**
     * <code>double delegate_amount = 4 [json_name = "delegateAmount"];</code>
     * @param value The delegateAmount to set.
     * @return This builder for chaining.
     */
    public Builder setDelegateAmount(double value) {

      delegateAmount_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>double delegate_amount = 4 [json_name = "delegateAmount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDelegateAmount() {
      bitField0_ = (bitField0_ & ~0x00000008);
      delegateAmount_ = 0D;
      onChanged();
      return this;
    }

    private double rewardAmount_ ;
    /**
     * <code>double reward_amount = 5 [json_name = "rewardAmount"];</code>
     * @return The rewardAmount.
     */
    @java.lang.Override
    public double getRewardAmount() {
      return rewardAmount_;
    }
    /**
     * <code>double reward_amount = 5 [json_name = "rewardAmount"];</code>
     * @param value The rewardAmount to set.
     * @return This builder for chaining.
     */
    public Builder setRewardAmount(double value) {

      rewardAmount_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>double reward_amount = 5 [json_name = "rewardAmount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRewardAmount() {
      bitField0_ = (bitField0_ & ~0x00000010);
      rewardAmount_ = 0D;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp time_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timeBuilder_;
    /**
     * <code>.google.protobuf.Timestamp time = 6 [json_name = "time"];</code>
     * @return Whether the time field is set.
     */
    public boolean hasTime() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp time = 6 [json_name = "time"];</code>
     * @return The time.
     */
    public com.google.protobuf.Timestamp getTime() {
      if (timeBuilder_ == null) {
        return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
      } else {
        return timeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp time = 6 [json_name = "time"];</code>
     */
    public Builder setTime(com.google.protobuf.Timestamp value) {
      if (timeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        time_ = value;
      } else {
        timeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 6 [json_name = "time"];</code>
     */
    public Builder setTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timeBuilder_ == null) {
        time_ = builderForValue.build();
      } else {
        timeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 6 [json_name = "time"];</code>
     */
    public Builder mergeTime(com.google.protobuf.Timestamp value) {
      if (timeBuilder_ == null) {
        if (((bitField0_ & 0x00000020) != 0) &&
          time_ != null &&
          time_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getTimeBuilder().mergeFrom(value);
        } else {
          time_ = value;
        }
      } else {
        timeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 6 [json_name = "time"];</code>
     */
    public Builder clearTime() {
      bitField0_ = (bitField0_ & ~0x00000020);
      time_ = null;
      if (timeBuilder_ != null) {
        timeBuilder_.dispose();
        timeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 6 [json_name = "time"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimeBuilder() {
      bitField0_ |= 0x00000020;
      onChanged();
      return getTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp time = 6 [json_name = "time"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimeOrBuilder() {
      if (timeBuilder_ != null) {
        return timeBuilder_.getMessageOrBuilder();
      } else {
        return time_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : time_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp time = 6 [json_name = "time"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimeFieldBuilder() {
      if (timeBuilder_ == null) {
        timeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTime(),
                getParentForChildren(),
                isClean());
        time_ = null;
      }
      return timeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.CosmosDelegateHistory)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.CosmosDelegateHistory)
  private static final adamant.global.v1.CosmosDelegateHistory DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new adamant.global.v1.CosmosDelegateHistory();
  }

  public static adamant.global.v1.CosmosDelegateHistory getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CosmosDelegateHistory>
      PARSER = new com.google.protobuf.AbstractParser<CosmosDelegateHistory>() {
    @java.lang.Override
    public CosmosDelegateHistory parsePartialFrom(
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

  public static com.google.protobuf.Parser<CosmosDelegateHistory> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CosmosDelegateHistory> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public adamant.global.v1.CosmosDelegateHistory getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

