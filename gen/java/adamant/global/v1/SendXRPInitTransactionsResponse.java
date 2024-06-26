// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
 * Protobuf type {@code adamant.global.v1.SendXRPInitTransactionsResponse}
 */
public final class SendXRPInitTransactionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.SendXRPInitTransactionsResponse)
    SendXRPInitTransactionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SendXRPInitTransactionsResponse.newBuilder() to construct.
  private SendXRPInitTransactionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SendXRPInitTransactionsResponse() {
    txIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SendXRPInitTransactionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_SendXRPInitTransactionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_SendXRPInitTransactionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            adamant.global.v1.SendXRPInitTransactionsResponse.class, adamant.global.v1.SendXRPInitTransactionsResponse.Builder.class);
  }

  public static final int TX_IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList txIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string tx_ids = 1 [json_name = "txIds"];</code>
   * @return A list containing the txIds.
   */
  public com.google.protobuf.ProtocolStringList
      getTxIdsList() {
    return txIds_;
  }
  /**
   * <code>repeated string tx_ids = 1 [json_name = "txIds"];</code>
   * @return The count of txIds.
   */
  public int getTxIdsCount() {
    return txIds_.size();
  }
  /**
   * <code>repeated string tx_ids = 1 [json_name = "txIds"];</code>
   * @param index The index of the element to return.
   * @return The txIds at the given index.
   */
  public java.lang.String getTxIds(int index) {
    return txIds_.get(index);
  }
  /**
   * <code>repeated string tx_ids = 1 [json_name = "txIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the txIds at the given index.
   */
  public com.google.protobuf.ByteString
      getTxIdsBytes(int index) {
    return txIds_.getByteString(index);
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
    for (int i = 0; i < txIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, txIds_.getRaw(i));
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
      for (int i = 0; i < txIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(txIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTxIdsList().size();
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
    if (!(obj instanceof adamant.global.v1.SendXRPInitTransactionsResponse)) {
      return super.equals(obj);
    }
    adamant.global.v1.SendXRPInitTransactionsResponse other = (adamant.global.v1.SendXRPInitTransactionsResponse) obj;

    if (!getTxIdsList()
        .equals(other.getTxIdsList())) return false;
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
    if (getTxIdsCount() > 0) {
      hash = (37 * hash) + TX_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getTxIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static adamant.global.v1.SendXRPInitTransactionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.SendXRPInitTransactionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.SendXRPInitTransactionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.SendXRPInitTransactionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.SendXRPInitTransactionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.SendXRPInitTransactionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.SendXRPInitTransactionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.SendXRPInitTransactionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static adamant.global.v1.SendXRPInitTransactionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static adamant.global.v1.SendXRPInitTransactionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.SendXRPInitTransactionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.SendXRPInitTransactionsResponse parseFrom(
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
  public static Builder newBuilder(adamant.global.v1.SendXRPInitTransactionsResponse prototype) {
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
   * Protobuf type {@code adamant.global.v1.SendXRPInitTransactionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.SendXRPInitTransactionsResponse)
      adamant.global.v1.SendXRPInitTransactionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_SendXRPInitTransactionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_SendXRPInitTransactionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              adamant.global.v1.SendXRPInitTransactionsResponse.class, adamant.global.v1.SendXRPInitTransactionsResponse.Builder.class);
    }

    // Construct using adamant.global.v1.SendXRPInitTransactionsResponse.newBuilder()
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
      txIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_SendXRPInitTransactionsResponse_descriptor;
    }

    @java.lang.Override
    public adamant.global.v1.SendXRPInitTransactionsResponse getDefaultInstanceForType() {
      return adamant.global.v1.SendXRPInitTransactionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public adamant.global.v1.SendXRPInitTransactionsResponse build() {
      adamant.global.v1.SendXRPInitTransactionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public adamant.global.v1.SendXRPInitTransactionsResponse buildPartial() {
      adamant.global.v1.SendXRPInitTransactionsResponse result = new adamant.global.v1.SendXRPInitTransactionsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(adamant.global.v1.SendXRPInitTransactionsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        txIds_.makeImmutable();
        result.txIds_ = txIds_;
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
      if (other instanceof adamant.global.v1.SendXRPInitTransactionsResponse) {
        return mergeFrom((adamant.global.v1.SendXRPInitTransactionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(adamant.global.v1.SendXRPInitTransactionsResponse other) {
      if (other == adamant.global.v1.SendXRPInitTransactionsResponse.getDefaultInstance()) return this;
      if (!other.txIds_.isEmpty()) {
        if (txIds_.isEmpty()) {
          txIds_ = other.txIds_;
          bitField0_ |= 0x00000001;
        } else {
          ensureTxIdsIsMutable();
          txIds_.addAll(other.txIds_);
        }
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
              ensureTxIdsIsMutable();
              txIds_.add(s);
              break;
            } // case 10
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

    private com.google.protobuf.LazyStringArrayList txIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureTxIdsIsMutable() {
      if (!txIds_.isModifiable()) {
        txIds_ = new com.google.protobuf.LazyStringArrayList(txIds_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string tx_ids = 1 [json_name = "txIds"];</code>
     * @return A list containing the txIds.
     */
    public com.google.protobuf.ProtocolStringList
        getTxIdsList() {
      txIds_.makeImmutable();
      return txIds_;
    }
    /**
     * <code>repeated string tx_ids = 1 [json_name = "txIds"];</code>
     * @return The count of txIds.
     */
    public int getTxIdsCount() {
      return txIds_.size();
    }
    /**
     * <code>repeated string tx_ids = 1 [json_name = "txIds"];</code>
     * @param index The index of the element to return.
     * @return The txIds at the given index.
     */
    public java.lang.String getTxIds(int index) {
      return txIds_.get(index);
    }
    /**
     * <code>repeated string tx_ids = 1 [json_name = "txIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the txIds at the given index.
     */
    public com.google.protobuf.ByteString
        getTxIdsBytes(int index) {
      return txIds_.getByteString(index);
    }
    /**
     * <code>repeated string tx_ids = 1 [json_name = "txIds"];</code>
     * @param index The index to set the value at.
     * @param value The txIds to set.
     * @return This builder for chaining.
     */
    public Builder setTxIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureTxIdsIsMutable();
      txIds_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tx_ids = 1 [json_name = "txIds"];</code>
     * @param value The txIds to add.
     * @return This builder for chaining.
     */
    public Builder addTxIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureTxIdsIsMutable();
      txIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tx_ids = 1 [json_name = "txIds"];</code>
     * @param values The txIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllTxIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureTxIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, txIds_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tx_ids = 1 [json_name = "txIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTxIds() {
      txIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tx_ids = 1 [json_name = "txIds"];</code>
     * @param value The bytes of the txIds to add.
     * @return This builder for chaining.
     */
    public Builder addTxIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureTxIdsIsMutable();
      txIds_.add(value);
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.SendXRPInitTransactionsResponse)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.SendXRPInitTransactionsResponse)
  private static final adamant.global.v1.SendXRPInitTransactionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new adamant.global.v1.SendXRPInitTransactionsResponse();
  }

  public static adamant.global.v1.SendXRPInitTransactionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SendXRPInitTransactionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<SendXRPInitTransactionsResponse>() {
    @java.lang.Override
    public SendXRPInitTransactionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SendXRPInitTransactionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SendXRPInitTransactionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public adamant.global.v1.SendXRPInitTransactionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

