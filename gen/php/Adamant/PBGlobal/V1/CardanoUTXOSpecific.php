<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/model.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The model of Cardano specific fields of UTXO
 *
 * Generated from protobuf message <code>adamant.global.v1.CardanoUTXOSpecific</code>
 */
class CardanoUTXOSpecific extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.CardanoCustomToken tokens = 1 [json_name = "tokens"];</code>
     */
    private $tokens;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type array<\Adamant\PBGlobal\V1\CardanoCustomToken>|\Google\Protobuf\Internal\RepeatedField $tokens
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\Model::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.CardanoCustomToken tokens = 1 [json_name = "tokens"];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getTokens()
    {
        return $this->tokens;
    }

    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.CardanoCustomToken tokens = 1 [json_name = "tokens"];</code>
     * @param array<\Adamant\PBGlobal\V1\CardanoCustomToken>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setTokens($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Adamant\PBGlobal\V1\CardanoCustomToken::class);
        $this->tokens = $arr;

        return $this;
    }

}
