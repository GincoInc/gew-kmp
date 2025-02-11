<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/global/v1/gincoincglobalv1/enum.proto

namespace Gincoinc\PBGlobal\V1;

use UnexpectedValueException;

/**
 * Protobuf type <code>gincoinc.global.v1.ContractCreationType</code>
 */
class ContractCreationType
{
    /**
     * Generated from protobuf enum <code>CONTRACT_CREATION_TYPE_INVALID = 0;</code>
     */
    const CONTRACT_CREATION_TYPE_INVALID = 0;
    /**
     * Generated from protobuf enum <code>CONTRACT_CREATION_TYPE_IMPL = 1;</code>
     */
    const CONTRACT_CREATION_TYPE_IMPL = 1;
    /**
     * Generated from protobuf enum <code>CONTRACT_CREATION_TYPE_UTILS = 2;</code>
     */
    const CONTRACT_CREATION_TYPE_UTILS = 2;

    private static $valueToName = [
        self::CONTRACT_CREATION_TYPE_INVALID => 'CONTRACT_CREATION_TYPE_INVALID',
        self::CONTRACT_CREATION_TYPE_IMPL => 'CONTRACT_CREATION_TYPE_IMPL',
        self::CONTRACT_CREATION_TYPE_UTILS => 'CONTRACT_CREATION_TYPE_UTILS',
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

