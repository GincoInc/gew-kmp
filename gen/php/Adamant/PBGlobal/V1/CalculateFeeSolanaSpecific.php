<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The model of Solana specific fields of CalculateFee
 *
 * Generated from protobuf message <code>adamant.global.v1.CalculateFeeSolanaSpecific</code>
 */
class CalculateFeeSolanaSpecific extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.SolanaEventType event_type = 1 [json_name = "eventType"];</code>
     */
    protected $event_type = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $event_type
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\GlobalApi::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.SolanaEventType event_type = 1 [json_name = "eventType"];</code>
     * @return int
     */
    public function getEventType()
    {
        return $this->event_type;
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.SolanaEventType event_type = 1 [json_name = "eventType"];</code>
     * @param int $var
     * @return $this
     */
    public function setEventType($var)
    {
        GPBUtil::checkEnum($var, \Gincoinc\PBGlobal\V1\SolanaEventType::class);
        $this->event_type = $var;

        return $this;
    }

}
