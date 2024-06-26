<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/model.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The model of proposal to update policy information
 *
 * Generated from protobuf message <code>adamant.global.v1.PolicyProposal</code>
 */
class PolicyProposal extends \Google\Protobuf\Internal\Message
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
     * Generated from protobuf field <code>.adamant.global.v1.Whitelist proposed_whitelist = 5 [json_name = "proposedWhitelist"];</code>
     */
    protected $proposed_whitelist = null;
    /**
     * Generated from protobuf field <code>bool is_reviewed = 6 [json_name = "isReviewed"];</code>
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
     *     @type \Adamant\PBGlobal\V1\Whitelist $proposed_whitelist
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
     * Generated from protobuf field <code>.adamant.global.v1.Whitelist proposed_whitelist = 5 [json_name = "proposedWhitelist"];</code>
     * @return \Adamant\PBGlobal\V1\Whitelist|null
     */
    public function getProposedWhitelist()
    {
        return $this->proposed_whitelist;
    }

    public function hasProposedWhitelist()
    {
        return isset($this->proposed_whitelist);
    }

    public function clearProposedWhitelist()
    {
        unset($this->proposed_whitelist);
    }

    /**
     * Generated from protobuf field <code>.adamant.global.v1.Whitelist proposed_whitelist = 5 [json_name = "proposedWhitelist"];</code>
     * @param \Adamant\PBGlobal\V1\Whitelist $var
     * @return $this
     */
    public function setProposedWhitelist($var)
    {
        GPBUtil::checkMessage($var, \Adamant\PBGlobal\V1\Whitelist::class);
        $this->proposed_whitelist = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool is_reviewed = 6 [json_name = "isReviewed"];</code>
     * @return bool
     */
    public function getIsReviewed()
    {
        return $this->is_reviewed;
    }

    /**
     * Generated from protobuf field <code>bool is_reviewed = 6 [json_name = "isReviewed"];</code>
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

