<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>adamant.global.v1.GetRateSnapshotRequest</code>
 */
class GetRateSnapshotRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * The id of rate-snapshot
     *
     * Generated from protobuf field <code>string rate_snapshot_id = 1 [json_name = "rateSnapshotId", (.validate.rules) = {</code>
     */
    protected $rate_snapshot_id = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $rate_snapshot_id
     *           The id of rate-snapshot
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\GlobalApi::initOnce();
        parent::__construct($data);
    }

    /**
     * The id of rate-snapshot
     *
     * Generated from protobuf field <code>string rate_snapshot_id = 1 [json_name = "rateSnapshotId", (.validate.rules) = {</code>
     * @return string
     */
    public function getRateSnapshotId()
    {
        return $this->rate_snapshot_id;
    }

    /**
     * The id of rate-snapshot
     *
     * Generated from protobuf field <code>string rate_snapshot_id = 1 [json_name = "rateSnapshotId", (.validate.rules) = {</code>
     * @param string $var
     * @return $this
     */
    public function setRateSnapshotId($var)
    {
        GPBUtil::checkString($var, True);
        $this->rate_snapshot_id = $var;

        return $this;
    }

}
