// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
* Validates {@code ListWalletsByFilterRequest} protobuf objects.
*/
public class ListWalletsByFilterRequestValidator implements io.envoyproxy.pgv.ValidatorImpl<adamant.global.v1.ListWalletsByFilterRequest>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(adamant.global.v1.ListWalletsByFilterRequest.class)) return new ListWalletsByFilterRequestValidator();
		
		return null;
	}
		
		private final adamant.global.v1.Enum.ListFilterType[] FILTER_TYPE__NOT_IN = new adamant.global.v1.Enum.ListFilterType[]{
			adamant.global.v1.Enum.ListFilterType.forNumber(0),
		};
	
		
	
		
	
		
	
		
	
		
	
		
	
		
	
		
		private final Integer PAGE_SIZE__LTE = 100;
	
		
		com.google.re2j.Pattern PAGE_TOKEN__PATTERN = com.google.re2j.Pattern.compile("^$|^[ABCDEFGHIJKLMNOPQRSTUVWXYZ234567]{16}$");
	
	

	public void assertValid(adamant.global.v1.ListWalletsByFilterRequest proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.EnumValidation.definedOnly(".adamant.global.v1.ListWalletsByFilterRequest.filter_type", proto.getFilterType());
			io.envoyproxy.pgv.CollectiveValidation.notIn(".adamant.global.v1.ListWalletsByFilterRequest.filter_type", proto.getFilterType(), FILTER_TYPE__NOT_IN);
	// no validation rules for WalletId

	
			io.envoyproxy.pgv.StringValidation.maxLength(".adamant.global.v1.ListWalletsByFilterRequest.wallet_name", proto.getWalletName(), 20);
	// no validation rules for Address

	// no validation rules for WatchOnly

	
			io.envoyproxy.pgv.EnumValidation.definedOnly(".adamant.global.v1.ListWalletsByFilterRequest.coin", proto.getCoin());
	
			io.envoyproxy.pgv.RepeatedValidation.forEach(proto.getWalletTypeList(), item -> {
				// no validation rules for WalletType

			});

	
			io.envoyproxy.pgv.RepeatedValidation.forEach(proto.getWalletStateList(), item -> {
				// no validation rules for WalletState

			});

	
			io.envoyproxy.pgv.ComparativeValidation.lessThanOrEqual(".adamant.global.v1.ListWalletsByFilterRequest.page_size", proto.getPageSize(), PAGE_SIZE__LTE, java.util.Comparator.naturalOrder());
	
			io.envoyproxy.pgv.StringValidation.pattern(".adamant.global.v1.ListWalletsByFilterRequest.page_token", proto.getPageToken(), PAGE_TOKEN__PATTERN);
	
	}

}
