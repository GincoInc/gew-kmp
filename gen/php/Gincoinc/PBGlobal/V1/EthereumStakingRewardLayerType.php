<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/global/v1/gincoincglobalv1/enum.proto

namespace Gincoinc\PBGlobal\V1;

use UnexpectedValueException;

/**
 * Protobuf type <code>gincoinc.global.v1.EthereumStakingRewardLayerType</code>
 */
class EthereumStakingRewardLayerType
{
    /**
     * Generated from protobuf enum <code>ETHEREUM_STAKING_REWARD_LAYER_TYPE_INVALID = 0;</code>
     */
    const ETHEREUM_STAKING_REWARD_LAYER_TYPE_INVALID = 0;
    /**
     * Generated from protobuf enum <code>ETHEREUM_STAKING_REWARD_LAYER_TYPE_CONSENSUS = 1;</code>
     */
    const ETHEREUM_STAKING_REWARD_LAYER_TYPE_CONSENSUS = 1;
    /**
     * Generated from protobuf enum <code>ETHEREUM_STAKING_REWARD_LAYER_TYPE_EXECUTION = 2;</code>
     */
    const ETHEREUM_STAKING_REWARD_LAYER_TYPE_EXECUTION = 2;
    /**
     * Generated from protobuf enum <code>ETHEREUM_STAKING_REWARD_LAYER_TYPE_EXECUTION_MEV = 3;</code>
     */
    const ETHEREUM_STAKING_REWARD_LAYER_TYPE_EXECUTION_MEV = 3;

    private static $valueToName = [
        self::ETHEREUM_STAKING_REWARD_LAYER_TYPE_INVALID => 'ETHEREUM_STAKING_REWARD_LAYER_TYPE_INVALID',
        self::ETHEREUM_STAKING_REWARD_LAYER_TYPE_CONSENSUS => 'ETHEREUM_STAKING_REWARD_LAYER_TYPE_CONSENSUS',
        self::ETHEREUM_STAKING_REWARD_LAYER_TYPE_EXECUTION => 'ETHEREUM_STAKING_REWARD_LAYER_TYPE_EXECUTION',
        self::ETHEREUM_STAKING_REWARD_LAYER_TYPE_EXECUTION_MEV => 'ETHEREUM_STAKING_REWARD_LAYER_TYPE_EXECUTION_MEV',
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

