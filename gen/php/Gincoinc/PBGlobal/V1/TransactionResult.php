<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/global/v1/gincoincglobalv1/enum.proto

namespace Gincoinc\PBGlobal\V1;

use UnexpectedValueException;

/**
 * TransactionResult is a result of transaction.
 *
 * Protobuf type <code>gincoinc.global.v1.TransactionResult</code>
 */
class TransactionResult
{
    /**
     * Generated from protobuf enum <code>TRANSACTION_RESULT_INVALID = 0;</code>
     */
    const TRANSACTION_RESULT_INVALID = 0;
    /**
     * Transaction is pending
     *
     * Generated from protobuf enum <code>TRANSACTION_RESULT_PENDING = 1;</code>
     */
    const TRANSACTION_RESULT_PENDING = 1;
    /**
     * Transaction is included in block
     *
     * Generated from protobuf enum <code>TRANSACTION_RESULT_SUCCESS = 2;</code>
     */
    const TRANSACTION_RESULT_SUCCESS = 2;
    /**
     * Failed to send transaction
     *
     * Generated from protobuf enum <code>TRANSACTION_RESULT_FAILURE = 3;</code>
     */
    const TRANSACTION_RESULT_FAILURE = 3;
    /**
     * Generated from protobuf enum <code>TRANSACTION_RESULT_NONE = 100;</code>
     */
    const TRANSACTION_RESULT_NONE = 100;

    private static $valueToName = [
        self::TRANSACTION_RESULT_INVALID => 'TRANSACTION_RESULT_INVALID',
        self::TRANSACTION_RESULT_PENDING => 'TRANSACTION_RESULT_PENDING',
        self::TRANSACTION_RESULT_SUCCESS => 'TRANSACTION_RESULT_SUCCESS',
        self::TRANSACTION_RESULT_FAILURE => 'TRANSACTION_RESULT_FAILURE',
        self::TRANSACTION_RESULT_NONE => 'TRANSACTION_RESULT_NONE',
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
