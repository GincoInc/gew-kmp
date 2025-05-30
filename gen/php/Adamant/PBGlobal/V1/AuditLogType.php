<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/enum.proto

namespace Adamant\PBGlobal\V1;

use UnexpectedValueException;

/**
 * AuditLogType is a type of AuditLog
 *
 * Protobuf type <code>adamant.global.v1.AuditLogType</code>
 */
class AuditLogType
{
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_INVALID = 0;</code>
     */
    const AUDIT_LOG_TYPE_INVALID = 0;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_LOGIN = 1;</code>
     */
    const AUDIT_LOG_TYPE_LOGIN = 1;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_LOGIN_FAIL = 2;</code>
     */
    const AUDIT_LOG_TYPE_LOGIN_FAIL = 2;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_2FA_FAIL = 50;</code>
     */
    const AUDIT_LOG_TYPE_2FA_FAIL = 50;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_LOGOUT = 3;</code>
     */
    const AUDIT_LOG_TYPE_LOGOUT = 3;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_MAIL_SETTINGS_CHANGE = 80;</code>
     */
    const AUDIT_LOG_TYPE_MAIL_SETTINGS_CHANGE = 80;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_WALLET_CREATE = 4;</code>
     */
    const AUDIT_LOG_TYPE_WALLET_CREATE = 4;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_WALLET_APPROVE = 5;</code>
     */
    const AUDIT_LOG_TYPE_WALLET_APPROVE = 5;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_WALLET_CANCEL = 6;</code>
     */
    const AUDIT_LOG_TYPE_WALLET_CANCEL = 6;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_WALLET_REGISTER_PUBKEY = 7;</code>
     */
    const AUDIT_LOG_TYPE_WALLET_REGISTER_PUBKEY = 7;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_WALLET_ARCHIVE = 8;</code>
     */
    const AUDIT_LOG_TYPE_WALLET_ARCHIVE = 8;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_WALLET_UNARCHIVE = 9;</code>
     */
    const AUDIT_LOG_TYPE_WALLET_UNARCHIVE = 9;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_WALLET_NAME_CHANGE = 10;</code>
     */
    const AUDIT_LOG_TYPE_WALLET_NAME_CHANGE = 10;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_WALLET_POLICY_CHANGE = 11;</code>
     */
    const AUDIT_LOG_TYPE_WALLET_POLICY_CHANGE = 11;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_WALLET_NO_WHITELIST_REQUEST = 12;</code>
     */
    const AUDIT_LOG_TYPE_WALLET_NO_WHITELIST_REQUEST = 12;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_WALLET_NO_WHITELIST_APPROVE = 13;</code>
     */
    const AUDIT_LOG_TYPE_WALLET_NO_WHITELIST_APPROVE = 13;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_WALLET_NO_WHITELIST_CANCEL = 14;</code>
     */
    const AUDIT_LOG_TYPE_WALLET_NO_WHITELIST_CANCEL = 14;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_WALLET_ADDRESS_UPLOAD = 51;</code>
     */
    const AUDIT_LOG_TYPE_WALLET_ADDRESS_UPLOAD = 51;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_WALLET_ADDRESS_DOWNLOAD = 52;</code>
     */
    const AUDIT_LOG_TYPE_WALLET_ADDRESS_DOWNLOAD = 52;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_WALLET_ADDRESS_DELETE = 53;</code>
     */
    const AUDIT_LOG_TYPE_WALLET_ADDRESS_DELETE = 53;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_WALLET_VALIDATOR_CHANGE = 60;</code>
     */
    const AUDIT_LOG_TYPE_WALLET_VALIDATOR_CHANGE = 60;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_WALLET_VALIDATOR_APPROVE = 61;</code>
     */
    const AUDIT_LOG_TYPE_WALLET_VALIDATOR_APPROVE = 61;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_WALLET_VALIDATOR_CANCEL = 62;</code>
     */
    const AUDIT_LOG_TYPE_WALLET_VALIDATOR_CANCEL = 62;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_WALLET_DESTINATION_WALLET_CHANGE = 63;</code>
     */
    const AUDIT_LOG_TYPE_WALLET_DESTINATION_WALLET_CHANGE = 63;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_WALLET_GROUP_CREATE = 54;</code>
     */
    const AUDIT_LOG_TYPE_WALLET_GROUP_CREATE = 54;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_WALLET_GROUP_NAME_CHANGE = 55;</code>
     */
    const AUDIT_LOG_TYPE_WALLET_GROUP_NAME_CHANGE = 55;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_WALLET_GROUP_CHANGE = 56;</code>
     */
    const AUDIT_LOG_TYPE_WALLET_GROUP_CHANGE = 56;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_TRANSACTION_CREATE = 15;</code>
     */
    const AUDIT_LOG_TYPE_TRANSACTION_CREATE = 15;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_TRANSACTION_APPROVE = 16;</code>
     */
    const AUDIT_LOG_TYPE_TRANSACTION_APPROVE = 16;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_TRANSACTION_CANCEL = 17;</code>
     */
    const AUDIT_LOG_TYPE_TRANSACTION_CANCEL = 17;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_TRANSACTION_REGISTER_SIGNATURE = 18;</code>
     */
    const AUDIT_LOG_TYPE_TRANSACTION_REGISTER_SIGNATURE = 18;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_TRANSACTION_SUBMIT = 19;</code>
     */
    const AUDIT_LOG_TYPE_TRANSACTION_SUBMIT = 19;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_TRANSACTION_RESEND = 79;</code>
     */
    const AUDIT_LOG_TYPE_TRANSACTION_RESEND = 79;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_TRANSACTION_REPLACE = 98;</code>
     */
    const AUDIT_LOG_TYPE_TRANSACTION_REPLACE = 98;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_ACCOUNT_PASSWORD_CHANGE = 20;</code>
     */
    const AUDIT_LOG_TYPE_ACCOUNT_PASSWORD_CHANGE = 20;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_ACCOUNT_EMAIL_CHANGE = 21;</code>
     */
    const AUDIT_LOG_TYPE_ACCOUNT_EMAIL_CHANGE = 21;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_ACCOUNT_INVITE = 22;</code>
     */
    const AUDIT_LOG_TYPE_ACCOUNT_INVITE = 22;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_ACCOUNT_ARCHIVE = 23;</code>
     */
    const AUDIT_LOG_TYPE_ACCOUNT_ARCHIVE = 23;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_ACCOUNT_UNARCHIVE = 24;</code>
     */
    const AUDIT_LOG_TYPE_ACCOUNT_UNARCHIVE = 24;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_SERVICE_ACCOUNT_CREATE = 25;</code>
     */
    const AUDIT_LOG_TYPE_SERVICE_ACCOUNT_CREATE = 25;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_SERVICE_ACCOUNT_CHANGE_PERMISSION = 26;</code>
     */
    const AUDIT_LOG_TYPE_SERVICE_ACCOUNT_CHANGE_PERMISSION = 26;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_SERVICE_ACCOUNT_ACTIVATE = 27;</code>
     */
    const AUDIT_LOG_TYPE_SERVICE_ACCOUNT_ACTIVATE = 27;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_SERVICE_ACCOUNT_INACTIVE = 28;</code>
     */
    const AUDIT_LOG_TYPE_SERVICE_ACCOUNT_INACTIVE = 28;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_SERVICE_ACCOUNT_DELETE = 29;</code>
     */
    const AUDIT_LOG_TYPE_SERVICE_ACCOUNT_DELETE = 29;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_SERVICE_ACCOUNT_KEY_CREATE = 30;</code>
     */
    const AUDIT_LOG_TYPE_SERVICE_ACCOUNT_KEY_CREATE = 30;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_SERVICE_ACCOUNT_KEY_DELETE = 31;</code>
     */
    const AUDIT_LOG_TYPE_SERVICE_ACCOUNT_KEY_DELETE = 31;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_POLICY_ADDRESS_CREATE = 32;</code>
     */
    const AUDIT_LOG_TYPE_POLICY_ADDRESS_CREATE = 32;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_POLICY_ADDRESS_DELETE = 33;</code>
     */
    const AUDIT_LOG_TYPE_POLICY_ADDRESS_DELETE = 33;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_POLICY_ADDRESS_APPROVE = 34;</code>
     */
    const AUDIT_LOG_TYPE_POLICY_ADDRESS_APPROVE = 34;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_POLICY_ADDRESS_CANCEL = 35;</code>
     */
    const AUDIT_LOG_TYPE_POLICY_ADDRESS_CANCEL = 35;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_POLICY_SPENDING_LIMIT_CREATE = 36;</code>
     */
    const AUDIT_LOG_TYPE_POLICY_SPENDING_LIMIT_CREATE = 36;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_POLICY_SPENDING_LIMIT_CHANGE = 37;</code>
     */
    const AUDIT_LOG_TYPE_POLICY_SPENDING_LIMIT_CHANGE = 37;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_POLICY_SPENDING_LIMIT_DELETE = 38;</code>
     */
    const AUDIT_LOG_TYPE_POLICY_SPENDING_LIMIT_DELETE = 38;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_POLICY_SPENDING_LIMIT_APPROVE = 39;</code>
     */
    const AUDIT_LOG_TYPE_POLICY_SPENDING_LIMIT_APPROVE = 39;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_POLICY_SPENDING_LIMIT_CANCEL = 40;</code>
     */
    const AUDIT_LOG_TYPE_POLICY_SPENDING_LIMIT_CANCEL = 40;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_POLICY_WHITELIST_CREATE = 41;</code>
     */
    const AUDIT_LOG_TYPE_POLICY_WHITELIST_CREATE = 41;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_POLICY_WHITELIST_CHANGE = 42;</code>
     */
    const AUDIT_LOG_TYPE_POLICY_WHITELIST_CHANGE = 42;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_POLICY_WHITELIST_DELETE = 43;</code>
     */
    const AUDIT_LOG_TYPE_POLICY_WHITELIST_DELETE = 43;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_POLICY_POLICY_CREATE = 44;</code>
     */
    const AUDIT_LOG_TYPE_POLICY_POLICY_CREATE = 44;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_POLICY_POLICY_CHANGE = 45;</code>
     */
    const AUDIT_LOG_TYPE_POLICY_POLICY_CHANGE = 45;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_POLICY_POLICY_DELETE = 46;</code>
     */
    const AUDIT_LOG_TYPE_POLICY_POLICY_DELETE = 46;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_POLICY_REQUEST_NO_WHITELIST = 47;</code>
     */
    const AUDIT_LOG_TYPE_POLICY_REQUEST_NO_WHITELIST = 47;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_POLICY_APPROVE_NO_WHITELIST = 48;</code>
     */
    const AUDIT_LOG_TYPE_POLICY_APPROVE_NO_WHITELIST = 48;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_POLICY_CANCEL_NO_WHITELIST = 49;</code>
     */
    const AUDIT_LOG_TYPE_POLICY_CANCEL_NO_WHITELIST = 49;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_TRANSACTION_DELEGATE_CREATE = 64;</code>
     */
    const AUDIT_LOG_TYPE_TRANSACTION_DELEGATE_CREATE = 64;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_TRANSACTION_DELEGATE_APPROVE = 65;</code>
     */
    const AUDIT_LOG_TYPE_TRANSACTION_DELEGATE_APPROVE = 65;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_TRANSACTION_DELEGATE_CANCEL = 66;</code>
     */
    const AUDIT_LOG_TYPE_TRANSACTION_DELEGATE_CANCEL = 66;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_TRANSACTION_DELEGATE_REGISTER_SIGNATURE = 67;</code>
     */
    const AUDIT_LOG_TYPE_TRANSACTION_DELEGATE_REGISTER_SIGNATURE = 67;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_TRANSACTION_DELEGATE_SUBMIT = 68;</code>
     */
    const AUDIT_LOG_TYPE_TRANSACTION_DELEGATE_SUBMIT = 68;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_TRANSACTION_UNDELEGATE_CREATE = 69;</code>
     */
    const AUDIT_LOG_TYPE_TRANSACTION_UNDELEGATE_CREATE = 69;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_TRANSACTION_UNDELEGATE_APPROVE = 70;</code>
     */
    const AUDIT_LOG_TYPE_TRANSACTION_UNDELEGATE_APPROVE = 70;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_TRANSACTION_UNDELEGATE_CANCEL = 71;</code>
     */
    const AUDIT_LOG_TYPE_TRANSACTION_UNDELEGATE_CANCEL = 71;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_TRANSACTION_UNDELEGATE_REGISTER_SIGNATURE = 72;</code>
     */
    const AUDIT_LOG_TYPE_TRANSACTION_UNDELEGATE_REGISTER_SIGNATURE = 72;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_TRANSACTION_UNDELEGATE_SUBMIT = 73;</code>
     */
    const AUDIT_LOG_TYPE_TRANSACTION_UNDELEGATE_SUBMIT = 73;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_TRANSACTION_WITHDRAW_CREATE = 74;</code>
     */
    const AUDIT_LOG_TYPE_TRANSACTION_WITHDRAW_CREATE = 74;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_TRANSACTION_WITHDRAW_APPROVE = 75;</code>
     */
    const AUDIT_LOG_TYPE_TRANSACTION_WITHDRAW_APPROVE = 75;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_TRANSACTION_WITHDRAW_CANCEL = 76;</code>
     */
    const AUDIT_LOG_TYPE_TRANSACTION_WITHDRAW_CANCEL = 76;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_TRANSACTION_WITHDRAW_REGISTER_SIGNATURE = 77;</code>
     */
    const AUDIT_LOG_TYPE_TRANSACTION_WITHDRAW_REGISTER_SIGNATURE = 77;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_TRANSACTION_WITHDRAW_SUBMIT = 78;</code>
     */
    const AUDIT_LOG_TYPE_TRANSACTION_WITHDRAW_SUBMIT = 78;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_PRE_TRANSACTION_APPROVE = 96;</code>
     */
    const AUDIT_LOG_TYPE_PRE_TRANSACTION_APPROVE = 96;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_PRE_TRANSACTION_REJECT = 97;</code>
     */
    const AUDIT_LOG_TYPE_PRE_TRANSACTION_REJECT = 97;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_PRE_TRANSACTION_THRESHOLD_CREATION_REQUESTED = 81;</code>
     */
    const AUDIT_LOG_TYPE_PRE_TRANSACTION_THRESHOLD_CREATION_REQUESTED = 81;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_PRE_TRANSACTION_THRESHOLD_CREATION_APPROVED = 82;</code>
     */
    const AUDIT_LOG_TYPE_PRE_TRANSACTION_THRESHOLD_CREATION_APPROVED = 82;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_PRE_TRANSACTION_THRESHOLD_CREATION_REJECTED = 83;</code>
     */
    const AUDIT_LOG_TYPE_PRE_TRANSACTION_THRESHOLD_CREATION_REJECTED = 83;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_PRE_TRANSACTION_THRESHOLD_CHANGE_REQUESTED = 84;</code>
     */
    const AUDIT_LOG_TYPE_PRE_TRANSACTION_THRESHOLD_CHANGE_REQUESTED = 84;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_PRE_TRANSACTION_THRESHOLD_CHANGE_APPROVED = 85;</code>
     */
    const AUDIT_LOG_TYPE_PRE_TRANSACTION_THRESHOLD_CHANGE_APPROVED = 85;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_PRE_TRANSACTION_THRESHOLD_CHANGE_REJECTED = 86;</code>
     */
    const AUDIT_LOG_TYPE_PRE_TRANSACTION_THRESHOLD_CHANGE_REJECTED = 86;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_CREATION_REQUESTED = 87;</code>
     */
    const AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_CREATION_REQUESTED = 87;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_CREATION_APPROVED = 88;</code>
     */
    const AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_CREATION_APPROVED = 88;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_CREATION_REJECTED = 89;</code>
     */
    const AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_CREATION_REJECTED = 89;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_IMPORT_REQUESTED = 90;</code>
     */
    const AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_IMPORT_REQUESTED = 90;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_IMPORT_FAILED = 99;</code>
     */
    const AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_IMPORT_FAILED = 99;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_IMPORT_APPROVED = 91;</code>
     */
    const AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_IMPORT_APPROVED = 91;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_IMPORT_REJECTED = 92;</code>
     */
    const AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_IMPORT_REJECTED = 92;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_CHANGE_REQUESTED = 93;</code>
     */
    const AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_CHANGE_REQUESTED = 93;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_CHANGE_APPROVED = 94;</code>
     */
    const AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_CHANGE_APPROVED = 94;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_CHANGE_REJECTED = 95;</code>
     */
    const AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_CHANGE_REJECTED = 95;
    /**
     * Generated from protobuf enum <code>AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_EXPORT_REQUESTED = 100;</code>
     */
    const AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_EXPORT_REQUESTED = 100;

    private static $valueToName = [
        self::AUDIT_LOG_TYPE_INVALID => 'AUDIT_LOG_TYPE_INVALID',
        self::AUDIT_LOG_TYPE_LOGIN => 'AUDIT_LOG_TYPE_LOGIN',
        self::AUDIT_LOG_TYPE_LOGIN_FAIL => 'AUDIT_LOG_TYPE_LOGIN_FAIL',
        self::AUDIT_LOG_TYPE_2FA_FAIL => 'AUDIT_LOG_TYPE_2FA_FAIL',
        self::AUDIT_LOG_TYPE_LOGOUT => 'AUDIT_LOG_TYPE_LOGOUT',
        self::AUDIT_LOG_TYPE_MAIL_SETTINGS_CHANGE => 'AUDIT_LOG_TYPE_MAIL_SETTINGS_CHANGE',
        self::AUDIT_LOG_TYPE_WALLET_CREATE => 'AUDIT_LOG_TYPE_WALLET_CREATE',
        self::AUDIT_LOG_TYPE_WALLET_APPROVE => 'AUDIT_LOG_TYPE_WALLET_APPROVE',
        self::AUDIT_LOG_TYPE_WALLET_CANCEL => 'AUDIT_LOG_TYPE_WALLET_CANCEL',
        self::AUDIT_LOG_TYPE_WALLET_REGISTER_PUBKEY => 'AUDIT_LOG_TYPE_WALLET_REGISTER_PUBKEY',
        self::AUDIT_LOG_TYPE_WALLET_ARCHIVE => 'AUDIT_LOG_TYPE_WALLET_ARCHIVE',
        self::AUDIT_LOG_TYPE_WALLET_UNARCHIVE => 'AUDIT_LOG_TYPE_WALLET_UNARCHIVE',
        self::AUDIT_LOG_TYPE_WALLET_NAME_CHANGE => 'AUDIT_LOG_TYPE_WALLET_NAME_CHANGE',
        self::AUDIT_LOG_TYPE_WALLET_POLICY_CHANGE => 'AUDIT_LOG_TYPE_WALLET_POLICY_CHANGE',
        self::AUDIT_LOG_TYPE_WALLET_NO_WHITELIST_REQUEST => 'AUDIT_LOG_TYPE_WALLET_NO_WHITELIST_REQUEST',
        self::AUDIT_LOG_TYPE_WALLET_NO_WHITELIST_APPROVE => 'AUDIT_LOG_TYPE_WALLET_NO_WHITELIST_APPROVE',
        self::AUDIT_LOG_TYPE_WALLET_NO_WHITELIST_CANCEL => 'AUDIT_LOG_TYPE_WALLET_NO_WHITELIST_CANCEL',
        self::AUDIT_LOG_TYPE_WALLET_ADDRESS_UPLOAD => 'AUDIT_LOG_TYPE_WALLET_ADDRESS_UPLOAD',
        self::AUDIT_LOG_TYPE_WALLET_ADDRESS_DOWNLOAD => 'AUDIT_LOG_TYPE_WALLET_ADDRESS_DOWNLOAD',
        self::AUDIT_LOG_TYPE_WALLET_ADDRESS_DELETE => 'AUDIT_LOG_TYPE_WALLET_ADDRESS_DELETE',
        self::AUDIT_LOG_TYPE_WALLET_VALIDATOR_CHANGE => 'AUDIT_LOG_TYPE_WALLET_VALIDATOR_CHANGE',
        self::AUDIT_LOG_TYPE_WALLET_VALIDATOR_APPROVE => 'AUDIT_LOG_TYPE_WALLET_VALIDATOR_APPROVE',
        self::AUDIT_LOG_TYPE_WALLET_VALIDATOR_CANCEL => 'AUDIT_LOG_TYPE_WALLET_VALIDATOR_CANCEL',
        self::AUDIT_LOG_TYPE_WALLET_DESTINATION_WALLET_CHANGE => 'AUDIT_LOG_TYPE_WALLET_DESTINATION_WALLET_CHANGE',
        self::AUDIT_LOG_TYPE_WALLET_GROUP_CREATE => 'AUDIT_LOG_TYPE_WALLET_GROUP_CREATE',
        self::AUDIT_LOG_TYPE_WALLET_GROUP_NAME_CHANGE => 'AUDIT_LOG_TYPE_WALLET_GROUP_NAME_CHANGE',
        self::AUDIT_LOG_TYPE_WALLET_GROUP_CHANGE => 'AUDIT_LOG_TYPE_WALLET_GROUP_CHANGE',
        self::AUDIT_LOG_TYPE_TRANSACTION_CREATE => 'AUDIT_LOG_TYPE_TRANSACTION_CREATE',
        self::AUDIT_LOG_TYPE_TRANSACTION_APPROVE => 'AUDIT_LOG_TYPE_TRANSACTION_APPROVE',
        self::AUDIT_LOG_TYPE_TRANSACTION_CANCEL => 'AUDIT_LOG_TYPE_TRANSACTION_CANCEL',
        self::AUDIT_LOG_TYPE_TRANSACTION_REGISTER_SIGNATURE => 'AUDIT_LOG_TYPE_TRANSACTION_REGISTER_SIGNATURE',
        self::AUDIT_LOG_TYPE_TRANSACTION_SUBMIT => 'AUDIT_LOG_TYPE_TRANSACTION_SUBMIT',
        self::AUDIT_LOG_TYPE_TRANSACTION_RESEND => 'AUDIT_LOG_TYPE_TRANSACTION_RESEND',
        self::AUDIT_LOG_TYPE_TRANSACTION_REPLACE => 'AUDIT_LOG_TYPE_TRANSACTION_REPLACE',
        self::AUDIT_LOG_TYPE_ACCOUNT_PASSWORD_CHANGE => 'AUDIT_LOG_TYPE_ACCOUNT_PASSWORD_CHANGE',
        self::AUDIT_LOG_TYPE_ACCOUNT_EMAIL_CHANGE => 'AUDIT_LOG_TYPE_ACCOUNT_EMAIL_CHANGE',
        self::AUDIT_LOG_TYPE_ACCOUNT_INVITE => 'AUDIT_LOG_TYPE_ACCOUNT_INVITE',
        self::AUDIT_LOG_TYPE_ACCOUNT_ARCHIVE => 'AUDIT_LOG_TYPE_ACCOUNT_ARCHIVE',
        self::AUDIT_LOG_TYPE_ACCOUNT_UNARCHIVE => 'AUDIT_LOG_TYPE_ACCOUNT_UNARCHIVE',
        self::AUDIT_LOG_TYPE_SERVICE_ACCOUNT_CREATE => 'AUDIT_LOG_TYPE_SERVICE_ACCOUNT_CREATE',
        self::AUDIT_LOG_TYPE_SERVICE_ACCOUNT_CHANGE_PERMISSION => 'AUDIT_LOG_TYPE_SERVICE_ACCOUNT_CHANGE_PERMISSION',
        self::AUDIT_LOG_TYPE_SERVICE_ACCOUNT_ACTIVATE => 'AUDIT_LOG_TYPE_SERVICE_ACCOUNT_ACTIVATE',
        self::AUDIT_LOG_TYPE_SERVICE_ACCOUNT_INACTIVE => 'AUDIT_LOG_TYPE_SERVICE_ACCOUNT_INACTIVE',
        self::AUDIT_LOG_TYPE_SERVICE_ACCOUNT_DELETE => 'AUDIT_LOG_TYPE_SERVICE_ACCOUNT_DELETE',
        self::AUDIT_LOG_TYPE_SERVICE_ACCOUNT_KEY_CREATE => 'AUDIT_LOG_TYPE_SERVICE_ACCOUNT_KEY_CREATE',
        self::AUDIT_LOG_TYPE_SERVICE_ACCOUNT_KEY_DELETE => 'AUDIT_LOG_TYPE_SERVICE_ACCOUNT_KEY_DELETE',
        self::AUDIT_LOG_TYPE_POLICY_ADDRESS_CREATE => 'AUDIT_LOG_TYPE_POLICY_ADDRESS_CREATE',
        self::AUDIT_LOG_TYPE_POLICY_ADDRESS_DELETE => 'AUDIT_LOG_TYPE_POLICY_ADDRESS_DELETE',
        self::AUDIT_LOG_TYPE_POLICY_ADDRESS_APPROVE => 'AUDIT_LOG_TYPE_POLICY_ADDRESS_APPROVE',
        self::AUDIT_LOG_TYPE_POLICY_ADDRESS_CANCEL => 'AUDIT_LOG_TYPE_POLICY_ADDRESS_CANCEL',
        self::AUDIT_LOG_TYPE_POLICY_SPENDING_LIMIT_CREATE => 'AUDIT_LOG_TYPE_POLICY_SPENDING_LIMIT_CREATE',
        self::AUDIT_LOG_TYPE_POLICY_SPENDING_LIMIT_CHANGE => 'AUDIT_LOG_TYPE_POLICY_SPENDING_LIMIT_CHANGE',
        self::AUDIT_LOG_TYPE_POLICY_SPENDING_LIMIT_DELETE => 'AUDIT_LOG_TYPE_POLICY_SPENDING_LIMIT_DELETE',
        self::AUDIT_LOG_TYPE_POLICY_SPENDING_LIMIT_APPROVE => 'AUDIT_LOG_TYPE_POLICY_SPENDING_LIMIT_APPROVE',
        self::AUDIT_LOG_TYPE_POLICY_SPENDING_LIMIT_CANCEL => 'AUDIT_LOG_TYPE_POLICY_SPENDING_LIMIT_CANCEL',
        self::AUDIT_LOG_TYPE_POLICY_WHITELIST_CREATE => 'AUDIT_LOG_TYPE_POLICY_WHITELIST_CREATE',
        self::AUDIT_LOG_TYPE_POLICY_WHITELIST_CHANGE => 'AUDIT_LOG_TYPE_POLICY_WHITELIST_CHANGE',
        self::AUDIT_LOG_TYPE_POLICY_WHITELIST_DELETE => 'AUDIT_LOG_TYPE_POLICY_WHITELIST_DELETE',
        self::AUDIT_LOG_TYPE_POLICY_POLICY_CREATE => 'AUDIT_LOG_TYPE_POLICY_POLICY_CREATE',
        self::AUDIT_LOG_TYPE_POLICY_POLICY_CHANGE => 'AUDIT_LOG_TYPE_POLICY_POLICY_CHANGE',
        self::AUDIT_LOG_TYPE_POLICY_POLICY_DELETE => 'AUDIT_LOG_TYPE_POLICY_POLICY_DELETE',
        self::AUDIT_LOG_TYPE_POLICY_REQUEST_NO_WHITELIST => 'AUDIT_LOG_TYPE_POLICY_REQUEST_NO_WHITELIST',
        self::AUDIT_LOG_TYPE_POLICY_APPROVE_NO_WHITELIST => 'AUDIT_LOG_TYPE_POLICY_APPROVE_NO_WHITELIST',
        self::AUDIT_LOG_TYPE_POLICY_CANCEL_NO_WHITELIST => 'AUDIT_LOG_TYPE_POLICY_CANCEL_NO_WHITELIST',
        self::AUDIT_LOG_TYPE_TRANSACTION_DELEGATE_CREATE => 'AUDIT_LOG_TYPE_TRANSACTION_DELEGATE_CREATE',
        self::AUDIT_LOG_TYPE_TRANSACTION_DELEGATE_APPROVE => 'AUDIT_LOG_TYPE_TRANSACTION_DELEGATE_APPROVE',
        self::AUDIT_LOG_TYPE_TRANSACTION_DELEGATE_CANCEL => 'AUDIT_LOG_TYPE_TRANSACTION_DELEGATE_CANCEL',
        self::AUDIT_LOG_TYPE_TRANSACTION_DELEGATE_REGISTER_SIGNATURE => 'AUDIT_LOG_TYPE_TRANSACTION_DELEGATE_REGISTER_SIGNATURE',
        self::AUDIT_LOG_TYPE_TRANSACTION_DELEGATE_SUBMIT => 'AUDIT_LOG_TYPE_TRANSACTION_DELEGATE_SUBMIT',
        self::AUDIT_LOG_TYPE_TRANSACTION_UNDELEGATE_CREATE => 'AUDIT_LOG_TYPE_TRANSACTION_UNDELEGATE_CREATE',
        self::AUDIT_LOG_TYPE_TRANSACTION_UNDELEGATE_APPROVE => 'AUDIT_LOG_TYPE_TRANSACTION_UNDELEGATE_APPROVE',
        self::AUDIT_LOG_TYPE_TRANSACTION_UNDELEGATE_CANCEL => 'AUDIT_LOG_TYPE_TRANSACTION_UNDELEGATE_CANCEL',
        self::AUDIT_LOG_TYPE_TRANSACTION_UNDELEGATE_REGISTER_SIGNATURE => 'AUDIT_LOG_TYPE_TRANSACTION_UNDELEGATE_REGISTER_SIGNATURE',
        self::AUDIT_LOG_TYPE_TRANSACTION_UNDELEGATE_SUBMIT => 'AUDIT_LOG_TYPE_TRANSACTION_UNDELEGATE_SUBMIT',
        self::AUDIT_LOG_TYPE_TRANSACTION_WITHDRAW_CREATE => 'AUDIT_LOG_TYPE_TRANSACTION_WITHDRAW_CREATE',
        self::AUDIT_LOG_TYPE_TRANSACTION_WITHDRAW_APPROVE => 'AUDIT_LOG_TYPE_TRANSACTION_WITHDRAW_APPROVE',
        self::AUDIT_LOG_TYPE_TRANSACTION_WITHDRAW_CANCEL => 'AUDIT_LOG_TYPE_TRANSACTION_WITHDRAW_CANCEL',
        self::AUDIT_LOG_TYPE_TRANSACTION_WITHDRAW_REGISTER_SIGNATURE => 'AUDIT_LOG_TYPE_TRANSACTION_WITHDRAW_REGISTER_SIGNATURE',
        self::AUDIT_LOG_TYPE_TRANSACTION_WITHDRAW_SUBMIT => 'AUDIT_LOG_TYPE_TRANSACTION_WITHDRAW_SUBMIT',
        self::AUDIT_LOG_TYPE_PRE_TRANSACTION_APPROVE => 'AUDIT_LOG_TYPE_PRE_TRANSACTION_APPROVE',
        self::AUDIT_LOG_TYPE_PRE_TRANSACTION_REJECT => 'AUDIT_LOG_TYPE_PRE_TRANSACTION_REJECT',
        self::AUDIT_LOG_TYPE_PRE_TRANSACTION_THRESHOLD_CREATION_REQUESTED => 'AUDIT_LOG_TYPE_PRE_TRANSACTION_THRESHOLD_CREATION_REQUESTED',
        self::AUDIT_LOG_TYPE_PRE_TRANSACTION_THRESHOLD_CREATION_APPROVED => 'AUDIT_LOG_TYPE_PRE_TRANSACTION_THRESHOLD_CREATION_APPROVED',
        self::AUDIT_LOG_TYPE_PRE_TRANSACTION_THRESHOLD_CREATION_REJECTED => 'AUDIT_LOG_TYPE_PRE_TRANSACTION_THRESHOLD_CREATION_REJECTED',
        self::AUDIT_LOG_TYPE_PRE_TRANSACTION_THRESHOLD_CHANGE_REQUESTED => 'AUDIT_LOG_TYPE_PRE_TRANSACTION_THRESHOLD_CHANGE_REQUESTED',
        self::AUDIT_LOG_TYPE_PRE_TRANSACTION_THRESHOLD_CHANGE_APPROVED => 'AUDIT_LOG_TYPE_PRE_TRANSACTION_THRESHOLD_CHANGE_APPROVED',
        self::AUDIT_LOG_TYPE_PRE_TRANSACTION_THRESHOLD_CHANGE_REJECTED => 'AUDIT_LOG_TYPE_PRE_TRANSACTION_THRESHOLD_CHANGE_REJECTED',
        self::AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_CREATION_REQUESTED => 'AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_CREATION_REQUESTED',
        self::AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_CREATION_APPROVED => 'AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_CREATION_APPROVED',
        self::AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_CREATION_REJECTED => 'AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_CREATION_REJECTED',
        self::AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_IMPORT_REQUESTED => 'AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_IMPORT_REQUESTED',
        self::AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_IMPORT_FAILED => 'AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_IMPORT_FAILED',
        self::AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_IMPORT_APPROVED => 'AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_IMPORT_APPROVED',
        self::AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_IMPORT_REJECTED => 'AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_IMPORT_REJECTED',
        self::AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_CHANGE_REQUESTED => 'AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_CHANGE_REQUESTED',
        self::AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_CHANGE_APPROVED => 'AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_CHANGE_APPROVED',
        self::AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_CHANGE_REJECTED => 'AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_CHANGE_REJECTED',
        self::AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_EXPORT_REQUESTED => 'AUDIT_LOG_TYPE_BLACKLIST_ADDRESS_STATE_EXPORT_REQUESTED',
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

