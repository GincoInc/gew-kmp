<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/model.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>adamant.global.v1.EventTriggeredMessage</code>
 */
class EventTriggeredMessage extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string event_triggered_message_id = 1 [json_name = "eventTriggeredMessageId"];</code>
     */
    protected $event_triggered_message_id = '';
    /**
     * Generated from protobuf field <code>.adamant.global.v1.EventTriggeredMessageType event_triggered_message_type = 2 [json_name = "eventTriggeredMessageType"];</code>
     */
    protected $event_triggered_message_type = 0;
    /**
     * Generated from protobuf field <code>string owner_id = 3 [json_name = "ownerId"];</code>
     */
    protected $owner_id = '';
    /**
     * Generated from protobuf field <code>string destination = 4 [json_name = "destination"];</code>
     */
    protected $destination = '';
    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 5 [json_name = "createTime"];</code>
     */
    protected $create_time = null;
    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp update_time = 6 [json_name = "updateTime"];</code>
     */
    protected $update_time = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $event_triggered_message_id
     *     @type int $event_triggered_message_type
     *     @type string $owner_id
     *     @type string $destination
     *     @type \Google\Protobuf\Timestamp $create_time
     *     @type \Google\Protobuf\Timestamp $update_time
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\Model::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string event_triggered_message_id = 1 [json_name = "eventTriggeredMessageId"];</code>
     * @return string
     */
    public function getEventTriggeredMessageId()
    {
        return $this->event_triggered_message_id;
    }

    /**
     * Generated from protobuf field <code>string event_triggered_message_id = 1 [json_name = "eventTriggeredMessageId"];</code>
     * @param string $var
     * @return $this
     */
    public function setEventTriggeredMessageId($var)
    {
        GPBUtil::checkString($var, True);
        $this->event_triggered_message_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.adamant.global.v1.EventTriggeredMessageType event_triggered_message_type = 2 [json_name = "eventTriggeredMessageType"];</code>
     * @return int
     */
    public function getEventTriggeredMessageType()
    {
        return $this->event_triggered_message_type;
    }

    /**
     * Generated from protobuf field <code>.adamant.global.v1.EventTriggeredMessageType event_triggered_message_type = 2 [json_name = "eventTriggeredMessageType"];</code>
     * @param int $var
     * @return $this
     */
    public function setEventTriggeredMessageType($var)
    {
        GPBUtil::checkEnum($var, \Adamant\PBGlobal\V1\EventTriggeredMessageType::class);
        $this->event_triggered_message_type = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string owner_id = 3 [json_name = "ownerId"];</code>
     * @return string
     */
    public function getOwnerId()
    {
        return $this->owner_id;
    }

    /**
     * Generated from protobuf field <code>string owner_id = 3 [json_name = "ownerId"];</code>
     * @param string $var
     * @return $this
     */
    public function setOwnerId($var)
    {
        GPBUtil::checkString($var, True);
        $this->owner_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string destination = 4 [json_name = "destination"];</code>
     * @return string
     */
    public function getDestination()
    {
        return $this->destination;
    }

    /**
     * Generated from protobuf field <code>string destination = 4 [json_name = "destination"];</code>
     * @param string $var
     * @return $this
     */
    public function setDestination($var)
    {
        GPBUtil::checkString($var, True);
        $this->destination = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 5 [json_name = "createTime"];</code>
     * @return \Google\Protobuf\Timestamp|null
     */
    public function getCreateTime()
    {
        return $this->create_time;
    }

    public function hasCreateTime()
    {
        return isset($this->create_time);
    }

    public function clearCreateTime()
    {
        unset($this->create_time);
    }

    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 5 [json_name = "createTime"];</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setCreateTime($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->create_time = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp update_time = 6 [json_name = "updateTime"];</code>
     * @return \Google\Protobuf\Timestamp|null
     */
    public function getUpdateTime()
    {
        return $this->update_time;
    }

    public function hasUpdateTime()
    {
        return isset($this->update_time);
    }

    public function clearUpdateTime()
    {
        unset($this->update_time);
    }

    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp update_time = 6 [json_name = "updateTime"];</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setUpdateTime($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->update_time = $var;

        return $this;
    }

}

