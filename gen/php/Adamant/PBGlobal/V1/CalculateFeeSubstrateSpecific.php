<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The model of Substrate specific fields of CreateTransaction
 *
 * Generated from protobuf message <code>adamant.global.v1.CalculateFeeSubstrateSpecific</code>
 */
class CalculateFeeSubstrateSpecific extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.adamant.global.v1.SubstrateCallType call_type = 1 [json_name = "callType"];</code>
     */
    protected $call_type = 0;
    /**
     * Generated from protobuf field <code>.adamant.global.v1.SubstrateCallType multisig_call_type = 2 [json_name = "multisigCallType"];</code>
     */
    protected $multisig_call_type = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $call_type
     *     @type int $multisig_call_type
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\GlobalApi::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.adamant.global.v1.SubstrateCallType call_type = 1 [json_name = "callType"];</code>
     * @return int
     */
    public function getCallType()
    {
        return $this->call_type;
    }

    /**
     * Generated from protobuf field <code>.adamant.global.v1.SubstrateCallType call_type = 1 [json_name = "callType"];</code>
     * @param int $var
     * @return $this
     */
    public function setCallType($var)
    {
        GPBUtil::checkEnum($var, \Adamant\PBGlobal\V1\SubstrateCallType::class);
        $this->call_type = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.adamant.global.v1.SubstrateCallType multisig_call_type = 2 [json_name = "multisigCallType"];</code>
     * @return int
     */
    public function getMultisigCallType()
    {
        return $this->multisig_call_type;
    }

    /**
     * Generated from protobuf field <code>.adamant.global.v1.SubstrateCallType multisig_call_type = 2 [json_name = "multisigCallType"];</code>
     * @param int $var
     * @return $this
     */
    public function setMultisigCallType($var)
    {
        GPBUtil::checkEnum($var, \Adamant\PBGlobal\V1\SubstrateCallType::class);
        $this->multisig_call_type = $var;

        return $this;
    }

}
