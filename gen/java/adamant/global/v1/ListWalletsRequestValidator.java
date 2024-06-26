// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;


/**
* Validates {@code ListWalletsRequest} protobuf objects.
*/
@SuppressWarnings("all")
public class ListWalletsRequestValidator implements io.envoyproxy.pgv.ValidatorImpl<adamant.global.v1.ListWalletsRequest>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(adamant.global.v1.ListWalletsRequest.class)) return new ListWalletsRequestValidator();
		
		return null;
	}
		
		private final Integer PAGE_SIZE__LTE = 100;
	
		
		com.google.re2j.Pattern PAGE_TOKEN__PATTERN = com.google.re2j.Pattern.compile("^$|^[ABCDEFGHIJKLMNOPQRSTUVWXYZ234567]{16}$");
	
	

	public void assertValid(adamant.global.v1.ListWalletsRequest proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.ComparativeValidation.lessThanOrEqual(".adamant.global.v1.ListWalletsRequest.page_size", proto.getPageSize(), PAGE_SIZE__LTE, java.util.Comparator.naturalOrder());
	
			io.envoyproxy.pgv.StringValidation.pattern(".adamant.global.v1.ListWalletsRequest.page_token", proto.getPageToken(), PAGE_TOKEN__PATTERN);
	
	}

}

