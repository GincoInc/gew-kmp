<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>adamant.global.v1.ListStakingHistoriesResponse</code>
 */
class ListStakingHistoriesResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
     */
    private $staking_histories;
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
     *     @type array<\Adamant\PBGlobal\V1\StakingHistory>|\Google\Protobuf\Internal\RepeatedField $staking_histories
     *     @type string $next_page_token
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\GlobalApi::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getStakingHistories()
    {
        return $this->staking_histories;
    }

    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.StakingHistory staking_histories = 1 [json_name = "stakingHistories"];</code>
     * @param array<\Adamant\PBGlobal\V1\StakingHistory>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setStakingHistories($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Adamant\PBGlobal\V1\StakingHistory::class);
        $this->staking_histories = $arr;

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
