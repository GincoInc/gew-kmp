<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>adamant.global.v1.BulkReviewBlacklistAddressProposalRequest</code>
 */
class BulkReviewBlacklistAddressProposalRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string file_id = 1 [json_name = "fileId"];</code>
     */
    protected $file_id = '';
    /**
     * Generated from protobuf field <code>bool approve = 2 [json_name = "approve"];</code>
     */
    protected $approve = false;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $file_id
     *     @type bool $approve
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\GlobalApi::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string file_id = 1 [json_name = "fileId"];</code>
     * @return string
     */
    public function getFileId()
    {
        return $this->file_id;
    }

    /**
     * Generated from protobuf field <code>string file_id = 1 [json_name = "fileId"];</code>
     * @param string $var
     * @return $this
     */
    public function setFileId($var)
    {
        GPBUtil::checkString($var, True);
        $this->file_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool approve = 2 [json_name = "approve"];</code>
     * @return bool
     */
    public function getApprove()
    {
        return $this->approve;
    }

    /**
     * Generated from protobuf field <code>bool approve = 2 [json_name = "approve"];</code>
     * @param bool $var
     * @return $this
     */
    public function setApprove($var)
    {
        GPBUtil::checkBool($var);
        $this->approve = $var;

        return $this;
    }

}
