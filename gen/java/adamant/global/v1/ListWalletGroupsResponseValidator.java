// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package java.adamant.global.v1;

/**
* Validates {@code ListWalletGroupsResponse} protobuf objects.
*/
public class ListWalletGroupsResponseValidator implements io.envoyproxy.pgv.ValidatorImpl<java.adamant.global.v1.ListWalletGroupsResponse>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(java.adamant.global.v1.ListWalletGroupsResponse.class)) return new ListWalletGroupsResponseValidator();
		
		return null;
	}
		
	
		
	
	

	public void assertValid(java.adamant.global.v1.ListWalletGroupsResponse proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.RepeatedValidation.forEach(proto.getWalletGroupsList(), item -> {
				
			// Validate wallet_groups
			if (true) index.validatorFor(item).assertValid(item);
			});

	// no validation rules for NextPageToken

	
	}

}
