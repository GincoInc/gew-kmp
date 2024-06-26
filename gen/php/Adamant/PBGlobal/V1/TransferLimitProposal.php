<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/model.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The model of proposal to update transfer limit information
 *
 * Generated from protobuf message <code>adamant.global.v1.TransferLimitProposal</code>
 */
class TransferLimitProposal extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string requester_account_id = 1 [json_name = "requesterAccountId"];</code>
     */
    protected $requester_account_id = '';
    /**
     * Generated from protobuf field <code>string requester_name = 2 [json_name = "requesterName"];</code>
     */
    protected $requester_name = '';
    /**
     * Generated from protobuf field <code>string approver_account_id = 3 [json_name = "approverAccountId"];</code>
     */
    protected $approver_account_id = '';
    /**
     * Generated from protobuf field <code>string approver_name = 4 [json_name = "approverName"];</code>
     */
    protected $approver_name = '';
    /**
     * Generated from protobuf field <code>int64 proposed_hourly_limit = 5 [json_name = "proposedHourlyLimit"];</code>
     */
    protected $proposed_hourly_limit = 0;
    /**
     * Generated from protobuf field <code>int64 proposed_daily_limit = 6 [json_name = "proposedDailyLimit"];</code>
     */
    protected $proposed_daily_limit = 0;
    /**
     * Generated from protobuf field <code>int64 proposed_one_time_limit = 7 [json_name = "proposedOneTimeLimit"];</code>
     */
    protected $proposed_one_time_limit = 0;
    /**
     * Generated from protobuf field <code>bool is_reviewed = 8 [json_name = "isReviewed"];</code>
     */
    protected $is_reviewed = false;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $requester_account_id
     *     @type string $requester_name
     *     @type string $approver_account_id
     *     @type string $approver_name
     *     @type int|string $proposed_hourly_limit
     *     @type int|string $proposed_daily_limit
     *     @type int|string $proposed_one_time_limit
     *     @type bool $is_reviewed
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\Model::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string requester_account_id = 1 [json_name = "requesterAccountId"];</code>
     * @return string
     */
    public function getRequesterAccountId()
    {
        return $this->requester_account_id;
    }

    /**
     * Generated from protobuf field <code>string requester_account_id = 1 [json_name = "requesterAccountId"];</code>
     * @param string $var
     * @return $this
     */
    public function setRequesterAccountId($var)
    {
        GPBUtil::checkString($var, True);
        $this->requester_account_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string requester_name = 2 [json_name = "requesterName"];</code>
     * @return string
     */
    public function getRequesterName()
    {
        return $this->requester_name;
    }

    /**
     * Generated from protobuf field <code>string requester_name = 2 [json_name = "requesterName"];</code>
     * @param string $var
     * @return $this
     */
    public function setRequesterName($var)
    {
        GPBUtil::checkString($var, True);
        $this->requester_name = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string approver_account_id = 3 [json_name = "approverAccountId"];</code>
     * @return string
     */
    public function getApproverAccountId()
    {
        return $this->approver_account_id;
    }

    /**
     * Generated from protobuf field <code>string approver_account_id = 3 [json_name = "approverAccountId"];</code>
     * @param string $var
     * @return $this
     */
    public function setApproverAccountId($var)
    {
        GPBUtil::checkString($var, True);
        $this->approver_account_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string approver_name = 4 [json_name = "approverName"];</code>
     * @return string
     */
    public function getApproverName()
    {
        return $this->approver_name;
    }

    /**
     * Generated from protobuf field <code>string approver_name = 4 [json_name = "approverName"];</code>
     * @param string $var
     * @return $this
     */
    public function setApproverName($var)
    {
        GPBUtil::checkString($var, True);
        $this->approver_name = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int64 proposed_hourly_limit = 5 [json_name = "proposedHourlyLimit"];</code>
     * @return int|string
     */
    public function getProposedHourlyLimit()
    {
        return $this->proposed_hourly_limit;
    }

    /**
     * Generated from protobuf field <code>int64 proposed_hourly_limit = 5 [json_name = "proposedHourlyLimit"];</code>
     * @param int|string $var
     * @return $this
     */
    public function setProposedHourlyLimit($var)
    {
        GPBUtil::checkInt64($var);
        $this->proposed_hourly_limit = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int64 proposed_daily_limit = 6 [json_name = "proposedDailyLimit"];</code>
     * @return int|string
     */
    public function getProposedDailyLimit()
    {
        return $this->proposed_daily_limit;
    }

    /**
     * Generated from protobuf field <code>int64 proposed_daily_limit = 6 [json_name = "proposedDailyLimit"];</code>
     * @param int|string $var
     * @return $this
     */
    public function setProposedDailyLimit($var)
    {
        GPBUtil::checkInt64($var);
        $this->proposed_daily_limit = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int64 proposed_one_time_limit = 7 [json_name = "proposedOneTimeLimit"];</code>
     * @return int|string
     */
    public function getProposedOneTimeLimit()
    {
        return $this->proposed_one_time_limit;
    }

    /**
     * Generated from protobuf field <code>int64 proposed_one_time_limit = 7 [json_name = "proposedOneTimeLimit"];</code>
     * @param int|string $var
     * @return $this
     */
    public function setProposedOneTimeLimit($var)
    {
        GPBUtil::checkInt64($var);
        $this->proposed_one_time_limit = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool is_reviewed = 8 [json_name = "isReviewed"];</code>
     * @return bool
     */
    public function getIsReviewed()
    {
        return $this->is_reviewed;
    }

    /**
     * Generated from protobuf field <code>bool is_reviewed = 8 [json_name = "isReviewed"];</code>
     * @param bool $var
     * @return $this
     */
    public function setIsReviewed($var)
    {
        GPBUtil::checkBool($var);
        $this->is_reviewed = $var;

        return $this;
    }

}

