<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/model.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>adamant.global.v1.ImportTxSpecific</code>
 */
class ImportTxSpecific extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string tx_id = 1 [json_name = "txId"];</code>
     */
    protected $tx_id = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $tx_id
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\Model::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string tx_id = 1 [json_name = "txId"];</code>
     * @return string
     */
    public function getTxId()
    {
        return $this->tx_id;
    }

    /**
     * Generated from protobuf field <code>string tx_id = 1 [json_name = "txId"];</code>
     * @param string $var
     * @return $this
     */
    public function setTxId($var)
    {
        GPBUtil::checkString($var, True);
        $this->tx_id = $var;

        return $this;
    }

}

