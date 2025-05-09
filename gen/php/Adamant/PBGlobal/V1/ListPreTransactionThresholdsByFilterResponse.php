<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>adamant.global.v1.ListPreTransactionThresholdsByFilterResponse</code>
 */
class ListPreTransactionThresholdsByFilterResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.PreTransactionThreshold pre_transaction_thresholds = 1 [json_name = "preTransactionThresholds"];</code>
     */
    private $pre_transaction_thresholds;
    /**
     * Generated from protobuf field <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
     */
    protected $next_page_token = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type array<\Adamant\PBGlobal\V1\PreTransactionThreshold>|\Google\Protobuf\Internal\RepeatedField $pre_transaction_thresholds
     *     @type string $next_page_token
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\GlobalApi::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.PreTransactionThreshold pre_transaction_thresholds = 1 [json_name = "preTransactionThresholds"];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getPreTransactionThresholds()
    {
        return $this->pre_transaction_thresholds;
    }

    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.PreTransactionThreshold pre_transaction_thresholds = 1 [json_name = "preTransactionThresholds"];</code>
     * @param array<\Adamant\PBGlobal\V1\PreTransactionThreshold>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setPreTransactionThresholds($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Adamant\PBGlobal\V1\PreTransactionThreshold::class);
        $this->pre_transaction_thresholds = $arr;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
     * @return string
     */
    public function getNextPageToken()
    {
        return $this->next_page_token;
    }

    /**
     * Generated from protobuf field <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
     * @param string $var
     * @return $this
     */
    public function setNextPageToken($var)
    {
        GPBUtil::checkString($var, True);
        $this->next_page_token = $var;

        return $this;
    }

}

