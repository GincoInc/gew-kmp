// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/global/v1/gincoincglobalv1/enum.proto

package java.gincoinc.global.v1;

/**
 * <pre>
 * TransactionResult is a result of transaction.
 * </pre>
 *
 * Protobuf enum {@code gincoinc.global.v1.TransactionResult}
 */
public enum TransactionResult
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TRANSACTION_RESULT_INVALID = 0;</code>
   */
  TRANSACTION_RESULT_INVALID(0),
  /**
   * <pre>
   * Transaction is pending
   * </pre>
   *
   * <code>TRANSACTION_RESULT_PENDING = 1;</code>
   */
  TRANSACTION_RESULT_PENDING(1),
  /**
   * <pre>
   * Transaction is included in block
   * </pre>
   *
   * <code>TRANSACTION_RESULT_SUCCESS = 2;</code>
   */
  TRANSACTION_RESULT_SUCCESS(2),
  /**
   * <pre>
   * Failed to send transaction
   * </pre>
   *
   * <code>TRANSACTION_RESULT_FAILURE = 3;</code>
   */
  TRANSACTION_RESULT_FAILURE(3),
  /**
   * <code>TRANSACTION_RESULT_NONE = 100;</code>
   */
  TRANSACTION_RESULT_NONE(100),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TRANSACTION_RESULT_INVALID = 0;</code>
   */
  public static final int TRANSACTION_RESULT_INVALID_VALUE = 0;
  /**
   * <pre>
   * Transaction is pending
   * </pre>
   *
   * <code>TRANSACTION_RESULT_PENDING = 1;</code>
   */
  public static final int TRANSACTION_RESULT_PENDING_VALUE = 1;
  /**
   * <pre>
   * Transaction is included in block
   * </pre>
   *
   * <code>TRANSACTION_RESULT_SUCCESS = 2;</code>
   */
  public static final int TRANSACTION_RESULT_SUCCESS_VALUE = 2;
  /**
   * <pre>
   * Failed to send transaction
   * </pre>
   *
   * <code>TRANSACTION_RESULT_FAILURE = 3;</code>
   */
  public static final int TRANSACTION_RESULT_FAILURE_VALUE = 3;
  /**
   * <code>TRANSACTION_RESULT_NONE = 100;</code>
   */
  public static final int TRANSACTION_RESULT_NONE_VALUE = 100;


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
  public static TransactionResult valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TransactionResult forNumber(int value) {
    switch (value) {
      case 0: return TRANSACTION_RESULT_INVALID;
      case 1: return TRANSACTION_RESULT_PENDING;
      case 2: return TRANSACTION_RESULT_SUCCESS;
      case 3: return TRANSACTION_RESULT_FAILURE;
      case 100: return TRANSACTION_RESULT_NONE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TransactionResult>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TransactionResult> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TransactionResult>() {
          public TransactionResult findValueByNumber(int number) {
            return TransactionResult.forNumber(number);
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
    return java.gincoinc.global.v1.EnumProto.getDescriptor().getEnumTypes().get(7);
  }

  private static final TransactionResult[] VALUES = values();

  public static TransactionResult valueOf(
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

  private TransactionResult(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:gincoinc.global.v1.TransactionResult)
}
