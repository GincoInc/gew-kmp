// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;


/**
* Validates {@code ListAuditLogsRequest} protobuf objects.
*/
@SuppressWarnings("all")
public class ListAuditLogsRequestValidator implements io.envoyproxy.pgv.ValidatorImpl<adamant.global.v1.ListAuditLogsRequest>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(adamant.global.v1.ListAuditLogsRequest.class)) return new ListAuditLogsRequestValidator();
		
		return null;
	}
		
	
		
		com.google.re2j.Pattern ACCOUNT_ID__PATTERN = com.google.re2j.Pattern.compile("^$|^[0-9a-f]{8}-[0-9a-f]{4}-4[0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$");
	
		
		private final Integer PAGE_SIZE__LTE = 100;
	
		
		com.google.re2j.Pattern PAGE_TOKEN__PATTERN = com.google.re2j.Pattern.compile("^$|^[ABCDEFGHIJKLMNOPQRSTUVWXYZ234567]{16}$");
	
	

	public void assertValid(adamant.global.v1.ListAuditLogsRequest proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	// no validation rules for AuditLogGroup

	
			io.envoyproxy.pgv.StringValidation.pattern(".adamant.global.v1.ListAuditLogsRequest.account_id", proto.getAccountId(), ACCOUNT_ID__PATTERN);
	
			io.envoyproxy.pgv.ComparativeValidation.lessThanOrEqual(".adamant.global.v1.ListAuditLogsRequest.page_size", proto.getPageSize(), PAGE_SIZE__LTE, java.util.Comparator.naturalOrder());
	
			io.envoyproxy.pgv.StringValidation.pattern(".adamant.global.v1.ListAuditLogsRequest.page_token", proto.getPageToken(), PAGE_TOKEN__PATTERN);
	
	}

}
