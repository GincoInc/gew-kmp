<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/enum.proto

namespace Adamant\PBGlobal\V1;

use UnexpectedValueException;

/**
 * Protobuf type <code>adamant.global.v1.PreTransactionState</code>
 */
class PreTransactionState
{
    /**
     * Generated from protobuf enum <code>PRE_TRANSACTION_STATE_INVALID = 0;</code>
     */
    const PRE_TRANSACTION_STATE_INVALID = 0;
    /**
     * Waiting for approve
     *
     * Generated from protobuf enum <code>PRE_TRANSACTION_STATE_APPROVING = 1;</code>
     */
    const PRE_TRANSACTION_STATE_APPROVING = 1;
    /**
     * Pre-transaction was approved or Transaction where it was used got canceled
     *
     * Generated from protobuf enum <code>PRE_TRANSACTION_STATE_AVAILABLE = 2;</code>
     */
    const PRE_TRANSACTION_STATE_AVAILABLE = 2;
    /**
     * Pre-transaction was rejected by reviewer
     *
     * Generated from protobuf enum <code>PRE_TRANSACTION_STATE_REJECTED = 3;</code>
     */
    const PRE_TRANSACTION_STATE_REJECTED = 3;
    /**
     * Pre-transaction was canceled
     *
     * Generated from protobuf enum <code>PRE_TRANSACTION_STATE_CANCELLED = 4;</code>
     */
    const PRE_TRANSACTION_STATE_CANCELLED = 4;
    /**
     * Pre-transaction was used for Transaction creation
     *
     * Generated from protobuf enum <code>PRE_TRANSACTION_STATE_USED = 5;</code>
     */
    const PRE_TRANSACTION_STATE_USED = 5;

    private static $valueToName = [
        self::PRE_TRANSACTION_STATE_INVALID => 'PRE_TRANSACTION_STATE_INVALID',
        self::PRE_TRANSACTION_STATE_APPROVING => 'PRE_TRANSACTION_STATE_APPROVING',
        self::PRE_TRANSACTION_STATE_AVAILABLE => 'PRE_TRANSACTION_STATE_AVAILABLE',
        self::PRE_TRANSACTION_STATE_REJECTED => 'PRE_TRANSACTION_STATE_REJECTED',
        self::PRE_TRANSACTION_STATE_CANCELLED => 'PRE_TRANSACTION_STATE_CANCELLED',
        self::PRE_TRANSACTION_STATE_USED => 'PRE_TRANSACTION_STATE_USED',
    ];

    public static function name($value)
    {
        if (!isset(self::$valueToName[$value])) {
            throw new UnexpectedValueException(sprintf(
                    'Enum %s has no name defined for value %s', __CLASS__, $value));
        }
        return self::$valueToName[$value];
    }


    public static function value($name)
    {
        $const = __CLASS__ . '::' . strtoupper($name);
        if (!defined($const)) {
            throw new UnexpectedValueException(sprintf(
                    'Enum %s has no value defined for name %s', __CLASS__, $name));
        }
        return constant($const);
    }
}

