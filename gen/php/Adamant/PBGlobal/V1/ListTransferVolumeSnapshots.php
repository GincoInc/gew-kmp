<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/model.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>adamant.global.v1.ListTransferVolumeSnapshots</code>
 */
class ListTransferVolumeSnapshots extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.TransferVolumeSnapshot transfer_volume_snapshots = 1 [json_name = "transferVolumeSnapshots"];</code>
     */
    private $transfer_volume_snapshots;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type array<\Adamant\PBGlobal\V1\TransferVolumeSnapshot>|\Google\Protobuf\Internal\RepeatedField $transfer_volume_snapshots
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\Model::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.TransferVolumeSnapshot transfer_volume_snapshots = 1 [json_name = "transferVolumeSnapshots"];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getTransferVolumeSnapshots()
    {
        return $this->transfer_volume_snapshots;
    }

    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.TransferVolumeSnapshot transfer_volume_snapshots = 1 [json_name = "transferVolumeSnapshots"];</code>
     * @param array<\Adamant\PBGlobal\V1\TransferVolumeSnapshot>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setTransferVolumeSnapshots($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Adamant\PBGlobal\V1\TransferVolumeSnapshot::class);
        $this->transfer_volume_snapshots = $arr;

        return $this;
    }

}
