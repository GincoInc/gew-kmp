// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;


/**
* Validates {@code ListBlacklistAddressesByFilterResponse} protobuf objects.
*/
@SuppressWarnings("all")
public class ListBlacklistAddressesByFilterResponseValidator implements io.envoyproxy.pgv.ValidatorImpl<adamant.global.v1.ListBlacklistAddressesByFilterResponse>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(adamant.global.v1.ListBlacklistAddressesByFilterResponse.class)) return new ListBlacklistAddressesByFilterResponseValidator();
		
		return null;
	}
		
	
		
	
	

	public void assertValid(adamant.global.v1.ListBlacklistAddressesByFilterResponse proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.RepeatedValidation.forEach(proto.getAddressesList(), item -> {
				
			// Validate addresses
			if (true) index.validatorFor(item).assertValid(item);
			});
	// no validation rules for NextPageToken

	
	}

}
