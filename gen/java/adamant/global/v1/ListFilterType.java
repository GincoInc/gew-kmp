// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/enum.proto

package java.adamant.global.v1;

/**
 * Protobuf enum {@code adamant.global.v1.ListFilterType}
 */
public enum ListFilterType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>LIST_FILTER_TYPE_INVALID = 0;</code>
   */
  LIST_FILTER_TYPE_INVALID(0),
  /**
   * <code>LIST_FILTER_TYPE_WALLET_ID = 1;</code>
   */
  LIST_FILTER_TYPE_WALLET_ID(1),
  /**
   * <code>LIST_FILTER_TYPE_WALLET_NAME = 2;</code>
   */
  LIST_FILTER_TYPE_WALLET_NAME(2),
  /**
   * <code>LIST_FILTER_TYPE_WALLET_ADDRESS = 3;</code>
   */
  LIST_FILTER_TYPE_WALLET_ADDRESS(3),
  /**
   * <code>LIST_FILTER_TYPE_TRANSACTION_ID = 4;</code>
   */
  LIST_FILTER_TYPE_TRANSACTION_ID(4),
  /**
   * <code>LIST_FILTER_TYPE_TRANSFER_ID = 5;</code>
   */
  LIST_FILTER_TYPE_TRANSFER_ID(5),
  /**
   * <code>LIST_FILTER_TYPE_ADDRESS_NAME = 6;</code>
   */
  LIST_FILTER_TYPE_ADDRESS_NAME(6),
  /**
   * <code>LIST_FILTER_TYPE_ADDRESS = 7;</code>
   */
  LIST_FILTER_TYPE_ADDRESS(7),
  /**
   * <code>LIST_FILTER_TYPE_TXID = 8;</code>
   */
  LIST_FILTER_TYPE_TXID(8),
  /**
   * <code>LIST_FILTER_TYPE_OWNER_ID = 9;</code>
   */
  LIST_FILTER_TYPE_OWNER_ID(9),
  /**
   * <code>LIST_FILTER_TYPE_WALLET_ID_CREATE_TIME = 10;</code>
   */
  LIST_FILTER_TYPE_WALLET_ID_CREATE_TIME(10),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>LIST_FILTER_TYPE_INVALID = 0;</code>
   */
  public static final int LIST_FILTER_TYPE_INVALID_VALUE = 0;
  /**
   * <code>LIST_FILTER_TYPE_WALLET_ID = 1;</code>
   */
  public static final int LIST_FILTER_TYPE_WALLET_ID_VALUE = 1;
  /**
   * <code>LIST_FILTER_TYPE_WALLET_NAME = 2;</code>
   */
  public static final int LIST_FILTER_TYPE_WALLET_NAME_VALUE = 2;
  /**
   * <code>LIST_FILTER_TYPE_WALLET_ADDRESS = 3;</code>
   */
  public static final int LIST_FILTER_TYPE_WALLET_ADDRESS_VALUE = 3;
  /**
   * <code>LIST_FILTER_TYPE_TRANSACTION_ID = 4;</code>
   */
  public static final int LIST_FILTER_TYPE_TRANSACTION_ID_VALUE = 4;
  /**
   * <code>LIST_FILTER_TYPE_TRANSFER_ID = 5;</code>
   */
  public static final int LIST_FILTER_TYPE_TRANSFER_ID_VALUE = 5;
  /**
   * <code>LIST_FILTER_TYPE_ADDRESS_NAME = 6;</code>
   */
  public static final int LIST_FILTER_TYPE_ADDRESS_NAME_VALUE = 6;
  /**
   * <code>LIST_FILTER_TYPE_ADDRESS = 7;</code>
   */
  public static final int LIST_FILTER_TYPE_ADDRESS_VALUE = 7;
  /**
   * <code>LIST_FILTER_TYPE_TXID = 8;</code>
   */
  public static final int LIST_FILTER_TYPE_TXID_VALUE = 8;
  /**
   * <code>LIST_FILTER_TYPE_OWNER_ID = 9;</code>
   */
  public static final int LIST_FILTER_TYPE_OWNER_ID_VALUE = 9;
  /**
   * <code>LIST_FILTER_TYPE_WALLET_ID_CREATE_TIME = 10;</code>
   */
  public static final int LIST_FILTER_TYPE_WALLET_ID_CREATE_TIME_VALUE = 10;


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
  public static ListFilterType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ListFilterType forNumber(int value) {
    switch (value) {
      case 0: return LIST_FILTER_TYPE_INVALID;
      case 1: return LIST_FILTER_TYPE_WALLET_ID;
      case 2: return LIST_FILTER_TYPE_WALLET_NAME;
      case 3: return LIST_FILTER_TYPE_WALLET_ADDRESS;
      case 4: return LIST_FILTER_TYPE_TRANSACTION_ID;
      case 5: return LIST_FILTER_TYPE_TRANSFER_ID;
      case 6: return LIST_FILTER_TYPE_ADDRESS_NAME;
      case 7: return LIST_FILTER_TYPE_ADDRESS;
      case 8: return LIST_FILTER_TYPE_TXID;
      case 9: return LIST_FILTER_TYPE_OWNER_ID;
      case 10: return LIST_FILTER_TYPE_WALLET_ID_CREATE_TIME;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ListFilterType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ListFilterType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ListFilterType>() {
          public ListFilterType findValueByNumber(int number) {
            return ListFilterType.forNumber(number);
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
    return java.adamant.global.v1.EnumProto.getDescriptor().getEnumTypes().get(16);
  }

  private static final ListFilterType[] VALUES = values();

  public static ListFilterType valueOf(
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

  private ListFilterType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:adamant.global.v1.ListFilterType)
}
