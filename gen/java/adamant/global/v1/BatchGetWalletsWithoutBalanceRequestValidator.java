// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;


/**
* Validates {@code BatchGetWalletsWithoutBalanceRequest} protobuf objects.
*/
@SuppressWarnings("all")
public class BatchGetWalletsWithoutBalanceRequestValidator implements io.envoyproxy.pgv.ValidatorImpl<adamant.global.v1.BatchGetWalletsWithoutBalanceRequest>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(adamant.global.v1.BatchGetWalletsWithoutBalanceRequest.class)) return new BatchGetWalletsWithoutBalanceRequestValidator();
		
		return null;
	}
		
	
	

	public void assertValid(adamant.global.v1.BatchGetWalletsWithoutBalanceRequest proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.RepeatedValidation.forEach(proto.getWalletIdsList(), item -> {
				// no validation rules for WalletIds

			});
	
	}

}

