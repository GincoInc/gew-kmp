// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;


/**
* Validates {@code ExistsIOSTAccountRequest} protobuf objects.
*/
@SuppressWarnings("all")
public class ExistsIOSTAccountRequestValidator implements io.envoyproxy.pgv.ValidatorImpl<adamant.global.v1.ExistsIOSTAccountRequest>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(adamant.global.v1.ExistsIOSTAccountRequest.class)) return new ExistsIOSTAccountRequestValidator();
		
		return null;
	}
		
		com.google.re2j.Pattern ACCOUNT_NAME__PATTERN = com.google.re2j.Pattern.compile("^([a-z0-9_]{5,11})$");
	
	

	public void assertValid(adamant.global.v1.ExistsIOSTAccountRequest proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.StringValidation.pattern(".adamant.global.v1.ExistsIOSTAccountRequest.account_name", proto.getAccountName(), ACCOUNT_NAME__PATTERN);
	
	}

}

