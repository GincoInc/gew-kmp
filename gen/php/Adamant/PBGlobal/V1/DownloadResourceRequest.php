<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>adamant.global.v1.DownloadResourceRequest</code>
 */
class DownloadResourceRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.adamant.global.v1.DownloadResourceType download_resource_type = 1 [json_name = "downloadResourceType"];</code>
     */
    protected $download_resource_type = 0;
    /**
     * Generated from protobuf field <code>bool watch_only = 5 [json_name = "watchOnly"];</code>
     */
    protected $watch_only = false;
    /**
     * Generated from protobuf field <code>string wallet_id = 2 [json_name = "walletId"];</code>
     */
    protected $wallet_id = '';
    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp start_time = 3 [json_name = "startTime"];</code>
     */
    protected $start_time = null;
    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp end_time = 4 [json_name = "endTime"];</code>
     */
    protected $end_time = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $download_resource_type
     *     @type bool $watch_only
     *     @type string $wallet_id
     *     @type \Google\Protobuf\Timestamp $start_time
     *     @type \Google\Protobuf\Timestamp $end_time
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\GlobalApi::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.adamant.global.v1.DownloadResourceType download_resource_type = 1 [json_name = "downloadResourceType"];</code>
     * @return int
     */
    public function getDownloadResourceType()
    {
        return $this->download_resource_type;
    }

    /**
     * Generated from protobuf field <code>.adamant.global.v1.DownloadResourceType download_resource_type = 1 [json_name = "downloadResourceType"];</code>
     * @param int $var
     * @return $this
     */
    public function setDownloadResourceType($var)
    {
        GPBUtil::checkEnum($var, \Adamant\PBGlobal\V1\DownloadResourceType::class);
        $this->download_resource_type = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool watch_only = 5 [json_name = "watchOnly"];</code>
     * @return bool
     */
    public function getWatchOnly()
    {
        return $this->watch_only;
    }

    /**
     * Generated from protobuf field <code>bool watch_only = 5 [json_name = "watchOnly"];</code>
     * @param bool $var
     * @return $this
     */
    public function setWatchOnly($var)
    {
        GPBUtil::checkBool($var);
        $this->watch_only = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string wallet_id = 2 [json_name = "walletId"];</code>
     * @return string
     */
    public function getWalletId()
    {
        return $this->wallet_id;
    }

    /**
     * Generated from protobuf field <code>string wallet_id = 2 [json_name = "walletId"];</code>
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
     * Generated from protobuf field <code>.google.protobuf.Timestamp start_time = 3 [json_name = "startTime"];</code>
     * @return \Google\Protobuf\Timestamp|null
     */
    public function getStartTime()
    {
        return $this->start_time;
    }

    public function hasStartTime()
    {
        return isset($this->start_time);
    }

    public function clearStartTime()
    {
        unset($this->start_time);
    }

    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp start_time = 3 [json_name = "startTime"];</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setStartTime($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->start_time = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp end_time = 4 [json_name = "endTime"];</code>
     * @return \Google\Protobuf\Timestamp|null
     */
    public function getEndTime()
    {
        return $this->end_time;
    }

    public function hasEndTime()
    {
        return isset($this->end_time);
    }

    public function clearEndTime()
    {
        unset($this->end_time);
    }

    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp end_time = 4 [json_name = "endTime"];</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setEndTime($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->end_time = $var;

        return $this;
    }

}

