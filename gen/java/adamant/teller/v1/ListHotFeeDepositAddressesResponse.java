// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/teller/v1/adamanttellerv1/teller_api.proto

package adamant.teller.v1;

/**
 * Protobuf type {@code adamant.teller.v1.ListHotFeeDepositAddressesResponse}
 */
public final class ListHotFeeDepositAddressesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.teller.v1.ListHotFeeDepositAddressesResponse)
    ListHotFeeDepositAddressesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListHotFeeDepositAddressesResponse.newBuilder() to construct.
  private ListHotFeeDepositAddressesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListHotFeeDepositAddressesResponse() {
    feeDepositAddresses_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListHotFeeDepositAddressesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return adamant.teller.v1.TellerAPIProto.internal_static_adamant_teller_v1_ListHotFeeDepositAddressesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return adamant.teller.v1.TellerAPIProto.internal_static_adamant_teller_v1_ListHotFeeDepositAddressesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            adamant.teller.v1.ListHotFeeDepositAddressesResponse.class, adamant.teller.v1.ListHotFeeDepositAddressesResponse.Builder.class);
  }

  public static final int FEE_DEPOSIT_ADDRESSES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<adamant.global.v1.Model.FeeDepositAddress> feeDepositAddresses_;
  /**
   * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
   */
  @java.lang.Override
  public java.util.List<adamant.global.v1.Model.FeeDepositAddress> getFeeDepositAddressesList() {
    return feeDepositAddresses_;
  }
  /**
   * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends adamant.global.v1.Model.FeeDepositAddressOrBuilder> 
      getFeeDepositAddressesOrBuilderList() {
    return feeDepositAddresses_;
  }
  /**
   * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
   */
  @java.lang.Override
  public int getFeeDepositAddressesCount() {
    return feeDepositAddresses_.size();
  }
  /**
   * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
   */
  @java.lang.Override
  public adamant.global.v1.Model.FeeDepositAddress getFeeDepositAddresses(int index) {
    return feeDepositAddresses_.get(index);
  }
  /**
   * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
   */
  @java.lang.Override
  public adamant.global.v1.Model.FeeDepositAddressOrBuilder getFeeDepositAddressesOrBuilder(
      int index) {
    return feeDepositAddresses_.get(index);
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
    for (int i = 0; i < feeDepositAddresses_.size(); i++) {
      output.writeMessage(1, feeDepositAddresses_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < feeDepositAddresses_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, feeDepositAddresses_.get(i));
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
    if (!(obj instanceof adamant.teller.v1.ListHotFeeDepositAddressesResponse)) {
      return super.equals(obj);
    }
    adamant.teller.v1.ListHotFeeDepositAddressesResponse other = (adamant.teller.v1.ListHotFeeDepositAddressesResponse) obj;

    if (!getFeeDepositAddressesList()
        .equals(other.getFeeDepositAddressesList())) return false;
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
    if (getFeeDepositAddressesCount() > 0) {
      hash = (37 * hash) + FEE_DEPOSIT_ADDRESSES_FIELD_NUMBER;
      hash = (53 * hash) + getFeeDepositAddressesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static adamant.teller.v1.ListHotFeeDepositAddressesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.teller.v1.ListHotFeeDepositAddressesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.teller.v1.ListHotFeeDepositAddressesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.teller.v1.ListHotFeeDepositAddressesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.teller.v1.ListHotFeeDepositAddressesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.teller.v1.ListHotFeeDepositAddressesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.teller.v1.ListHotFeeDepositAddressesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.teller.v1.ListHotFeeDepositAddressesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static adamant.teller.v1.ListHotFeeDepositAddressesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static adamant.teller.v1.ListHotFeeDepositAddressesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.teller.v1.ListHotFeeDepositAddressesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.teller.v1.ListHotFeeDepositAddressesResponse parseFrom(
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
  public static Builder newBuilder(adamant.teller.v1.ListHotFeeDepositAddressesResponse prototype) {
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
   * Protobuf type {@code adamant.teller.v1.ListHotFeeDepositAddressesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.teller.v1.ListHotFeeDepositAddressesResponse)
      adamant.teller.v1.ListHotFeeDepositAddressesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return adamant.teller.v1.TellerAPIProto.internal_static_adamant_teller_v1_ListHotFeeDepositAddressesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return adamant.teller.v1.TellerAPIProto.internal_static_adamant_teller_v1_ListHotFeeDepositAddressesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              adamant.teller.v1.ListHotFeeDepositAddressesResponse.class, adamant.teller.v1.ListHotFeeDepositAddressesResponse.Builder.class);
    }

    // Construct using adamant.teller.v1.ListHotFeeDepositAddressesResponse.newBuilder()
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
      if (feeDepositAddressesBuilder_ == null) {
        feeDepositAddresses_ = java.util.Collections.emptyList();
      } else {
        feeDepositAddresses_ = null;
        feeDepositAddressesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return adamant.teller.v1.TellerAPIProto.internal_static_adamant_teller_v1_ListHotFeeDepositAddressesResponse_descriptor;
    }

    @java.lang.Override
    public adamant.teller.v1.ListHotFeeDepositAddressesResponse getDefaultInstanceForType() {
      return adamant.teller.v1.ListHotFeeDepositAddressesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public adamant.teller.v1.ListHotFeeDepositAddressesResponse build() {
      adamant.teller.v1.ListHotFeeDepositAddressesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public adamant.teller.v1.ListHotFeeDepositAddressesResponse buildPartial() {
      adamant.teller.v1.ListHotFeeDepositAddressesResponse result = new adamant.teller.v1.ListHotFeeDepositAddressesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(adamant.teller.v1.ListHotFeeDepositAddressesResponse result) {
      if (feeDepositAddressesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          feeDepositAddresses_ = java.util.Collections.unmodifiableList(feeDepositAddresses_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.feeDepositAddresses_ = feeDepositAddresses_;
      } else {
        result.feeDepositAddresses_ = feeDepositAddressesBuilder_.build();
      }
    }

    private void buildPartial0(adamant.teller.v1.ListHotFeeDepositAddressesResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof adamant.teller.v1.ListHotFeeDepositAddressesResponse) {
        return mergeFrom((adamant.teller.v1.ListHotFeeDepositAddressesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(adamant.teller.v1.ListHotFeeDepositAddressesResponse other) {
      if (other == adamant.teller.v1.ListHotFeeDepositAddressesResponse.getDefaultInstance()) return this;
      if (feeDepositAddressesBuilder_ == null) {
        if (!other.feeDepositAddresses_.isEmpty()) {
          if (feeDepositAddresses_.isEmpty()) {
            feeDepositAddresses_ = other.feeDepositAddresses_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFeeDepositAddressesIsMutable();
            feeDepositAddresses_.addAll(other.feeDepositAddresses_);
          }
          onChanged();
        }
      } else {
        if (!other.feeDepositAddresses_.isEmpty()) {
          if (feeDepositAddressesBuilder_.isEmpty()) {
            feeDepositAddressesBuilder_.dispose();
            feeDepositAddressesBuilder_ = null;
            feeDepositAddresses_ = other.feeDepositAddresses_;
            bitField0_ = (bitField0_ & ~0x00000001);
            feeDepositAddressesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFeeDepositAddressesFieldBuilder() : null;
          } else {
            feeDepositAddressesBuilder_.addAllMessages(other.feeDepositAddresses_);
          }
        }
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
              adamant.global.v1.Model.FeeDepositAddress m =
                  input.readMessage(
                      adamant.global.v1.Model.FeeDepositAddress.parser(),
                      extensionRegistry);
              if (feeDepositAddressesBuilder_ == null) {
                ensureFeeDepositAddressesIsMutable();
                feeDepositAddresses_.add(m);
              } else {
                feeDepositAddressesBuilder_.addMessage(m);
              }
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

    private java.util.List<adamant.global.v1.Model.FeeDepositAddress> feeDepositAddresses_ =
      java.util.Collections.emptyList();
    private void ensureFeeDepositAddressesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        feeDepositAddresses_ = new java.util.ArrayList<adamant.global.v1.Model.FeeDepositAddress>(feeDepositAddresses_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        adamant.global.v1.Model.FeeDepositAddress, adamant.global.v1.Model.FeeDepositAddress.Builder, adamant.global.v1.Model.FeeDepositAddressOrBuilder> feeDepositAddressesBuilder_;

    /**
     * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
     */
    public java.util.List<adamant.global.v1.Model.FeeDepositAddress> getFeeDepositAddressesList() {
      if (feeDepositAddressesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(feeDepositAddresses_);
      } else {
        return feeDepositAddressesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
     */
    public int getFeeDepositAddressesCount() {
      if (feeDepositAddressesBuilder_ == null) {
        return feeDepositAddresses_.size();
      } else {
        return feeDepositAddressesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
     */
    public adamant.global.v1.Model.FeeDepositAddress getFeeDepositAddresses(int index) {
      if (feeDepositAddressesBuilder_ == null) {
        return feeDepositAddresses_.get(index);
      } else {
        return feeDepositAddressesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
     */
    public Builder setFeeDepositAddresses(
        int index, adamant.global.v1.Model.FeeDepositAddress value) {
      if (feeDepositAddressesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeeDepositAddressesIsMutable();
        feeDepositAddresses_.set(index, value);
        onChanged();
      } else {
        feeDepositAddressesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
     */
    public Builder setFeeDepositAddresses(
        int index, adamant.global.v1.Model.FeeDepositAddress.Builder builderForValue) {
      if (feeDepositAddressesBuilder_ == null) {
        ensureFeeDepositAddressesIsMutable();
        feeDepositAddresses_.set(index, builderForValue.build());
        onChanged();
      } else {
        feeDepositAddressesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
     */
    public Builder addFeeDepositAddresses(adamant.global.v1.Model.FeeDepositAddress value) {
      if (feeDepositAddressesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeeDepositAddressesIsMutable();
        feeDepositAddresses_.add(value);
        onChanged();
      } else {
        feeDepositAddressesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
     */
    public Builder addFeeDepositAddresses(
        int index, adamant.global.v1.Model.FeeDepositAddress value) {
      if (feeDepositAddressesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeeDepositAddressesIsMutable();
        feeDepositAddresses_.add(index, value);
        onChanged();
      } else {
        feeDepositAddressesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
     */
    public Builder addFeeDepositAddresses(
        adamant.global.v1.Model.FeeDepositAddress.Builder builderForValue) {
      if (feeDepositAddressesBuilder_ == null) {
        ensureFeeDepositAddressesIsMutable();
        feeDepositAddresses_.add(builderForValue.build());
        onChanged();
      } else {
        feeDepositAddressesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
     */
    public Builder addFeeDepositAddresses(
        int index, adamant.global.v1.Model.FeeDepositAddress.Builder builderForValue) {
      if (feeDepositAddressesBuilder_ == null) {
        ensureFeeDepositAddressesIsMutable();
        feeDepositAddresses_.add(index, builderForValue.build());
        onChanged();
      } else {
        feeDepositAddressesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
     */
    public Builder addAllFeeDepositAddresses(
        java.lang.Iterable<? extends adamant.global.v1.Model.FeeDepositAddress> values) {
      if (feeDepositAddressesBuilder_ == null) {
        ensureFeeDepositAddressesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, feeDepositAddresses_);
        onChanged();
      } else {
        feeDepositAddressesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
     */
    public Builder clearFeeDepositAddresses() {
      if (feeDepositAddressesBuilder_ == null) {
        feeDepositAddresses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        feeDepositAddressesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
     */
    public Builder removeFeeDepositAddresses(int index) {
      if (feeDepositAddressesBuilder_ == null) {
        ensureFeeDepositAddressesIsMutable();
        feeDepositAddresses_.remove(index);
        onChanged();
      } else {
        feeDepositAddressesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
     */
    public adamant.global.v1.Model.FeeDepositAddress.Builder getFeeDepositAddressesBuilder(
        int index) {
      return getFeeDepositAddressesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
     */
    public adamant.global.v1.Model.FeeDepositAddressOrBuilder getFeeDepositAddressesOrBuilder(
        int index) {
      if (feeDepositAddressesBuilder_ == null) {
        return feeDepositAddresses_.get(index);  } else {
        return feeDepositAddressesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
     */
    public java.util.List<? extends adamant.global.v1.Model.FeeDepositAddressOrBuilder> 
         getFeeDepositAddressesOrBuilderList() {
      if (feeDepositAddressesBuilder_ != null) {
        return feeDepositAddressesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(feeDepositAddresses_);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
     */
    public adamant.global.v1.Model.FeeDepositAddress.Builder addFeeDepositAddressesBuilder() {
      return getFeeDepositAddressesFieldBuilder().addBuilder(
          adamant.global.v1.Model.FeeDepositAddress.getDefaultInstance());
    }
    /**
     * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
     */
    public adamant.global.v1.Model.FeeDepositAddress.Builder addFeeDepositAddressesBuilder(
        int index) {
      return getFeeDepositAddressesFieldBuilder().addBuilder(
          index, adamant.global.v1.Model.FeeDepositAddress.getDefaultInstance());
    }
    /**
     * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
     */
    public java.util.List<adamant.global.v1.Model.FeeDepositAddress.Builder> 
         getFeeDepositAddressesBuilderList() {
      return getFeeDepositAddressesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        adamant.global.v1.Model.FeeDepositAddress, adamant.global.v1.Model.FeeDepositAddress.Builder, adamant.global.v1.Model.FeeDepositAddressOrBuilder> 
        getFeeDepositAddressesFieldBuilder() {
      if (feeDepositAddressesBuilder_ == null) {
        feeDepositAddressesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            adamant.global.v1.Model.FeeDepositAddress, adamant.global.v1.Model.FeeDepositAddress.Builder, adamant.global.v1.Model.FeeDepositAddressOrBuilder>(
                feeDepositAddresses_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        feeDepositAddresses_ = null;
      }
      return feeDepositAddressesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:adamant.teller.v1.ListHotFeeDepositAddressesResponse)
  }

  // @@protoc_insertion_point(class_scope:adamant.teller.v1.ListHotFeeDepositAddressesResponse)
  private static final adamant.teller.v1.ListHotFeeDepositAddressesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new adamant.teller.v1.ListHotFeeDepositAddressesResponse();
  }

  public static adamant.teller.v1.ListHotFeeDepositAddressesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListHotFeeDepositAddressesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListHotFeeDepositAddressesResponse>() {
    @java.lang.Override
    public ListHotFeeDepositAddressesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListHotFeeDepositAddressesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListHotFeeDepositAddressesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public adamant.teller.v1.ListHotFeeDepositAddressesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

