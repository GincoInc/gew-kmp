<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/enum.proto

namespace Adamant\PBGlobal\V1;

use UnexpectedValueException;

/**
 * Protobuf type <code>adamant.global.v1.DownloadResourceType</code>
 */
class DownloadResourceType
{
    /**
     * Generated from protobuf enum <code>DOWNLOAD_RESOURCE_TYPE_INVALID = 0;</code>
     */
    const DOWNLOAD_RESOURCE_TYPE_INVALID = 0;
    /**
     * Generated from protobuf enum <code>DOWNLOAD_RESOURCE_TYPE_ALL_WALLET_BALANCE_SNAPSHOT_EOD = 1;</code>
     */
    const DOWNLOAD_RESOURCE_TYPE_ALL_WALLET_BALANCE_SNAPSHOT_EOD = 1;
    /**
     * Generated from protobuf enum <code>DOWNLOAD_RESOURCE_TYPE_ALL_WALLET_GROUP_BALANCE_SNAPSHOT_EOD = 2;</code>
     */
    const DOWNLOAD_RESOURCE_TYPE_ALL_WALLET_GROUP_BALANCE_SNAPSHOT_EOD = 2;
    /**
     * Generated from protobuf enum <code>DOWNLOAD_RESOURCE_TYPE_ALL_WALLET_BALANCE_SNAPSHOT_ON_DEMAND = 3;</code>
     */
    const DOWNLOAD_RESOURCE_TYPE_ALL_WALLET_BALANCE_SNAPSHOT_ON_DEMAND = 3;
    /**
     * Generated from protobuf enum <code>DOWNLOAD_RESOURCE_TYPE_ALL_WALLET_GROUP_BALANCE_SNAPSHOT_ON_DEMAND = 4;</code>
     */
    const DOWNLOAD_RESOURCE_TYPE_ALL_WALLET_GROUP_BALANCE_SNAPSHOT_ON_DEMAND = 4;
    /**
     * Generated from protobuf enum <code>DOWNLOAD_RESOURCE_TYPE_WALLET_TRANSFER = 5;</code>
     */
    const DOWNLOAD_RESOURCE_TYPE_WALLET_TRANSFER = 5;
    /**
     * Generated from protobuf enum <code>DOWNLOAD_RESOURCE_TYPE_WALLET_ADDRESS = 6;</code>
     */
    const DOWNLOAD_RESOURCE_TYPE_WALLET_ADDRESS = 6;

    private static $valueToName = [
        self::DOWNLOAD_RESOURCE_TYPE_INVALID => 'DOWNLOAD_RESOURCE_TYPE_INVALID',
        self::DOWNLOAD_RESOURCE_TYPE_ALL_WALLET_BALANCE_SNAPSHOT_EOD => 'DOWNLOAD_RESOURCE_TYPE_ALL_WALLET_BALANCE_SNAPSHOT_EOD',
        self::DOWNLOAD_RESOURCE_TYPE_ALL_WALLET_GROUP_BALANCE_SNAPSHOT_EOD => 'DOWNLOAD_RESOURCE_TYPE_ALL_WALLET_GROUP_BALANCE_SNAPSHOT_EOD',
        self::DOWNLOAD_RESOURCE_TYPE_ALL_WALLET_BALANCE_SNAPSHOT_ON_DEMAND => 'DOWNLOAD_RESOURCE_TYPE_ALL_WALLET_BALANCE_SNAPSHOT_ON_DEMAND',
        self::DOWNLOAD_RESOURCE_TYPE_ALL_WALLET_GROUP_BALANCE_SNAPSHOT_ON_DEMAND => 'DOWNLOAD_RESOURCE_TYPE_ALL_WALLET_GROUP_BALANCE_SNAPSHOT_ON_DEMAND',
        self::DOWNLOAD_RESOURCE_TYPE_WALLET_TRANSFER => 'DOWNLOAD_RESOURCE_TYPE_WALLET_TRANSFER',
        self::DOWNLOAD_RESOURCE_TYPE_WALLET_ADDRESS => 'DOWNLOAD_RESOURCE_TYPE_WALLET_ADDRESS',
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
