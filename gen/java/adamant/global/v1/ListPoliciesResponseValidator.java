// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
* Validates {@code ListPoliciesResponse} protobuf objects.
*/
public class ListPoliciesResponseValidator implements io.envoyproxy.pgv.ValidatorImpl<adamant.global.v1.ListPoliciesResponse>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(adamant.global.v1.ListPoliciesResponse.class)) return new ListPoliciesResponseValidator();
		
		return null;
	}
		
	
	

	public void assertValid(adamant.global.v1.ListPoliciesResponse proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.RepeatedValidation.forEach(proto.getPoliciesList(), item -> {
				
			// Validate policies
			if (true) index.validatorFor(item).assertValid(item);
			});

	
	}

}
