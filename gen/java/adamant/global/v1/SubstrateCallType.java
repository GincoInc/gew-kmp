// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/enum.proto

package java.adamant.global.v1;

/**
 * Protobuf enum {@code adamant.global.v1.SubstrateCallType}
 */
public enum SubstrateCallType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SUBSTRATE_CALL_TYPE_INVALID = 0;</code>
   */
  SUBSTRATE_CALL_TYPE_INVALID(0),
  /**
   * <code>SUBSTRATE_CALL_TYPE_TRANSFER = 1;</code>
   */
  SUBSTRATE_CALL_TYPE_TRANSFER(1),
  /**
   * <code>SUBSTRATE_CALL_TYPE_TRANSFER_ALL = 2;</code>
   */
  SUBSTRATE_CALL_TYPE_TRANSFER_ALL(2),
  /**
   * <code>SUBSTRATE_CALL_TYPE_TRANSFER_KEEP_ALIVE = 3;</code>
   */
  SUBSTRATE_CALL_TYPE_TRANSFER_KEEP_ALIVE(3),
  /**
   * <code>SUBSTRATE_CALL_TYPE_APPROVE_AS_MULTI = 4;</code>
   */
  SUBSTRATE_CALL_TYPE_APPROVE_AS_MULTI(4),
  /**
   * <code>SUBSTRATE_CALL_TYPE_AS_MULTI = 5;</code>
   */
  SUBSTRATE_CALL_TYPE_AS_MULTI(5),
  /**
   * <code>SUBSTRATE_CALL_TYPE_AS_MULTI_THRESHOLD1 = 6;</code>
   */
  SUBSTRATE_CALL_TYPE_AS_MULTI_THRESHOLD1(6),
  /**
   * <code>SUBSTRATE_CALL_TYPE_CANCEL_AS_MULTI = 7;</code>
   */
  SUBSTRATE_CALL_TYPE_CANCEL_AS_MULTI(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SUBSTRATE_CALL_TYPE_INVALID = 0;</code>
   */
  public static final int SUBSTRATE_CALL_TYPE_INVALID_VALUE = 0;
  /**
   * <code>SUBSTRATE_CALL_TYPE_TRANSFER = 1;</code>
   */
  public static final int SUBSTRATE_CALL_TYPE_TRANSFER_VALUE = 1;
  /**
   * <code>SUBSTRATE_CALL_TYPE_TRANSFER_ALL = 2;</code>
   */
  public static final int SUBSTRATE_CALL_TYPE_TRANSFER_ALL_VALUE = 2;
  /**
   * <code>SUBSTRATE_CALL_TYPE_TRANSFER_KEEP_ALIVE = 3;</code>
   */
  public static final int SUBSTRATE_CALL_TYPE_TRANSFER_KEEP_ALIVE_VALUE = 3;
  /**
   * <code>SUBSTRATE_CALL_TYPE_APPROVE_AS_MULTI = 4;</code>
   */
  public static final int SUBSTRATE_CALL_TYPE_APPROVE_AS_MULTI_VALUE = 4;
  /**
   * <code>SUBSTRATE_CALL_TYPE_AS_MULTI = 5;</code>
   */
  public static final int SUBSTRATE_CALL_TYPE_AS_MULTI_VALUE = 5;
  /**
   * <code>SUBSTRATE_CALL_TYPE_AS_MULTI_THRESHOLD1 = 6;</code>
   */
  public static final int SUBSTRATE_CALL_TYPE_AS_MULTI_THRESHOLD1_VALUE = 6;
  /**
   * <code>SUBSTRATE_CALL_TYPE_CANCEL_AS_MULTI = 7;</code>
   */
  public static final int SUBSTRATE_CALL_TYPE_CANCEL_AS_MULTI_VALUE = 7;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static SubstrateCallType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SubstrateCallType forNumber(int value) {
    switch (value) {
      case 0: return SUBSTRATE_CALL_TYPE_INVALID;
      case 1: return SUBSTRATE_CALL_TYPE_TRANSFER;
      case 2: return SUBSTRATE_CALL_TYPE_TRANSFER_ALL;
      case 3: return SUBSTRATE_CALL_TYPE_TRANSFER_KEEP_ALIVE;
      case 4: return SUBSTRATE_CALL_TYPE_APPROVE_AS_MULTI;
      case 5: return SUBSTRATE_CALL_TYPE_AS_MULTI;
      case 6: return SUBSTRATE_CALL_TYPE_AS_MULTI_THRESHOLD1;
      case 7: return SUBSTRATE_CALL_TYPE_CANCEL_AS_MULTI;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SubstrateCallType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SubstrateCallType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SubstrateCallType>() {
          public SubstrateCallType findValueByNumber(int number) {
            return SubstrateCallType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return java.adamant.global.v1.EnumProto.getDescriptor().getEnumTypes().get(19);
  }

  private static final SubstrateCallType[] VALUES = values();

  public static SubstrateCallType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private SubstrateCallType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:adamant.global.v1.SubstrateCallType)
}
