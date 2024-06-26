<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>adamant.global.v1.UpdatePolicyRequest</code>
 */
class UpdatePolicyRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string policy_id = 1 [json_name = "policyId", (.validate.rules) = {</code>
     */
    protected $policy_id = '';
    /**
     * Generated from protobuf field <code>string name = 2 [json_name = "name", (.validate.rules) = {</code>
     */
    protected $name = '';
    /**
     * Generated from protobuf field <code>string whitelist_id = 3 [json_name = "whitelistId", (.validate.rules) = {</code>
     */
    protected $whitelist_id = '';
    /**
     * Generated from protobuf field <code>string transfer_limit_id = 4 [json_name = "transferLimitId", (.validate.rules) = {</code>
     */
    protected $transfer_limit_id = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $policy_id
     *     @type string $name
     *     @type string $whitelist_id
     *     @type string $transfer_limit_id
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\GlobalApi::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string policy_id = 1 [json_name = "policyId", (.validate.rules) = {</code>
     * @return string
     */
    public function getPolicyId()
    {
        return $this->policy_id;
    }

    /**
     * Generated from protobuf field <code>string policy_id = 1 [json_name = "policyId", (.validate.rules) = {</code>
     * @param string $var
     * @return $this
     */
    public function setPolicyId($var)
    {
        GPBUtil::checkString($var, True);
        $this->policy_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string name = 2 [json_name = "name", (.validate.rules) = {</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Generated from protobuf field <code>string name = 2 [json_name = "name", (.validate.rules) = {</code>
     * @param string $var
     * @return $this
     */
    public function setName($var)
    {
        GPBUtil::checkString($var, True);
        $this->name = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string whitelist_id = 3 [json_name = "whitelistId", (.validate.rules) = {</code>
     * @return string
     */
    public function getWhitelistId()
    {
        return $this->whitelist_id;
    }

    /**
     * Generated from protobuf field <code>string whitelist_id = 3 [json_name = "whitelistId", (.validate.rules) = {</code>
     * @param string $var
     * @return $this
     */
    public function setWhitelistId($var)
    {
        GPBUtil::checkString($var, True);
        $this->whitelist_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string transfer_limit_id = 4 [json_name = "transferLimitId", (.validate.rules) = {</code>
     * @return string
     */
    public function getTransferLimitId()
    {
        return $this->transfer_limit_id;
    }

    /**
     * Generated from protobuf field <code>string transfer_limit_id = 4 [json_name = "transferLimitId", (.validate.rules) = {</code>
     * @param string $var
     * @return $this
     */
    public function setTransferLimitId($var)
    {
        GPBUtil::checkString($var, True);
        $this->transfer_limit_id = $var;

        return $this;
    }

}

