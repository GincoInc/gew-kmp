// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;


/**
* Validates {@code UpdateWalletGroupRequest} protobuf objects.
*/
@SuppressWarnings("all")
public class UpdateWalletGroupRequestValidator implements io.envoyproxy.pgv.ValidatorImpl<adamant.global.v1.UpdateWalletGroupRequest>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(adamant.global.v1.UpdateWalletGroupRequest.class)) return new UpdateWalletGroupRequestValidator();
		
		return null;
	}
		
		com.google.re2j.Pattern WALLET_GROUP_ID__PATTERN = com.google.re2j.Pattern.compile("^[0-9a-f]{8}-[0-9a-f]{4}-4[0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$");
	
		
	
	

	public void assertValid(adamant.global.v1.UpdateWalletGroupRequest proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.StringValidation.pattern(".adamant.global.v1.UpdateWalletGroupRequest.wallet_group_id", proto.getWalletGroupId(), WALLET_GROUP_ID__PATTERN);
	
			io.envoyproxy.pgv.RepeatedValidation.minItems(".adamant.global.v1.UpdateWalletGroupRequest.wallet_ids", proto.getWalletIdsList(), 1);
			io.envoyproxy.pgv.RepeatedValidation.forEach(proto.getWalletIdsList(), item -> {
				// no validation rules for WalletIds

			});
	
	}

}

