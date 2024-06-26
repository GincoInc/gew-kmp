// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
 * Protobuf type {@code adamant.global.v1.ForwardingThreshold}
 */
public final class ForwardingThreshold extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.ForwardingThreshold)
    ForwardingThresholdOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ForwardingThreshold.newBuilder() to construct.
  private ForwardingThreshold(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ForwardingThreshold() {
    coin_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ForwardingThreshold();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ForwardingThreshold_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ForwardingThreshold_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            adamant.global.v1.ForwardingThreshold.class, adamant.global.v1.ForwardingThreshold.Builder.class);
  }

  public static final int COIN_FIELD_NUMBER = 1;
  private int coin_ = 0;
  /**
   * <code>.gincoinc.global.v1.Coin coin = 1 [json_name = "coin", (.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for coin.
   */
  @java.lang.Override public int getCoinValue() {
    return coin_;
  }
  /**
   * <code>.gincoinc.global.v1.Coin coin = 1 [json_name = "coin", (.validate.rules) = { ... }</code>
   * @return The coin.
   */
  @java.lang.Override public gincoinc.global.v1.Enum.Coin getCoin() {
    gincoinc.global.v1.Enum.Coin result = gincoinc.global.v1.Enum.Coin.forNumber(coin_);
    return result == null ? gincoinc.global.v1.Enum.Coin.UNRECOGNIZED : result;
  }

  public static final int FEE_RATE_FIELD_NUMBER = 2;
  private double feeRate_ = 0D;
  /**
   * <code>double fee_rate = 2 [json_name = "feeRate"];</code>
   * @return The feeRate.
   */
  @java.lang.Override
  public double getFeeRate() {
    return feeRate_;
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
    if (java.lang.Double.doubleToRawLongBits(feeRate_) != 0) {
      output.writeDouble(2, feeRate_);
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
    if (java.lang.Double.doubleToRawLongBits(feeRate_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, feeRate_);
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
    if (!(obj instanceof adamant.global.v1.ForwardingThreshold)) {
      return super.equals(obj);
    }
    adamant.global.v1.ForwardingThreshold other = (adamant.global.v1.ForwardingThreshold) obj;

    if (coin_ != other.coin_) return false;
    if (java.lang.Double.doubleToLongBits(getFeeRate())
        != java.lang.Double.doubleToLongBits(
            other.getFeeRate())) return false;
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
    hash = (37 * hash) + FEE_RATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getFeeRate()));
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getValue()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static adamant.global.v1.ForwardingThreshold parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ForwardingThreshold parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ForwardingThreshold parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ForwardingThreshold parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ForwardingThreshold parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ForwardingThreshold parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ForwardingThreshold parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ForwardingThreshold parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static adamant.global.v1.ForwardingThreshold parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static adamant.global.v1.ForwardingThreshold parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.ForwardingThreshold parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ForwardingThreshold parseFrom(
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
  public static Builder newBuilder(adamant.global.v1.ForwardingThreshold prototype) {
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
   * Protobuf type {@code adamant.global.v1.ForwardingThreshold}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.ForwardingThreshold)
      adamant.global.v1.ForwardingThresholdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ForwardingThreshold_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ForwardingThreshold_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              adamant.global.v1.ForwardingThreshold.class, adamant.global.v1.ForwardingThreshold.Builder.class);
    }

    // Construct using adamant.global.v1.ForwardingThreshold.newBuilder()
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
      feeRate_ = 0D;
      value_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ForwardingThreshold_descriptor;
    }

    @java.lang.Override
    public adamant.global.v1.ForwardingThreshold getDefaultInstanceForType() {
      return adamant.global.v1.ForwardingThreshold.getDefaultInstance();
    }

    @java.lang.Override
    public adamant.global.v1.ForwardingThreshold build() {
      adamant.global.v1.ForwardingThreshold result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public adamant.global.v1.ForwardingThreshold buildPartial() {
      adamant.global.v1.ForwardingThreshold result = new adamant.global.v1.ForwardingThreshold(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(adamant.global.v1.ForwardingThreshold result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.coin_ = coin_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.feeRate_ = feeRate_;
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
      if (other instanceof adamant.global.v1.ForwardingThreshold) {
        return mergeFrom((adamant.global.v1.ForwardingThreshold)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(adamant.global.v1.ForwardingThreshold other) {
      if (other == adamant.global.v1.ForwardingThreshold.getDefaultInstance()) return this;
      if (other.coin_ != 0) {
        setCoinValue(other.getCoinValue());
      }
      if (other.getFeeRate() != 0D) {
        setFeeRate(other.getFeeRate());
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
            case 17: {
              feeRate_ = input.readDouble();
              bitField0_ |= 0x00000002;
              break;
            } // case 17
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
     * <code>.gincoinc.global.v1.Coin coin = 1 [json_name = "coin", (.validate.rules) = { ... }</code>
     * @return The enum numeric value on the wire for coin.
     */
    @java.lang.Override public int getCoinValue() {
      return coin_;
    }
    /**
     * <code>.gincoinc.global.v1.Coin coin = 1 [json_name = "coin", (.validate.rules) = { ... }</code>
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
     * <code>.gincoinc.global.v1.Coin coin = 1 [json_name = "coin", (.validate.rules) = { ... }</code>
     * @return The coin.
     */
    @java.lang.Override
    public gincoinc.global.v1.Enum.Coin getCoin() {
      gincoinc.global.v1.Enum.Coin result = gincoinc.global.v1.Enum.Coin.forNumber(coin_);
      return result == null ? gincoinc.global.v1.Enum.Coin.UNRECOGNIZED : result;
    }
    /**
     * <code>.gincoinc.global.v1.Coin coin = 1 [json_name = "coin", (.validate.rules) = { ... }</code>
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
     * <code>.gincoinc.global.v1.Coin coin = 1 [json_name = "coin", (.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearCoin() {
      bitField0_ = (bitField0_ & ~0x00000001);
      coin_ = 0;
      onChanged();
      return this;
    }

    private double feeRate_ ;
    /**
     * <code>double fee_rate = 2 [json_name = "feeRate"];</code>
     * @return The feeRate.
     */
    @java.lang.Override
    public double getFeeRate() {
      return feeRate_;
    }
    /**
     * <code>double fee_rate = 2 [json_name = "feeRate"];</code>
     * @param value The feeRate to set.
     * @return This builder for chaining.
     */
    public Builder setFeeRate(double value) {

      feeRate_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>double fee_rate = 2 [json_name = "feeRate"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFeeRate() {
      bitField0_ = (bitField0_ & ~0x00000002);
      feeRate_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.ForwardingThreshold)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.ForwardingThreshold)
  private static final adamant.global.v1.ForwardingThreshold DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new adamant.global.v1.ForwardingThreshold();
  }

  public static adamant.global.v1.ForwardingThreshold getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ForwardingThreshold>
      PARSER = new com.google.protobuf.AbstractParser<ForwardingThreshold>() {
    @java.lang.Override
    public ForwardingThreshold parsePartialFrom(
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

  public static com.google.protobuf.Parser<ForwardingThreshold> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ForwardingThreshold> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public adamant.global.v1.ForwardingThreshold getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

