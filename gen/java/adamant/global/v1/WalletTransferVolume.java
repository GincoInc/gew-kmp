// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/model.proto

package java.adamant.global.v1;

/**
 * Protobuf type {@code adamant.global.v1.WalletTransferVolume}
 */
public final class WalletTransferVolume extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.WalletTransferVolume)
    WalletTransferVolumeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WalletTransferVolume.newBuilder() to construct.
  private WalletTransferVolume(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WalletTransferVolume() {
    stringVolume_ = "";
    stringJpyVolume_ = "";
    transferType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WalletTransferVolume();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WalletTransferVolume(
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
            java.lang.String s = input.readStringRequireUtf8();

            stringVolume_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            stringJpyVolume_ = s;
            break;
          }
          case 24: {

            number_ = input.readInt64();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            transferType_ = rawValue;
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
    return java.adamant.global.v1.ModelProto.internal_static_adamant_global_v1_WalletTransferVolume_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return java.adamant.global.v1.ModelProto.internal_static_adamant_global_v1_WalletTransferVolume_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            java.adamant.global.v1.WalletTransferVolume.class, java.adamant.global.v1.WalletTransferVolume.Builder.class);
  }

  public static final int STRING_VOLUME_FIELD_NUMBER = 1;
  private volatile java.lang.Object stringVolume_;
  /**
   * <pre>
   * coin volume
   * </pre>
   *
   * <code>string string_volume = 1 [json_name = "stringVolume"];</code>
   * @return The stringVolume.
   */
  @java.lang.Override
  public java.lang.String getStringVolume() {
    java.lang.Object ref = stringVolume_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stringVolume_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * coin volume
   * </pre>
   *
   * <code>string string_volume = 1 [json_name = "stringVolume"];</code>
   * @return The bytes for stringVolume.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStringVolumeBytes() {
    java.lang.Object ref = stringVolume_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stringVolume_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STRING_JPY_VOLUME_FIELD_NUMBER = 2;
  private volatile java.lang.Object stringJpyVolume_;
  /**
   * <pre>
   * hot volume
   * </pre>
   *
   * <code>string string_jpy_volume = 2 [json_name = "stringJpyVolume"];</code>
   * @return The stringJpyVolume.
   */
  @java.lang.Override
  public java.lang.String getStringJpyVolume() {
    java.lang.Object ref = stringJpyVolume_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stringJpyVolume_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * hot volume
   * </pre>
   *
   * <code>string string_jpy_volume = 2 [json_name = "stringJpyVolume"];</code>
   * @return The bytes for stringJpyVolume.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStringJpyVolumeBytes() {
    java.lang.Object ref = stringJpyVolume_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stringJpyVolume_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NUMBER_FIELD_NUMBER = 3;
  private long number_;
  /**
   * <pre>
   * transfer number volume
   * </pre>
   *
   * <code>int64 number = 3 [json_name = "number"];</code>
   * @return The number.
   */
  @java.lang.Override
  public long getNumber() {
    return number_;
  }

  public static final int TRANSFER_TYPE_FIELD_NUMBER = 4;
  private int transferType_;
  /**
   * <pre>
   * transfer type;
   * </pre>
   *
   * <code>.gincoinc.global.v1.TransferType transfer_type = 4 [json_name = "transferType"];</code>
   * @return The enum numeric value on the wire for transferType.
   */
  @java.lang.Override public int getTransferTypeValue() {
    return transferType_;
  }
  /**
   * <pre>
   * transfer type;
   * </pre>
   *
   * <code>.gincoinc.global.v1.TransferType transfer_type = 4 [json_name = "transferType"];</code>
   * @return The transferType.
   */
  @java.lang.Override public java.gincoinc.global.v1.TransferType getTransferType() {
    @SuppressWarnings("deprecation")
    java.gincoinc.global.v1.TransferType result = java.gincoinc.global.v1.TransferType.valueOf(transferType_);
    return result == null ? java.gincoinc.global.v1.TransferType.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stringVolume_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, stringVolume_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stringJpyVolume_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, stringJpyVolume_);
    }
    if (number_ != 0L) {
      output.writeInt64(3, number_);
    }
    if (transferType_ != java.gincoinc.global.v1.TransferType.TRANSFER_TYPE_INVALID.getNumber()) {
      output.writeEnum(4, transferType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stringVolume_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, stringVolume_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stringJpyVolume_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, stringJpyVolume_);
    }
    if (number_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, number_);
    }
    if (transferType_ != java.gincoinc.global.v1.TransferType.TRANSFER_TYPE_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, transferType_);
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
    if (!(obj instanceof java.adamant.global.v1.WalletTransferVolume)) {
      return super.equals(obj);
    }
    java.adamant.global.v1.WalletTransferVolume other = (java.adamant.global.v1.WalletTransferVolume) obj;

    if (!getStringVolume()
        .equals(other.getStringVolume())) return false;
    if (!getStringJpyVolume()
        .equals(other.getStringJpyVolume())) return false;
    if (getNumber()
        != other.getNumber()) return false;
    if (transferType_ != other.transferType_) return false;
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
    hash = (37 * hash) + STRING_VOLUME_FIELD_NUMBER;
    hash = (53 * hash) + getStringVolume().hashCode();
    hash = (37 * hash) + STRING_JPY_VOLUME_FIELD_NUMBER;
    hash = (53 * hash) + getStringJpyVolume().hashCode();
    hash = (37 * hash) + NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumber());
    hash = (37 * hash) + TRANSFER_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + transferType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static java.adamant.global.v1.WalletTransferVolume parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static java.adamant.global.v1.WalletTransferVolume parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static java.adamant.global.v1.WalletTransferVolume parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static java.adamant.global.v1.WalletTransferVolume parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static java.adamant.global.v1.WalletTransferVolume parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static java.adamant.global.v1.WalletTransferVolume parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static java.adamant.global.v1.WalletTransferVolume parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static java.adamant.global.v1.WalletTransferVolume parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static java.adamant.global.v1.WalletTransferVolume parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static java.adamant.global.v1.WalletTransferVolume parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static java.adamant.global.v1.WalletTransferVolume parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static java.adamant.global.v1.WalletTransferVolume parseFrom(
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
  public static Builder newBuilder(java.adamant.global.v1.WalletTransferVolume prototype) {
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
   * Protobuf type {@code adamant.global.v1.WalletTransferVolume}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.WalletTransferVolume)
      java.adamant.global.v1.WalletTransferVolumeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return java.adamant.global.v1.ModelProto.internal_static_adamant_global_v1_WalletTransferVolume_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return java.adamant.global.v1.ModelProto.internal_static_adamant_global_v1_WalletTransferVolume_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              java.adamant.global.v1.WalletTransferVolume.class, java.adamant.global.v1.WalletTransferVolume.Builder.class);
    }

    // Construct using java.adamant.global.v1.WalletTransferVolume.newBuilder()
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
      stringVolume_ = "";

      stringJpyVolume_ = "";

      number_ = 0L;

      transferType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return java.adamant.global.v1.ModelProto.internal_static_adamant_global_v1_WalletTransferVolume_descriptor;
    }

    @java.lang.Override
    public java.adamant.global.v1.WalletTransferVolume getDefaultInstanceForType() {
      return java.adamant.global.v1.WalletTransferVolume.getDefaultInstance();
    }

    @java.lang.Override
    public java.adamant.global.v1.WalletTransferVolume build() {
      java.adamant.global.v1.WalletTransferVolume result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public java.adamant.global.v1.WalletTransferVolume buildPartial() {
      java.adamant.global.v1.WalletTransferVolume result = new java.adamant.global.v1.WalletTransferVolume(this);
      result.stringVolume_ = stringVolume_;
      result.stringJpyVolume_ = stringJpyVolume_;
      result.number_ = number_;
      result.transferType_ = transferType_;
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
      if (other instanceof java.adamant.global.v1.WalletTransferVolume) {
        return mergeFrom((java.adamant.global.v1.WalletTransferVolume)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(java.adamant.global.v1.WalletTransferVolume other) {
      if (other == java.adamant.global.v1.WalletTransferVolume.getDefaultInstance()) return this;
      if (!other.getStringVolume().isEmpty()) {
        stringVolume_ = other.stringVolume_;
        onChanged();
      }
      if (!other.getStringJpyVolume().isEmpty()) {
        stringJpyVolume_ = other.stringJpyVolume_;
        onChanged();
      }
      if (other.getNumber() != 0L) {
        setNumber(other.getNumber());
      }
      if (other.transferType_ != 0) {
        setTransferTypeValue(other.getTransferTypeValue());
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
      java.adamant.global.v1.WalletTransferVolume parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (java.adamant.global.v1.WalletTransferVolume) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object stringVolume_ = "";
    /**
     * <pre>
     * coin volume
     * </pre>
     *
     * <code>string string_volume = 1 [json_name = "stringVolume"];</code>
     * @return The stringVolume.
     */
    public java.lang.String getStringVolume() {
      java.lang.Object ref = stringVolume_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stringVolume_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * coin volume
     * </pre>
     *
     * <code>string string_volume = 1 [json_name = "stringVolume"];</code>
     * @return The bytes for stringVolume.
     */
    public com.google.protobuf.ByteString
        getStringVolumeBytes() {
      java.lang.Object ref = stringVolume_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stringVolume_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * coin volume
     * </pre>
     *
     * <code>string string_volume = 1 [json_name = "stringVolume"];</code>
     * @param value The stringVolume to set.
     * @return This builder for chaining.
     */
    public Builder setStringVolume(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stringVolume_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * coin volume
     * </pre>
     *
     * <code>string string_volume = 1 [json_name = "stringVolume"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStringVolume() {
      
      stringVolume_ = getDefaultInstance().getStringVolume();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * coin volume
     * </pre>
     *
     * <code>string string_volume = 1 [json_name = "stringVolume"];</code>
     * @param value The bytes for stringVolume to set.
     * @return This builder for chaining.
     */
    public Builder setStringVolumeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stringVolume_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object stringJpyVolume_ = "";
    /**
     * <pre>
     * hot volume
     * </pre>
     *
     * <code>string string_jpy_volume = 2 [json_name = "stringJpyVolume"];</code>
     * @return The stringJpyVolume.
     */
    public java.lang.String getStringJpyVolume() {
      java.lang.Object ref = stringJpyVolume_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stringJpyVolume_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * hot volume
     * </pre>
     *
     * <code>string string_jpy_volume = 2 [json_name = "stringJpyVolume"];</code>
     * @return The bytes for stringJpyVolume.
     */
    public com.google.protobuf.ByteString
        getStringJpyVolumeBytes() {
      java.lang.Object ref = stringJpyVolume_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stringJpyVolume_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * hot volume
     * </pre>
     *
     * <code>string string_jpy_volume = 2 [json_name = "stringJpyVolume"];</code>
     * @param value The stringJpyVolume to set.
     * @return This builder for chaining.
     */
    public Builder setStringJpyVolume(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stringJpyVolume_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * hot volume
     * </pre>
     *
     * <code>string string_jpy_volume = 2 [json_name = "stringJpyVolume"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStringJpyVolume() {
      
      stringJpyVolume_ = getDefaultInstance().getStringJpyVolume();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * hot volume
     * </pre>
     *
     * <code>string string_jpy_volume = 2 [json_name = "stringJpyVolume"];</code>
     * @param value The bytes for stringJpyVolume to set.
     * @return This builder for chaining.
     */
    public Builder setStringJpyVolumeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stringJpyVolume_ = value;
      onChanged();
      return this;
    }

    private long number_ ;
    /**
     * <pre>
     * transfer number volume
     * </pre>
     *
     * <code>int64 number = 3 [json_name = "number"];</code>
     * @return The number.
     */
    @java.lang.Override
    public long getNumber() {
      return number_;
    }
    /**
     * <pre>
     * transfer number volume
     * </pre>
     *
     * <code>int64 number = 3 [json_name = "number"];</code>
     * @param value The number to set.
     * @return This builder for chaining.
     */
    public Builder setNumber(long value) {
      
      number_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * transfer number volume
     * </pre>
     *
     * <code>int64 number = 3 [json_name = "number"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNumber() {
      
      number_ = 0L;
      onChanged();
      return this;
    }

    private int transferType_ = 0;
    /**
     * <pre>
     * transfer type;
     * </pre>
     *
     * <code>.gincoinc.global.v1.TransferType transfer_type = 4 [json_name = "transferType"];</code>
     * @return The enum numeric value on the wire for transferType.
     */
    @java.lang.Override public int getTransferTypeValue() {
      return transferType_;
    }
    /**
     * <pre>
     * transfer type;
     * </pre>
     *
     * <code>.gincoinc.global.v1.TransferType transfer_type = 4 [json_name = "transferType"];</code>
     * @param value The enum numeric value on the wire for transferType to set.
     * @return This builder for chaining.
     */
    public Builder setTransferTypeValue(int value) {
      
      transferType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * transfer type;
     * </pre>
     *
     * <code>.gincoinc.global.v1.TransferType transfer_type = 4 [json_name = "transferType"];</code>
     * @return The transferType.
     */
    @java.lang.Override
    public java.gincoinc.global.v1.TransferType getTransferType() {
      @SuppressWarnings("deprecation")
      java.gincoinc.global.v1.TransferType result = java.gincoinc.global.v1.TransferType.valueOf(transferType_);
      return result == null ? java.gincoinc.global.v1.TransferType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * transfer type;
     * </pre>
     *
     * <code>.gincoinc.global.v1.TransferType transfer_type = 4 [json_name = "transferType"];</code>
     * @param value The transferType to set.
     * @return This builder for chaining.
     */
    public Builder setTransferType(java.gincoinc.global.v1.TransferType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      transferType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * transfer type;
     * </pre>
     *
     * <code>.gincoinc.global.v1.TransferType transfer_type = 4 [json_name = "transferType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTransferType() {
      
      transferType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.WalletTransferVolume)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.WalletTransferVolume)
  private static final java.adamant.global.v1.WalletTransferVolume DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new java.adamant.global.v1.WalletTransferVolume();
  }

  public static java.adamant.global.v1.WalletTransferVolume getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WalletTransferVolume>
      PARSER = new com.google.protobuf.AbstractParser<WalletTransferVolume>() {
    @java.lang.Override
    public WalletTransferVolume parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WalletTransferVolume(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WalletTransferVolume> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WalletTransferVolume> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public java.adamant.global.v1.WalletTransferVolume getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
