// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
 * Protobuf type {@code adamant.global.v1.RefreshStakingWalletClaimableRewardResponse}
 */
public final class RefreshStakingWalletClaimableRewardResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.RefreshStakingWalletClaimableRewardResponse)
    RefreshStakingWalletClaimableRewardResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RefreshStakingWalletClaimableRewardResponse.newBuilder() to construct.
  private RefreshStakingWalletClaimableRewardResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RefreshStakingWalletClaimableRewardResponse() {
    stringClaimableReward_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RefreshStakingWalletClaimableRewardResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_RefreshStakingWalletClaimableRewardResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_RefreshStakingWalletClaimableRewardResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            adamant.global.v1.RefreshStakingWalletClaimableRewardResponse.class, adamant.global.v1.RefreshStakingWalletClaimableRewardResponse.Builder.class);
  }

  public static final int CLAIMABLE_REWARD_FIELD_NUMBER = 1;
  private double claimableReward_ = 0D;
  /**
   * <code>double claimable_reward = 1 [json_name = "claimableReward"];</code>
   * @return The claimableReward.
   */
  @java.lang.Override
  public double getClaimableReward() {
    return claimableReward_;
  }

  public static final int STRING_CLAIMABLE_REWARD_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object stringClaimableReward_ = "";
  /**
   * <code>string string_claimable_reward = 2 [json_name = "stringClaimableReward"];</code>
   * @return The stringClaimableReward.
   */
  @java.lang.Override
  public java.lang.String getStringClaimableReward() {
    java.lang.Object ref = stringClaimableReward_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stringClaimableReward_ = s;
      return s;
    }
  }
  /**
   * <code>string string_claimable_reward = 2 [json_name = "stringClaimableReward"];</code>
   * @return The bytes for stringClaimableReward.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStringClaimableRewardBytes() {
    java.lang.Object ref = stringClaimableReward_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stringClaimableReward_ = b;
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
    if (java.lang.Double.doubleToRawLongBits(claimableReward_) != 0) {
      output.writeDouble(1, claimableReward_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stringClaimableReward_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, stringClaimableReward_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(claimableReward_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, claimableReward_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stringClaimableReward_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, stringClaimableReward_);
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
    if (!(obj instanceof adamant.global.v1.RefreshStakingWalletClaimableRewardResponse)) {
      return super.equals(obj);
    }
    adamant.global.v1.RefreshStakingWalletClaimableRewardResponse other = (adamant.global.v1.RefreshStakingWalletClaimableRewardResponse) obj;

    if (java.lang.Double.doubleToLongBits(getClaimableReward())
        != java.lang.Double.doubleToLongBits(
            other.getClaimableReward())) return false;
    if (!getStringClaimableReward()
        .equals(other.getStringClaimableReward())) return false;
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
    hash = (37 * hash) + CLAIMABLE_REWARD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getClaimableReward()));
    hash = (37 * hash) + STRING_CLAIMABLE_REWARD_FIELD_NUMBER;
    hash = (53 * hash) + getStringClaimableReward().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static adamant.global.v1.RefreshStakingWalletClaimableRewardResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.RefreshStakingWalletClaimableRewardResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.RefreshStakingWalletClaimableRewardResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.RefreshStakingWalletClaimableRewardResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.RefreshStakingWalletClaimableRewardResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.RefreshStakingWalletClaimableRewardResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.RefreshStakingWalletClaimableRewardResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.RefreshStakingWalletClaimableRewardResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static adamant.global.v1.RefreshStakingWalletClaimableRewardResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static adamant.global.v1.RefreshStakingWalletClaimableRewardResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.RefreshStakingWalletClaimableRewardResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.RefreshStakingWalletClaimableRewardResponse parseFrom(
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
  public static Builder newBuilder(adamant.global.v1.RefreshStakingWalletClaimableRewardResponse prototype) {
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
   * Protobuf type {@code adamant.global.v1.RefreshStakingWalletClaimableRewardResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.RefreshStakingWalletClaimableRewardResponse)
      adamant.global.v1.RefreshStakingWalletClaimableRewardResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_RefreshStakingWalletClaimableRewardResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_RefreshStakingWalletClaimableRewardResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              adamant.global.v1.RefreshStakingWalletClaimableRewardResponse.class, adamant.global.v1.RefreshStakingWalletClaimableRewardResponse.Builder.class);
    }

    // Construct using adamant.global.v1.RefreshStakingWalletClaimableRewardResponse.newBuilder()
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
      claimableReward_ = 0D;
      stringClaimableReward_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_RefreshStakingWalletClaimableRewardResponse_descriptor;
    }

    @java.lang.Override
    public adamant.global.v1.RefreshStakingWalletClaimableRewardResponse getDefaultInstanceForType() {
      return adamant.global.v1.RefreshStakingWalletClaimableRewardResponse.getDefaultInstance();
    }

    @java.lang.Override
    public adamant.global.v1.RefreshStakingWalletClaimableRewardResponse build() {
      adamant.global.v1.RefreshStakingWalletClaimableRewardResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public adamant.global.v1.RefreshStakingWalletClaimableRewardResponse buildPartial() {
      adamant.global.v1.RefreshStakingWalletClaimableRewardResponse result = new adamant.global.v1.RefreshStakingWalletClaimableRewardResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(adamant.global.v1.RefreshStakingWalletClaimableRewardResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.claimableReward_ = claimableReward_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.stringClaimableReward_ = stringClaimableReward_;
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
      if (other instanceof adamant.global.v1.RefreshStakingWalletClaimableRewardResponse) {
        return mergeFrom((adamant.global.v1.RefreshStakingWalletClaimableRewardResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(adamant.global.v1.RefreshStakingWalletClaimableRewardResponse other) {
      if (other == adamant.global.v1.RefreshStakingWalletClaimableRewardResponse.getDefaultInstance()) return this;
      if (other.getClaimableReward() != 0D) {
        setClaimableReward(other.getClaimableReward());
      }
      if (!other.getStringClaimableReward().isEmpty()) {
        stringClaimableReward_ = other.stringClaimableReward_;
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
            case 9: {
              claimableReward_ = input.readDouble();
              bitField0_ |= 0x00000001;
              break;
            } // case 9
            case 18: {
              stringClaimableReward_ = input.readStringRequireUtf8();
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

    private double claimableReward_ ;
    /**
     * <code>double claimable_reward = 1 [json_name = "claimableReward"];</code>
     * @return The claimableReward.
     */
    @java.lang.Override
    public double getClaimableReward() {
      return claimableReward_;
    }
    /**
     * <code>double claimable_reward = 1 [json_name = "claimableReward"];</code>
     * @param value The claimableReward to set.
     * @return This builder for chaining.
     */
    public Builder setClaimableReward(double value) {

      claimableReward_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>double claimable_reward = 1 [json_name = "claimableReward"];</code>
     * @return This builder for chaining.
     */
    public Builder clearClaimableReward() {
      bitField0_ = (bitField0_ & ~0x00000001);
      claimableReward_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object stringClaimableReward_ = "";
    /**
     * <code>string string_claimable_reward = 2 [json_name = "stringClaimableReward"];</code>
     * @return The stringClaimableReward.
     */
    public java.lang.String getStringClaimableReward() {
      java.lang.Object ref = stringClaimableReward_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stringClaimableReward_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string string_claimable_reward = 2 [json_name = "stringClaimableReward"];</code>
     * @return The bytes for stringClaimableReward.
     */
    public com.google.protobuf.ByteString
        getStringClaimableRewardBytes() {
      java.lang.Object ref = stringClaimableReward_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stringClaimableReward_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string string_claimable_reward = 2 [json_name = "stringClaimableReward"];</code>
     * @param value The stringClaimableReward to set.
     * @return This builder for chaining.
     */
    public Builder setStringClaimableReward(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      stringClaimableReward_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string string_claimable_reward = 2 [json_name = "stringClaimableReward"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStringClaimableReward() {
      stringClaimableReward_ = getDefaultInstance().getStringClaimableReward();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string string_claimable_reward = 2 [json_name = "stringClaimableReward"];</code>
     * @param value The bytes for stringClaimableReward to set.
     * @return This builder for chaining.
     */
    public Builder setStringClaimableRewardBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      stringClaimableReward_ = value;
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.RefreshStakingWalletClaimableRewardResponse)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.RefreshStakingWalletClaimableRewardResponse)
  private static final adamant.global.v1.RefreshStakingWalletClaimableRewardResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new adamant.global.v1.RefreshStakingWalletClaimableRewardResponse();
  }

  public static adamant.global.v1.RefreshStakingWalletClaimableRewardResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RefreshStakingWalletClaimableRewardResponse>
      PARSER = new com.google.protobuf.AbstractParser<RefreshStakingWalletClaimableRewardResponse>() {
    @java.lang.Override
    public RefreshStakingWalletClaimableRewardResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<RefreshStakingWalletClaimableRewardResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RefreshStakingWalletClaimableRewardResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public adamant.global.v1.RefreshStakingWalletClaimableRewardResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
