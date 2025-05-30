<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/audit_logger.proto

namespace GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1;

class AuditLogger
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\Enum::initOnce();
        \GPBMetadata\Gincoinc\PBGlobal\V1\Gincoincglobalv1\Enum::initOnce();
        \GPBMetadata\Google\Protobuf\Timestamp::initOnce();
        $pool->internalAddGeneratedFile(
            '
�
=gincoinc/adamant/global/v1/adamantglobalv1/audit_logger.protoadamant.global.v1.gincoinc/global/v1/gincoincglobalv1/enum.protogoogle/protobuf/timestamp.proto"�
AuditLog 
audit_log_id (	R
auditLogIdH
audit_log_group (2 .adamant.global.v1.AuditLogGroupRauditLogGroupE
audit_log_type (2.adamant.global.v1.AuditLogTypeRauditLogType

account_id (	R	accountId!
account_name (	RaccountName*
target_account_id (	RtargetAccountId.
target_account_name (	RtargetAccountName
email (	Remail8
	role_type	 (2.adamant.global.v1.RoleTypeRroleType,
service_account_id
 (	RserviceAccountId0
service_account_name (	RserviceAccountName3
service_account_key_id (	RserviceAccountKeyId
	wallet_id (	RwalletId
wallet_name (	R
walletName2
destination_wallet_id\' (	RdestinationWalletId6
destination_wallet_name( (	RdestinationWalletName&
wallet_group_id" (	RwalletGroupId*
wallet_group_name# (	RwalletGroupName!
wallet_names$ (	RwalletNames,
pre_transaction_id2 (	RpreTransactionId=
pre_transaction_external_id5 (	RpreTransactionExternalId%
transaction_id (	RtransactionId5
	coin_type (2.gincoinc.global.v1.CoinRcoinType!
string_value (	RstringValue
tx_id (	RtxId
	policy_id (	RpolicyId
policy_name (	R
policyName,
labeled_address_id (	RlabeledAddressId
address (	Raddress!
address_name (	RaddressName
message+ (	Rmessage*
transfer_limit_id (	RtransferLimitId.
transfer_limit_name (	RtransferLimitName5
transfer_one_time_limit (RtransferOneTimeLimit2
transfer_hourly_limit (RtransferHourlyLimit0
transfer_daily_limit (RtransferDailyLimit!
whitelist_id (	RwhitelistId%
whitelist_name (	RwhitelistName%
old_validators% (	RoldValidators%
new_validators& (	RnewValidators/
whitelist_addresses (	RwhitelistAddresses9

event_time  (2.google.protobuf.TimestampR	eventTime;
create_time! (2.google.protobuf.TimestampR
createTime@
enabled_mails) (2.adamant.global.v1.MailTypeRenabledMailsB
disabled_mails* (2.adamant.global.v1.MailTypeRdisabledMails5
network, (2.gincoinc.global.v1.NetworkRnetwork:
pre_transaction_threshold- (RpreTransactionThreshold?
pre_transaction_threshold_id. (	RpreTransactionThresholdId0
blacklist_address_id/ (	RblacklistAddressId
	file_name0 (	RfileName#
address_count1 (RaddressCount6
previous_transaction_id3 (	RpreviousTransactionId,
new_transaction_id4 (	RnewTransactionId
activate6 (Ractivate
file_id7 (	RfileId
	client_ip8 (	RclientIpBLZJgithub.com/GincoInc/gew-kmp/gen/gincoinc/adamant/global/v1/adamantglobalv1bproto3'
        , true);

        static::$is_initialized = true;
    }
}

