// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
 * <pre>
 * The model of Utxo specific fields of CalculateFee
 * </pre>
 *
 * Protobuf type {@code adamant.global.v1.UtxoSpecific}
 */
public final class UtxoSpecific extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.UtxoSpecific)
    UtxoSpecificOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UtxoSpecific.newBuilder() to construct.
  private UtxoSpecific(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UtxoSpecific() {
    selectedUtxos_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UtxoSpecific();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_UtxoSpecific_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_UtxoSpecific_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            adamant.global.v1.UtxoSpecific.class, adamant.global.v1.UtxoSpecific.Builder.class);
  }

  public static final int SELECTED_UTXOS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<adamant.global.v1.Model.SelectedUTXO> selectedUtxos_;
  /**
   * <code>repeated .adamant.global.v1.SelectedUTXO selected_utxos = 1 [json_name = "selectedUtxos"];</code>
   */
  @java.lang.Override
  public java.util.List<adamant.global.v1.Model.SelectedUTXO> getSelectedUtxosList() {
    return selectedUtxos_;
  }
  /**
   * <code>repeated .adamant.global.v1.SelectedUTXO selected_utxos = 1 [json_name = "selectedUtxos"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends adamant.global.v1.Model.SelectedUTXOOrBuilder> 
      getSelectedUtxosOrBuilderList() {
    return selectedUtxos_;
  }
  /**
   * <code>repeated .adamant.global.v1.SelectedUTXO selected_utxos = 1 [json_name = "selectedUtxos"];</code>
   */
  @java.lang.Override
  public int getSelectedUtxosCount() {
    return selectedUtxos_.size();
  }
  /**
   * <code>repeated .adamant.global.v1.SelectedUTXO selected_utxos = 1 [json_name = "selectedUtxos"];</code>
   */
  @java.lang.Override
  public adamant.global.v1.Model.SelectedUTXO getSelectedUtxos(int index) {
    return selectedUtxos_.get(index);
  }
  /**
   * <code>repeated .adamant.global.v1.SelectedUTXO selected_utxos = 1 [json_name = "selectedUtxos"];</code>
   */
  @java.lang.Override
  public adamant.global.v1.Model.SelectedUTXOOrBuilder getSelectedUtxosOrBuilder(
      int index) {
    return selectedUtxos_.get(index);
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
    for (int i = 0; i < selectedUtxos_.size(); i++) {
      output.writeMessage(1, selectedUtxos_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < selectedUtxos_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, selectedUtxos_.get(i));
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
    if (!(obj instanceof adamant.global.v1.UtxoSpecific)) {
      return super.equals(obj);
    }
    adamant.global.v1.UtxoSpecific other = (adamant.global.v1.UtxoSpecific) obj;

    if (!getSelectedUtxosList()
        .equals(other.getSelectedUtxosList())) return false;
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
    if (getSelectedUtxosCount() > 0) {
      hash = (37 * hash) + SELECTED_UTXOS_FIELD_NUMBER;
      hash = (53 * hash) + getSelectedUtxosList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static adamant.global.v1.UtxoSpecific parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.UtxoSpecific parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.UtxoSpecific parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.UtxoSpecific parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.UtxoSpecific parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.UtxoSpecific parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.UtxoSpecific parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.UtxoSpecific parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static adamant.global.v1.UtxoSpecific parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static adamant.global.v1.UtxoSpecific parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.UtxoSpecific parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.UtxoSpecific parseFrom(
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
  public static Builder newBuilder(adamant.global.v1.UtxoSpecific prototype) {
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
   * The model of Utxo specific fields of CalculateFee
   * </pre>
   *
   * Protobuf type {@code adamant.global.v1.UtxoSpecific}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.UtxoSpecific)
      adamant.global.v1.UtxoSpecificOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_UtxoSpecific_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_UtxoSpecific_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              adamant.global.v1.UtxoSpecific.class, adamant.global.v1.UtxoSpecific.Builder.class);
    }

    // Construct using adamant.global.v1.UtxoSpecific.newBuilder()
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
      if (selectedUtxosBuilder_ == null) {
        selectedUtxos_ = java.util.Collections.emptyList();
      } else {
        selectedUtxos_ = null;
        selectedUtxosBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_UtxoSpecific_descriptor;
    }

    @java.lang.Override
    public adamant.global.v1.UtxoSpecific getDefaultInstanceForType() {
      return adamant.global.v1.UtxoSpecific.getDefaultInstance();
    }

    @java.lang.Override
    public adamant.global.v1.UtxoSpecific build() {
      adamant.global.v1.UtxoSpecific result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public adamant.global.v1.UtxoSpecific buildPartial() {
      adamant.global.v1.UtxoSpecific result = new adamant.global.v1.UtxoSpecific(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(adamant.global.v1.UtxoSpecific result) {
      if (selectedUtxosBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          selectedUtxos_ = java.util.Collections.unmodifiableList(selectedUtxos_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.selectedUtxos_ = selectedUtxos_;
      } else {
        result.selectedUtxos_ = selectedUtxosBuilder_.build();
      }
    }

    private void buildPartial0(adamant.global.v1.UtxoSpecific result) {
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
      if (other instanceof adamant.global.v1.UtxoSpecific) {
        return mergeFrom((adamant.global.v1.UtxoSpecific)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(adamant.global.v1.UtxoSpecific other) {
      if (other == adamant.global.v1.UtxoSpecific.getDefaultInstance()) return this;
      if (selectedUtxosBuilder_ == null) {
        if (!other.selectedUtxos_.isEmpty()) {
          if (selectedUtxos_.isEmpty()) {
            selectedUtxos_ = other.selectedUtxos_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSelectedUtxosIsMutable();
            selectedUtxos_.addAll(other.selectedUtxos_);
          }
          onChanged();
        }
      } else {
        if (!other.selectedUtxos_.isEmpty()) {
          if (selectedUtxosBuilder_.isEmpty()) {
            selectedUtxosBuilder_.dispose();
            selectedUtxosBuilder_ = null;
            selectedUtxos_ = other.selectedUtxos_;
            bitField0_ = (bitField0_ & ~0x00000001);
            selectedUtxosBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSelectedUtxosFieldBuilder() : null;
          } else {
            selectedUtxosBuilder_.addAllMessages(other.selectedUtxos_);
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
              adamant.global.v1.Model.SelectedUTXO m =
                  input.readMessage(
                      adamant.global.v1.Model.SelectedUTXO.parser(),
                      extensionRegistry);
              if (selectedUtxosBuilder_ == null) {
                ensureSelectedUtxosIsMutable();
                selectedUtxos_.add(m);
              } else {
                selectedUtxosBuilder_.addMessage(m);
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

    private java.util.List<adamant.global.v1.Model.SelectedUTXO> selectedUtxos_ =
      java.util.Collections.emptyList();
    private void ensureSelectedUtxosIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        selectedUtxos_ = new java.util.ArrayList<adamant.global.v1.Model.SelectedUTXO>(selectedUtxos_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        adamant.global.v1.Model.SelectedUTXO, adamant.global.v1.Model.SelectedUTXO.Builder, adamant.global.v1.Model.SelectedUTXOOrBuilder> selectedUtxosBuilder_;

    /**
     * <code>repeated .adamant.global.v1.SelectedUTXO selected_utxos = 1 [json_name = "selectedUtxos"];</code>
     */
    public java.util.List<adamant.global.v1.Model.SelectedUTXO> getSelectedUtxosList() {
      if (selectedUtxosBuilder_ == null) {
        return java.util.Collections.unmodifiableList(selectedUtxos_);
      } else {
        return selectedUtxosBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .adamant.global.v1.SelectedUTXO selected_utxos = 1 [json_name = "selectedUtxos"];</code>
     */
    public int getSelectedUtxosCount() {
      if (selectedUtxosBuilder_ == null) {
        return selectedUtxos_.size();
      } else {
        return selectedUtxosBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .adamant.global.v1.SelectedUTXO selected_utxos = 1 [json_name = "selectedUtxos"];</code>
     */
    public adamant.global.v1.Model.SelectedUTXO getSelectedUtxos(int index) {
      if (selectedUtxosBuilder_ == null) {
        return selectedUtxos_.get(index);
      } else {
        return selectedUtxosBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.SelectedUTXO selected_utxos = 1 [json_name = "selectedUtxos"];</code>
     */
    public Builder setSelectedUtxos(
        int index, adamant.global.v1.Model.SelectedUTXO value) {
      if (selectedUtxosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSelectedUtxosIsMutable();
        selectedUtxos_.set(index, value);
        onChanged();
      } else {
        selectedUtxosBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.SelectedUTXO selected_utxos = 1 [json_name = "selectedUtxos"];</code>
     */
    public Builder setSelectedUtxos(
        int index, adamant.global.v1.Model.SelectedUTXO.Builder builderForValue) {
      if (selectedUtxosBuilder_ == null) {
        ensureSelectedUtxosIsMutable();
        selectedUtxos_.set(index, builderForValue.build());
        onChanged();
      } else {
        selectedUtxosBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.SelectedUTXO selected_utxos = 1 [json_name = "selectedUtxos"];</code>
     */
    public Builder addSelectedUtxos(adamant.global.v1.Model.SelectedUTXO value) {
      if (selectedUtxosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSelectedUtxosIsMutable();
        selectedUtxos_.add(value);
        onChanged();
      } else {
        selectedUtxosBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.SelectedUTXO selected_utxos = 1 [json_name = "selectedUtxos"];</code>
     */
    public Builder addSelectedUtxos(
        int index, adamant.global.v1.Model.SelectedUTXO value) {
      if (selectedUtxosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSelectedUtxosIsMutable();
        selectedUtxos_.add(index, value);
        onChanged();
      } else {
        selectedUtxosBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.SelectedUTXO selected_utxos = 1 [json_name = "selectedUtxos"];</code>
     */
    public Builder addSelectedUtxos(
        adamant.global.v1.Model.SelectedUTXO.Builder builderForValue) {
      if (selectedUtxosBuilder_ == null) {
        ensureSelectedUtxosIsMutable();
        selectedUtxos_.add(builderForValue.build());
        onChanged();
      } else {
        selectedUtxosBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.SelectedUTXO selected_utxos = 1 [json_name = "selectedUtxos"];</code>
     */
    public Builder addSelectedUtxos(
        int index, adamant.global.v1.Model.SelectedUTXO.Builder builderForValue) {
      if (selectedUtxosBuilder_ == null) {
        ensureSelectedUtxosIsMutable();
        selectedUtxos_.add(index, builderForValue.build());
        onChanged();
      } else {
        selectedUtxosBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.SelectedUTXO selected_utxos = 1 [json_name = "selectedUtxos"];</code>
     */
    public Builder addAllSelectedUtxos(
        java.lang.Iterable<? extends adamant.global.v1.Model.SelectedUTXO> values) {
      if (selectedUtxosBuilder_ == null) {
        ensureSelectedUtxosIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, selectedUtxos_);
        onChanged();
      } else {
        selectedUtxosBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.SelectedUTXO selected_utxos = 1 [json_name = "selectedUtxos"];</code>
     */
    public Builder clearSelectedUtxos() {
      if (selectedUtxosBuilder_ == null) {
        selectedUtxos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        selectedUtxosBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.SelectedUTXO selected_utxos = 1 [json_name = "selectedUtxos"];</code>
     */
    public Builder removeSelectedUtxos(int index) {
      if (selectedUtxosBuilder_ == null) {
        ensureSelectedUtxosIsMutable();
        selectedUtxos_.remove(index);
        onChanged();
      } else {
        selectedUtxosBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.SelectedUTXO selected_utxos = 1 [json_name = "selectedUtxos"];</code>
     */
    public adamant.global.v1.Model.SelectedUTXO.Builder getSelectedUtxosBuilder(
        int index) {
      return getSelectedUtxosFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .adamant.global.v1.SelectedUTXO selected_utxos = 1 [json_name = "selectedUtxos"];</code>
     */
    public adamant.global.v1.Model.SelectedUTXOOrBuilder getSelectedUtxosOrBuilder(
        int index) {
      if (selectedUtxosBuilder_ == null) {
        return selectedUtxos_.get(index);  } else {
        return selectedUtxosBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.SelectedUTXO selected_utxos = 1 [json_name = "selectedUtxos"];</code>
     */
    public java.util.List<? extends adamant.global.v1.Model.SelectedUTXOOrBuilder> 
         getSelectedUtxosOrBuilderList() {
      if (selectedUtxosBuilder_ != null) {
        return selectedUtxosBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(selectedUtxos_);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.SelectedUTXO selected_utxos = 1 [json_name = "selectedUtxos"];</code>
     */
    public adamant.global.v1.Model.SelectedUTXO.Builder addSelectedUtxosBuilder() {
      return getSelectedUtxosFieldBuilder().addBuilder(
          adamant.global.v1.Model.SelectedUTXO.getDefaultInstance());
    }
    /**
     * <code>repeated .adamant.global.v1.SelectedUTXO selected_utxos = 1 [json_name = "selectedUtxos"];</code>
     */
    public adamant.global.v1.Model.SelectedUTXO.Builder addSelectedUtxosBuilder(
        int index) {
      return getSelectedUtxosFieldBuilder().addBuilder(
          index, adamant.global.v1.Model.SelectedUTXO.getDefaultInstance());
    }
    /**
     * <code>repeated .adamant.global.v1.SelectedUTXO selected_utxos = 1 [json_name = "selectedUtxos"];</code>
     */
    public java.util.List<adamant.global.v1.Model.SelectedUTXO.Builder> 
         getSelectedUtxosBuilderList() {
      return getSelectedUtxosFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        adamant.global.v1.Model.SelectedUTXO, adamant.global.v1.Model.SelectedUTXO.Builder, adamant.global.v1.Model.SelectedUTXOOrBuilder> 
        getSelectedUtxosFieldBuilder() {
      if (selectedUtxosBuilder_ == null) {
        selectedUtxosBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            adamant.global.v1.Model.SelectedUTXO, adamant.global.v1.Model.SelectedUTXO.Builder, adamant.global.v1.Model.SelectedUTXOOrBuilder>(
                selectedUtxos_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        selectedUtxos_ = null;
      }
      return selectedUtxosBuilder_;
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.UtxoSpecific)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.UtxoSpecific)
  private static final adamant.global.v1.UtxoSpecific DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new adamant.global.v1.UtxoSpecific();
  }

  public static adamant.global.v1.UtxoSpecific getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UtxoSpecific>
      PARSER = new com.google.protobuf.AbstractParser<UtxoSpecific>() {
    @java.lang.Override
    public UtxoSpecific parsePartialFrom(
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

  public static com.google.protobuf.Parser<UtxoSpecific> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UtxoSpecific> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public adamant.global.v1.UtxoSpecific getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
