<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/global/v1/gincoincglobalv1/enum.proto

namespace Gincoinc\PBGlobal\V1;

use UnexpectedValueException;

/**
 * Protobuf type <code>gincoinc.global.v1.SolanaRecentBlockhashType</code>
 */
class SolanaRecentBlockhashType
{
    /**
     * Generated from protobuf enum <code>SOLANA_RECENT_BLOCKHASH_TYPE_INVALID = 0;</code>
     */
    const SOLANA_RECENT_BLOCKHASH_TYPE_INVALID = 0;
    /**
     * Generated from protobuf enum <code>SOLANA_RECENT_BLOCKHASH_TYPE_FINALIZED = 1;</code>
     */
    const SOLANA_RECENT_BLOCKHASH_TYPE_FINALIZED = 1;
    /**
     * Generated from protobuf enum <code>SOLANA_RECENT_BLOCKHASH_TYPE_CONFIRMED = 2;</code>
     */
    const SOLANA_RECENT_BLOCKHASH_TYPE_CONFIRMED = 2;
    /**
     * Generated from protobuf enum <code>SOLANA_RECENT_BLOCKHASH_TYPE_PROCESSED = 3;</code>
     */
    const SOLANA_RECENT_BLOCKHASH_TYPE_PROCESSED = 3;

    private static $valueToName = [
        self::SOLANA_RECENT_BLOCKHASH_TYPE_INVALID => 'SOLANA_RECENT_BLOCKHASH_TYPE_INVALID',
        self::SOLANA_RECENT_BLOCKHASH_TYPE_FINALIZED => 'SOLANA_RECENT_BLOCKHASH_TYPE_FINALIZED',
        self::SOLANA_RECENT_BLOCKHASH_TYPE_CONFIRMED => 'SOLANA_RECENT_BLOCKHASH_TYPE_CONFIRMED',
        self::SOLANA_RECENT_BLOCKHASH_TYPE_PROCESSED => 'SOLANA_RECENT_BLOCKHASH_TYPE_PROCESSED',
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

