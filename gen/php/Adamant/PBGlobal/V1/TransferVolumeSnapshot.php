<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/model.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The model of transfer volume snapshot
 *
 * Generated from protobuf message <code>adamant.global.v1.TransferVolumeSnapshot</code>
 */
class TransferVolumeSnapshot extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp target_time = 1 [json_name = "targetTime"];</code>
     */
    protected $target_time = null;
    /**
     * map<k, v> ... k: coin / v: TransferVolumeByCoin
     *
     * Generated from protobuf field <code>map<int32, .adamant.global.v1.TransferVolume> transfer_volume_by_coin = 2 [json_name = "transferVolumeByCoin"];</code>
     */
    private $transfer_volume_by_coin;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Google\Protobuf\Timestamp $target_time
     *     @type array|\Google\Protobuf\Internal\MapField $transfer_volume_by_coin
     *           map<k, v> ... k: coin / v: TransferVolumeByCoin
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\Model::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp target_time = 1 [json_name = "targetTime"];</code>
     * @return \Google\Protobuf\Timestamp|null
     */
    public function getTargetTime()
    {
        return $this->target_time;
    }

    public function hasTargetTime()
    {
        return isset($this->target_time);
    }

    public function clearTargetTime()
    {
        unset($this->target_time);
    }

    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp target_time = 1 [json_name = "targetTime"];</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setTargetTime($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->target_time = $var;

        return $this;
    }

    /**
     * map<k, v> ... k: coin / v: TransferVolumeByCoin
     *
     * Generated from protobuf field <code>map<int32, .adamant.global.v1.TransferVolume> transfer_volume_by_coin = 2 [json_name = "transferVolumeByCoin"];</code>
     * @return \Google\Protobuf\Internal\MapField
     */
    public function getTransferVolumeByCoin()
    {
        return $this->transfer_volume_by_coin;
    }

    /**
     * map<k, v> ... k: coin / v: TransferVolumeByCoin
     *
     * Generated from protobuf field <code>map<int32, .adamant.global.v1.TransferVolume> transfer_volume_by_coin = 2 [json_name = "transferVolumeByCoin"];</code>
     * @param array|\Google\Protobuf\Internal\MapField $var
     * @return $this
     */
    public function setTransferVolumeByCoin($var)
    {
        $arr = GPBUtil::checkMapField($var, \Google\Protobuf\Internal\GPBType::INT32, \Google\Protobuf\Internal\GPBType::MESSAGE, \Adamant\PBGlobal\V1\TransferVolume::class);
        $this->transfer_volume_by_coin = $arr;

        return $this;
    }

}

