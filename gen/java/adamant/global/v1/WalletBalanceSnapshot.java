// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/model.proto

package java.adamant.global.v1;

/**
 * <pre>
 * The model of wallet balance snapshot
 * </pre>
 *
 * Protobuf type {@code adamant.global.v1.WalletBalanceSnapshot}
 */
public final class WalletBalanceSnapshot extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.WalletBalanceSnapshot)
    WalletBalanceSnapshotOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WalletBalanceSnapshot.newBuilder() to construct.
  private WalletBalanceSnapshot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WalletBalanceSnapshot() {
    stringBalance_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WalletBalanceSnapshot();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WalletBalanceSnapshot(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (createTime_ != null) {
              subBuilder = createTime_.toBuilder();
            }
            createTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(createTime_);
              createTime_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            stringBalance_ = s;
            break;
          }
          case 25: {

            jpy_ = input.readDouble();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return java.adamant.global.v1.ModelProto.internal_static_adamant_global_v1_WalletBalanceSnapshot_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return java.adamant.global.v1.ModelProto.internal_static_adamant_global_v1_WalletBalanceSnapshot_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            java.adamant.global.v1.WalletBalanceSnapshot.class, java.adamant.global.v1.WalletBalanceSnapshot.Builder.class);
  }

  public static final int CREATE_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp createTime_;
  /**
   * <code>.google.protobuf.Timestamp create_time = 1 [json_name = "createTime"];</code>
   * @return Whether the createTime field is set.
   */
  @java.lang.Override
  public boolean hasCreateTime() {
    return createTime_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp create_time = 1 [json_name = "createTime"];</code>
   * @return The createTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreateTime() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }
  /**
   * <code>.google.protobuf.Timestamp create_time = 1 [json_name = "createTime"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
    return getCreateTime();
  }

  public static final int STRING_BALANCE_FIELD_NUMBER = 2;
  private volatile java.lang.Object stringBalance_;
  /**
   * <pre>
   * Wallet Balance
   * </pre>
   *
   * <code>string string_balance = 2 [json_name = "stringBalance"];</code>
   * @return The stringBalance.
   */
  @java.lang.Override
  public java.lang.String getStringBalance() {
    java.lang.Object ref = stringBalance_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stringBalance_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Wallet Balance
   * </pre>
   *
   * <code>string string_balance = 2 [json_name = "stringBalance"];</code>
   * @return The bytes for stringBalance.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStringBalanceBytes() {
    java.lang.Object ref = stringBalance_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stringBalance_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JPY_FIELD_NUMBER = 3;
  private double jpy_;
  /**
   * <pre>
   * JPY rate
   * </pre>
   *
   * <code>double jpy = 3 [json_name = "jpy"];</code>
   * @return The jpy.
   */
  @java.lang.Override
  public double getJpy() {
    return jpy_;
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
    if (createTime_ != null) {
      output.writeMessage(1, getCreateTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stringBalance_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, stringBalance_);
    }
    if (java.lang.Double.doubleToRawLongBits(jpy_) != 0) {
      output.writeDouble(3, jpy_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (createTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCreateTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stringBalance_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, stringBalance_);
    }
    if (java.lang.Double.doubleToRawLongBits(jpy_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, jpy_);
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
    if (!(obj instanceof java.adamant.global.v1.WalletBalanceSnapshot)) {
      return super.equals(obj);
    }
    java.adamant.global.v1.WalletBalanceSnapshot other = (java.adamant.global.v1.WalletBalanceSnapshot) obj;

    if (hasCreateTime() != other.hasCreateTime()) return false;
    if (hasCreateTime()) {
      if (!getCreateTime()
          .equals(other.getCreateTime())) return false;
    }
    if (!getStringBalance()
        .equals(other.getStringBalance())) return false;
    if (java.lang.Double.doubleToLongBits(getJpy())
        != java.lang.Double.doubleToLongBits(
            other.getJpy())) return false;
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
    if (hasCreateTime()) {
      hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
    }
    hash = (37 * hash) + STRING_BALANCE_FIELD_NUMBER;
    hash = (53 * hash) + getStringBalance().hashCode();
    hash = (37 * hash) + JPY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getJpy()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static java.adamant.global.v1.WalletBalanceSnapshot parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static java.adamant.global.v1.WalletBalanceSnapshot parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static java.adamant.global.v1.WalletBalanceSnapshot parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static java.adamant.global.v1.WalletBalanceSnapshot parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static java.adamant.global.v1.WalletBalanceSnapshot parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static java.adamant.global.v1.WalletBalanceSnapshot parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static java.adamant.global.v1.WalletBalanceSnapshot parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static java.adamant.global.v1.WalletBalanceSnapshot parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static java.adamant.global.v1.WalletBalanceSnapshot parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static java.adamant.global.v1.WalletBalanceSnapshot parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static java.adamant.global.v1.WalletBalanceSnapshot parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static java.adamant.global.v1.WalletBalanceSnapshot parseFrom(
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
  public static Builder newBuilder(java.adamant.global.v1.WalletBalanceSnapshot prototype) {
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
   * <pre>
   * The model of wallet balance snapshot
   * </pre>
   *
   * Protobuf type {@code adamant.global.v1.WalletBalanceSnapshot}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.WalletBalanceSnapshot)
      java.adamant.global.v1.WalletBalanceSnapshotOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return java.adamant.global.v1.ModelProto.internal_static_adamant_global_v1_WalletBalanceSnapshot_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return java.adamant.global.v1.ModelProto.internal_static_adamant_global_v1_WalletBalanceSnapshot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              java.adamant.global.v1.WalletBalanceSnapshot.class, java.adamant.global.v1.WalletBalanceSnapshot.Builder.class);
    }

    // Construct using java.adamant.global.v1.WalletBalanceSnapshot.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (createTimeBuilder_ == null) {
        createTime_ = null;
      } else {
        createTime_ = null;
        createTimeBuilder_ = null;
      }
      stringBalance_ = "";

      jpy_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return java.adamant.global.v1.ModelProto.internal_static_adamant_global_v1_WalletBalanceSnapshot_descriptor;
    }

    @java.lang.Override
    public java.adamant.global.v1.WalletBalanceSnapshot getDefaultInstanceForType() {
      return java.adamant.global.v1.WalletBalanceSnapshot.getDefaultInstance();
    }

    @java.lang.Override
    public java.adamant.global.v1.WalletBalanceSnapshot build() {
      java.adamant.global.v1.WalletBalanceSnapshot result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public java.adamant.global.v1.WalletBalanceSnapshot buildPartial() {
      java.adamant.global.v1.WalletBalanceSnapshot result = new java.adamant.global.v1.WalletBalanceSnapshot(this);
      if (createTimeBuilder_ == null) {
        result.createTime_ = createTime_;
      } else {
        result.createTime_ = createTimeBuilder_.build();
      }
      result.stringBalance_ = stringBalance_;
      result.jpy_ = jpy_;
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
      if (other instanceof java.adamant.global.v1.WalletBalanceSnapshot) {
        return mergeFrom((java.adamant.global.v1.WalletBalanceSnapshot)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(java.adamant.global.v1.WalletBalanceSnapshot other) {
      if (other == java.adamant.global.v1.WalletBalanceSnapshot.getDefaultInstance()) return this;
      if (other.hasCreateTime()) {
        mergeCreateTime(other.getCreateTime());
      }
      if (!other.getStringBalance().isEmpty()) {
        stringBalance_ = other.stringBalance_;
        onChanged();
      }
      if (other.getJpy() != 0D) {
        setJpy(other.getJpy());
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
      java.adamant.global.v1.WalletBalanceSnapshot parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (java.adamant.global.v1.WalletBalanceSnapshot) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Timestamp createTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createTimeBuilder_;
    /**
     * <code>.google.protobuf.Timestamp create_time = 1 [json_name = "createTime"];</code>
     * @return Whether the createTime field is set.
     */
    public boolean hasCreateTime() {
      return createTimeBuilder_ != null || createTime_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp create_time = 1 [json_name = "createTime"];</code>
     * @return The createTime.
     */
    public com.google.protobuf.Timestamp getCreateTime() {
      if (createTimeBuilder_ == null) {
        return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      } else {
        return createTimeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp create_time = 1 [json_name = "createTime"];</code>
     */
    public Builder setCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createTime_ = value;
        onChanged();
      } else {
        createTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp create_time = 1 [json_name = "createTime"];</code>
     */
    public Builder setCreateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createTimeBuilder_ == null) {
        createTime_ = builderForValue.build();
        onChanged();
      } else {
        createTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp create_time = 1 [json_name = "createTime"];</code>
     */
    public Builder mergeCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (createTime_ != null) {
          createTime_ =
            com.google.protobuf.Timestamp.newBuilder(createTime_).mergeFrom(value).buildPartial();
        } else {
          createTime_ = value;
        }
        onChanged();
      } else {
        createTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp create_time = 1 [json_name = "createTime"];</code>
     */
    public Builder clearCreateTime() {
      if (createTimeBuilder_ == null) {
        createTime_ = null;
        onChanged();
      } else {
        createTime_ = null;
        createTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp create_time = 1 [json_name = "createTime"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreateTimeBuilder() {
      
      onChanged();
      return getCreateTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp create_time = 1 [json_name = "createTime"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
      if (createTimeBuilder_ != null) {
        return createTimeBuilder_.getMessageOrBuilder();
      } else {
        return createTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp create_time = 1 [json_name = "createTime"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCreateTimeFieldBuilder() {
      if (createTimeBuilder_ == null) {
        createTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCreateTime(),
                getParentForChildren(),
                isClean());
        createTime_ = null;
      }
      return createTimeBuilder_;
    }

    private java.lang.Object stringBalance_ = "";
    /**
     * <pre>
     * Wallet Balance
     * </pre>
     *
     * <code>string string_balance = 2 [json_name = "stringBalance"];</code>
     * @return The stringBalance.
     */
    public java.lang.String getStringBalance() {
      java.lang.Object ref = stringBalance_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stringBalance_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Wallet Balance
     * </pre>
     *
     * <code>string string_balance = 2 [json_name = "stringBalance"];</code>
     * @return The bytes for stringBalance.
     */
    public com.google.protobuf.ByteString
        getStringBalanceBytes() {
      java.lang.Object ref = stringBalance_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stringBalance_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Wallet Balance
     * </pre>
     *
     * <code>string string_balance = 2 [json_name = "stringBalance"];</code>
     * @param value The stringBalance to set.
     * @return This builder for chaining.
     */
    public Builder setStringBalance(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stringBalance_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Wallet Balance
     * </pre>
     *
     * <code>string string_balance = 2 [json_name = "stringBalance"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStringBalance() {
      
      stringBalance_ = getDefaultInstance().getStringBalance();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Wallet Balance
     * </pre>
     *
     * <code>string string_balance = 2 [json_name = "stringBalance"];</code>
     * @param value The bytes for stringBalance to set.
     * @return This builder for chaining.
     */
    public Builder setStringBalanceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stringBalance_ = value;
      onChanged();
      return this;
    }

    private double jpy_ ;
    /**
     * <pre>
     * JPY rate
     * </pre>
     *
     * <code>double jpy = 3 [json_name = "jpy"];</code>
     * @return The jpy.
     */
    @java.lang.Override
    public double getJpy() {
      return jpy_;
    }
    /**
     * <pre>
     * JPY rate
     * </pre>
     *
     * <code>double jpy = 3 [json_name = "jpy"];</code>
     * @param value The jpy to set.
     * @return This builder for chaining.
     */
    public Builder setJpy(double value) {
      
      jpy_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * JPY rate
     * </pre>
     *
     * <code>double jpy = 3 [json_name = "jpy"];</code>
     * @return This builder for chaining.
     */
    public Builder clearJpy() {
      
      jpy_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.WalletBalanceSnapshot)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.WalletBalanceSnapshot)
  private static final java.adamant.global.v1.WalletBalanceSnapshot DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new java.adamant.global.v1.WalletBalanceSnapshot();
  }

  public static java.adamant.global.v1.WalletBalanceSnapshot getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WalletBalanceSnapshot>
      PARSER = new com.google.protobuf.AbstractParser<WalletBalanceSnapshot>() {
    @java.lang.Override
    public WalletBalanceSnapshot parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WalletBalanceSnapshot(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WalletBalanceSnapshot> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WalletBalanceSnapshot> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public java.adamant.global.v1.WalletBalanceSnapshot getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
