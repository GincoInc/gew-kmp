// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
 * Protobuf type {@code adamant.global.v1.ListStakingHistoriesResponse}
 */
public final class ListStakingHistoriesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.ListStakingHistoriesResponse)
    ListStakingHistoriesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListStakingHistoriesResponse.newBuilder() to construct.
  private ListStakingHistoriesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListStakingHistoriesResponse() {
    stakingHistories_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListStakingHistoriesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListStakingHistoriesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListStakingHistoriesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            adamant.global.v1.ListStakingHistoriesResponse.class, adamant.global.v1.ListStakingHistoriesResponse.Builder.class);
  }

  public static final int STAKING_HISTORIES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<adamant.global.v1.Model.StakingHistory> stakingHistories_;
  /**
   * <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
   */
  @java.lang.Override
  public java.util.List<adamant.global.v1.Model.StakingHistory> getStakingHistoriesList() {
    return stakingHistories_;
  }
  /**
   * <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends adamant.global.v1.Model.StakingHistoryOrBuilder> 
      getStakingHistoriesOrBuilderList() {
    return stakingHistories_;
  }
  /**
   * <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
   */
  @java.lang.Override
  public int getStakingHistoriesCount() {
    return stakingHistories_.size();
  }
  /**
   * <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
   */
  @java.lang.Override
  public adamant.global.v1.Model.StakingHistory getStakingHistories(int index) {
    return stakingHistories_.get(index);
  }
  /**
   * <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
   */
  @java.lang.Override
  public adamant.global.v1.Model.StakingHistoryOrBuilder getStakingHistoriesOrBuilder(
      int index) {
    return stakingHistories_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < stakingHistories_.size(); i++) {
      output.writeMessage(1, stakingHistories_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < stakingHistories_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, stakingHistories_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof adamant.global.v1.ListStakingHistoriesResponse)) {
      return super.equals(obj);
    }
    adamant.global.v1.ListStakingHistoriesResponse other = (adamant.global.v1.ListStakingHistoriesResponse) obj;

    if (!getStakingHistoriesList()
        .equals(other.getStakingHistoriesList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getStakingHistoriesCount() > 0) {
      hash = (37 * hash) + STAKING_HISTORIES_FIELD_NUMBER;
      hash = (53 * hash) + getStakingHistoriesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static adamant.global.v1.ListStakingHistoriesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ListStakingHistoriesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ListStakingHistoriesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ListStakingHistoriesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ListStakingHistoriesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ListStakingHistoriesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ListStakingHistoriesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ListStakingHistoriesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static adamant.global.v1.ListStakingHistoriesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static adamant.global.v1.ListStakingHistoriesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.ListStakingHistoriesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ListStakingHistoriesResponse parseFrom(
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
  public static Builder newBuilder(adamant.global.v1.ListStakingHistoriesResponse prototype) {
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
   * Protobuf type {@code adamant.global.v1.ListStakingHistoriesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.ListStakingHistoriesResponse)
      adamant.global.v1.ListStakingHistoriesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListStakingHistoriesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListStakingHistoriesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              adamant.global.v1.ListStakingHistoriesResponse.class, adamant.global.v1.ListStakingHistoriesResponse.Builder.class);
    }

    // Construct using adamant.global.v1.ListStakingHistoriesResponse.newBuilder()
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
      if (stakingHistoriesBuilder_ == null) {
        stakingHistories_ = java.util.Collections.emptyList();
      } else {
        stakingHistories_ = null;
        stakingHistoriesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListStakingHistoriesResponse_descriptor;
    }

    @java.lang.Override
    public adamant.global.v1.ListStakingHistoriesResponse getDefaultInstanceForType() {
      return adamant.global.v1.ListStakingHistoriesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public adamant.global.v1.ListStakingHistoriesResponse build() {
      adamant.global.v1.ListStakingHistoriesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public adamant.global.v1.ListStakingHistoriesResponse buildPartial() {
      adamant.global.v1.ListStakingHistoriesResponse result = new adamant.global.v1.ListStakingHistoriesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(adamant.global.v1.ListStakingHistoriesResponse result) {
      if (stakingHistoriesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          stakingHistories_ = java.util.Collections.unmodifiableList(stakingHistories_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.stakingHistories_ = stakingHistories_;
      } else {
        result.stakingHistories_ = stakingHistoriesBuilder_.build();
      }
    }

    private void buildPartial0(adamant.global.v1.ListStakingHistoriesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof adamant.global.v1.ListStakingHistoriesResponse) {
        return mergeFrom((adamant.global.v1.ListStakingHistoriesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(adamant.global.v1.ListStakingHistoriesResponse other) {
      if (other == adamant.global.v1.ListStakingHistoriesResponse.getDefaultInstance()) return this;
      if (stakingHistoriesBuilder_ == null) {
        if (!other.stakingHistories_.isEmpty()) {
          if (stakingHistories_.isEmpty()) {
            stakingHistories_ = other.stakingHistories_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStakingHistoriesIsMutable();
            stakingHistories_.addAll(other.stakingHistories_);
          }
          onChanged();
        }
      } else {
        if (!other.stakingHistories_.isEmpty()) {
          if (stakingHistoriesBuilder_.isEmpty()) {
            stakingHistoriesBuilder_.dispose();
            stakingHistoriesBuilder_ = null;
            stakingHistories_ = other.stakingHistories_;
            bitField0_ = (bitField0_ & ~0x00000001);
            stakingHistoriesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStakingHistoriesFieldBuilder() : null;
          } else {
            stakingHistoriesBuilder_.addAllMessages(other.stakingHistories_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
              adamant.global.v1.Model.StakingHistory m =
                  input.readMessage(
                      adamant.global.v1.Model.StakingHistory.parser(),
                      extensionRegistry);
              if (stakingHistoriesBuilder_ == null) {
                ensureStakingHistoriesIsMutable();
                stakingHistories_.add(m);
              } else {
                stakingHistoriesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<adamant.global.v1.Model.StakingHistory> stakingHistories_ =
      java.util.Collections.emptyList();
    private void ensureStakingHistoriesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        stakingHistories_ = new java.util.ArrayList<adamant.global.v1.Model.StakingHistory>(stakingHistories_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        adamant.global.v1.Model.StakingHistory, adamant.global.v1.Model.StakingHistory.Builder, adamant.global.v1.Model.StakingHistoryOrBuilder> stakingHistoriesBuilder_;

    /**
     * <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
     */
    public java.util.List<adamant.global.v1.Model.StakingHistory> getStakingHistoriesList() {
      if (stakingHistoriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(stakingHistories_);
      } else {
        return stakingHistoriesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
     */
    public int getStakingHistoriesCount() {
      if (stakingHistoriesBuilder_ == null) {
        return stakingHistories_.size();
      } else {
        return stakingHistoriesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
     */
    public adamant.global.v1.Model.StakingHistory getStakingHistories(int index) {
      if (stakingHistoriesBuilder_ == null) {
        return stakingHistories_.get(index);
      } else {
        return stakingHistoriesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
     */
    public Builder setStakingHistories(
        int index, adamant.global.v1.Model.StakingHistory value) {
      if (stakingHistoriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStakingHistoriesIsMutable();
        stakingHistories_.set(index, value);
        onChanged();
      } else {
        stakingHistoriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
     */
    public Builder setStakingHistories(
        int index, adamant.global.v1.Model.StakingHistory.Builder builderForValue) {
      if (stakingHistoriesBuilder_ == null) {
        ensureStakingHistoriesIsMutable();
        stakingHistories_.set(index, builderForValue.build());
        onChanged();
      } else {
        stakingHistoriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
     */
    public Builder addStakingHistories(adamant.global.v1.Model.StakingHistory value) {
      if (stakingHistoriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStakingHistoriesIsMutable();
        stakingHistories_.add(value);
        onChanged();
      } else {
        stakingHistoriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
     */
    public Builder addStakingHistories(
        int index, adamant.global.v1.Model.StakingHistory value) {
      if (stakingHistoriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStakingHistoriesIsMutable();
        stakingHistories_.add(index, value);
        onChanged();
      } else {
        stakingHistoriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
     */
    public Builder addStakingHistories(
        adamant.global.v1.Model.StakingHistory.Builder builderForValue) {
      if (stakingHistoriesBuilder_ == null) {
        ensureStakingHistoriesIsMutable();
        stakingHistories_.add(builderForValue.build());
        onChanged();
      } else {
        stakingHistoriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
     */
    public Builder addStakingHistories(
        int index, adamant.global.v1.Model.StakingHistory.Builder builderForValue) {
      if (stakingHistoriesBuilder_ == null) {
        ensureStakingHistoriesIsMutable();
        stakingHistories_.add(index, builderForValue.build());
        onChanged();
      } else {
        stakingHistoriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
     */
    public Builder addAllStakingHistories(
        java.lang.Iterable<? extends adamant.global.v1.Model.StakingHistory> values) {
      if (stakingHistoriesBuilder_ == null) {
        ensureStakingHistoriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, stakingHistories_);
        onChanged();
      } else {
        stakingHistoriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
     */
    public Builder clearStakingHistories() {
      if (stakingHistoriesBuilder_ == null) {
        stakingHistories_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        stakingHistoriesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
     */
    public Builder removeStakingHistories(int index) {
      if (stakingHistoriesBuilder_ == null) {
        ensureStakingHistoriesIsMutable();
        stakingHistories_.remove(index);
        onChanged();
      } else {
        stakingHistoriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
     */
    public adamant.global.v1.Model.StakingHistory.Builder getStakingHistoriesBuilder(
        int index) {
      return getStakingHistoriesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
     */
    public adamant.global.v1.Model.StakingHistoryOrBuilder getStakingHistoriesOrBuilder(
        int index) {
      if (stakingHistoriesBuilder_ == null) {
        return stakingHistories_.get(index);  } else {
        return stakingHistoriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
     */
    public java.util.List<? extends adamant.global.v1.Model.StakingHistoryOrBuilder> 
         getStakingHistoriesOrBuilderList() {
      if (stakingHistoriesBuilder_ != null) {
        return stakingHistoriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(stakingHistories_);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
     */
    public adamant.global.v1.Model.StakingHistory.Builder addStakingHistoriesBuilder() {
      return getStakingHistoriesFieldBuilder().addBuilder(
          adamant.global.v1.Model.StakingHistory.getDefaultInstance());
    }
    /**
     * <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
     */
    public adamant.global.v1.Model.StakingHistory.Builder addStakingHistoriesBuilder(
        int index) {
      return getStakingHistoriesFieldBuilder().addBuilder(
          index, adamant.global.v1.Model.StakingHistory.getDefaultInstance());
    }
    /**
     * <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
     */
    public java.util.List<adamant.global.v1.Model.StakingHistory.Builder> 
         getStakingHistoriesBuilderList() {
      return getStakingHistoriesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        adamant.global.v1.Model.StakingHistory, adamant.global.v1.Model.StakingHistory.Builder, adamant.global.v1.Model.StakingHistoryOrBuilder> 
        getStakingHistoriesFieldBuilder() {
      if (stakingHistoriesBuilder_ == null) {
        stakingHistoriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            adamant.global.v1.Model.StakingHistory, adamant.global.v1.Model.StakingHistory.Builder, adamant.global.v1.Model.StakingHistoryOrBuilder>(
                stakingHistories_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        stakingHistories_ = null;
      }
      return stakingHistoriesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.ListStakingHistoriesResponse)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.ListStakingHistoriesResponse)
  private static final adamant.global.v1.ListStakingHistoriesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new adamant.global.v1.ListStakingHistoriesResponse();
  }

  public static adamant.global.v1.ListStakingHistoriesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListStakingHistoriesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListStakingHistoriesResponse>() {
    @java.lang.Override
    public ListStakingHistoriesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListStakingHistoriesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListStakingHistoriesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public adamant.global.v1.ListStakingHistoriesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
