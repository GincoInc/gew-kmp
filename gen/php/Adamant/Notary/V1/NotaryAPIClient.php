<?php
// GENERATED CODE -- DO NOT EDIT!

namespace Adamant\Notary\V1;

/**
 * =============================================================================
 *  Service
 * =============================================================================
 *
 * Internal-only service. Do not expose publicly.
 */
class NotaryAPIClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * -----------------------------------------------------------------------------
     * Key Registry
     * -----------------------------------------------------------------------------
     * @param \Adamant\Notary\V1\RegisterPublicKeyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function RegisterPublicKey(\Adamant\Notary\V1\RegisterPublicKeyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.notary.v1.NotaryAPI/RegisterPublicKey',
        $argument,
        ['\Adamant\Notary\V1\RegisterPublicKeyResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * -----------------------------------------------------------------------------
     * Key Lifecycle
     * -----------------------------------------------------------------------------
     * @param \Adamant\Notary\V1\RevokePublicKeyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function RevokePublicKey(\Adamant\Notary\V1\RevokePublicKeyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.notary.v1.NotaryAPI/RevokePublicKey',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Notary\V1\UpdatePublicKeyLimitRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function UpdatePublicKeyLimit(\Adamant\Notary\V1\UpdatePublicKeyLimitRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.notary.v1.NotaryAPI/UpdatePublicKeyLimit',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * -----------------------------------------------------------------------------
     * Signature Verification (atomic: key resolve → verify → consume nonce)
     * -----------------------------------------------------------------------------
     * @param \Adamant\Notary\V1\VerifySignatureRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function VerifySignature(\Adamant\Notary\V1\VerifySignatureRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.notary.v1.NotaryAPI/VerifySignature',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

}
