// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;


/**
* Validates {@code ListWalletTransferVolumeSnapshotsResponse} protobuf objects.
*/
@SuppressWarnings("all")
public class ListWalletTransferVolumeSnapshotsResponseValidator implements io.envoyproxy.pgv.ValidatorImpl<adamant.global.v1.ListWalletTransferVolumeSnapshotsResponse>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(adamant.global.v1.ListWalletTransferVolumeSnapshotsResponse.class)) return new ListWalletTransferVolumeSnapshotsResponseValidator();
		
		return null;
	}
		
	
	

	public void assertValid(adamant.global.v1.ListWalletTransferVolumeSnapshotsResponse proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			// Validate wallet_transfer_volume_snapshots
			if (proto.hasWalletTransferVolumeSnapshots()) index.validatorFor(proto.getWalletTransferVolumeSnapshots()).assertValid(proto.getWalletTransferVolumeSnapshots());
	
	}

}

