// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;


/**
* Validates {@code GetBlacklistStorageSignedURLRequest} protobuf objects.
*/
@SuppressWarnings("all")
public class GetBlacklistStorageSignedURLRequestValidator implements io.envoyproxy.pgv.ValidatorImpl<adamant.global.v1.GetBlacklistStorageSignedURLRequest>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(adamant.global.v1.GetBlacklistStorageSignedURLRequest.class)) return new GetBlacklistStorageSignedURLRequestValidator();
		
		return null;
	}
		
	
		
	
	

	public void assertValid(adamant.global.v1.GetBlacklistStorageSignedURLRequest proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.EnumValidation.definedOnly(".adamant.global.v1.GetBlacklistStorageSignedURLRequest.network", proto.getNetwork());
	// no validation rules for FileName

	
	}

}

