// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/model.proto

package java.adamant.global.v1;

/**
 * Protobuf type {@code adamant.global.v1.SubstrateChildAddress}
 */
public final class SubstrateChildAddress extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.SubstrateChildAddress)
    SubstrateChildAddressOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubstrateChildAddress.newBuilder() to construct.
  private SubstrateChildAddress(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubstrateChildAddress() {
    walletId_ = "";
    accountId_ = "";
    address_ = "";
    stringBalance_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubstrateChildAddress();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SubstrateChildAddress(
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

            walletId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            accountId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            address_ = s;
            break;
          }
          case 33: {

            balance_ = input.readDouble();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            stringBalance_ = s;
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
    return java.adamant.global.v1.ModelProto.internal_static_adamant_global_v1_SubstrateChildAddress_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return java.adamant.global.v1.ModelProto.internal_static_adamant_global_v1_SubstrateChildAddress_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            java.adamant.global.v1.SubstrateChildAddress.class, java.adamant.global.v1.SubstrateChildAddress.Builder.class);
  }

  public static final int WALLET_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object walletId_;
  /**
   * <code>string wallet_id = 1 [json_name = "walletId"];</code>
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
   * <code>string wallet_id = 1 [json_name = "walletId"];</code>
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

  public static final int ACCOUNT_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object accountId_;
  /**
   * <code>string account_id = 2 [json_name = "accountId"];</code>
   * @return The accountId.
   */
  @java.lang.Override
  public java.lang.String getAccountId() {
    java.lang.Object ref = accountId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accountId_ = s;
      return s;
    }
  }
  /**
   * <code>string account_id = 2 [json_name = "accountId"];</code>
   * @return The bytes for accountId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAccountIdBytes() {
    java.lang.Object ref = accountId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      accountId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADDRESS_FIELD_NUMBER = 3;
  private volatile java.lang.Object address_;
  /**
   * <code>string address = 3 [json_name = "address"];</code>
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
   * <code>string address = 3 [json_name = "address"];</code>
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

  public static final int BALANCE_FIELD_NUMBER = 4;
  private double balance_;
  /**
   * <code>double balance = 4 [json_name = "balance"];</code>
   * @return The balance.
   */
  @java.lang.Override
  public double getBalance() {
    return balance_;
  }

  public static final int STRING_BALANCE_FIELD_NUMBER = 5;
  private volatile java.lang.Object stringBalance_;
  /**
   * <code>string string_balance = 5 [json_name = "stringBalance"];</code>
   * @return The stringBalance.
   */
  @java.lang.Override
  public java.lang.String getStringBalance() {
    java.lang.Object ref = stringBalance_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stringBalance_ = s;
      return s;
    }
  }
  /**
   * <code>string string_balance = 5 [json_name = "stringBalance"];</code>
   * @return The bytes for stringBalance.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStringBalanceBytes() {
    java.lang.Object ref = stringBalance_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stringBalance_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(walletId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, walletId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accountId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, accountId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, address_);
    }
    if (java.lang.Double.doubleToRawLongBits(balance_) != 0) {
      output.writeDouble(4, balance_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stringBalance_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, stringBalance_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(walletId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, walletId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accountId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, accountId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, address_);
    }
    if (java.lang.Double.doubleToRawLongBits(balance_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, balance_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stringBalance_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, stringBalance_);
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
    if (!(obj instanceof java.adamant.global.v1.SubstrateChildAddress)) {
      return super.equals(obj);
    }
    java.adamant.global.v1.SubstrateChildAddress other = (java.adamant.global.v1.SubstrateChildAddress) obj;

    if (!getWalletId()
        .equals(other.getWalletId())) return false;
    if (!getAccountId()
        .equals(other.getAccountId())) return false;
    if (!getAddress()
        .equals(other.getAddress())) return false;
    if (java.lang.Double.doubleToLongBits(getBalance())
        != java.lang.Double.doubleToLongBits(
            other.getBalance())) return false;
    if (!getStringBalance()
        .equals(other.getStringBalance())) return false;
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
    hash = (37 * hash) + WALLET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getWalletId().hashCode();
    hash = (37 * hash) + ACCOUNT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAccountId().hashCode();
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    hash = (37 * hash) + BALANCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBalance()));
    hash = (37 * hash) + STRING_BALANCE_FIELD_NUMBER;
    hash = (53 * hash) + getStringBalance().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static java.adamant.global.v1.SubstrateChildAddress parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static java.adamant.global.v1.SubstrateChildAddress parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static java.adamant.global.v1.SubstrateChildAddress parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static java.adamant.global.v1.SubstrateChildAddress parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static java.adamant.global.v1.SubstrateChildAddress parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static java.adamant.global.v1.SubstrateChildAddress parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static java.adamant.global.v1.SubstrateChildAddress parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static java.adamant.global.v1.SubstrateChildAddress parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static java.adamant.global.v1.SubstrateChildAddress parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static java.adamant.global.v1.SubstrateChildAddress parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static java.adamant.global.v1.SubstrateChildAddress parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static java.adamant.global.v1.SubstrateChildAddress parseFrom(
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
  public static Builder newBuilder(java.adamant.global.v1.SubstrateChildAddress prototype) {
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
   * Protobuf type {@code adamant.global.v1.SubstrateChildAddress}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.SubstrateChildAddress)
      java.adamant.global.v1.SubstrateChildAddressOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return java.adamant.global.v1.ModelProto.internal_static_adamant_global_v1_SubstrateChildAddress_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return java.adamant.global.v1.ModelProto.internal_static_adamant_global_v1_SubstrateChildAddress_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              java.adamant.global.v1.SubstrateChildAddress.class, java.adamant.global.v1.SubstrateChildAddress.Builder.class);
    }

    // Construct using java.adamant.global.v1.SubstrateChildAddress.newBuilder()
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
      walletId_ = "";

      accountId_ = "";

      address_ = "";

      balance_ = 0D;

      stringBalance_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return java.adamant.global.v1.ModelProto.internal_static_adamant_global_v1_SubstrateChildAddress_descriptor;
    }

    @java.lang.Override
    public java.adamant.global.v1.SubstrateChildAddress getDefaultInstanceForType() {
      return java.adamant.global.v1.SubstrateChildAddress.getDefaultInstance();
    }

    @java.lang.Override
    public java.adamant.global.v1.SubstrateChildAddress build() {
      java.adamant.global.v1.SubstrateChildAddress result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public java.adamant.global.v1.SubstrateChildAddress buildPartial() {
      java.adamant.global.v1.SubstrateChildAddress result = new java.adamant.global.v1.SubstrateChildAddress(this);
      result.walletId_ = walletId_;
      result.accountId_ = accountId_;
      result.address_ = address_;
      result.balance_ = balance_;
      result.stringBalance_ = stringBalance_;
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
      if (other instanceof java.adamant.global.v1.SubstrateChildAddress) {
        return mergeFrom((java.adamant.global.v1.SubstrateChildAddress)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(java.adamant.global.v1.SubstrateChildAddress other) {
      if (other == java.adamant.global.v1.SubstrateChildAddress.getDefaultInstance()) return this;
      if (!other.getWalletId().isEmpty()) {
        walletId_ = other.walletId_;
        onChanged();
      }
      if (!other.getAccountId().isEmpty()) {
        accountId_ = other.accountId_;
        onChanged();
      }
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        onChanged();
      }
      if (other.getBalance() != 0D) {
        setBalance(other.getBalance());
      }
      if (!other.getStringBalance().isEmpty()) {
        stringBalance_ = other.stringBalance_;
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
      java.adamant.global.v1.SubstrateChildAddress parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (java.adamant.global.v1.SubstrateChildAddress) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object walletId_ = "";
    /**
     * <code>string wallet_id = 1 [json_name = "walletId"];</code>
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
     * <code>string wallet_id = 1 [json_name = "walletId"];</code>
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
     * <code>string wallet_id = 1 [json_name = "walletId"];</code>
     * @param value The walletId to set.
     * @return This builder for chaining.
     */
    public Builder setWalletId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      walletId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string wallet_id = 1 [json_name = "walletId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWalletId() {
      
      walletId_ = getDefaultInstance().getWalletId();
      onChanged();
      return this;
    }
    /**
     * <code>string wallet_id = 1 [json_name = "walletId"];</code>
     * @param value The bytes for walletId to set.
     * @return This builder for chaining.
     */
    public Builder setWalletIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      walletId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object accountId_ = "";
    /**
     * <code>string account_id = 2 [json_name = "accountId"];</code>
     * @return The accountId.
     */
    public java.lang.String getAccountId() {
      java.lang.Object ref = accountId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accountId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string account_id = 2 [json_name = "accountId"];</code>
     * @return The bytes for accountId.
     */
    public com.google.protobuf.ByteString
        getAccountIdBytes() {
      java.lang.Object ref = accountId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accountId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string account_id = 2 [json_name = "accountId"];</code>
     * @param value The accountId to set.
     * @return This builder for chaining.
     */
    public Builder setAccountId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      accountId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string account_id = 2 [json_name = "accountId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAccountId() {
      
      accountId_ = getDefaultInstance().getAccountId();
      onChanged();
      return this;
    }
    /**
     * <code>string account_id = 2 [json_name = "accountId"];</code>
     * @param value The bytes for accountId to set.
     * @return This builder for chaining.
     */
    public Builder setAccountIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      accountId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object address_ = "";
    /**
     * <code>string address = 3 [json_name = "address"];</code>
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
     * <code>string address = 3 [json_name = "address"];</code>
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
     * <code>string address = 3 [json_name = "address"];</code>
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
     * <code>string address = 3 [json_name = "address"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      
      address_ = getDefaultInstance().getAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string address = 3 [json_name = "address"];</code>
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

    private double balance_ ;
    /**
     * <code>double balance = 4 [json_name = "balance"];</code>
     * @return The balance.
     */
    @java.lang.Override
    public double getBalance() {
      return balance_;
    }
    /**
     * <code>double balance = 4 [json_name = "balance"];</code>
     * @param value The balance to set.
     * @return This builder for chaining.
     */
    public Builder setBalance(double value) {
      
      balance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double balance = 4 [json_name = "balance"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBalance() {
      
      balance_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object stringBalance_ = "";
    /**
     * <code>string string_balance = 5 [json_name = "stringBalance"];</code>
     * @return The stringBalance.
     */
    public java.lang.String getStringBalance() {
      java.lang.Object ref = stringBalance_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stringBalance_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string string_balance = 5 [json_name = "stringBalance"];</code>
     * @return The bytes for stringBalance.
     */
    public com.google.protobuf.ByteString
        getStringBalanceBytes() {
      java.lang.Object ref = stringBalance_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stringBalance_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string string_balance = 5 [json_name = "stringBalance"];</code>
     * @param value The stringBalance to set.
     * @return This builder for chaining.
     */
    public Builder setStringBalance(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stringBalance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string string_balance = 5 [json_name = "stringBalance"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStringBalance() {
      
      stringBalance_ = getDefaultInstance().getStringBalance();
      onChanged();
      return this;
    }
    /**
     * <code>string string_balance = 5 [json_name = "stringBalance"];</code>
     * @param value The bytes for stringBalance to set.
     * @return This builder for chaining.
     */
    public Builder setStringBalanceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stringBalance_ = value;
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.SubstrateChildAddress)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.SubstrateChildAddress)
  private static final java.adamant.global.v1.SubstrateChildAddress DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new java.adamant.global.v1.SubstrateChildAddress();
  }

  public static java.adamant.global.v1.SubstrateChildAddress getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubstrateChildAddress>
      PARSER = new com.google.protobuf.AbstractParser<SubstrateChildAddress>() {
    @java.lang.Override
    public SubstrateChildAddress parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SubstrateChildAddress(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SubstrateChildAddress> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubstrateChildAddress> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public java.adamant.global.v1.SubstrateChildAddress getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
