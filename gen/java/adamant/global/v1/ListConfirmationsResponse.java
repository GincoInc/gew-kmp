// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
 * Protobuf type {@code adamant.global.v1.ListConfirmationsResponse}
 */
public  final class ListConfirmationsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.ListConfirmationsResponse)
    ListConfirmationsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListConfirmationsResponse.newBuilder() to construct.
  private ListConfirmationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListConfirmationsResponse() {
    confirmations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListConfirmationsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListConfirmationsResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              confirmations_ = new java.util.ArrayList<adamant.global.v1.Model.Confirmation>();
              mutable_bitField0_ |= 0x00000001;
            }
            confirmations_.add(
                input.readMessage(adamant.global.v1.Model.Confirmation.parser(), extensionRegistry));
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
        confirmations_ = java.util.Collections.unmodifiableList(confirmations_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListConfirmationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListConfirmationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            adamant.global.v1.ListConfirmationsResponse.class, adamant.global.v1.ListConfirmationsResponse.Builder.class);
  }

  public static final int CONFIRMATIONS_FIELD_NUMBER = 1;
  private java.util.List<adamant.global.v1.Model.Confirmation> confirmations_;
  /**
   * <code>repeated .adamant.global.v1.Confirmation confirmations = 1;</code>
   */
  public java.util.List<adamant.global.v1.Model.Confirmation> getConfirmationsList() {
    return confirmations_;
  }
  /**
   * <code>repeated .adamant.global.v1.Confirmation confirmations = 1;</code>
   */
  public java.util.List<? extends adamant.global.v1.Model.ConfirmationOrBuilder> 
      getConfirmationsOrBuilderList() {
    return confirmations_;
  }
  /**
   * <code>repeated .adamant.global.v1.Confirmation confirmations = 1;</code>
   */
  public int getConfirmationsCount() {
    return confirmations_.size();
  }
  /**
   * <code>repeated .adamant.global.v1.Confirmation confirmations = 1;</code>
   */
  public adamant.global.v1.Model.Confirmation getConfirmations(int index) {
    return confirmations_.get(index);
  }
  /**
   * <code>repeated .adamant.global.v1.Confirmation confirmations = 1;</code>
   */
  public adamant.global.v1.Model.ConfirmationOrBuilder getConfirmationsOrBuilder(
      int index) {
    return confirmations_.get(index);
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
    for (int i = 0; i < confirmations_.size(); i++) {
      output.writeMessage(1, confirmations_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < confirmations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, confirmations_.get(i));
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
    if (!(obj instanceof adamant.global.v1.ListConfirmationsResponse)) {
      return super.equals(obj);
    }
    adamant.global.v1.ListConfirmationsResponse other = (adamant.global.v1.ListConfirmationsResponse) obj;

    if (!getConfirmationsList()
        .equals(other.getConfirmationsList())) return false;
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
    if (getConfirmationsCount() > 0) {
      hash = (37 * hash) + CONFIRMATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getConfirmationsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static adamant.global.v1.ListConfirmationsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ListConfirmationsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ListConfirmationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ListConfirmationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ListConfirmationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ListConfirmationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ListConfirmationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ListConfirmationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.ListConfirmationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ListConfirmationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.ListConfirmationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ListConfirmationsResponse parseFrom(
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
  public static Builder newBuilder(adamant.global.v1.ListConfirmationsResponse prototype) {
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
   * Protobuf type {@code adamant.global.v1.ListConfirmationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.ListConfirmationsResponse)
      adamant.global.v1.ListConfirmationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListConfirmationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListConfirmationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              adamant.global.v1.ListConfirmationsResponse.class, adamant.global.v1.ListConfirmationsResponse.Builder.class);
    }

    // Construct using adamant.global.v1.ListConfirmationsResponse.newBuilder()
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
        getConfirmationsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (confirmationsBuilder_ == null) {
        confirmations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        confirmationsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListConfirmationsResponse_descriptor;
    }

    @java.lang.Override
    public adamant.global.v1.ListConfirmationsResponse getDefaultInstanceForType() {
      return adamant.global.v1.ListConfirmationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public adamant.global.v1.ListConfirmationsResponse build() {
      adamant.global.v1.ListConfirmationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public adamant.global.v1.ListConfirmationsResponse buildPartial() {
      adamant.global.v1.ListConfirmationsResponse result = new adamant.global.v1.ListConfirmationsResponse(this);
      int from_bitField0_ = bitField0_;
      if (confirmationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          confirmations_ = java.util.Collections.unmodifiableList(confirmations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.confirmations_ = confirmations_;
      } else {
        result.confirmations_ = confirmationsBuilder_.build();
      }
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
      if (other instanceof adamant.global.v1.ListConfirmationsResponse) {
        return mergeFrom((adamant.global.v1.ListConfirmationsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(adamant.global.v1.ListConfirmationsResponse other) {
      if (other == adamant.global.v1.ListConfirmationsResponse.getDefaultInstance()) return this;
      if (confirmationsBuilder_ == null) {
        if (!other.confirmations_.isEmpty()) {
          if (confirmations_.isEmpty()) {
            confirmations_ = other.confirmations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConfirmationsIsMutable();
            confirmations_.addAll(other.confirmations_);
          }
          onChanged();
        }
      } else {
        if (!other.confirmations_.isEmpty()) {
          if (confirmationsBuilder_.isEmpty()) {
            confirmationsBuilder_.dispose();
            confirmationsBuilder_ = null;
            confirmations_ = other.confirmations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            confirmationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getConfirmationsFieldBuilder() : null;
          } else {
            confirmationsBuilder_.addAllMessages(other.confirmations_);
          }
        }
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
      adamant.global.v1.ListConfirmationsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (adamant.global.v1.ListConfirmationsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<adamant.global.v1.Model.Confirmation> confirmations_ =
      java.util.Collections.emptyList();
    private void ensureConfirmationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        confirmations_ = new java.util.ArrayList<adamant.global.v1.Model.Confirmation>(confirmations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        adamant.global.v1.Model.Confirmation, adamant.global.v1.Model.Confirmation.Builder, adamant.global.v1.Model.ConfirmationOrBuilder> confirmationsBuilder_;

    /**
     * <code>repeated .adamant.global.v1.Confirmation confirmations = 1;</code>
     */
    public java.util.List<adamant.global.v1.Model.Confirmation> getConfirmationsList() {
      if (confirmationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(confirmations_);
      } else {
        return confirmationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .adamant.global.v1.Confirmation confirmations = 1;</code>
     */
    public int getConfirmationsCount() {
      if (confirmationsBuilder_ == null) {
        return confirmations_.size();
      } else {
        return confirmationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .adamant.global.v1.Confirmation confirmations = 1;</code>
     */
    public adamant.global.v1.Model.Confirmation getConfirmations(int index) {
      if (confirmationsBuilder_ == null) {
        return confirmations_.get(index);
      } else {
        return confirmationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.Confirmation confirmations = 1;</code>
     */
    public Builder setConfirmations(
        int index, adamant.global.v1.Model.Confirmation value) {
      if (confirmationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConfirmationsIsMutable();
        confirmations_.set(index, value);
        onChanged();
      } else {
        confirmationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Confirmation confirmations = 1;</code>
     */
    public Builder setConfirmations(
        int index, adamant.global.v1.Model.Confirmation.Builder builderForValue) {
      if (confirmationsBuilder_ == null) {
        ensureConfirmationsIsMutable();
        confirmations_.set(index, builderForValue.build());
        onChanged();
      } else {
        confirmationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Confirmation confirmations = 1;</code>
     */
    public Builder addConfirmations(adamant.global.v1.Model.Confirmation value) {
      if (confirmationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConfirmationsIsMutable();
        confirmations_.add(value);
        onChanged();
      } else {
        confirmationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Confirmation confirmations = 1;</code>
     */
    public Builder addConfirmations(
        int index, adamant.global.v1.Model.Confirmation value) {
      if (confirmationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConfirmationsIsMutable();
        confirmations_.add(index, value);
        onChanged();
      } else {
        confirmationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Confirmation confirmations = 1;</code>
     */
    public Builder addConfirmations(
        adamant.global.v1.Model.Confirmation.Builder builderForValue) {
      if (confirmationsBuilder_ == null) {
        ensureConfirmationsIsMutable();
        confirmations_.add(builderForValue.build());
        onChanged();
      } else {
        confirmationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Confirmation confirmations = 1;</code>
     */
    public Builder addConfirmations(
        int index, adamant.global.v1.Model.Confirmation.Builder builderForValue) {
      if (confirmationsBuilder_ == null) {
        ensureConfirmationsIsMutable();
        confirmations_.add(index, builderForValue.build());
        onChanged();
      } else {
        confirmationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Confirmation confirmations = 1;</code>
     */
    public Builder addAllConfirmations(
        java.lang.Iterable<? extends adamant.global.v1.Model.Confirmation> values) {
      if (confirmationsBuilder_ == null) {
        ensureConfirmationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, confirmations_);
        onChanged();
      } else {
        confirmationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Confirmation confirmations = 1;</code>
     */
    public Builder clearConfirmations() {
      if (confirmationsBuilder_ == null) {
        confirmations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        confirmationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Confirmation confirmations = 1;</code>
     */
    public Builder removeConfirmations(int index) {
      if (confirmationsBuilder_ == null) {
        ensureConfirmationsIsMutable();
        confirmations_.remove(index);
        onChanged();
      } else {
        confirmationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Confirmation confirmations = 1;</code>
     */
    public adamant.global.v1.Model.Confirmation.Builder getConfirmationsBuilder(
        int index) {
      return getConfirmationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .adamant.global.v1.Confirmation confirmations = 1;</code>
     */
    public adamant.global.v1.Model.ConfirmationOrBuilder getConfirmationsOrBuilder(
        int index) {
      if (confirmationsBuilder_ == null) {
        return confirmations_.get(index);  } else {
        return confirmationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.Confirmation confirmations = 1;</code>
     */
    public java.util.List<? extends adamant.global.v1.Model.ConfirmationOrBuilder> 
         getConfirmationsOrBuilderList() {
      if (confirmationsBuilder_ != null) {
        return confirmationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(confirmations_);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.Confirmation confirmations = 1;</code>
     */
    public adamant.global.v1.Model.Confirmation.Builder addConfirmationsBuilder() {
      return getConfirmationsFieldBuilder().addBuilder(
          adamant.global.v1.Model.Confirmation.getDefaultInstance());
    }
    /**
     * <code>repeated .adamant.global.v1.Confirmation confirmations = 1;</code>
     */
    public adamant.global.v1.Model.Confirmation.Builder addConfirmationsBuilder(
        int index) {
      return getConfirmationsFieldBuilder().addBuilder(
          index, adamant.global.v1.Model.Confirmation.getDefaultInstance());
    }
    /**
     * <code>repeated .adamant.global.v1.Confirmation confirmations = 1;</code>
     */
    public java.util.List<adamant.global.v1.Model.Confirmation.Builder> 
         getConfirmationsBuilderList() {
      return getConfirmationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        adamant.global.v1.Model.Confirmation, adamant.global.v1.Model.Confirmation.Builder, adamant.global.v1.Model.ConfirmationOrBuilder> 
        getConfirmationsFieldBuilder() {
      if (confirmationsBuilder_ == null) {
        confirmationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            adamant.global.v1.Model.Confirmation, adamant.global.v1.Model.Confirmation.Builder, adamant.global.v1.Model.ConfirmationOrBuilder>(
                confirmations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        confirmations_ = null;
      }
      return confirmationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.ListConfirmationsResponse)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.ListConfirmationsResponse)
  private static final adamant.global.v1.ListConfirmationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new adamant.global.v1.ListConfirmationsResponse();
  }

  public static adamant.global.v1.ListConfirmationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListConfirmationsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListConfirmationsResponse>() {
    @java.lang.Override
    public ListConfirmationsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListConfirmationsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListConfirmationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListConfirmationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public adamant.global.v1.ListConfirmationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
