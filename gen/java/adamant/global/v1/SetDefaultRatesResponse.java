// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
 * Protobuf type {@code adamant.global.v1.SetDefaultRatesResponse}
 */
public final class SetDefaultRatesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.SetDefaultRatesResponse)
    SetDefaultRatesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetDefaultRatesResponse.newBuilder() to construct.
  private SetDefaultRatesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetDefaultRatesResponse() {
    rateSnapshotIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetDefaultRatesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_SetDefaultRatesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_SetDefaultRatesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            adamant.global.v1.SetDefaultRatesResponse.class, adamant.global.v1.SetDefaultRatesResponse.Builder.class);
  }

  public static final int RATE_SNAPSHOT_IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList rateSnapshotIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Array of ids of rate-snapshots
   * </pre>
   *
   * <code>repeated string rate_snapshot_ids = 1 [json_name = "rateSnapshotIds"];</code>
   * @return A list containing the rateSnapshotIds.
   */
  public com.google.protobuf.ProtocolStringList
      getRateSnapshotIdsList() {
    return rateSnapshotIds_;
  }
  /**
   * <pre>
   * Array of ids of rate-snapshots
   * </pre>
   *
   * <code>repeated string rate_snapshot_ids = 1 [json_name = "rateSnapshotIds"];</code>
   * @return The count of rateSnapshotIds.
   */
  public int getRateSnapshotIdsCount() {
    return rateSnapshotIds_.size();
  }
  /**
   * <pre>
   * Array of ids of rate-snapshots
   * </pre>
   *
   * <code>repeated string rate_snapshot_ids = 1 [json_name = "rateSnapshotIds"];</code>
   * @param index The index of the element to return.
   * @return The rateSnapshotIds at the given index.
   */
  public java.lang.String getRateSnapshotIds(int index) {
    return rateSnapshotIds_.get(index);
  }
  /**
   * <pre>
   * Array of ids of rate-snapshots
   * </pre>
   *
   * <code>repeated string rate_snapshot_ids = 1 [json_name = "rateSnapshotIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the rateSnapshotIds at the given index.
   */
  public com.google.protobuf.ByteString
      getRateSnapshotIdsBytes(int index) {
    return rateSnapshotIds_.getByteString(index);
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
    for (int i = 0; i < rateSnapshotIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rateSnapshotIds_.getRaw(i));
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
      for (int i = 0; i < rateSnapshotIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(rateSnapshotIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getRateSnapshotIdsList().size();
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
    if (!(obj instanceof adamant.global.v1.SetDefaultRatesResponse)) {
      return super.equals(obj);
    }
    adamant.global.v1.SetDefaultRatesResponse other = (adamant.global.v1.SetDefaultRatesResponse) obj;

    if (!getRateSnapshotIdsList()
        .equals(other.getRateSnapshotIdsList())) return false;
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
    if (getRateSnapshotIdsCount() > 0) {
      hash = (37 * hash) + RATE_SNAPSHOT_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getRateSnapshotIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static adamant.global.v1.SetDefaultRatesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.SetDefaultRatesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.SetDefaultRatesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.SetDefaultRatesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.SetDefaultRatesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.SetDefaultRatesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.SetDefaultRatesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.SetDefaultRatesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static adamant.global.v1.SetDefaultRatesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static adamant.global.v1.SetDefaultRatesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.SetDefaultRatesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.SetDefaultRatesResponse parseFrom(
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
  public static Builder newBuilder(adamant.global.v1.SetDefaultRatesResponse prototype) {
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
   * Protobuf type {@code adamant.global.v1.SetDefaultRatesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.SetDefaultRatesResponse)
      adamant.global.v1.SetDefaultRatesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_SetDefaultRatesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_SetDefaultRatesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              adamant.global.v1.SetDefaultRatesResponse.class, adamant.global.v1.SetDefaultRatesResponse.Builder.class);
    }

    // Construct using adamant.global.v1.SetDefaultRatesResponse.newBuilder()
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
      rateSnapshotIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_SetDefaultRatesResponse_descriptor;
    }

    @java.lang.Override
    public adamant.global.v1.SetDefaultRatesResponse getDefaultInstanceForType() {
      return adamant.global.v1.SetDefaultRatesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public adamant.global.v1.SetDefaultRatesResponse build() {
      adamant.global.v1.SetDefaultRatesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public adamant.global.v1.SetDefaultRatesResponse buildPartial() {
      adamant.global.v1.SetDefaultRatesResponse result = new adamant.global.v1.SetDefaultRatesResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(adamant.global.v1.SetDefaultRatesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        rateSnapshotIds_.makeImmutable();
        result.rateSnapshotIds_ = rateSnapshotIds_;
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
      if (other instanceof adamant.global.v1.SetDefaultRatesResponse) {
        return mergeFrom((adamant.global.v1.SetDefaultRatesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(adamant.global.v1.SetDefaultRatesResponse other) {
      if (other == adamant.global.v1.SetDefaultRatesResponse.getDefaultInstance()) return this;
      if (!other.rateSnapshotIds_.isEmpty()) {
        if (rateSnapshotIds_.isEmpty()) {
          rateSnapshotIds_ = other.rateSnapshotIds_;
          bitField0_ |= 0x00000001;
        } else {
          ensureRateSnapshotIdsIsMutable();
          rateSnapshotIds_.addAll(other.rateSnapshotIds_);
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
              ensureRateSnapshotIdsIsMutable();
              rateSnapshotIds_.add(s);
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

    private com.google.protobuf.LazyStringArrayList rateSnapshotIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureRateSnapshotIdsIsMutable() {
      if (!rateSnapshotIds_.isModifiable()) {
        rateSnapshotIds_ = new com.google.protobuf.LazyStringArrayList(rateSnapshotIds_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * Array of ids of rate-snapshots
     * </pre>
     *
     * <code>repeated string rate_snapshot_ids = 1 [json_name = "rateSnapshotIds"];</code>
     * @return A list containing the rateSnapshotIds.
     */
    public com.google.protobuf.ProtocolStringList
        getRateSnapshotIdsList() {
      rateSnapshotIds_.makeImmutable();
      return rateSnapshotIds_;
    }
    /**
     * <pre>
     * Array of ids of rate-snapshots
     * </pre>
     *
     * <code>repeated string rate_snapshot_ids = 1 [json_name = "rateSnapshotIds"];</code>
     * @return The count of rateSnapshotIds.
     */
    public int getRateSnapshotIdsCount() {
      return rateSnapshotIds_.size();
    }
    /**
     * <pre>
     * Array of ids of rate-snapshots
     * </pre>
     *
     * <code>repeated string rate_snapshot_ids = 1 [json_name = "rateSnapshotIds"];</code>
     * @param index The index of the element to return.
     * @return The rateSnapshotIds at the given index.
     */
    public java.lang.String getRateSnapshotIds(int index) {
      return rateSnapshotIds_.get(index);
    }
    /**
     * <pre>
     * Array of ids of rate-snapshots
     * </pre>
     *
     * <code>repeated string rate_snapshot_ids = 1 [json_name = "rateSnapshotIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the rateSnapshotIds at the given index.
     */
    public com.google.protobuf.ByteString
        getRateSnapshotIdsBytes(int index) {
      return rateSnapshotIds_.getByteString(index);
    }
    /**
     * <pre>
     * Array of ids of rate-snapshots
     * </pre>
     *
     * <code>repeated string rate_snapshot_ids = 1 [json_name = "rateSnapshotIds"];</code>
     * @param index The index to set the value at.
     * @param value The rateSnapshotIds to set.
     * @return This builder for chaining.
     */
    public Builder setRateSnapshotIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureRateSnapshotIdsIsMutable();
      rateSnapshotIds_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Array of ids of rate-snapshots
     * </pre>
     *
     * <code>repeated string rate_snapshot_ids = 1 [json_name = "rateSnapshotIds"];</code>
     * @param value The rateSnapshotIds to add.
     * @return This builder for chaining.
     */
    public Builder addRateSnapshotIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureRateSnapshotIdsIsMutable();
      rateSnapshotIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Array of ids of rate-snapshots
     * </pre>
     *
     * <code>repeated string rate_snapshot_ids = 1 [json_name = "rateSnapshotIds"];</code>
     * @param values The rateSnapshotIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllRateSnapshotIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureRateSnapshotIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, rateSnapshotIds_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Array of ids of rate-snapshots
     * </pre>
     *
     * <code>repeated string rate_snapshot_ids = 1 [json_name = "rateSnapshotIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRateSnapshotIds() {
      rateSnapshotIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Array of ids of rate-snapshots
     * </pre>
     *
     * <code>repeated string rate_snapshot_ids = 1 [json_name = "rateSnapshotIds"];</code>
     * @param value The bytes of the rateSnapshotIds to add.
     * @return This builder for chaining.
     */
    public Builder addRateSnapshotIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureRateSnapshotIdsIsMutable();
      rateSnapshotIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.SetDefaultRatesResponse)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.SetDefaultRatesResponse)
  private static final adamant.global.v1.SetDefaultRatesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new adamant.global.v1.SetDefaultRatesResponse();
  }

  public static adamant.global.v1.SetDefaultRatesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetDefaultRatesResponse>
      PARSER = new com.google.protobuf.AbstractParser<SetDefaultRatesResponse>() {
    @java.lang.Override
    public SetDefaultRatesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SetDefaultRatesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetDefaultRatesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public adamant.global.v1.SetDefaultRatesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

