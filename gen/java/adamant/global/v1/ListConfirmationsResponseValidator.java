// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;


/**
* Validates {@code ListConfirmationsResponse} protobuf objects.
*/
@SuppressWarnings("all")
public class ListConfirmationsResponseValidator implements io.envoyproxy.pgv.ValidatorImpl<adamant.global.v1.ListConfirmationsResponse>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(adamant.global.v1.ListConfirmationsResponse.class)) return new ListConfirmationsResponseValidator();
		
		return null;
	}
		
	
	

	public void assertValid(adamant.global.v1.ListConfirmationsResponse proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.RepeatedValidation.forEach(proto.getConfirmationsList(), item -> {
				
			// Validate confirmations
			if (true) index.validatorFor(item).assertValid(item);
			});
	
	}

}

