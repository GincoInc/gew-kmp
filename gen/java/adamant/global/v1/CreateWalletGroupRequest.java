// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package java.adamant.global.v1;

/**
 * Protobuf type {@code adamant.global.v1.CreateWalletGroupRequest}
 */
public final class CreateWalletGroupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.CreateWalletGroupRequest)
    CreateWalletGroupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateWalletGroupRequest.newBuilder() to construct.
  private CreateWalletGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateWalletGroupRequest() {
    name_ = "";
    coin_ = 0;
    walletIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateWalletGroupRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateWalletGroupRequest(
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

            name_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            coin_ = rawValue;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              walletIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            walletIds_.add(s);
            break;
          }
          case 32: {

            watchOnly_ = input.readBool();
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
        walletIds_ = walletIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return java.adamant.global.v1.GlobalApiProto.internal_static_adamant_global_v1_CreateWalletGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return java.adamant.global.v1.GlobalApiProto.internal_static_adamant_global_v1_CreateWalletGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            java.adamant.global.v1.CreateWalletGroupRequest.class, java.adamant.global.v1.CreateWalletGroupRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1 [json_name = "name", (.validate.rules) = { ... }</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1 [json_name = "name", (.validate.rules) = { ... }</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COIN_FIELD_NUMBER = 2;
  private int coin_;
  /**
   * <code>.gincoinc.global.v1.Coin coin = 2 [json_name = "coin", (.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for coin.
   */
  @java.lang.Override public int getCoinValue() {
    return coin_;
  }
  /**
   * <code>.gincoinc.global.v1.Coin coin = 2 [json_name = "coin", (.validate.rules) = { ... }</code>
   * @return The coin.
   */
  @java.lang.Override public java.gincoinc.global.v1.Coin getCoin() {
    @SuppressWarnings("deprecation")
    java.gincoinc.global.v1.Coin result = java.gincoinc.global.v1.Coin.valueOf(coin_);
    return result == null ? java.gincoinc.global.v1.Coin.UNRECOGNIZED : result;
  }

  public static final int WALLET_IDS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList walletIds_;
  /**
   * <code>repeated string wallet_ids = 3 [json_name = "walletIds", (.validate.rules) = { ... }</code>
   * @return A list containing the walletIds.
   */
  public com.google.protobuf.ProtocolStringList
      getWalletIdsList() {
    return walletIds_;
  }
  /**
   * <code>repeated string wallet_ids = 3 [json_name = "walletIds", (.validate.rules) = { ... }</code>
   * @return The count of walletIds.
   */
  public int getWalletIdsCount() {
    return walletIds_.size();
  }
  /**
   * <code>repeated string wallet_ids = 3 [json_name = "walletIds", (.validate.rules) = { ... }</code>
   * @param index The index of the element to return.
   * @return The walletIds at the given index.
   */
  public java.lang.String getWalletIds(int index) {
    return walletIds_.get(index);
  }
  /**
   * <code>repeated string wallet_ids = 3 [json_name = "walletIds", (.validate.rules) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the walletIds at the given index.
   */
  public com.google.protobuf.ByteString
      getWalletIdsBytes(int index) {
    return walletIds_.getByteString(index);
  }

  public static final int WATCH_ONLY_FIELD_NUMBER = 4;
  private boolean watchOnly_;
  /**
   * <code>bool watch_only = 4 [json_name = "watchOnly"];</code>
   * @return The watchOnly.
   */
  @java.lang.Override
  public boolean getWatchOnly() {
    return watchOnly_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (coin_ != java.gincoinc.global.v1.Coin.COIN_INVALID.getNumber()) {
      output.writeEnum(2, coin_);
    }
    for (int i = 0; i < walletIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, walletIds_.getRaw(i));
    }
    if (watchOnly_ != false) {
      output.writeBool(4, watchOnly_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (coin_ != java.gincoinc.global.v1.Coin.COIN_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, coin_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < walletIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(walletIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getWalletIdsList().size();
    }
    if (watchOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, watchOnly_);
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
    if (!(obj instanceof java.adamant.global.v1.CreateWalletGroupRequest)) {
      return super.equals(obj);
    }
    java.adamant.global.v1.CreateWalletGroupRequest other = (java.adamant.global.v1.CreateWalletGroupRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (coin_ != other.coin_) return false;
    if (!getWalletIdsList()
        .equals(other.getWalletIdsList())) return false;
    if (getWatchOnly()
        != other.getWatchOnly()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + COIN_FIELD_NUMBER;
    hash = (53 * hash) + coin_;
    if (getWalletIdsCount() > 0) {
      hash = (37 * hash) + WALLET_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getWalletIdsList().hashCode();
    }
    hash = (37 * hash) + WATCH_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getWatchOnly());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static java.adamant.global.v1.CreateWalletGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static java.adamant.global.v1.CreateWalletGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static java.adamant.global.v1.CreateWalletGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static java.adamant.global.v1.CreateWalletGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static java.adamant.global.v1.CreateWalletGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static java.adamant.global.v1.CreateWalletGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static java.adamant.global.v1.CreateWalletGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static java.adamant.global.v1.CreateWalletGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static java.adamant.global.v1.CreateWalletGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static java.adamant.global.v1.CreateWalletGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static java.adamant.global.v1.CreateWalletGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static java.adamant.global.v1.CreateWalletGroupRequest parseFrom(
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
  public static Builder newBuilder(java.adamant.global.v1.CreateWalletGroupRequest prototype) {
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
   * Protobuf type {@code adamant.global.v1.CreateWalletGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.CreateWalletGroupRequest)
      java.adamant.global.v1.CreateWalletGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return java.adamant.global.v1.GlobalApiProto.internal_static_adamant_global_v1_CreateWalletGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return java.adamant.global.v1.GlobalApiProto.internal_static_adamant_global_v1_CreateWalletGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              java.adamant.global.v1.CreateWalletGroupRequest.class, java.adamant.global.v1.CreateWalletGroupRequest.Builder.class);
    }

    // Construct using java.adamant.global.v1.CreateWalletGroupRequest.newBuilder()
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
      name_ = "";

      coin_ = 0;

      walletIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      watchOnly_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return java.adamant.global.v1.GlobalApiProto.internal_static_adamant_global_v1_CreateWalletGroupRequest_descriptor;
    }

    @java.lang.Override
    public java.adamant.global.v1.CreateWalletGroupRequest getDefaultInstanceForType() {
      return java.adamant.global.v1.CreateWalletGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public java.adamant.global.v1.CreateWalletGroupRequest build() {
      java.adamant.global.v1.CreateWalletGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public java.adamant.global.v1.CreateWalletGroupRequest buildPartial() {
      java.adamant.global.v1.CreateWalletGroupRequest result = new java.adamant.global.v1.CreateWalletGroupRequest(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      result.coin_ = coin_;
      if (((bitField0_ & 0x00000001) != 0)) {
        walletIds_ = walletIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.walletIds_ = walletIds_;
      result.watchOnly_ = watchOnly_;
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
      if (other instanceof java.adamant.global.v1.CreateWalletGroupRequest) {
        return mergeFrom((java.adamant.global.v1.CreateWalletGroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(java.adamant.global.v1.CreateWalletGroupRequest other) {
      if (other == java.adamant.global.v1.CreateWalletGroupRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.coin_ != 0) {
        setCoinValue(other.getCoinValue());
      }
      if (!other.walletIds_.isEmpty()) {
        if (walletIds_.isEmpty()) {
          walletIds_ = other.walletIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureWalletIdsIsMutable();
          walletIds_.addAll(other.walletIds_);
        }
        onChanged();
      }
      if (other.getWatchOnly() != false) {
        setWatchOnly(other.getWatchOnly());
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
      java.adamant.global.v1.CreateWalletGroupRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (java.adamant.global.v1.CreateWalletGroupRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1 [json_name = "name", (.validate.rules) = { ... }</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1 [json_name = "name", (.validate.rules) = { ... }</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1 [json_name = "name", (.validate.rules) = { ... }</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1 [json_name = "name", (.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1 [json_name = "name", (.validate.rules) = { ... }</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int coin_ = 0;
    /**
     * <code>.gincoinc.global.v1.Coin coin = 2 [json_name = "coin", (.validate.rules) = { ... }</code>
     * @return The enum numeric value on the wire for coin.
     */
    @java.lang.Override public int getCoinValue() {
      return coin_;
    }
    /**
     * <code>.gincoinc.global.v1.Coin coin = 2 [json_name = "coin", (.validate.rules) = { ... }</code>
     * @param value The enum numeric value on the wire for coin to set.
     * @return This builder for chaining.
     */
    public Builder setCoinValue(int value) {
      
      coin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.gincoinc.global.v1.Coin coin = 2 [json_name = "coin", (.validate.rules) = { ... }</code>
     * @return The coin.
     */
    @java.lang.Override
    public java.gincoinc.global.v1.Coin getCoin() {
      @SuppressWarnings("deprecation")
      java.gincoinc.global.v1.Coin result = java.gincoinc.global.v1.Coin.valueOf(coin_);
      return result == null ? java.gincoinc.global.v1.Coin.UNRECOGNIZED : result;
    }
    /**
     * <code>.gincoinc.global.v1.Coin coin = 2 [json_name = "coin", (.validate.rules) = { ... }</code>
     * @param value The coin to set.
     * @return This builder for chaining.
     */
    public Builder setCoin(java.gincoinc.global.v1.Coin value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      coin_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.gincoinc.global.v1.Coin coin = 2 [json_name = "coin", (.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearCoin() {
      
      coin_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList walletIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureWalletIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        walletIds_ = new com.google.protobuf.LazyStringArrayList(walletIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string wallet_ids = 3 [json_name = "walletIds", (.validate.rules) = { ... }</code>
     * @return A list containing the walletIds.
     */
    public com.google.protobuf.ProtocolStringList
        getWalletIdsList() {
      return walletIds_.getUnmodifiableView();
    }
    /**
     * <code>repeated string wallet_ids = 3 [json_name = "walletIds", (.validate.rules) = { ... }</code>
     * @return The count of walletIds.
     */
    public int getWalletIdsCount() {
      return walletIds_.size();
    }
    /**
     * <code>repeated string wallet_ids = 3 [json_name = "walletIds", (.validate.rules) = { ... }</code>
     * @param index The index of the element to return.
     * @return The walletIds at the given index.
     */
    public java.lang.String getWalletIds(int index) {
      return walletIds_.get(index);
    }
    /**
     * <code>repeated string wallet_ids = 3 [json_name = "walletIds", (.validate.rules) = { ... }</code>
     * @param index The index of the value to return.
     * @return The bytes of the walletIds at the given index.
     */
    public com.google.protobuf.ByteString
        getWalletIdsBytes(int index) {
      return walletIds_.getByteString(index);
    }
    /**
     * <code>repeated string wallet_ids = 3 [json_name = "walletIds", (.validate.rules) = { ... }</code>
     * @param index The index to set the value at.
     * @param value The walletIds to set.
     * @return This builder for chaining.
     */
    public Builder setWalletIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureWalletIdsIsMutable();
      walletIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string wallet_ids = 3 [json_name = "walletIds", (.validate.rules) = { ... }</code>
     * @param value The walletIds to add.
     * @return This builder for chaining.
     */
    public Builder addWalletIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureWalletIdsIsMutable();
      walletIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string wallet_ids = 3 [json_name = "walletIds", (.validate.rules) = { ... }</code>
     * @param values The walletIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllWalletIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureWalletIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, walletIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string wallet_ids = 3 [json_name = "walletIds", (.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearWalletIds() {
      walletIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string wallet_ids = 3 [json_name = "walletIds", (.validate.rules) = { ... }</code>
     * @param value The bytes of the walletIds to add.
     * @return This builder for chaining.
     */
    public Builder addWalletIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureWalletIdsIsMutable();
      walletIds_.add(value);
      onChanged();
      return this;
    }

    private boolean watchOnly_ ;
    /**
     * <code>bool watch_only = 4 [json_name = "watchOnly"];</code>
     * @return The watchOnly.
     */
    @java.lang.Override
    public boolean getWatchOnly() {
      return watchOnly_;
    }
    /**
     * <code>bool watch_only = 4 [json_name = "watchOnly"];</code>
     * @param value The watchOnly to set.
     * @return This builder for chaining.
     */
    public Builder setWatchOnly(boolean value) {
      
      watchOnly_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool watch_only = 4 [json_name = "watchOnly"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWatchOnly() {
      
      watchOnly_ = false;
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.CreateWalletGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.CreateWalletGroupRequest)
  private static final java.adamant.global.v1.CreateWalletGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new java.adamant.global.v1.CreateWalletGroupRequest();
  }

  public static java.adamant.global.v1.CreateWalletGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateWalletGroupRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateWalletGroupRequest>() {
    @java.lang.Override
    public CreateWalletGroupRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateWalletGroupRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateWalletGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateWalletGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public java.adamant.global.v1.CreateWalletGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
