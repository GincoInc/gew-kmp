<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/enum.proto

namespace Adamant\PBGlobal\V1;

use UnexpectedValueException;

/**
 * Protobuf type <code>adamant.global.v1.EventTriggeredMessageType</code>
 */
class EventTriggeredMessageType
{
    /**
     * Generated from protobuf enum <code>EVENT_TRIGGERED_MESSAGE_TYPE_INVALID = 0;</code>
     */
    const EVENT_TRIGGERED_MESSAGE_TYPE_INVALID = 0;
    /**
     * Generated from protobuf enum <code>EVENT_TRIGGERED_MESSAGE_TYPE_UNCHECKED_TRANSFER_ALERT = 1;</code>
     */
    const EVENT_TRIGGERED_MESSAGE_TYPE_UNCHECKED_TRANSFER_ALERT = 1;
    /**
     * Generated from protobuf enum <code>EVENT_TRIGGERED_MESSAGE_TYPE_FRAUDULENT_TRANSFER_ALERT = 2;</code>
     */
    const EVENT_TRIGGERED_MESSAGE_TYPE_FRAUDULENT_TRANSFER_ALERT = 2;

    private static $valueToName = [
        self::EVENT_TRIGGERED_MESSAGE_TYPE_INVALID => 'EVENT_TRIGGERED_MESSAGE_TYPE_INVALID',
        self::EVENT_TRIGGERED_MESSAGE_TYPE_UNCHECKED_TRANSFER_ALERT => 'EVENT_TRIGGERED_MESSAGE_TYPE_UNCHECKED_TRANSFER_ALERT',
        self::EVENT_TRIGGERED_MESSAGE_TYPE_FRAUDULENT_TRANSFER_ALERT => 'EVENT_TRIGGERED_MESSAGE_TYPE_FRAUDULENT_TRANSFER_ALERT',
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
