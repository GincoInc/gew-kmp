// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;


/**
* Validates {@code CalculateFeeRbfSpecific} protobuf objects.
*/
@SuppressWarnings("all")
public class CalculateFeeRbfSpecificValidator implements io.envoyproxy.pgv.ValidatorImpl<adamant.global.v1.CalculateFeeRbfSpecific>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(adamant.global.v1.CalculateFeeRbfSpecific.class)) return new CalculateFeeRbfSpecificValidator();
		
		return null;
	}
		
		com.google.re2j.Pattern TRANSACTION_ID__PATTERN = com.google.re2j.Pattern.compile("^$|^[0-9a-f]{8}-[0-9a-f]{4}-4[0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$");
	
	

	public void assertValid(adamant.global.v1.CalculateFeeRbfSpecific proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.StringValidation.pattern(".adamant.global.v1.CalculateFeeRbfSpecific.transaction_id", proto.getTransactionId(), TRANSACTION_ID__PATTERN);
	
	}

}
