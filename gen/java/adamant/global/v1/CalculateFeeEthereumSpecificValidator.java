// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;


/**
* Validates {@code CalculateFeeEthereumSpecific} protobuf objects.
*/
@SuppressWarnings("all")
public class CalculateFeeEthereumSpecificValidator implements io.envoyproxy.pgv.ValidatorImpl<adamant.global.v1.CalculateFeeEthereumSpecific>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(adamant.global.v1.CalculateFeeEthereumSpecific.class)) return new CalculateFeeEthereumSpecificValidator();
		
		return null;
	}
		
		com.google.re2j.Pattern DATA__PATTERN = com.google.re2j.Pattern.compile("^0x[0-9a-fA-F]*$");
	
	

	public void assertValid(adamant.global.v1.CalculateFeeEthereumSpecific proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.StringValidation.pattern(".adamant.global.v1.CalculateFeeEthereumSpecific.data", proto.getData(), DATA__PATTERN);
	
	}

}
