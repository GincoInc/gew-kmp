<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/global/v1/gincoincglobalv1/enum.proto

namespace Gincoinc\PBGlobal\V1;

use UnexpectedValueException;

/**
 * Protobuf type <code>gincoinc.global.v1.SolanaEventType</code>
 */
class SolanaEventType
{
    /**
     * Generated from protobuf enum <code>SOLANA_EVENT_TYPE_INVALID = 0;</code>
     */
    const SOLANA_EVENT_TYPE_INVALID = 0;
    /**
     * Generated from protobuf enum <code>SOLANA_EVENT_TYPE_DELEGATE = 1;</code>
     */
    const SOLANA_EVENT_TYPE_DELEGATE = 1;
    /**
     * Generated from protobuf enum <code>SOLANA_EVENT_TYPE_DEACTIVATE = 2;</code>
     */
    const SOLANA_EVENT_TYPE_DEACTIVATE = 2;
    /**
     * Generated from protobuf enum <code>SOLANA_EVENT_TYPE_WITHDRAW = 3;</code>
     */
    const SOLANA_EVENT_TYPE_WITHDRAW = 3;
    /**
     * ステークアカウント作成
     *
     * Generated from protobuf enum <code>SOLANA_EVENT_TYPE_STAKE_INIT = 4;</code>
     */
    const SOLANA_EVENT_TYPE_STAKE_INIT = 4;
    /**
     * ステータス遷移を監視する場合(ステータス変化するまで1Epoch要)
     * Withdrawだけは即時反映されるので不要
     *
     * Generated from protobuf enum <code>SOLANA_EVENT_TYPE_DELEGATE_COMPLETE = 5;</code>
     */
    const SOLANA_EVENT_TYPE_DELEGATE_COMPLETE = 5;
    /**
     * Deactivateステータス遷移時
     *
     * Generated from protobuf enum <code>SOLANA_EVENT_TYPE_DEACTIVATE_COMPLETE = 6;</code>
     */
    const SOLANA_EVENT_TYPE_DEACTIVATE_COMPLETE = 6;

    private static $valueToName = [
        self::SOLANA_EVENT_TYPE_INVALID => 'SOLANA_EVENT_TYPE_INVALID',
        self::SOLANA_EVENT_TYPE_DELEGATE => 'SOLANA_EVENT_TYPE_DELEGATE',
        self::SOLANA_EVENT_TYPE_DEACTIVATE => 'SOLANA_EVENT_TYPE_DEACTIVATE',
        self::SOLANA_EVENT_TYPE_WITHDRAW => 'SOLANA_EVENT_TYPE_WITHDRAW',
        self::SOLANA_EVENT_TYPE_STAKE_INIT => 'SOLANA_EVENT_TYPE_STAKE_INIT',
        self::SOLANA_EVENT_TYPE_DELEGATE_COMPLETE => 'SOLANA_EVENT_TYPE_DELEGATE_COMPLETE',
        self::SOLANA_EVENT_TYPE_DEACTIVATE_COMPLETE => 'SOLANA_EVENT_TYPE_DEACTIVATE_COMPLETE',
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
