<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>adamant.global.v1.UpdateWalletPolicyRequest</code>
 */
class UpdateWalletPolicyRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string wallet_id = 1 [json_name = "walletId", (.validate.rules) = {</code>
     */
    protected $wallet_id = '';
    /**
     * Generated from protobuf field <code>string policy_id = 2 [json_name = "policyId", (.validate.rules) = {</code>
     */
    protected $policy_id = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $wallet_id
     *     @type string $policy_id
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\GlobalApi::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string wallet_id = 1 [json_name = "walletId", (.validate.rules) = {</code>
     * @return string
     */
    public function getWalletId()
    {
        return $this->wallet_id;
    }

    /**
     * Generated from protobuf field <code>string wallet_id = 1 [json_name = "walletId", (.validate.rules) = {</code>
     * @param string $var
     * @return $this
     */
    public function setWalletId($var)
    {
        GPBUtil::checkString($var, True);
        $this->wallet_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string policy_id = 2 [json_name = "policyId", (.validate.rules) = {</code>
     * @return string
     */
    public function getPolicyId()
    {
        return $this->policy_id;
    }

    /**
     * Generated from protobuf field <code>string policy_id = 2 [json_name = "policyId", (.validate.rules) = {</code>
     * @param string $var
     * @return $this
     */
    public function setPolicyId($var)
    {
        GPBUtil::checkString($var, True);
        $this->policy_id = $var;

        return $this;
    }

}
