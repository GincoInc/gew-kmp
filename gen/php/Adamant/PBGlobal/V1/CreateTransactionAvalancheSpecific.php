<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/model.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The model of Avalanche specific fields of CreateTransaction
 *
 * Generated from protobuf message <code>adamant.global.v1.CreateTransactionAvalancheSpecific</code>
 */
class CreateTransactionAvalancheSpecific extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>optional .gincoinc.global.v1.AvalancheTxType tx_type = 1 [json_name = "txType"];</code>
     */
    protected $tx_type = null;
    /**
     * Generated from protobuf field <code>optional .adamant.global.v1.ImportTxSpecific import_tx_specific = 2 [json_name = "importTxSpecific"];</code>
     */
    protected $import_tx_specific = null;
    /**
     * Generated from protobuf field <code>optional .adamant.global.v1.StakingSpecific staking_specific = 3 [json_name = "stakingSpecific"];</code>
     */
    protected $staking_specific = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $tx_type
     *     @type \Adamant\PBGlobal\V1\ImportTxSpecific $import_tx_specific
     *     @type \Adamant\PBGlobal\V1\StakingSpecific $staking_specific
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\Model::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>optional .gincoinc.global.v1.AvalancheTxType tx_type = 1 [json_name = "txType"];</code>
     * @return int
     */
    public function getTxType()
    {
        return isset($this->tx_type) ? $this->tx_type : 0;
    }

    public function hasTxType()
    {
        return isset($this->tx_type);
    }

    public function clearTxType()
    {
        unset($this->tx_type);
    }

    /**
     * Generated from protobuf field <code>optional .gincoinc.global.v1.AvalancheTxType tx_type = 1 [json_name = "txType"];</code>
     * @param int $var
     * @return $this
     */
    public function setTxType($var)
    {
        GPBUtil::checkEnum($var, \Gincoinc\PBGlobal\V1\AvalancheTxType::class);
        $this->tx_type = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>optional .adamant.global.v1.ImportTxSpecific import_tx_specific = 2 [json_name = "importTxSpecific"];</code>
     * @return \Adamant\PBGlobal\V1\ImportTxSpecific|null
     */
    public function getImportTxSpecific()
    {
        return $this->import_tx_specific;
    }

    public function hasImportTxSpecific()
    {
        return isset($this->import_tx_specific);
    }

    public function clearImportTxSpecific()
    {
        unset($this->import_tx_specific);
    }

    /**
     * Generated from protobuf field <code>optional .adamant.global.v1.ImportTxSpecific import_tx_specific = 2 [json_name = "importTxSpecific"];</code>
     * @param \Adamant\PBGlobal\V1\ImportTxSpecific $var
     * @return $this
     */
    public function setImportTxSpecific($var)
    {
        GPBUtil::checkMessage($var, \Adamant\PBGlobal\V1\ImportTxSpecific::class);
        $this->import_tx_specific = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>optional .adamant.global.v1.StakingSpecific staking_specific = 3 [json_name = "stakingSpecific"];</code>
     * @return \Adamant\PBGlobal\V1\StakingSpecific|null
     */
    public function getStakingSpecific()
    {
        return $this->staking_specific;
    }

    public function hasStakingSpecific()
    {
        return isset($this->staking_specific);
    }

    public function clearStakingSpecific()
    {
        unset($this->staking_specific);
    }

    /**
     * Generated from protobuf field <code>optional .adamant.global.v1.StakingSpecific staking_specific = 3 [json_name = "stakingSpecific"];</code>
     * @param \Adamant\PBGlobal\V1\StakingSpecific $var
     * @return $this
     */
    public function setStakingSpecific($var)
    {
        GPBUtil::checkMessage($var, \Adamant\PBGlobal\V1\StakingSpecific::class);
        $this->staking_specific = $var;

        return $this;
    }

}

