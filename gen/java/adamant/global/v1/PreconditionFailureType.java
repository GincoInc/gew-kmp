// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/enum.proto

package java.adamant.global.v1;

/**
 * <pre>
 * ErrDetailViolationType define violation type of
 * errdetails.PreconditionFailure of grpc
 * </pre>
 *
 * Protobuf enum {@code adamant.global.v1.PreconditionFailureType}
 */
public enum PreconditionFailureType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PRECONDITION_FAILURE_TYPE_INVALID = 0;</code>
   */
  PRECONDITION_FAILURE_TYPE_INVALID(0),
  /**
   * <pre>
   * authenticator
   * </pre>
   *
   * <code>PRECONDITION_FAILURE_TYPE_MFA_REQUIRED = 1;</code>
   */
  PRECONDITION_FAILURE_TYPE_MFA_REQUIRED(1),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_MFA_NOT_REGISTERED = 2;</code>
   */
  PRECONDITION_FAILURE_TYPE_MFA_NOT_REGISTERED(2),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_USER_NOT_ACTIVE = 3;</code>
   */
  PRECONDITION_FAILURE_TYPE_USER_NOT_ACTIVE(3),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_USER_IS_ARCHIVED = 4;</code>
   */
  PRECONDITION_FAILURE_TYPE_USER_IS_ARCHIVED(4),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_EMAIL_IS_ALREADY_USED = 5;</code>
   */
  PRECONDITION_FAILURE_TYPE_EMAIL_IS_ALREADY_USED(5),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_INVITATION_TOKEN_IS_INVALID = 27;</code>
   */
  PRECONDITION_FAILURE_TYPE_INVITATION_TOKEN_IS_INVALID(27),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_INVITATION_TOKEN_IS_EXPIRED = 28;</code>
   */
  PRECONDITION_FAILURE_TYPE_INVITATION_TOKEN_IS_EXPIRED(28),
  /**
   * <pre>
   * treasurer/gatekeeper
   * </pre>
   *
   * <code>PRECONDITION_FAILURE_TYPE_INSUFFICIENT_SPENDABLE_BALANCE = 6;</code>
   */
  PRECONDITION_FAILURE_TYPE_INSUFFICIENT_SPENDABLE_BALANCE(6),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_HOURLY_LIMIT_EXCEEDED = 7;</code>
   */
  PRECONDITION_FAILURE_TYPE_HOURLY_LIMIT_EXCEEDED(7),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_DAILY_LIMIT_EXCEEDED = 8;</code>
   */
  PRECONDITION_FAILURE_TYPE_DAILY_LIMIT_EXCEEDED(8),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_ONETIME_LIMIT_EXCEEDED = 9;</code>
   */
  PRECONDITION_FAILURE_TYPE_ONETIME_LIMIT_EXCEEDED(9),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_WALLET_NAME_IS_ALREADY_USED = 10;</code>
   */
  PRECONDITION_FAILURE_TYPE_WALLET_NAME_IS_ALREADY_USED(10),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_WALLET_IS_CANCELED = 11;</code>
   */
  PRECONDITION_FAILURE_TYPE_WALLET_IS_CANCELED(11),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_WALLET_IS_ARCHIVED = 12;</code>
   */
  PRECONDITION_FAILURE_TYPE_WALLET_IS_ARCHIVED(12),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_TRANSACTION_IS_CANCELED = 13;</code>
   */
  PRECONDITION_FAILURE_TYPE_TRANSACTION_IS_CANCELED(13),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_PROPOSAL_ALREADY_EXISTS = 14;</code>
   */
  PRECONDITION_FAILURE_TYPE_PROPOSAL_ALREADY_EXISTS(14),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_NO_RATE = 15;</code>
   */
  PRECONDITION_FAILURE_TYPE_NO_RATE(15),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_WHITELIST_OF_BASEPOLICY = 16;</code>
   */
  PRECONDITION_FAILURE_TYPE_WHITELIST_OF_BASEPOLICY(16),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_CANNOT_ARCHIVE_WALLET_WITH_BALANCE = 17;</code>
   */
  PRECONDITION_FAILURE_TYPE_CANNOT_ARCHIVE_WALLET_WITH_BALANCE(17),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_TEMPORARY_INCREASE_IN_FEERATE = 18;</code>
   */
  PRECONDITION_FAILURE_TYPE_TEMPORARY_INCREASE_IN_FEERATE(18),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_INSUFFICIENT_FEE_ACCOUNT_BALANCE = 20;</code>
   */
  PRECONDITION_FAILURE_TYPE_INSUFFICIENT_FEE_ACCOUNT_BALANCE(20),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_CANNOT_FLUSH_BALANCE_DUE_TO_EXISTING_UNCONFIRMED_TRANSFERS = 21;</code>
   */
  PRECONDITION_FAILURE_TYPE_CANNOT_FLUSH_BALANCE_DUE_TO_EXISTING_UNCONFIRMED_TRANSFERS(21),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_WALLET_STATE_IS_FLUSHING = 22;</code>
   */
  PRECONDITION_FAILURE_TYPE_WALLET_STATE_IS_FLUSHING(22),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_WALLET_FLUSH_SETTING_DOES_NOT_EXIST = 23;</code>
   */
  PRECONDITION_FAILURE_TYPE_WALLET_FLUSH_SETTING_DOES_NOT_EXIST(23),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_TRANSACTION_ALREADY_CANCELED = 24;</code>
   */
  PRECONDITION_FAILURE_TYPE_TRANSACTION_ALREADY_CANCELED(24),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_TRANSACTION_ALREADY_SUBMITTED = 25;</code>
   */
  PRECONDITION_FAILURE_TYPE_TRANSACTION_ALREADY_SUBMITTED(25),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_CANNOT_OPERATE_TRANSACTION_DUE_TO_WALLET_STATE_IS_CREATING = 26;</code>
   */
  PRECONDITION_FAILURE_TYPE_CANNOT_OPERATE_TRANSACTION_DUE_TO_WALLET_STATE_IS_CREATING(26),
  /**
   * <code>PRECONDITION_FAILURE_TYPE_TRANSACTION_INCLUDE_SELF_ADDRESS = 29;</code>
   */
  PRECONDITION_FAILURE_TYPE_TRANSACTION_INCLUDE_SELF_ADDRESS(29),
  /**
   * <pre>
   * subscription
   * </pre>
   *
   * <code>PRECONDITION_FAILURE_TYPE_PROHIBITED_BY_SUBSCRIPTION = 19;</code>
   */
  PRECONDITION_FAILURE_TYPE_PROHIBITED_BY_SUBSCRIPTION(19),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PRECONDITION_FAILURE_TYPE_INVALID = 0;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_INVALID_VALUE = 0;
  /**
   * <pre>
   * authenticator
   * </pre>
   *
   * <code>PRECONDITION_FAILURE_TYPE_MFA_REQUIRED = 1;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_MFA_REQUIRED_VALUE = 1;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_MFA_NOT_REGISTERED = 2;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_MFA_NOT_REGISTERED_VALUE = 2;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_USER_NOT_ACTIVE = 3;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_USER_NOT_ACTIVE_VALUE = 3;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_USER_IS_ARCHIVED = 4;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_USER_IS_ARCHIVED_VALUE = 4;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_EMAIL_IS_ALREADY_USED = 5;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_EMAIL_IS_ALREADY_USED_VALUE = 5;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_INVITATION_TOKEN_IS_INVALID = 27;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_INVITATION_TOKEN_IS_INVALID_VALUE = 27;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_INVITATION_TOKEN_IS_EXPIRED = 28;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_INVITATION_TOKEN_IS_EXPIRED_VALUE = 28;
  /**
   * <pre>
   * treasurer/gatekeeper
   * </pre>
   *
   * <code>PRECONDITION_FAILURE_TYPE_INSUFFICIENT_SPENDABLE_BALANCE = 6;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_INSUFFICIENT_SPENDABLE_BALANCE_VALUE = 6;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_HOURLY_LIMIT_EXCEEDED = 7;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_HOURLY_LIMIT_EXCEEDED_VALUE = 7;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_DAILY_LIMIT_EXCEEDED = 8;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_DAILY_LIMIT_EXCEEDED_VALUE = 8;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_ONETIME_LIMIT_EXCEEDED = 9;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_ONETIME_LIMIT_EXCEEDED_VALUE = 9;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_WALLET_NAME_IS_ALREADY_USED = 10;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_WALLET_NAME_IS_ALREADY_USED_VALUE = 10;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_WALLET_IS_CANCELED = 11;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_WALLET_IS_CANCELED_VALUE = 11;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_WALLET_IS_ARCHIVED = 12;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_WALLET_IS_ARCHIVED_VALUE = 12;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_TRANSACTION_IS_CANCELED = 13;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_TRANSACTION_IS_CANCELED_VALUE = 13;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_PROPOSAL_ALREADY_EXISTS = 14;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_PROPOSAL_ALREADY_EXISTS_VALUE = 14;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_NO_RATE = 15;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_NO_RATE_VALUE = 15;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_WHITELIST_OF_BASEPOLICY = 16;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_WHITELIST_OF_BASEPOLICY_VALUE = 16;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_CANNOT_ARCHIVE_WALLET_WITH_BALANCE = 17;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_CANNOT_ARCHIVE_WALLET_WITH_BALANCE_VALUE = 17;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_TEMPORARY_INCREASE_IN_FEERATE = 18;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_TEMPORARY_INCREASE_IN_FEERATE_VALUE = 18;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_INSUFFICIENT_FEE_ACCOUNT_BALANCE = 20;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_INSUFFICIENT_FEE_ACCOUNT_BALANCE_VALUE = 20;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_CANNOT_FLUSH_BALANCE_DUE_TO_EXISTING_UNCONFIRMED_TRANSFERS = 21;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_CANNOT_FLUSH_BALANCE_DUE_TO_EXISTING_UNCONFIRMED_TRANSFERS_VALUE = 21;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_WALLET_STATE_IS_FLUSHING = 22;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_WALLET_STATE_IS_FLUSHING_VALUE = 22;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_WALLET_FLUSH_SETTING_DOES_NOT_EXIST = 23;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_WALLET_FLUSH_SETTING_DOES_NOT_EXIST_VALUE = 23;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_TRANSACTION_ALREADY_CANCELED = 24;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_TRANSACTION_ALREADY_CANCELED_VALUE = 24;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_TRANSACTION_ALREADY_SUBMITTED = 25;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_TRANSACTION_ALREADY_SUBMITTED_VALUE = 25;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_CANNOT_OPERATE_TRANSACTION_DUE_TO_WALLET_STATE_IS_CREATING = 26;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_CANNOT_OPERATE_TRANSACTION_DUE_TO_WALLET_STATE_IS_CREATING_VALUE = 26;
  /**
   * <code>PRECONDITION_FAILURE_TYPE_TRANSACTION_INCLUDE_SELF_ADDRESS = 29;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_TRANSACTION_INCLUDE_SELF_ADDRESS_VALUE = 29;
  /**
   * <pre>
   * subscription
   * </pre>
   *
   * <code>PRECONDITION_FAILURE_TYPE_PROHIBITED_BY_SUBSCRIPTION = 19;</code>
   */
  public static final int PRECONDITION_FAILURE_TYPE_PROHIBITED_BY_SUBSCRIPTION_VALUE = 19;


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
  public static PreconditionFailureType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PreconditionFailureType forNumber(int value) {
    switch (value) {
      case 0: return PRECONDITION_FAILURE_TYPE_INVALID;
      case 1: return PRECONDITION_FAILURE_TYPE_MFA_REQUIRED;
      case 2: return PRECONDITION_FAILURE_TYPE_MFA_NOT_REGISTERED;
      case 3: return PRECONDITION_FAILURE_TYPE_USER_NOT_ACTIVE;
      case 4: return PRECONDITION_FAILURE_TYPE_USER_IS_ARCHIVED;
      case 5: return PRECONDITION_FAILURE_TYPE_EMAIL_IS_ALREADY_USED;
      case 27: return PRECONDITION_FAILURE_TYPE_INVITATION_TOKEN_IS_INVALID;
      case 28: return PRECONDITION_FAILURE_TYPE_INVITATION_TOKEN_IS_EXPIRED;
      case 6: return PRECONDITION_FAILURE_TYPE_INSUFFICIENT_SPENDABLE_BALANCE;
      case 7: return PRECONDITION_FAILURE_TYPE_HOURLY_LIMIT_EXCEEDED;
      case 8: return PRECONDITION_FAILURE_TYPE_DAILY_LIMIT_EXCEEDED;
      case 9: return PRECONDITION_FAILURE_TYPE_ONETIME_LIMIT_EXCEEDED;
      case 10: return PRECONDITION_FAILURE_TYPE_WALLET_NAME_IS_ALREADY_USED;
      case 11: return PRECONDITION_FAILURE_TYPE_WALLET_IS_CANCELED;
      case 12: return PRECONDITION_FAILURE_TYPE_WALLET_IS_ARCHIVED;
      case 13: return PRECONDITION_FAILURE_TYPE_TRANSACTION_IS_CANCELED;
      case 14: return PRECONDITION_FAILURE_TYPE_PROPOSAL_ALREADY_EXISTS;
      case 15: return PRECONDITION_FAILURE_TYPE_NO_RATE;
      case 16: return PRECONDITION_FAILURE_TYPE_WHITELIST_OF_BASEPOLICY;
      case 17: return PRECONDITION_FAILURE_TYPE_CANNOT_ARCHIVE_WALLET_WITH_BALANCE;
      case 18: return PRECONDITION_FAILURE_TYPE_TEMPORARY_INCREASE_IN_FEERATE;
      case 20: return PRECONDITION_FAILURE_TYPE_INSUFFICIENT_FEE_ACCOUNT_BALANCE;
      case 21: return PRECONDITION_FAILURE_TYPE_CANNOT_FLUSH_BALANCE_DUE_TO_EXISTING_UNCONFIRMED_TRANSFERS;
      case 22: return PRECONDITION_FAILURE_TYPE_WALLET_STATE_IS_FLUSHING;
      case 23: return PRECONDITION_FAILURE_TYPE_WALLET_FLUSH_SETTING_DOES_NOT_EXIST;
      case 24: return PRECONDITION_FAILURE_TYPE_TRANSACTION_ALREADY_CANCELED;
      case 25: return PRECONDITION_FAILURE_TYPE_TRANSACTION_ALREADY_SUBMITTED;
      case 26: return PRECONDITION_FAILURE_TYPE_CANNOT_OPERATE_TRANSACTION_DUE_TO_WALLET_STATE_IS_CREATING;
      case 29: return PRECONDITION_FAILURE_TYPE_TRANSACTION_INCLUDE_SELF_ADDRESS;
      case 19: return PRECONDITION_FAILURE_TYPE_PROHIBITED_BY_SUBSCRIPTION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PreconditionFailureType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PreconditionFailureType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PreconditionFailureType>() {
          public PreconditionFailureType findValueByNumber(int number) {
            return PreconditionFailureType.forNumber(number);
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
    return java.adamant.global.v1.EnumProto.getDescriptor().getEnumTypes().get(15);
  }

  private static final PreconditionFailureType[] VALUES = values();

  public static PreconditionFailureType valueOf(
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

  private PreconditionFailureType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:adamant.global.v1.PreconditionFailureType)
}
