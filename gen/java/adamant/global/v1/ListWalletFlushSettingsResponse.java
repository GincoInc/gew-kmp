// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
 * Protobuf type {@code adamant.global.v1.ListWalletFlushSettingsResponse}
 */
public  final class ListWalletFlushSettingsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.ListWalletFlushSettingsResponse)
    ListWalletFlushSettingsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListWalletFlushSettingsResponse.newBuilder() to construct.
  private ListWalletFlushSettingsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListWalletFlushSettingsResponse() {
    walletFlushSettings_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListWalletFlushSettingsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListWalletFlushSettingsResponse(
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
              walletFlushSettings_ = new java.util.ArrayList<adamant.global.v1.Model.WalletFlushSetting>();
              mutable_bitField0_ |= 0x00000001;
            }
            walletFlushSettings_.add(
                input.readMessage(adamant.global.v1.Model.WalletFlushSetting.parser(), extensionRegistry));
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
        walletFlushSettings_ = java.util.Collections.unmodifiableList(walletFlushSettings_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListWalletFlushSettingsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListWalletFlushSettingsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            adamant.global.v1.ListWalletFlushSettingsResponse.class, adamant.global.v1.ListWalletFlushSettingsResponse.Builder.class);
  }

  public static final int WALLET_FLUSH_SETTINGS_FIELD_NUMBER = 1;
  private java.util.List<adamant.global.v1.Model.WalletFlushSetting> walletFlushSettings_;
  /**
   * <code>repeated .adamant.global.v1.WalletFlushSetting wallet_flush_settings = 1;</code>
   */
  public java.util.List<adamant.global.v1.Model.WalletFlushSetting> getWalletFlushSettingsList() {
    return walletFlushSettings_;
  }
  /**
   * <code>repeated .adamant.global.v1.WalletFlushSetting wallet_flush_settings = 1;</code>
   */
  public java.util.List<? extends adamant.global.v1.Model.WalletFlushSettingOrBuilder> 
      getWalletFlushSettingsOrBuilderList() {
    return walletFlushSettings_;
  }
  /**
   * <code>repeated .adamant.global.v1.WalletFlushSetting wallet_flush_settings = 1;</code>
   */
  public int getWalletFlushSettingsCount() {
    return walletFlushSettings_.size();
  }
  /**
   * <code>repeated .adamant.global.v1.WalletFlushSetting wallet_flush_settings = 1;</code>
   */
  public adamant.global.v1.Model.WalletFlushSetting getWalletFlushSettings(int index) {
    return walletFlushSettings_.get(index);
  }
  /**
   * <code>repeated .adamant.global.v1.WalletFlushSetting wallet_flush_settings = 1;</code>
   */
  public adamant.global.v1.Model.WalletFlushSettingOrBuilder getWalletFlushSettingsOrBuilder(
      int index) {
    return walletFlushSettings_.get(index);
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
    for (int i = 0; i < walletFlushSettings_.size(); i++) {
      output.writeMessage(1, walletFlushSettings_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < walletFlushSettings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, walletFlushSettings_.get(i));
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
    if (!(obj instanceof adamant.global.v1.ListWalletFlushSettingsResponse)) {
      return super.equals(obj);
    }
    adamant.global.v1.ListWalletFlushSettingsResponse other = (adamant.global.v1.ListWalletFlushSettingsResponse) obj;

    if (!getWalletFlushSettingsList()
        .equals(other.getWalletFlushSettingsList())) return false;
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
    if (getWalletFlushSettingsCount() > 0) {
      hash = (37 * hash) + WALLET_FLUSH_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getWalletFlushSettingsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static adamant.global.v1.ListWalletFlushSettingsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ListWalletFlushSettingsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ListWalletFlushSettingsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ListWalletFlushSettingsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ListWalletFlushSettingsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ListWalletFlushSettingsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ListWalletFlushSettingsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ListWalletFlushSettingsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.ListWalletFlushSettingsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ListWalletFlushSettingsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.ListWalletFlushSettingsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ListWalletFlushSettingsResponse parseFrom(
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
  public static Builder newBuilder(adamant.global.v1.ListWalletFlushSettingsResponse prototype) {
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
   * Protobuf type {@code adamant.global.v1.ListWalletFlushSettingsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.ListWalletFlushSettingsResponse)
      adamant.global.v1.ListWalletFlushSettingsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListWalletFlushSettingsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListWalletFlushSettingsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              adamant.global.v1.ListWalletFlushSettingsResponse.class, adamant.global.v1.ListWalletFlushSettingsResponse.Builder.class);
    }

    // Construct using adamant.global.v1.ListWalletFlushSettingsResponse.newBuilder()
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
        getWalletFlushSettingsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (walletFlushSettingsBuilder_ == null) {
        walletFlushSettings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        walletFlushSettingsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListWalletFlushSettingsResponse_descriptor;
    }

    @java.lang.Override
    public adamant.global.v1.ListWalletFlushSettingsResponse getDefaultInstanceForType() {
      return adamant.global.v1.ListWalletFlushSettingsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public adamant.global.v1.ListWalletFlushSettingsResponse build() {
      adamant.global.v1.ListWalletFlushSettingsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public adamant.global.v1.ListWalletFlushSettingsResponse buildPartial() {
      adamant.global.v1.ListWalletFlushSettingsResponse result = new adamant.global.v1.ListWalletFlushSettingsResponse(this);
      int from_bitField0_ = bitField0_;
      if (walletFlushSettingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          walletFlushSettings_ = java.util.Collections.unmodifiableList(walletFlushSettings_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.walletFlushSettings_ = walletFlushSettings_;
      } else {
        result.walletFlushSettings_ = walletFlushSettingsBuilder_.build();
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
      if (other instanceof adamant.global.v1.ListWalletFlushSettingsResponse) {
        return mergeFrom((adamant.global.v1.ListWalletFlushSettingsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(adamant.global.v1.ListWalletFlushSettingsResponse other) {
      if (other == adamant.global.v1.ListWalletFlushSettingsResponse.getDefaultInstance()) return this;
      if (walletFlushSettingsBuilder_ == null) {
        if (!other.walletFlushSettings_.isEmpty()) {
          if (walletFlushSettings_.isEmpty()) {
            walletFlushSettings_ = other.walletFlushSettings_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWalletFlushSettingsIsMutable();
            walletFlushSettings_.addAll(other.walletFlushSettings_);
          }
          onChanged();
        }
      } else {
        if (!other.walletFlushSettings_.isEmpty()) {
          if (walletFlushSettingsBuilder_.isEmpty()) {
            walletFlushSettingsBuilder_.dispose();
            walletFlushSettingsBuilder_ = null;
            walletFlushSettings_ = other.walletFlushSettings_;
            bitField0_ = (bitField0_ & ~0x00000001);
            walletFlushSettingsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWalletFlushSettingsFieldBuilder() : null;
          } else {
            walletFlushSettingsBuilder_.addAllMessages(other.walletFlushSettings_);
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
      adamant.global.v1.ListWalletFlushSettingsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (adamant.global.v1.ListWalletFlushSettingsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<adamant.global.v1.Model.WalletFlushSetting> walletFlushSettings_ =
      java.util.Collections.emptyList();
    private void ensureWalletFlushSettingsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        walletFlushSettings_ = new java.util.ArrayList<adamant.global.v1.Model.WalletFlushSetting>(walletFlushSettings_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        adamant.global.v1.Model.WalletFlushSetting, adamant.global.v1.Model.WalletFlushSetting.Builder, adamant.global.v1.Model.WalletFlushSettingOrBuilder> walletFlushSettingsBuilder_;

    /**
     * <code>repeated .adamant.global.v1.WalletFlushSetting wallet_flush_settings = 1;</code>
     */
    public java.util.List<adamant.global.v1.Model.WalletFlushSetting> getWalletFlushSettingsList() {
      if (walletFlushSettingsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(walletFlushSettings_);
      } else {
        return walletFlushSettingsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .adamant.global.v1.WalletFlushSetting wallet_flush_settings = 1;</code>
     */
    public int getWalletFlushSettingsCount() {
      if (walletFlushSettingsBuilder_ == null) {
        return walletFlushSettings_.size();
      } else {
        return walletFlushSettingsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .adamant.global.v1.WalletFlushSetting wallet_flush_settings = 1;</code>
     */
    public adamant.global.v1.Model.WalletFlushSetting getWalletFlushSettings(int index) {
      if (walletFlushSettingsBuilder_ == null) {
        return walletFlushSettings_.get(index);
      } else {
        return walletFlushSettingsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.WalletFlushSetting wallet_flush_settings = 1;</code>
     */
    public Builder setWalletFlushSettings(
        int index, adamant.global.v1.Model.WalletFlushSetting value) {
      if (walletFlushSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWalletFlushSettingsIsMutable();
        walletFlushSettings_.set(index, value);
        onChanged();
      } else {
        walletFlushSettingsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.WalletFlushSetting wallet_flush_settings = 1;</code>
     */
    public Builder setWalletFlushSettings(
        int index, adamant.global.v1.Model.WalletFlushSetting.Builder builderForValue) {
      if (walletFlushSettingsBuilder_ == null) {
        ensureWalletFlushSettingsIsMutable();
        walletFlushSettings_.set(index, builderForValue.build());
        onChanged();
      } else {
        walletFlushSettingsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.WalletFlushSetting wallet_flush_settings = 1;</code>
     */
    public Builder addWalletFlushSettings(adamant.global.v1.Model.WalletFlushSetting value) {
      if (walletFlushSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWalletFlushSettingsIsMutable();
        walletFlushSettings_.add(value);
        onChanged();
      } else {
        walletFlushSettingsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.WalletFlushSetting wallet_flush_settings = 1;</code>
     */
    public Builder addWalletFlushSettings(
        int index, adamant.global.v1.Model.WalletFlushSetting value) {
      if (walletFlushSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWalletFlushSettingsIsMutable();
        walletFlushSettings_.add(index, value);
        onChanged();
      } else {
        walletFlushSettingsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.WalletFlushSetting wallet_flush_settings = 1;</code>
     */
    public Builder addWalletFlushSettings(
        adamant.global.v1.Model.WalletFlushSetting.Builder builderForValue) {
      if (walletFlushSettingsBuilder_ == null) {
        ensureWalletFlushSettingsIsMutable();
        walletFlushSettings_.add(builderForValue.build());
        onChanged();
      } else {
        walletFlushSettingsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.WalletFlushSetting wallet_flush_settings = 1;</code>
     */
    public Builder addWalletFlushSettings(
        int index, adamant.global.v1.Model.WalletFlushSetting.Builder builderForValue) {
      if (walletFlushSettingsBuilder_ == null) {
        ensureWalletFlushSettingsIsMutable();
        walletFlushSettings_.add(index, builderForValue.build());
        onChanged();
      } else {
        walletFlushSettingsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.WalletFlushSetting wallet_flush_settings = 1;</code>
     */
    public Builder addAllWalletFlushSettings(
        java.lang.Iterable<? extends adamant.global.v1.Model.WalletFlushSetting> values) {
      if (walletFlushSettingsBuilder_ == null) {
        ensureWalletFlushSettingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, walletFlushSettings_);
        onChanged();
      } else {
        walletFlushSettingsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.WalletFlushSetting wallet_flush_settings = 1;</code>
     */
    public Builder clearWalletFlushSettings() {
      if (walletFlushSettingsBuilder_ == null) {
        walletFlushSettings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        walletFlushSettingsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.WalletFlushSetting wallet_flush_settings = 1;</code>
     */
    public Builder removeWalletFlushSettings(int index) {
      if (walletFlushSettingsBuilder_ == null) {
        ensureWalletFlushSettingsIsMutable();
        walletFlushSettings_.remove(index);
        onChanged();
      } else {
        walletFlushSettingsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.WalletFlushSetting wallet_flush_settings = 1;</code>
     */
    public adamant.global.v1.Model.WalletFlushSetting.Builder getWalletFlushSettingsBuilder(
        int index) {
      return getWalletFlushSettingsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .adamant.global.v1.WalletFlushSetting wallet_flush_settings = 1;</code>
     */
    public adamant.global.v1.Model.WalletFlushSettingOrBuilder getWalletFlushSettingsOrBuilder(
        int index) {
      if (walletFlushSettingsBuilder_ == null) {
        return walletFlushSettings_.get(index);  } else {
        return walletFlushSettingsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.WalletFlushSetting wallet_flush_settings = 1;</code>
     */
    public java.util.List<? extends adamant.global.v1.Model.WalletFlushSettingOrBuilder> 
         getWalletFlushSettingsOrBuilderList() {
      if (walletFlushSettingsBuilder_ != null) {
        return walletFlushSettingsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(walletFlushSettings_);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.WalletFlushSetting wallet_flush_settings = 1;</code>
     */
    public adamant.global.v1.Model.WalletFlushSetting.Builder addWalletFlushSettingsBuilder() {
      return getWalletFlushSettingsFieldBuilder().addBuilder(
          adamant.global.v1.Model.WalletFlushSetting.getDefaultInstance());
    }
    /**
     * <code>repeated .adamant.global.v1.WalletFlushSetting wallet_flush_settings = 1;</code>
     */
    public adamant.global.v1.Model.WalletFlushSetting.Builder addWalletFlushSettingsBuilder(
        int index) {
      return getWalletFlushSettingsFieldBuilder().addBuilder(
          index, adamant.global.v1.Model.WalletFlushSetting.getDefaultInstance());
    }
    /**
     * <code>repeated .adamant.global.v1.WalletFlushSetting wallet_flush_settings = 1;</code>
     */
    public java.util.List<adamant.global.v1.Model.WalletFlushSetting.Builder> 
         getWalletFlushSettingsBuilderList() {
      return getWalletFlushSettingsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        adamant.global.v1.Model.WalletFlushSetting, adamant.global.v1.Model.WalletFlushSetting.Builder, adamant.global.v1.Model.WalletFlushSettingOrBuilder> 
        getWalletFlushSettingsFieldBuilder() {
      if (walletFlushSettingsBuilder_ == null) {
        walletFlushSettingsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            adamant.global.v1.Model.WalletFlushSetting, adamant.global.v1.Model.WalletFlushSetting.Builder, adamant.global.v1.Model.WalletFlushSettingOrBuilder>(
                walletFlushSettings_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        walletFlushSettings_ = null;
      }
      return walletFlushSettingsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.ListWalletFlushSettingsResponse)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.ListWalletFlushSettingsResponse)
  private static final adamant.global.v1.ListWalletFlushSettingsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new adamant.global.v1.ListWalletFlushSettingsResponse();
  }

  public static adamant.global.v1.ListWalletFlushSettingsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListWalletFlushSettingsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListWalletFlushSettingsResponse>() {
    @java.lang.Override
    public ListWalletFlushSettingsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListWalletFlushSettingsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListWalletFlushSettingsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListWalletFlushSettingsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public adamant.global.v1.ListWalletFlushSettingsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
