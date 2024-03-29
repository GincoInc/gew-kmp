// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;


/**
* Validates {@code UpdatePolicyRequest} protobuf objects.
*/
@SuppressWarnings("all")
public class UpdatePolicyRequestValidator implements io.envoyproxy.pgv.ValidatorImpl<adamant.global.v1.UpdatePolicyRequest>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(adamant.global.v1.UpdatePolicyRequest.class)) return new UpdatePolicyRequestValidator();
		
		return null;
	}
		
		com.google.re2j.Pattern POLICY_ID__PATTERN = com.google.re2j.Pattern.compile("^[0-9a-f]{8}-[0-9a-f]{4}-4[0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$");
	
		
	
		
		com.google.re2j.Pattern WHITELIST_ID__PATTERN = com.google.re2j.Pattern.compile("^$|^[0-9a-f]{8}-[0-9a-f]{4}-4[0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$");
	
		
		com.google.re2j.Pattern TRANSFER_LIMIT_ID__PATTERN = com.google.re2j.Pattern.compile("^[0-9a-f]{8}-[0-9a-f]{4}-4[0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$");
	
	

	public void assertValid(adamant.global.v1.UpdatePolicyRequest proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.StringValidation.pattern(".adamant.global.v1.UpdatePolicyRequest.policy_id", proto.getPolicyId(), POLICY_ID__PATTERN);
	
			io.envoyproxy.pgv.StringValidation.minLength(".adamant.global.v1.UpdatePolicyRequest.name", proto.getName(), 1);
			io.envoyproxy.pgv.StringValidation.maxLength(".adamant.global.v1.UpdatePolicyRequest.name", proto.getName(), 40);
	
			io.envoyproxy.pgv.StringValidation.pattern(".adamant.global.v1.UpdatePolicyRequest.whitelist_id", proto.getWhitelistId(), WHITELIST_ID__PATTERN);
	
			io.envoyproxy.pgv.StringValidation.pattern(".adamant.global.v1.UpdatePolicyRequest.transfer_limit_id", proto.getTransferLimitId(), TRANSFER_LIMIT_ID__PATTERN);
	
	}

}

