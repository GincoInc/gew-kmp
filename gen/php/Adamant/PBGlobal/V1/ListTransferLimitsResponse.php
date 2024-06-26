<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>adamant.global.v1.ListTransferLimitsResponse</code>
 */
class ListTransferLimitsResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.TransferLimit transfer_limits = 1 [json_name = "transferLimits"];</code>
     */
    private $transfer_limits;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type array<\Adamant\PBGlobal\V1\TransferLimit>|\Google\Protobuf\Internal\RepeatedField $transfer_limits
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\GlobalApi::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.TransferLimit transfer_limits = 1 [json_name = "transferLimits"];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getTransferLimits()
    {
        return $this->transfer_limits;
    }

    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.TransferLimit transfer_limits = 1 [json_name = "transferLimits"];</code>
     * @param array<\Adamant\PBGlobal\V1\TransferLimit>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setTransferLimits($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Adamant\PBGlobal\V1\TransferLimit::class);
        $this->transfer_limits = $arr;

        return $this;
    }

}

