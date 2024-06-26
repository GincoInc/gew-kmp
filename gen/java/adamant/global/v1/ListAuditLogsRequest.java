// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
 * Protobuf type {@code adamant.global.v1.ListAuditLogsRequest}
 */
public final class ListAuditLogsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.ListAuditLogsRequest)
    ListAuditLogsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAuditLogsRequest.newBuilder() to construct.
  private ListAuditLogsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAuditLogsRequest() {
    auditLogGroup_ = 0;
    accountId_ = "";
    pageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAuditLogsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListAuditLogsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListAuditLogsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            adamant.global.v1.ListAuditLogsRequest.class, adamant.global.v1.ListAuditLogsRequest.Builder.class);
  }

  public static final int AUDIT_LOG_GROUP_FIELD_NUMBER = 1;
  private int auditLogGroup_ = 0;
  /**
   * <code>.adamant.global.v1.AuditLogGroup audit_log_group = 1 [json_name = "auditLogGroup"];</code>
   * @return The enum numeric value on the wire for auditLogGroup.
   */
  @java.lang.Override public int getAuditLogGroupValue() {
    return auditLogGroup_;
  }
  /**
   * <code>.adamant.global.v1.AuditLogGroup audit_log_group = 1 [json_name = "auditLogGroup"];</code>
   * @return The auditLogGroup.
   */
  @java.lang.Override public adamant.global.v1.Enum.AuditLogGroup getAuditLogGroup() {
    adamant.global.v1.Enum.AuditLogGroup result = adamant.global.v1.Enum.AuditLogGroup.forNumber(auditLogGroup_);
    return result == null ? adamant.global.v1.Enum.AuditLogGroup.UNRECOGNIZED : result;
  }

  public static final int ACCOUNT_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object accountId_ = "";
  /**
   * <code>string account_id = 2 [json_name = "accountId", (.validate.rules) = { ... }</code>
   * @return The accountId.
   */
  @java.lang.Override
  public java.lang.String getAccountId() {
    java.lang.Object ref = accountId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accountId_ = s;
      return s;
    }
  }
  /**
   * <code>string account_id = 2 [json_name = "accountId", (.validate.rules) = { ... }</code>
   * @return The bytes for accountId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAccountIdBytes() {
    java.lang.Object ref = accountId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      accountId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 3;
  private int pageSize_ = 0;
  /**
   * <code>uint32 page_size = 3 [json_name = "pageSize", (.validate.rules) = { ... }</code>
   * @return The pageSize.
   */
  @java.lang.Override
  public int getPageSize() {
    return pageSize_;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object pageToken_ = "";
  /**
   * <code>string page_token = 4 [json_name = "pageToken", (.validate.rules) = { ... }</code>
   * @return The pageToken.
   */
  @java.lang.Override
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   * <code>string page_token = 4 [json_name = "pageToken", (.validate.rules) = { ... }</code>
   * @return The bytes for pageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pageToken_ = b;
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
    if (auditLogGroup_ != adamant.global.v1.Enum.AuditLogGroup.AUDIT_LOG_GROUP_INVALID.getNumber()) {
      output.writeEnum(1, auditLogGroup_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accountId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, accountId_);
    }
    if (pageSize_ != 0) {
      output.writeUInt32(3, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, pageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (auditLogGroup_ != adamant.global.v1.Enum.AuditLogGroup.AUDIT_LOG_GROUP_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, auditLogGroup_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accountId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, accountId_);
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, pageToken_);
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
    if (!(obj instanceof adamant.global.v1.ListAuditLogsRequest)) {
      return super.equals(obj);
    }
    adamant.global.v1.ListAuditLogsRequest other = (adamant.global.v1.ListAuditLogsRequest) obj;

    if (auditLogGroup_ != other.auditLogGroup_) return false;
    if (!getAccountId()
        .equals(other.getAccountId())) return false;
    if (getPageSize()
        != other.getPageSize()) return false;
    if (!getPageToken()
        .equals(other.getPageToken())) return false;
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
    hash = (37 * hash) + AUDIT_LOG_GROUP_FIELD_NUMBER;
    hash = (53 * hash) + auditLogGroup_;
    hash = (37 * hash) + ACCOUNT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAccountId().hashCode();
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static adamant.global.v1.ListAuditLogsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ListAuditLogsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ListAuditLogsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ListAuditLogsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ListAuditLogsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ListAuditLogsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ListAuditLogsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ListAuditLogsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static adamant.global.v1.ListAuditLogsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static adamant.global.v1.ListAuditLogsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.ListAuditLogsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ListAuditLogsRequest parseFrom(
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
  public static Builder newBuilder(adamant.global.v1.ListAuditLogsRequest prototype) {
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
   * Protobuf type {@code adamant.global.v1.ListAuditLogsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.ListAuditLogsRequest)
      adamant.global.v1.ListAuditLogsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListAuditLogsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListAuditLogsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              adamant.global.v1.ListAuditLogsRequest.class, adamant.global.v1.ListAuditLogsRequest.Builder.class);
    }

    // Construct using adamant.global.v1.ListAuditLogsRequest.newBuilder()
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
      auditLogGroup_ = 0;
      accountId_ = "";
      pageSize_ = 0;
      pageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListAuditLogsRequest_descriptor;
    }

    @java.lang.Override
    public adamant.global.v1.ListAuditLogsRequest getDefaultInstanceForType() {
      return adamant.global.v1.ListAuditLogsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public adamant.global.v1.ListAuditLogsRequest build() {
      adamant.global.v1.ListAuditLogsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public adamant.global.v1.ListAuditLogsRequest buildPartial() {
      adamant.global.v1.ListAuditLogsRequest result = new adamant.global.v1.ListAuditLogsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(adamant.global.v1.ListAuditLogsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.auditLogGroup_ = auditLogGroup_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.accountId_ = accountId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pageSize_ = pageSize_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.pageToken_ = pageToken_;
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
      if (other instanceof adamant.global.v1.ListAuditLogsRequest) {
        return mergeFrom((adamant.global.v1.ListAuditLogsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(adamant.global.v1.ListAuditLogsRequest other) {
      if (other == adamant.global.v1.ListAuditLogsRequest.getDefaultInstance()) return this;
      if (other.auditLogGroup_ != 0) {
        setAuditLogGroupValue(other.getAuditLogGroupValue());
      }
      if (!other.getAccountId().isEmpty()) {
        accountId_ = other.accountId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        bitField0_ |= 0x00000008;
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
            case 8: {
              auditLogGroup_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              accountId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              pageSize_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              pageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private int auditLogGroup_ = 0;
    /**
     * <code>.adamant.global.v1.AuditLogGroup audit_log_group = 1 [json_name = "auditLogGroup"];</code>
     * @return The enum numeric value on the wire for auditLogGroup.
     */
    @java.lang.Override public int getAuditLogGroupValue() {
      return auditLogGroup_;
    }
    /**
     * <code>.adamant.global.v1.AuditLogGroup audit_log_group = 1 [json_name = "auditLogGroup"];</code>
     * @param value The enum numeric value on the wire for auditLogGroup to set.
     * @return This builder for chaining.
     */
    public Builder setAuditLogGroupValue(int value) {
      auditLogGroup_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.adamant.global.v1.AuditLogGroup audit_log_group = 1 [json_name = "auditLogGroup"];</code>
     * @return The auditLogGroup.
     */
    @java.lang.Override
    public adamant.global.v1.Enum.AuditLogGroup getAuditLogGroup() {
      adamant.global.v1.Enum.AuditLogGroup result = adamant.global.v1.Enum.AuditLogGroup.forNumber(auditLogGroup_);
      return result == null ? adamant.global.v1.Enum.AuditLogGroup.UNRECOGNIZED : result;
    }
    /**
     * <code>.adamant.global.v1.AuditLogGroup audit_log_group = 1 [json_name = "auditLogGroup"];</code>
     * @param value The auditLogGroup to set.
     * @return This builder for chaining.
     */
    public Builder setAuditLogGroup(adamant.global.v1.Enum.AuditLogGroup value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      auditLogGroup_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.adamant.global.v1.AuditLogGroup audit_log_group = 1 [json_name = "auditLogGroup"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAuditLogGroup() {
      bitField0_ = (bitField0_ & ~0x00000001);
      auditLogGroup_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object accountId_ = "";
    /**
     * <code>string account_id = 2 [json_name = "accountId", (.validate.rules) = { ... }</code>
     * @return The accountId.
     */
    public java.lang.String getAccountId() {
      java.lang.Object ref = accountId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accountId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string account_id = 2 [json_name = "accountId", (.validate.rules) = { ... }</code>
     * @return The bytes for accountId.
     */
    public com.google.protobuf.ByteString
        getAccountIdBytes() {
      java.lang.Object ref = accountId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accountId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string account_id = 2 [json_name = "accountId", (.validate.rules) = { ... }</code>
     * @param value The accountId to set.
     * @return This builder for chaining.
     */
    public Builder setAccountId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      accountId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string account_id = 2 [json_name = "accountId", (.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearAccountId() {
      accountId_ = getDefaultInstance().getAccountId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string account_id = 2 [json_name = "accountId", (.validate.rules) = { ... }</code>
     * @param value The bytes for accountId to set.
     * @return This builder for chaining.
     */
    public Builder setAccountIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      accountId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int pageSize_ ;
    /**
     * <code>uint32 page_size = 3 [json_name = "pageSize", (.validate.rules) = { ... }</code>
     * @return The pageSize.
     */
    @java.lang.Override
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <code>uint32 page_size = 3 [json_name = "pageSize", (.validate.rules) = { ... }</code>
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {

      pageSize_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 page_size = 3 [json_name = "pageSize", (.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      bitField0_ = (bitField0_ & ~0x00000004);
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     * <code>string page_token = 4 [json_name = "pageToken", (.validate.rules) = { ... }</code>
     * @return The pageToken.
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string page_token = 4 [json_name = "pageToken", (.validate.rules) = { ... }</code>
     * @return The bytes for pageToken.
     */
    public com.google.protobuf.ByteString
        getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string page_token = 4 [json_name = "pageToken", (.validate.rules) = { ... }</code>
     * @param value The pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      pageToken_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string page_token = 4 [json_name = "pageToken", (.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearPageToken() {
      pageToken_ = getDefaultInstance().getPageToken();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string page_token = 4 [json_name = "pageToken", (.validate.rules) = { ... }</code>
     * @param value The bytes for pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      pageToken_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.ListAuditLogsRequest)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.ListAuditLogsRequest)
  private static final adamant.global.v1.ListAuditLogsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new adamant.global.v1.ListAuditLogsRequest();
  }

  public static adamant.global.v1.ListAuditLogsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAuditLogsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListAuditLogsRequest>() {
    @java.lang.Override
    public ListAuditLogsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAuditLogsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAuditLogsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public adamant.global.v1.ListAuditLogsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

