// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
 * Protobuf type {@code adamant.global.v1.UpdateWalletPolicyRequest}
 */
public final class UpdateWalletPolicyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.UpdateWalletPolicyRequest)
    UpdateWalletPolicyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateWalletPolicyRequest.newBuilder() to construct.
  private UpdateWalletPolicyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateWalletPolicyRequest() {
    walletId_ = "";
    policyId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateWalletPolicyRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_UpdateWalletPolicyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_UpdateWalletPolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            adamant.global.v1.UpdateWalletPolicyRequest.class, adamant.global.v1.UpdateWalletPolicyRequest.Builder.class);
  }

  public static final int WALLET_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object walletId_ = "";
  /**
   * <code>string wallet_id = 1 [json_name = "walletId", (.validate.rules) = { ... }</code>
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
   * <code>string wallet_id = 1 [json_name = "walletId", (.validate.rules) = { ... }</code>
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

  public static final int POLICY_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object policyId_ = "";
  /**
   * <code>string policy_id = 2 [json_name = "policyId", (.validate.rules) = { ... }</code>
   * @return The policyId.
   */
  @java.lang.Override
  public java.lang.String getPolicyId() {
    java.lang.Object ref = policyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      policyId_ = s;
      return s;
    }
  }
  /**
   * <code>string policy_id = 2 [json_name = "policyId", (.validate.rules) = { ... }</code>
   * @return The bytes for policyId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPolicyIdBytes() {
    java.lang.Object ref = policyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      policyId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(policyId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, policyId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(walletId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, walletId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(policyId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, policyId_);
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
    if (!(obj instanceof adamant.global.v1.UpdateWalletPolicyRequest)) {
      return super.equals(obj);
    }
    adamant.global.v1.UpdateWalletPolicyRequest other = (adamant.global.v1.UpdateWalletPolicyRequest) obj;

    if (!getWalletId()
        .equals(other.getWalletId())) return false;
    if (!getPolicyId()
        .equals(other.getPolicyId())) return false;
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
    hash = (37 * hash) + WALLET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getWalletId().hashCode();
    hash = (37 * hash) + POLICY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPolicyId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static adamant.global.v1.UpdateWalletPolicyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.UpdateWalletPolicyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.UpdateWalletPolicyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.UpdateWalletPolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.UpdateWalletPolicyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.UpdateWalletPolicyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.UpdateWalletPolicyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.UpdateWalletPolicyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static adamant.global.v1.UpdateWalletPolicyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static adamant.global.v1.UpdateWalletPolicyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.UpdateWalletPolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.UpdateWalletPolicyRequest parseFrom(
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
  public static Builder newBuilder(adamant.global.v1.UpdateWalletPolicyRequest prototype) {
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
   * Protobuf type {@code adamant.global.v1.UpdateWalletPolicyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.UpdateWalletPolicyRequest)
      adamant.global.v1.UpdateWalletPolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_UpdateWalletPolicyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_UpdateWalletPolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              adamant.global.v1.UpdateWalletPolicyRequest.class, adamant.global.v1.UpdateWalletPolicyRequest.Builder.class);
    }

    // Construct using adamant.global.v1.UpdateWalletPolicyRequest.newBuilder()
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
      walletId_ = "";
      policyId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_UpdateWalletPolicyRequest_descriptor;
    }

    @java.lang.Override
    public adamant.global.v1.UpdateWalletPolicyRequest getDefaultInstanceForType() {
      return adamant.global.v1.UpdateWalletPolicyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public adamant.global.v1.UpdateWalletPolicyRequest build() {
      adamant.global.v1.UpdateWalletPolicyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public adamant.global.v1.UpdateWalletPolicyRequest buildPartial() {
      adamant.global.v1.UpdateWalletPolicyRequest result = new adamant.global.v1.UpdateWalletPolicyRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(adamant.global.v1.UpdateWalletPolicyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.walletId_ = walletId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.policyId_ = policyId_;
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
      if (other instanceof adamant.global.v1.UpdateWalletPolicyRequest) {
        return mergeFrom((adamant.global.v1.UpdateWalletPolicyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(adamant.global.v1.UpdateWalletPolicyRequest other) {
      if (other == adamant.global.v1.UpdateWalletPolicyRequest.getDefaultInstance()) return this;
      if (!other.getWalletId().isEmpty()) {
        walletId_ = other.walletId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPolicyId().isEmpty()) {
        policyId_ = other.policyId_;
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
              walletId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              policyId_ = input.readStringRequireUtf8();
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

    private java.lang.Object walletId_ = "";
    /**
     * <code>string wallet_id = 1 [json_name = "walletId", (.validate.rules) = { ... }</code>
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
     * <code>string wallet_id = 1 [json_name = "walletId", (.validate.rules) = { ... }</code>
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
     * <code>string wallet_id = 1 [json_name = "walletId", (.validate.rules) = { ... }</code>
     * @param value The walletId to set.
     * @return This builder for chaining.
     */
    public Builder setWalletId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      walletId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string wallet_id = 1 [json_name = "walletId", (.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearWalletId() {
      walletId_ = getDefaultInstance().getWalletId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string wallet_id = 1 [json_name = "walletId", (.validate.rules) = { ... }</code>
     * @param value The bytes for walletId to set.
     * @return This builder for chaining.
     */
    public Builder setWalletIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      walletId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object policyId_ = "";
    /**
     * <code>string policy_id = 2 [json_name = "policyId", (.validate.rules) = { ... }</code>
     * @return The policyId.
     */
    public java.lang.String getPolicyId() {
      java.lang.Object ref = policyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        policyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string policy_id = 2 [json_name = "policyId", (.validate.rules) = { ... }</code>
     * @return The bytes for policyId.
     */
    public com.google.protobuf.ByteString
        getPolicyIdBytes() {
      java.lang.Object ref = policyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        policyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string policy_id = 2 [json_name = "policyId", (.validate.rules) = { ... }</code>
     * @param value The policyId to set.
     * @return This builder for chaining.
     */
    public Builder setPolicyId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      policyId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string policy_id = 2 [json_name = "policyId", (.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearPolicyId() {
      policyId_ = getDefaultInstance().getPolicyId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string policy_id = 2 [json_name = "policyId", (.validate.rules) = { ... }</code>
     * @param value The bytes for policyId to set.
     * @return This builder for chaining.
     */
    public Builder setPolicyIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      policyId_ = value;
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.UpdateWalletPolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.UpdateWalletPolicyRequest)
  private static final adamant.global.v1.UpdateWalletPolicyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new adamant.global.v1.UpdateWalletPolicyRequest();
  }

  public static adamant.global.v1.UpdateWalletPolicyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateWalletPolicyRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateWalletPolicyRequest>() {
    @java.lang.Override
    public UpdateWalletPolicyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateWalletPolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateWalletPolicyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public adamant.global.v1.UpdateWalletPolicyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

