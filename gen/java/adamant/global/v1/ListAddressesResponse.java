// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
 * Protobuf type {@code adamant.global.v1.ListAddressesResponse}
 */
public  final class ListAddressesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.ListAddressesResponse)
    ListAddressesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAddressesResponse.newBuilder() to construct.
  private ListAddressesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAddressesResponse() {
    addresses_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAddressesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListAddressesResponse(
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
              addresses_ = new java.util.ArrayList<adamant.global.v1.Model.Address>();
              mutable_bitField0_ |= 0x00000001;
            }
            addresses_.add(
                input.readMessage(adamant.global.v1.Model.Address.parser(), extensionRegistry));
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
        addresses_ = java.util.Collections.unmodifiableList(addresses_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListAddressesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListAddressesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            adamant.global.v1.ListAddressesResponse.class, adamant.global.v1.ListAddressesResponse.Builder.class);
  }

  public static final int ADDRESSES_FIELD_NUMBER = 1;
  private java.util.List<adamant.global.v1.Model.Address> addresses_;
  /**
   * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
   */
  public java.util.List<adamant.global.v1.Model.Address> getAddressesList() {
    return addresses_;
  }
  /**
   * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
   */
  public java.util.List<? extends adamant.global.v1.Model.AddressOrBuilder> 
      getAddressesOrBuilderList() {
    return addresses_;
  }
  /**
   * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
   */
  public int getAddressesCount() {
    return addresses_.size();
  }
  /**
   * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
   */
  public adamant.global.v1.Model.Address getAddresses(int index) {
    return addresses_.get(index);
  }
  /**
   * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
   */
  public adamant.global.v1.Model.AddressOrBuilder getAddressesOrBuilder(
      int index) {
    return addresses_.get(index);
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
    for (int i = 0; i < addresses_.size(); i++) {
      output.writeMessage(1, addresses_.get(i));
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
    for (int i = 0; i < addresses_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, addresses_.get(i));
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
    if (!(obj instanceof adamant.global.v1.ListAddressesResponse)) {
      return super.equals(obj);
    }
    adamant.global.v1.ListAddressesResponse other = (adamant.global.v1.ListAddressesResponse) obj;

    if (!getAddressesList()
        .equals(other.getAddressesList())) return false;
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
    if (getAddressesCount() > 0) {
      hash = (37 * hash) + ADDRESSES_FIELD_NUMBER;
      hash = (53 * hash) + getAddressesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static adamant.global.v1.ListAddressesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ListAddressesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ListAddressesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ListAddressesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ListAddressesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ListAddressesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ListAddressesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ListAddressesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.ListAddressesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ListAddressesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.ListAddressesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ListAddressesResponse parseFrom(
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
  public static Builder newBuilder(adamant.global.v1.ListAddressesResponse prototype) {
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
   * Protobuf type {@code adamant.global.v1.ListAddressesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.ListAddressesResponse)
      adamant.global.v1.ListAddressesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListAddressesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListAddressesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              adamant.global.v1.ListAddressesResponse.class, adamant.global.v1.ListAddressesResponse.Builder.class);
    }

    // Construct using adamant.global.v1.ListAddressesResponse.newBuilder()
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
        getAddressesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (addressesBuilder_ == null) {
        addresses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        addressesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListAddressesResponse_descriptor;
    }

    @java.lang.Override
    public adamant.global.v1.ListAddressesResponse getDefaultInstanceForType() {
      return adamant.global.v1.ListAddressesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public adamant.global.v1.ListAddressesResponse build() {
      adamant.global.v1.ListAddressesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public adamant.global.v1.ListAddressesResponse buildPartial() {
      adamant.global.v1.ListAddressesResponse result = new adamant.global.v1.ListAddressesResponse(this);
      int from_bitField0_ = bitField0_;
      if (addressesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          addresses_ = java.util.Collections.unmodifiableList(addresses_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.addresses_ = addresses_;
      } else {
        result.addresses_ = addressesBuilder_.build();
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
      if (other instanceof adamant.global.v1.ListAddressesResponse) {
        return mergeFrom((adamant.global.v1.ListAddressesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(adamant.global.v1.ListAddressesResponse other) {
      if (other == adamant.global.v1.ListAddressesResponse.getDefaultInstance()) return this;
      if (addressesBuilder_ == null) {
        if (!other.addresses_.isEmpty()) {
          if (addresses_.isEmpty()) {
            addresses_ = other.addresses_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAddressesIsMutable();
            addresses_.addAll(other.addresses_);
          }
          onChanged();
        }
      } else {
        if (!other.addresses_.isEmpty()) {
          if (addressesBuilder_.isEmpty()) {
            addressesBuilder_.dispose();
            addressesBuilder_ = null;
            addresses_ = other.addresses_;
            bitField0_ = (bitField0_ & ~0x00000001);
            addressesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAddressesFieldBuilder() : null;
          } else {
            addressesBuilder_.addAllMessages(other.addresses_);
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
      adamant.global.v1.ListAddressesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (adamant.global.v1.ListAddressesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<adamant.global.v1.Model.Address> addresses_ =
      java.util.Collections.emptyList();
    private void ensureAddressesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        addresses_ = new java.util.ArrayList<adamant.global.v1.Model.Address>(addresses_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        adamant.global.v1.Model.Address, adamant.global.v1.Model.Address.Builder, adamant.global.v1.Model.AddressOrBuilder> addressesBuilder_;

    /**
     * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
     */
    public java.util.List<adamant.global.v1.Model.Address> getAddressesList() {
      if (addressesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(addresses_);
      } else {
        return addressesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
     */
    public int getAddressesCount() {
      if (addressesBuilder_ == null) {
        return addresses_.size();
      } else {
        return addressesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
     */
    public adamant.global.v1.Model.Address getAddresses(int index) {
      if (addressesBuilder_ == null) {
        return addresses_.get(index);
      } else {
        return addressesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
     */
    public Builder setAddresses(
        int index, adamant.global.v1.Model.Address value) {
      if (addressesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAddressesIsMutable();
        addresses_.set(index, value);
        onChanged();
      } else {
        addressesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
     */
    public Builder setAddresses(
        int index, adamant.global.v1.Model.Address.Builder builderForValue) {
      if (addressesBuilder_ == null) {
        ensureAddressesIsMutable();
        addresses_.set(index, builderForValue.build());
        onChanged();
      } else {
        addressesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
     */
    public Builder addAddresses(adamant.global.v1.Model.Address value) {
      if (addressesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAddressesIsMutable();
        addresses_.add(value);
        onChanged();
      } else {
        addressesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
     */
    public Builder addAddresses(
        int index, adamant.global.v1.Model.Address value) {
      if (addressesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAddressesIsMutable();
        addresses_.add(index, value);
        onChanged();
      } else {
        addressesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
     */
    public Builder addAddresses(
        adamant.global.v1.Model.Address.Builder builderForValue) {
      if (addressesBuilder_ == null) {
        ensureAddressesIsMutable();
        addresses_.add(builderForValue.build());
        onChanged();
      } else {
        addressesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
     */
    public Builder addAddresses(
        int index, adamant.global.v1.Model.Address.Builder builderForValue) {
      if (addressesBuilder_ == null) {
        ensureAddressesIsMutable();
        addresses_.add(index, builderForValue.build());
        onChanged();
      } else {
        addressesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
     */
    public Builder addAllAddresses(
        java.lang.Iterable<? extends adamant.global.v1.Model.Address> values) {
      if (addressesBuilder_ == null) {
        ensureAddressesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, addresses_);
        onChanged();
      } else {
        addressesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
     */
    public Builder clearAddresses() {
      if (addressesBuilder_ == null) {
        addresses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        addressesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
     */
    public Builder removeAddresses(int index) {
      if (addressesBuilder_ == null) {
        ensureAddressesIsMutable();
        addresses_.remove(index);
        onChanged();
      } else {
        addressesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
     */
    public adamant.global.v1.Model.Address.Builder getAddressesBuilder(
        int index) {
      return getAddressesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
     */
    public adamant.global.v1.Model.AddressOrBuilder getAddressesOrBuilder(
        int index) {
      if (addressesBuilder_ == null) {
        return addresses_.get(index);  } else {
        return addressesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
     */
    public java.util.List<? extends adamant.global.v1.Model.AddressOrBuilder> 
         getAddressesOrBuilderList() {
      if (addressesBuilder_ != null) {
        return addressesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(addresses_);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
     */
    public adamant.global.v1.Model.Address.Builder addAddressesBuilder() {
      return getAddressesFieldBuilder().addBuilder(
          adamant.global.v1.Model.Address.getDefaultInstance());
    }
    /**
     * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
     */
    public adamant.global.v1.Model.Address.Builder addAddressesBuilder(
        int index) {
      return getAddressesFieldBuilder().addBuilder(
          index, adamant.global.v1.Model.Address.getDefaultInstance());
    }
    /**
     * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
     */
    public java.util.List<adamant.global.v1.Model.Address.Builder> 
         getAddressesBuilderList() {
      return getAddressesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        adamant.global.v1.Model.Address, adamant.global.v1.Model.Address.Builder, adamant.global.v1.Model.AddressOrBuilder> 
        getAddressesFieldBuilder() {
      if (addressesBuilder_ == null) {
        addressesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            adamant.global.v1.Model.Address, adamant.global.v1.Model.Address.Builder, adamant.global.v1.Model.AddressOrBuilder>(
                addresses_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        addresses_ = null;
      }
      return addressesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.ListAddressesResponse)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.ListAddressesResponse)
  private static final adamant.global.v1.ListAddressesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new adamant.global.v1.ListAddressesResponse();
  }

  public static adamant.global.v1.ListAddressesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAddressesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListAddressesResponse>() {
    @java.lang.Override
    public ListAddressesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListAddressesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListAddressesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAddressesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public adamant.global.v1.ListAddressesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
