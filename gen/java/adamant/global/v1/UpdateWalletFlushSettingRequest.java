// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
 * Protobuf type {@code adamant.global.v1.UpdateWalletFlushSettingRequest}
 */
public  final class UpdateWalletFlushSettingRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.UpdateWalletFlushSettingRequest)
    UpdateWalletFlushSettingRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateWalletFlushSettingRequest.newBuilder() to construct.
  private UpdateWalletFlushSettingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateWalletFlushSettingRequest() {
    coin_ = 0;
    destinationWalletId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateWalletFlushSettingRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateWalletFlushSettingRequest(
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
          case 8: {
            int rawValue = input.readEnum();

            coin_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            destinationWalletId_ = s;
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
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_UpdateWalletFlushSettingRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_UpdateWalletFlushSettingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            adamant.global.v1.UpdateWalletFlushSettingRequest.class, adamant.global.v1.UpdateWalletFlushSettingRequest.Builder.class);
  }

  public static final int COIN_FIELD_NUMBER = 1;
  private int coin_;
  /**
   * <code>.gincoinc.global.v1.Coin coin = 1 [(.validate.rules) = { ... }</code>
   */
  public int getCoinValue() {
    return coin_;
  }
  /**
   * <code>.gincoinc.global.v1.Coin coin = 1 [(.validate.rules) = { ... }</code>
   */
  public gincoinc.global.v1.Enum.Coin getCoin() {
    @SuppressWarnings("deprecation")
    gincoinc.global.v1.Enum.Coin result = gincoinc.global.v1.Enum.Coin.valueOf(coin_);
    return result == null ? gincoinc.global.v1.Enum.Coin.UNRECOGNIZED : result;
  }

  public static final int DESTINATION_WALLET_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object destinationWalletId_;
  /**
   * <code>string destination_wallet_id = 2 [(.validate.rules) = { ... }</code>
   */
  public java.lang.String getDestinationWalletId() {
    java.lang.Object ref = destinationWalletId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      destinationWalletId_ = s;
      return s;
    }
  }
  /**
   * <code>string destination_wallet_id = 2 [(.validate.rules) = { ... }</code>
   */
  public com.google.protobuf.ByteString
      getDestinationWalletIdBytes() {
    java.lang.Object ref = destinationWalletId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      destinationWalletId_ = b;
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
    if (coin_ != gincoinc.global.v1.Enum.Coin.COIN_INVALID.getNumber()) {
      output.writeEnum(1, coin_);
    }
    if (!getDestinationWalletIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, destinationWalletId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (coin_ != gincoinc.global.v1.Enum.Coin.COIN_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, coin_);
    }
    if (!getDestinationWalletIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, destinationWalletId_);
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
    if (!(obj instanceof adamant.global.v1.UpdateWalletFlushSettingRequest)) {
      return super.equals(obj);
    }
    adamant.global.v1.UpdateWalletFlushSettingRequest other = (adamant.global.v1.UpdateWalletFlushSettingRequest) obj;

    if (coin_ != other.coin_) return false;
    if (!getDestinationWalletId()
        .equals(other.getDestinationWalletId())) return false;
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
    hash = (37 * hash) + COIN_FIELD_NUMBER;
    hash = (53 * hash) + coin_;
    hash = (37 * hash) + DESTINATION_WALLET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDestinationWalletId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static adamant.global.v1.UpdateWalletFlushSettingRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.UpdateWalletFlushSettingRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.UpdateWalletFlushSettingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.UpdateWalletFlushSettingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.UpdateWalletFlushSettingRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.UpdateWalletFlushSettingRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.UpdateWalletFlushSettingRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.UpdateWalletFlushSettingRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.UpdateWalletFlushSettingRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static adamant.global.v1.UpdateWalletFlushSettingRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.UpdateWalletFlushSettingRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.UpdateWalletFlushSettingRequest parseFrom(
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
  public static Builder newBuilder(adamant.global.v1.UpdateWalletFlushSettingRequest prototype) {
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
   * Protobuf type {@code adamant.global.v1.UpdateWalletFlushSettingRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.UpdateWalletFlushSettingRequest)
      adamant.global.v1.UpdateWalletFlushSettingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_UpdateWalletFlushSettingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_UpdateWalletFlushSettingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              adamant.global.v1.UpdateWalletFlushSettingRequest.class, adamant.global.v1.UpdateWalletFlushSettingRequest.Builder.class);
    }

    // Construct using adamant.global.v1.UpdateWalletFlushSettingRequest.newBuilder()
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
      coin_ = 0;

      destinationWalletId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_UpdateWalletFlushSettingRequest_descriptor;
    }

    @java.lang.Override
    public adamant.global.v1.UpdateWalletFlushSettingRequest getDefaultInstanceForType() {
      return adamant.global.v1.UpdateWalletFlushSettingRequest.getDefaultInstance();
    }

    @java.lang.Override
    public adamant.global.v1.UpdateWalletFlushSettingRequest build() {
      adamant.global.v1.UpdateWalletFlushSettingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public adamant.global.v1.UpdateWalletFlushSettingRequest buildPartial() {
      adamant.global.v1.UpdateWalletFlushSettingRequest result = new adamant.global.v1.UpdateWalletFlushSettingRequest(this);
      result.coin_ = coin_;
      result.destinationWalletId_ = destinationWalletId_;
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
      if (other instanceof adamant.global.v1.UpdateWalletFlushSettingRequest) {
        return mergeFrom((adamant.global.v1.UpdateWalletFlushSettingRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(adamant.global.v1.UpdateWalletFlushSettingRequest other) {
      if (other == adamant.global.v1.UpdateWalletFlushSettingRequest.getDefaultInstance()) return this;
      if (other.coin_ != 0) {
        setCoinValue(other.getCoinValue());
      }
      if (!other.getDestinationWalletId().isEmpty()) {
        destinationWalletId_ = other.destinationWalletId_;
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
      adamant.global.v1.UpdateWalletFlushSettingRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (adamant.global.v1.UpdateWalletFlushSettingRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int coin_ = 0;
    /**
     * <code>.gincoinc.global.v1.Coin coin = 1 [(.validate.rules) = { ... }</code>
     */
    public int getCoinValue() {
      return coin_;
    }
    /**
     * <code>.gincoinc.global.v1.Coin coin = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setCoinValue(int value) {
      coin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.gincoinc.global.v1.Coin coin = 1 [(.validate.rules) = { ... }</code>
     */
    public gincoinc.global.v1.Enum.Coin getCoin() {
      @SuppressWarnings("deprecation")
      gincoinc.global.v1.Enum.Coin result = gincoinc.global.v1.Enum.Coin.valueOf(coin_);
      return result == null ? gincoinc.global.v1.Enum.Coin.UNRECOGNIZED : result;
    }
    /**
     * <code>.gincoinc.global.v1.Coin coin = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setCoin(gincoinc.global.v1.Enum.Coin value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      coin_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.gincoinc.global.v1.Coin coin = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearCoin() {
      
      coin_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object destinationWalletId_ = "";
    /**
     * <code>string destination_wallet_id = 2 [(.validate.rules) = { ... }</code>
     */
    public java.lang.String getDestinationWalletId() {
      java.lang.Object ref = destinationWalletId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        destinationWalletId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string destination_wallet_id = 2 [(.validate.rules) = { ... }</code>
     */
    public com.google.protobuf.ByteString
        getDestinationWalletIdBytes() {
      java.lang.Object ref = destinationWalletId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        destinationWalletId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string destination_wallet_id = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setDestinationWalletId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      destinationWalletId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string destination_wallet_id = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder clearDestinationWalletId() {
      
      destinationWalletId_ = getDefaultInstance().getDestinationWalletId();
      onChanged();
      return this;
    }
    /**
     * <code>string destination_wallet_id = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setDestinationWalletIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      destinationWalletId_ = value;
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.UpdateWalletFlushSettingRequest)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.UpdateWalletFlushSettingRequest)
  private static final adamant.global.v1.UpdateWalletFlushSettingRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new adamant.global.v1.UpdateWalletFlushSettingRequest();
  }

  public static adamant.global.v1.UpdateWalletFlushSettingRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateWalletFlushSettingRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateWalletFlushSettingRequest>() {
    @java.lang.Override
    public UpdateWalletFlushSettingRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateWalletFlushSettingRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateWalletFlushSettingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateWalletFlushSettingRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public adamant.global.v1.UpdateWalletFlushSettingRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

