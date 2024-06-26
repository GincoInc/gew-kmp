<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/global/v1/gincoincglobalv1/enum.proto

namespace Gincoinc\PBGlobal\V1;

use UnexpectedValueException;

/**
 * XRPTransactionType is a type of xrp transaction.
 *
 * Protobuf type <code>gincoinc.global.v1.XRPTransactionType</code>
 */
class XRPTransactionType
{
    /**
     * Generated from protobuf enum <code>XRP_TRANSACTION_TYPE_INVALID = 0;</code>
     */
    const XRP_TRANSACTION_TYPE_INVALID = 0;
    /**
     * Generated from protobuf enum <code>XRP_TRANSACTION_TYPE_PAYMENT = 1;</code>
     */
    const XRP_TRANSACTION_TYPE_PAYMENT = 1;
    /**
     * Generated from protobuf enum <code>XRP_TRANSACTION_TYPE_SET_SIGNER_LIST = 2;</code>
     */
    const XRP_TRANSACTION_TYPE_SET_SIGNER_LIST = 2;
    /**
     * Generated from protobuf enum <code>XRP_TRANSACTION_TYPE_DISABLE_MASTER = 3;</code>
     */
    const XRP_TRANSACTION_TYPE_DISABLE_MASTER = 3;

    private static $valueToName = [
        self::XRP_TRANSACTION_TYPE_INVALID => 'XRP_TRANSACTION_TYPE_INVALID',
        self::XRP_TRANSACTION_TYPE_PAYMENT => 'XRP_TRANSACTION_TYPE_PAYMENT',
        self::XRP_TRANSACTION_TYPE_SET_SIGNER_LIST => 'XRP_TRANSACTION_TYPE_SET_SIGNER_LIST',
        self::XRP_TRANSACTION_TYPE_DISABLE_MASTER => 'XRP_TRANSACTION_TYPE_DISABLE_MASTER',
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

