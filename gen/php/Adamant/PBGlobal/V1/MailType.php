<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/enum.proto

namespace Adamant\PBGlobal\V1;

use UnexpectedValueException;

/**
 * Protobuf type <code>adamant.global.v1.MailType</code>
 */
class MailType
{
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_INVALID = 0;</code>
     */
    const MAIL_TYPE_INVALID = 0;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_USER_INVITED = 1;</code>
     */
    const MAIL_TYPE_USER_INVITED = 1;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_PASSWORD_RESET_REQUEST = 2;</code>
     */
    const MAIL_TYPE_PASSWORD_RESET_REQUEST = 2;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_PASSWORD_UPDATED = 3;</code>
     */
    const MAIL_TYPE_PASSWORD_UPDATED = 3;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_EMAIL_UPDATE_REQUEST = 4;</code>
     */
    const MAIL_TYPE_EMAIL_UPDATE_REQUEST = 4;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_EMAIL_UPDATED = 5;</code>
     */
    const MAIL_TYPE_EMAIL_UPDATED = 5;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_FRAUD_TRANSACTION_SUBMITTED = 6;</code>
     */
    const MAIL_TYPE_FRAUD_TRANSACTION_SUBMITTED = 6;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_IMPORT_ADDRESS_COMPLETED = 7;</code>
     */
    const MAIL_TYPE_IMPORT_ADDRESS_COMPLETED = 7;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_VALIDATOR_CHANGE_REQUESTED = 8;</code>
     */
    const MAIL_TYPE_VALIDATOR_CHANGE_REQUESTED = 8;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_UNCHECKED_TRANSFER_EXISTS = 9;</code>
     */
    const MAIL_TYPE_UNCHECKED_TRANSFER_EXISTS = 9;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_DOWNLOAD_RESOURCE = 10;</code>
     */
    const MAIL_TYPE_DOWNLOAD_RESOURCE = 10;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_TRANSFER_RECEIVED = 11;</code>
     */
    const MAIL_TYPE_TRANSFER_RECEIVED = 11;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_PRE_TRANSACTION_APPROVED = 29;</code>
     */
    const MAIL_TYPE_PRE_TRANSACTION_APPROVED = 29;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_PRE_TRANSACTION_REJECTED = 30;</code>
     */
    const MAIL_TYPE_PRE_TRANSACTION_REJECTED = 30;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_TRANSACTION_CREATED = 12;</code>
     */
    const MAIL_TYPE_TRANSACTION_CREATED = 12;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_TRANSACTION_SUBMITTED = 13;</code>
     */
    const MAIL_TYPE_TRANSACTION_SUBMITTED = 13;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_TRANSACTION_RESENT = 20;</code>
     */
    const MAIL_TYPE_TRANSACTION_RESENT = 20;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_VALIDATOR_APPROVED = 14;</code>
     */
    const MAIL_TYPE_VALIDATOR_APPROVED = 14;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_VALIDATOR_CANCELED = 15;</code>
     */
    const MAIL_TYPE_VALIDATOR_CANCELED = 15;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_WALLET_POLICY_CHANGED = 16;</code>
     */
    const MAIL_TYPE_WALLET_POLICY_CHANGED = 16;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_WALLET_NO_WHITELIST_REQUESTED = 17;</code>
     */
    const MAIL_TYPE_WALLET_NO_WHITELIST_REQUESTED = 17;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_WALLET_NO_WHITELIST_APPROVED = 18;</code>
     */
    const MAIL_TYPE_WALLET_NO_WHITELIST_APPROVED = 18;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_WALLET_NO_WHITELIST_CANCELED = 19;</code>
     */
    const MAIL_TYPE_WALLET_NO_WHITELIST_CANCELED = 19;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_MAIL_SETTINGS_UPDATED = 21;</code>
     */
    const MAIL_TYPE_MAIL_SETTINGS_UPDATED = 21;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_PRE_TRANSACTION_THRESHOLD_CREATION_REQUESTED = 22;</code>
     */
    const MAIL_TYPE_PRE_TRANSACTION_THRESHOLD_CREATION_REQUESTED = 22;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_PRE_TRANSACTION_THRESHOLD_CREATION_APPROVED = 23;</code>
     */
    const MAIL_TYPE_PRE_TRANSACTION_THRESHOLD_CREATION_APPROVED = 23;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_PRE_TRANSACTION_THRESHOLD_CREATION_REJECTED = 24;</code>
     */
    const MAIL_TYPE_PRE_TRANSACTION_THRESHOLD_CREATION_REJECTED = 24;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_PRE_TRANSACTION_THRESHOLD_CHANGE_REQUESTED = 25;</code>
     */
    const MAIL_TYPE_PRE_TRANSACTION_THRESHOLD_CHANGE_REQUESTED = 25;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_PRE_TRANSACTION_THRESHOLD_CHANGE_APPROVED = 26;</code>
     */
    const MAIL_TYPE_PRE_TRANSACTION_THRESHOLD_CHANGE_APPROVED = 26;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_PRE_TRANSACTION_THRESHOLD_CHANGE_REJECTED = 27;</code>
     */
    const MAIL_TYPE_PRE_TRANSACTION_THRESHOLD_CHANGE_REJECTED = 27;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_BLACKLIST_ADDRESS_CREATION_REQUESTED = 31;</code>
     */
    const MAIL_TYPE_BLACKLIST_ADDRESS_CREATION_REQUESTED = 31;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_BLACKLIST_ADDRESS_CREATION_APPROVED = 32;</code>
     */
    const MAIL_TYPE_BLACKLIST_ADDRESS_CREATION_APPROVED = 32;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_BLACKLIST_ADDRESS_CREATION_REJECTED = 33;</code>
     */
    const MAIL_TYPE_BLACKLIST_ADDRESS_CREATION_REJECTED = 33;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_BLACKLIST_ADDRESS_IMPORT_REQUESTED = 34;</code>
     */
    const MAIL_TYPE_BLACKLIST_ADDRESS_IMPORT_REQUESTED = 34;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_BLACKLIST_ADDRESS_IMPORT_FAILED = 35;</code>
     */
    const MAIL_TYPE_BLACKLIST_ADDRESS_IMPORT_FAILED = 35;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_BLACKLIST_ADDRESS_IMPORT_APPROVED = 36;</code>
     */
    const MAIL_TYPE_BLACKLIST_ADDRESS_IMPORT_APPROVED = 36;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_BLACKLIST_ADDRESS_IMPORT_REJECTED = 37;</code>
     */
    const MAIL_TYPE_BLACKLIST_ADDRESS_IMPORT_REJECTED = 37;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_BLACKLIST_ADDRESS_CHANGE_REQUESTED = 38;</code>
     */
    const MAIL_TYPE_BLACKLIST_ADDRESS_CHANGE_REQUESTED = 38;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_BLACKLIST_ADDRESS_CHANGE_APPROVED = 39;</code>
     */
    const MAIL_TYPE_BLACKLIST_ADDRESS_CHANGE_APPROVED = 39;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_BLACKLIST_ADDRESS_CHANGE_REJECTED = 40;</code>
     */
    const MAIL_TYPE_BLACKLIST_ADDRESS_CHANGE_REJECTED = 40;
    /**
     * Generated from protobuf enum <code>MAIL_TYPE_BLACKLIST_ADDRESS_EXPORT_REQUESTED = 41;</code>
     */
    const MAIL_TYPE_BLACKLIST_ADDRESS_EXPORT_REQUESTED = 41;

    private static $valueToName = [
        self::MAIL_TYPE_INVALID => 'MAIL_TYPE_INVALID',
        self::MAIL_TYPE_USER_INVITED => 'MAIL_TYPE_USER_INVITED',
        self::MAIL_TYPE_PASSWORD_RESET_REQUEST => 'MAIL_TYPE_PASSWORD_RESET_REQUEST',
        self::MAIL_TYPE_PASSWORD_UPDATED => 'MAIL_TYPE_PASSWORD_UPDATED',
        self::MAIL_TYPE_EMAIL_UPDATE_REQUEST => 'MAIL_TYPE_EMAIL_UPDATE_REQUEST',
        self::MAIL_TYPE_EMAIL_UPDATED => 'MAIL_TYPE_EMAIL_UPDATED',
        self::MAIL_TYPE_FRAUD_TRANSACTION_SUBMITTED => 'MAIL_TYPE_FRAUD_TRANSACTION_SUBMITTED',
        self::MAIL_TYPE_IMPORT_ADDRESS_COMPLETED => 'MAIL_TYPE_IMPORT_ADDRESS_COMPLETED',
        self::MAIL_TYPE_VALIDATOR_CHANGE_REQUESTED => 'MAIL_TYPE_VALIDATOR_CHANGE_REQUESTED',
        self::MAIL_TYPE_UNCHECKED_TRANSFER_EXISTS => 'MAIL_TYPE_UNCHECKED_TRANSFER_EXISTS',
        self::MAIL_TYPE_DOWNLOAD_RESOURCE => 'MAIL_TYPE_DOWNLOAD_RESOURCE',
        self::MAIL_TYPE_TRANSFER_RECEIVED => 'MAIL_TYPE_TRANSFER_RECEIVED',
        self::MAIL_TYPE_PRE_TRANSACTION_APPROVED => 'MAIL_TYPE_PRE_TRANSACTION_APPROVED',
        self::MAIL_TYPE_PRE_TRANSACTION_REJECTED => 'MAIL_TYPE_PRE_TRANSACTION_REJECTED',
        self::MAIL_TYPE_TRANSACTION_CREATED => 'MAIL_TYPE_TRANSACTION_CREATED',
        self::MAIL_TYPE_TRANSACTION_SUBMITTED => 'MAIL_TYPE_TRANSACTION_SUBMITTED',
        self::MAIL_TYPE_TRANSACTION_RESENT => 'MAIL_TYPE_TRANSACTION_RESENT',
        self::MAIL_TYPE_VALIDATOR_APPROVED => 'MAIL_TYPE_VALIDATOR_APPROVED',
        self::MAIL_TYPE_VALIDATOR_CANCELED => 'MAIL_TYPE_VALIDATOR_CANCELED',
        self::MAIL_TYPE_WALLET_POLICY_CHANGED => 'MAIL_TYPE_WALLET_POLICY_CHANGED',
        self::MAIL_TYPE_WALLET_NO_WHITELIST_REQUESTED => 'MAIL_TYPE_WALLET_NO_WHITELIST_REQUESTED',
        self::MAIL_TYPE_WALLET_NO_WHITELIST_APPROVED => 'MAIL_TYPE_WALLET_NO_WHITELIST_APPROVED',
        self::MAIL_TYPE_WALLET_NO_WHITELIST_CANCELED => 'MAIL_TYPE_WALLET_NO_WHITELIST_CANCELED',
        self::MAIL_TYPE_MAIL_SETTINGS_UPDATED => 'MAIL_TYPE_MAIL_SETTINGS_UPDATED',
        self::MAIL_TYPE_PRE_TRANSACTION_THRESHOLD_CREATION_REQUESTED => 'MAIL_TYPE_PRE_TRANSACTION_THRESHOLD_CREATION_REQUESTED',
        self::MAIL_TYPE_PRE_TRANSACTION_THRESHOLD_CREATION_APPROVED => 'MAIL_TYPE_PRE_TRANSACTION_THRESHOLD_CREATION_APPROVED',
        self::MAIL_TYPE_PRE_TRANSACTION_THRESHOLD_CREATION_REJECTED => 'MAIL_TYPE_PRE_TRANSACTION_THRESHOLD_CREATION_REJECTED',
        self::MAIL_TYPE_PRE_TRANSACTION_THRESHOLD_CHANGE_REQUESTED => 'MAIL_TYPE_PRE_TRANSACTION_THRESHOLD_CHANGE_REQUESTED',
        self::MAIL_TYPE_PRE_TRANSACTION_THRESHOLD_CHANGE_APPROVED => 'MAIL_TYPE_PRE_TRANSACTION_THRESHOLD_CHANGE_APPROVED',
        self::MAIL_TYPE_PRE_TRANSACTION_THRESHOLD_CHANGE_REJECTED => 'MAIL_TYPE_PRE_TRANSACTION_THRESHOLD_CHANGE_REJECTED',
        self::MAIL_TYPE_BLACKLIST_ADDRESS_CREATION_REQUESTED => 'MAIL_TYPE_BLACKLIST_ADDRESS_CREATION_REQUESTED',
        self::MAIL_TYPE_BLACKLIST_ADDRESS_CREATION_APPROVED => 'MAIL_TYPE_BLACKLIST_ADDRESS_CREATION_APPROVED',
        self::MAIL_TYPE_BLACKLIST_ADDRESS_CREATION_REJECTED => 'MAIL_TYPE_BLACKLIST_ADDRESS_CREATION_REJECTED',
        self::MAIL_TYPE_BLACKLIST_ADDRESS_IMPORT_REQUESTED => 'MAIL_TYPE_BLACKLIST_ADDRESS_IMPORT_REQUESTED',
        self::MAIL_TYPE_BLACKLIST_ADDRESS_IMPORT_FAILED => 'MAIL_TYPE_BLACKLIST_ADDRESS_IMPORT_FAILED',
        self::MAIL_TYPE_BLACKLIST_ADDRESS_IMPORT_APPROVED => 'MAIL_TYPE_BLACKLIST_ADDRESS_IMPORT_APPROVED',
        self::MAIL_TYPE_BLACKLIST_ADDRESS_IMPORT_REJECTED => 'MAIL_TYPE_BLACKLIST_ADDRESS_IMPORT_REJECTED',
        self::MAIL_TYPE_BLACKLIST_ADDRESS_CHANGE_REQUESTED => 'MAIL_TYPE_BLACKLIST_ADDRESS_CHANGE_REQUESTED',
        self::MAIL_TYPE_BLACKLIST_ADDRESS_CHANGE_APPROVED => 'MAIL_TYPE_BLACKLIST_ADDRESS_CHANGE_APPROVED',
        self::MAIL_TYPE_BLACKLIST_ADDRESS_CHANGE_REJECTED => 'MAIL_TYPE_BLACKLIST_ADDRESS_CHANGE_REJECTED',
        self::MAIL_TYPE_BLACKLIST_ADDRESS_EXPORT_REQUESTED => 'MAIL_TYPE_BLACKLIST_ADDRESS_EXPORT_REQUESTED',
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

