// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
 * Protobuf type {@code adamant.global.v1.ListWalletsResponse}
 */
public  final class ListWalletsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.ListWalletsResponse)
    ListWalletsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListWalletsResponse.newBuilder() to construct.
  private ListWalletsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListWalletsResponse() {
    wallets_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListWalletsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListWalletsResponse(
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
              wallets_ = new java.util.ArrayList<adamant.global.v1.Model.Wallet>();
              mutable_bitField0_ |= 0x00000001;
            }
            wallets_.add(
                input.readMessage(adamant.global.v1.Model.Wallet.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
        wallets_ = java.util.Collections.unmodifiableList(wallets_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListWalletsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListWalletsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            adamant.global.v1.ListWalletsResponse.class, adamant.global.v1.ListWalletsResponse.Builder.class);
  }

  public static final int WALLETS_FIELD_NUMBER = 1;
  private java.util.List<adamant.global.v1.Model.Wallet> wallets_;
  /**
   * <code>repeated .adamant.global.v1.Wallet wallets = 1;</code>
   */
  public java.util.List<adamant.global.v1.Model.Wallet> getWalletsList() {
    return wallets_;
  }
  /**
   * <code>repeated .adamant.global.v1.Wallet wallets = 1;</code>
   */
  public java.util.List<? extends adamant.global.v1.Model.WalletOrBuilder> 
      getWalletsOrBuilderList() {
    return wallets_;
  }
  /**
   * <code>repeated .adamant.global.v1.Wallet wallets = 1;</code>
   */
  public int getWalletsCount() {
    return wallets_.size();
  }
  /**
   * <code>repeated .adamant.global.v1.Wallet wallets = 1;</code>
   */
  public adamant.global.v1.Model.Wallet getWallets(int index) {
    return wallets_.get(index);
  }
  /**
   * <code>repeated .adamant.global.v1.Wallet wallets = 1;</code>
   */
  public adamant.global.v1.Model.WalletOrBuilder getWalletsOrBuilder(
      int index) {
    return wallets_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <code>string next_page_token = 2;</code>
   */
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
   * <code>string next_page_token = 2;</code>
   */
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
    for (int i = 0; i < wallets_.size(); i++) {
      output.writeMessage(1, wallets_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < wallets_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, wallets_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof adamant.global.v1.ListWalletsResponse)) {
      return super.equals(obj);
    }
    adamant.global.v1.ListWalletsResponse other = (adamant.global.v1.ListWalletsResponse) obj;

    if (!getWalletsList()
        .equals(other.getWalletsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getWalletsCount() > 0) {
      hash = (37 * hash) + WALLETS_FIELD_NUMBER;
      hash = (53 * hash) + getWalletsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static adamant.global.v1.ListWalletsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ListWalletsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ListWalletsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ListWalletsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ListWalletsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ListWalletsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ListWalletsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ListWalletsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.ListWalletsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ListWalletsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.ListWalletsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ListWalletsResponse parseFrom(
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
  public static Builder newBuilder(adamant.global.v1.ListWalletsResponse prototype) {
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
   * Protobuf type {@code adamant.global.v1.ListWalletsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.ListWalletsResponse)
      adamant.global.v1.ListWalletsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListWalletsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListWalletsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              adamant.global.v1.ListWalletsResponse.class, adamant.global.v1.ListWalletsResponse.Builder.class);
    }

    // Construct using adamant.global.v1.ListWalletsResponse.newBuilder()
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
        getWalletsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (walletsBuilder_ == null) {
        wallets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        walletsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListWalletsResponse_descriptor;
    }

    @java.lang.Override
    public adamant.global.v1.ListWalletsResponse getDefaultInstanceForType() {
      return adamant.global.v1.ListWalletsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public adamant.global.v1.ListWalletsResponse build() {
      adamant.global.v1.ListWalletsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public adamant.global.v1.ListWalletsResponse buildPartial() {
      adamant.global.v1.ListWalletsResponse result = new adamant.global.v1.ListWalletsResponse(this);
      int from_bitField0_ = bitField0_;
      if (walletsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          wallets_ = java.util.Collections.unmodifiableList(wallets_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.wallets_ = wallets_;
      } else {
        result.wallets_ = walletsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof adamant.global.v1.ListWalletsResponse) {
        return mergeFrom((adamant.global.v1.ListWalletsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(adamant.global.v1.ListWalletsResponse other) {
      if (other == adamant.global.v1.ListWalletsResponse.getDefaultInstance()) return this;
      if (walletsBuilder_ == null) {
        if (!other.wallets_.isEmpty()) {
          if (wallets_.isEmpty()) {
            wallets_ = other.wallets_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWalletsIsMutable();
            wallets_.addAll(other.wallets_);
          }
          onChanged();
        }
      } else {
        if (!other.wallets_.isEmpty()) {
          if (walletsBuilder_.isEmpty()) {
            walletsBuilder_.dispose();
            walletsBuilder_ = null;
            wallets_ = other.wallets_;
            bitField0_ = (bitField0_ & ~0x00000001);
            walletsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWalletsFieldBuilder() : null;
          } else {
            walletsBuilder_.addAllMessages(other.wallets_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      adamant.global.v1.ListWalletsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (adamant.global.v1.ListWalletsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<adamant.global.v1.Model.Wallet> wallets_ =
      java.util.Collections.emptyList();
    private void ensureWalletsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        wallets_ = new java.util.ArrayList<adamant.global.v1.Model.Wallet>(wallets_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        adamant.global.v1.Model.Wallet, adamant.global.v1.Model.Wallet.Builder, adamant.global.v1.Model.WalletOrBuilder> walletsBuilder_;

    /**
     * <code>repeated .adamant.global.v1.Wallet wallets = 1;</code>
     */
    public java.util.List<adamant.global.v1.Model.Wallet> getWalletsList() {
      if (walletsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(wallets_);
      } else {
        return walletsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .adamant.global.v1.Wallet wallets = 1;</code>
     */
    public int getWalletsCount() {
      if (walletsBuilder_ == null) {
        return wallets_.size();
      } else {
        return walletsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .adamant.global.v1.Wallet wallets = 1;</code>
     */
    public adamant.global.v1.Model.Wallet getWallets(int index) {
      if (walletsBuilder_ == null) {
        return wallets_.get(index);
      } else {
        return walletsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.Wallet wallets = 1;</code>
     */
    public Builder setWallets(
        int index, adamant.global.v1.Model.Wallet value) {
      if (walletsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWalletsIsMutable();
        wallets_.set(index, value);
        onChanged();
      } else {
        walletsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Wallet wallets = 1;</code>
     */
    public Builder setWallets(
        int index, adamant.global.v1.Model.Wallet.Builder builderForValue) {
      if (walletsBuilder_ == null) {
        ensureWalletsIsMutable();
        wallets_.set(index, builderForValue.build());
        onChanged();
      } else {
        walletsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Wallet wallets = 1;</code>
     */
    public Builder addWallets(adamant.global.v1.Model.Wallet value) {
      if (walletsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWalletsIsMutable();
        wallets_.add(value);
        onChanged();
      } else {
        walletsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Wallet wallets = 1;</code>
     */
    public Builder addWallets(
        int index, adamant.global.v1.Model.Wallet value) {
      if (walletsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWalletsIsMutable();
        wallets_.add(index, value);
        onChanged();
      } else {
        walletsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Wallet wallets = 1;</code>
     */
    public Builder addWallets(
        adamant.global.v1.Model.Wallet.Builder builderForValue) {
      if (walletsBuilder_ == null) {
        ensureWalletsIsMutable();
        wallets_.add(builderForValue.build());
        onChanged();
      } else {
        walletsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Wallet wallets = 1;</code>
     */
    public Builder addWallets(
        int index, adamant.global.v1.Model.Wallet.Builder builderForValue) {
      if (walletsBuilder_ == null) {
        ensureWalletsIsMutable();
        wallets_.add(index, builderForValue.build());
        onChanged();
      } else {
        walletsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Wallet wallets = 1;</code>
     */
    public Builder addAllWallets(
        java.lang.Iterable<? extends adamant.global.v1.Model.Wallet> values) {
      if (walletsBuilder_ == null) {
        ensureWalletsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, wallets_);
        onChanged();
      } else {
        walletsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Wallet wallets = 1;</code>
     */
    public Builder clearWallets() {
      if (walletsBuilder_ == null) {
        wallets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        walletsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Wallet wallets = 1;</code>
     */
    public Builder removeWallets(int index) {
      if (walletsBuilder_ == null) {
        ensureWalletsIsMutable();
        wallets_.remove(index);
        onChanged();
      } else {
        walletsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Wallet wallets = 1;</code>
     */
    public adamant.global.v1.Model.Wallet.Builder getWalletsBuilder(
        int index) {
      return getWalletsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .adamant.global.v1.Wallet wallets = 1;</code>
     */
    public adamant.global.v1.Model.WalletOrBuilder getWalletsOrBuilder(
        int index) {
      if (walletsBuilder_ == null) {
        return wallets_.get(index);  } else {
        return walletsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.Wallet wallets = 1;</code>
     */
    public java.util.List<? extends adamant.global.v1.Model.WalletOrBuilder> 
         getWalletsOrBuilderList() {
      if (walletsBuilder_ != null) {
        return walletsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(wallets_);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.Wallet wallets = 1;</code>
     */
    public adamant.global.v1.Model.Wallet.Builder addWalletsBuilder() {
      return getWalletsFieldBuilder().addBuilder(
          adamant.global.v1.Model.Wallet.getDefaultInstance());
    }
    /**
     * <code>repeated .adamant.global.v1.Wallet wallets = 1;</code>
     */
    public adamant.global.v1.Model.Wallet.Builder addWalletsBuilder(
        int index) {
      return getWalletsFieldBuilder().addBuilder(
          index, adamant.global.v1.Model.Wallet.getDefaultInstance());
    }
    /**
     * <code>repeated .adamant.global.v1.Wallet wallets = 1;</code>
     */
    public java.util.List<adamant.global.v1.Model.Wallet.Builder> 
         getWalletsBuilderList() {
      return getWalletsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        adamant.global.v1.Model.Wallet, adamant.global.v1.Model.Wallet.Builder, adamant.global.v1.Model.WalletOrBuilder> 
        getWalletsFieldBuilder() {
      if (walletsBuilder_ == null) {
        walletsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            adamant.global.v1.Model.Wallet, adamant.global.v1.Model.Wallet.Builder, adamant.global.v1.Model.WalletOrBuilder>(
                wallets_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        wallets_ = null;
      }
      return walletsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <code>string next_page_token = 2;</code>
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
     * <code>string next_page_token = 2;</code>
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
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.ListWalletsResponse)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.ListWalletsResponse)
  private static final adamant.global.v1.ListWalletsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new adamant.global.v1.ListWalletsResponse();
  }

  public static adamant.global.v1.ListWalletsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListWalletsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListWalletsResponse>() {
    @java.lang.Override
    public ListWalletsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListWalletsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListWalletsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListWalletsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public adamant.global.v1.ListWalletsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
