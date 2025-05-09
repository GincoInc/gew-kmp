// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
 * Protobuf type {@code adamant.global.v1.CreatePreTransactionThresholdRequest}
 */
public final class CreatePreTransactionThresholdRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.CreatePreTransactionThresholdRequest)
    CreatePreTransactionThresholdRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreatePreTransactionThresholdRequest.newBuilder() to construct.
  private CreatePreTransactionThresholdRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreatePreTransactionThresholdRequest() {
    coin_ = 0;
    network_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreatePreTransactionThresholdRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_CreatePreTransactionThresholdRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_CreatePreTransactionThresholdRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            adamant.global.v1.CreatePreTransactionThresholdRequest.class, adamant.global.v1.CreatePreTransactionThresholdRequest.Builder.class);
  }

  public static final int COIN_FIELD_NUMBER = 1;
  private int coin_ = 0;
  /**
   * <code>.gincoinc.global.v1.Coin coin = 1 [json_name = "coin"];</code>
   * @return The enum numeric value on the wire for coin.
   */
  @java.lang.Override public int getCoinValue() {
    return coin_;
  }
  /**
   * <code>.gincoinc.global.v1.Coin coin = 1 [json_name = "coin"];</code>
   * @return The coin.
   */
  @java.lang.Override public gincoinc.global.v1.Enum.Coin getCoin() {
    gincoinc.global.v1.Enum.Coin result = gincoinc.global.v1.Enum.Coin.forNumber(coin_);
    return result == null ? gincoinc.global.v1.Enum.Coin.UNRECOGNIZED : result;
  }

  public static final int NETWORK_FIELD_NUMBER = 2;
  private int network_ = 0;
  /**
   * <code>.gincoinc.global.v1.Network network = 2 [json_name = "network"];</code>
   * @return The enum numeric value on the wire for network.
   */
  @java.lang.Override public int getNetworkValue() {
    return network_;
  }
  /**
   * <code>.gincoinc.global.v1.Network network = 2 [json_name = "network"];</code>
   * @return The network.
   */
  @java.lang.Override public gincoinc.global.v1.Enum.Network getNetwork() {
    gincoinc.global.v1.Enum.Network result = gincoinc.global.v1.Enum.Network.forNumber(network_);
    return result == null ? gincoinc.global.v1.Enum.Network.UNRECOGNIZED : result;
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  private double value_ = 0D;
  /**
   * <code>double value = 3 [json_name = "value"];</code>
   * @return The value.
   */
  @java.lang.Override
  public double getValue() {
    return value_;
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
    if (network_ != gincoinc.global.v1.Enum.Network.NETWORK_INVALID.getNumber()) {
      output.writeEnum(2, network_);
    }
    if (java.lang.Double.doubleToRawLongBits(value_) != 0) {
      output.writeDouble(3, value_);
    }
    getUnknownFields().writeTo(output);
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
    if (network_ != gincoinc.global.v1.Enum.Network.NETWORK_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, network_);
    }
    if (java.lang.Double.doubleToRawLongBits(value_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, value_);
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
    if (!(obj instanceof adamant.global.v1.CreatePreTransactionThresholdRequest)) {
      return super.equals(obj);
    }
    adamant.global.v1.CreatePreTransactionThresholdRequest other = (adamant.global.v1.CreatePreTransactionThresholdRequest) obj;

    if (coin_ != other.coin_) return false;
    if (network_ != other.network_) return false;
    if (java.lang.Double.doubleToLongBits(getValue())
        != java.lang.Double.doubleToLongBits(
            other.getValue())) return false;
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
    hash = (37 * hash) + COIN_FIELD_NUMBER;
    hash = (53 * hash) + coin_;
    hash = (37 * hash) + NETWORK_FIELD_NUMBER;
    hash = (53 * hash) + network_;
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getValue()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static adamant.global.v1.CreatePreTransactionThresholdRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.CreatePreTransactionThresholdRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.CreatePreTransactionThresholdRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.CreatePreTransactionThresholdRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.CreatePreTransactionThresholdRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.CreatePreTransactionThresholdRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.CreatePreTransactionThresholdRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.CreatePreTransactionThresholdRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static adamant.global.v1.CreatePreTransactionThresholdRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static adamant.global.v1.CreatePreTransactionThresholdRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.CreatePreTransactionThresholdRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.CreatePreTransactionThresholdRequest parseFrom(
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
  public static Builder newBuilder(adamant.global.v1.CreatePreTransactionThresholdRequest prototype) {
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
   * Protobuf type {@code adamant.global.v1.CreatePreTransactionThresholdRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.CreatePreTransactionThresholdRequest)
      adamant.global.v1.CreatePreTransactionThresholdRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_CreatePreTransactionThresholdRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_CreatePreTransactionThresholdRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              adamant.global.v1.CreatePreTransactionThresholdRequest.class, adamant.global.v1.CreatePreTransactionThresholdRequest.Builder.class);
    }

    // Construct using adamant.global.v1.CreatePreTransactionThresholdRequest.newBuilder()
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
      coin_ = 0;
      network_ = 0;
      value_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_CreatePreTransactionThresholdRequest_descriptor;
    }

    @java.lang.Override
    public adamant.global.v1.CreatePreTransactionThresholdRequest getDefaultInstanceForType() {
      return adamant.global.v1.CreatePreTransactionThresholdRequest.getDefaultInstance();
    }

    @java.lang.Override
    public adamant.global.v1.CreatePreTransactionThresholdRequest build() {
      adamant.global.v1.CreatePreTransactionThresholdRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public adamant.global.v1.CreatePreTransactionThresholdRequest buildPartial() {
      adamant.global.v1.CreatePreTransactionThresholdRequest result = new adamant.global.v1.CreatePreTransactionThresholdRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(adamant.global.v1.CreatePreTransactionThresholdRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.coin_ = coin_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.network_ = network_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.value_ = value_;
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
      if (other instanceof adamant.global.v1.CreatePreTransactionThresholdRequest) {
        return mergeFrom((adamant.global.v1.CreatePreTransactionThresholdRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(adamant.global.v1.CreatePreTransactionThresholdRequest other) {
      if (other == adamant.global.v1.CreatePreTransactionThresholdRequest.getDefaultInstance()) return this;
      if (other.coin_ != 0) {
        setCoinValue(other.getCoinValue());
      }
      if (other.network_ != 0) {
        setNetworkValue(other.getNetworkValue());
      }
      if (other.getValue() != 0D) {
        setValue(other.getValue());
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
            case 8: {
              coin_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              network_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 25: {
              value_ = input.readDouble();
              bitField0_ |= 0x00000004;
              break;
            } // case 25
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

    private int coin_ = 0;
    /**
     * <code>.gincoinc.global.v1.Coin coin = 1 [json_name = "coin"];</code>
     * @return The enum numeric value on the wire for coin.
     */
    @java.lang.Override public int getCoinValue() {
      return coin_;
    }
    /**
     * <code>.gincoinc.global.v1.Coin coin = 1 [json_name = "coin"];</code>
     * @param value The enum numeric value on the wire for coin to set.
     * @return This builder for chaining.
     */
    public Builder setCoinValue(int value) {
      coin_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.gincoinc.global.v1.Coin coin = 1 [json_name = "coin"];</code>
     * @return The coin.
     */
    @java.lang.Override
    public gincoinc.global.v1.Enum.Coin getCoin() {
      gincoinc.global.v1.Enum.Coin result = gincoinc.global.v1.Enum.Coin.forNumber(coin_);
      return result == null ? gincoinc.global.v1.Enum.Coin.UNRECOGNIZED : result;
    }
    /**
     * <code>.gincoinc.global.v1.Coin coin = 1 [json_name = "coin"];</code>
     * @param value The coin to set.
     * @return This builder for chaining.
     */
    public Builder setCoin(gincoinc.global.v1.Enum.Coin value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      coin_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.gincoinc.global.v1.Coin coin = 1 [json_name = "coin"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCoin() {
      bitField0_ = (bitField0_ & ~0x00000001);
      coin_ = 0;
      onChanged();
      return this;
    }

    private int network_ = 0;
    /**
     * <code>.gincoinc.global.v1.Network network = 2 [json_name = "network"];</code>
     * @return The enum numeric value on the wire for network.
     */
    @java.lang.Override public int getNetworkValue() {
      return network_;
    }
    /**
     * <code>.gincoinc.global.v1.Network network = 2 [json_name = "network"];</code>
     * @param value The enum numeric value on the wire for network to set.
     * @return This builder for chaining.
     */
    public Builder setNetworkValue(int value) {
      network_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.gincoinc.global.v1.Network network = 2 [json_name = "network"];</code>
     * @return The network.
     */
    @java.lang.Override
    public gincoinc.global.v1.Enum.Network getNetwork() {
      gincoinc.global.v1.Enum.Network result = gincoinc.global.v1.Enum.Network.forNumber(network_);
      return result == null ? gincoinc.global.v1.Enum.Network.UNRECOGNIZED : result;
    }
    /**
     * <code>.gincoinc.global.v1.Network network = 2 [json_name = "network"];</code>
     * @param value The network to set.
     * @return This builder for chaining.
     */
    public Builder setNetwork(gincoinc.global.v1.Enum.Network value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      network_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.gincoinc.global.v1.Network network = 2 [json_name = "network"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNetwork() {
      bitField0_ = (bitField0_ & ~0x00000002);
      network_ = 0;
      onChanged();
      return this;
    }

    private double value_ ;
    /**
     * <code>double value = 3 [json_name = "value"];</code>
     * @return The value.
     */
    @java.lang.Override
    public double getValue() {
      return value_;
    }
    /**
     * <code>double value = 3 [json_name = "value"];</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(double value) {

      value_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>double value = 3 [json_name = "value"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000004);
      value_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.CreatePreTransactionThresholdRequest)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.CreatePreTransactionThresholdRequest)
  private static final adamant.global.v1.CreatePreTransactionThresholdRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new adamant.global.v1.CreatePreTransactionThresholdRequest();
  }

  public static adamant.global.v1.CreatePreTransactionThresholdRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreatePreTransactionThresholdRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreatePreTransactionThresholdRequest>() {
    @java.lang.Override
    public CreatePreTransactionThresholdRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreatePreTransactionThresholdRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreatePreTransactionThresholdRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public adamant.global.v1.CreatePreTransactionThresholdRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

