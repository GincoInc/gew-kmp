// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;


/**
* Validates {@code UpdateWalletFlushSettingRequest} protobuf objects.
*/
@SuppressWarnings("all")
public class UpdateWalletFlushSettingRequestValidator implements io.envoyproxy.pgv.ValidatorImpl<adamant.global.v1.UpdateWalletFlushSettingRequest>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(adamant.global.v1.UpdateWalletFlushSettingRequest.class)) return new UpdateWalletFlushSettingRequestValidator();
		
		return null;
	}
		
		private final gincoinc.global.v1.Enum.Coin[] COIN__NOT_IN = new gincoinc.global.v1.Enum.Coin[]{
			gincoinc.global.v1.Enum.Coin.forNumber(0),
		};
	
		
		com.google.re2j.Pattern DESTINATION_WALLET_ID__PATTERN = com.google.re2j.Pattern.compile("^$|^[0-9a-f]{8}-[0-9a-f]{4}-4[0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$");
	
		
	
	

	public void assertValid(adamant.global.v1.UpdateWalletFlushSettingRequest proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.EnumValidation.definedOnly(".adamant.global.v1.UpdateWalletFlushSettingRequest.coin", proto.getCoin());
			io.envoyproxy.pgv.CollectiveValidation.notIn(".adamant.global.v1.UpdateWalletFlushSettingRequest.coin", proto.getCoin(), COIN__NOT_IN);
	
			io.envoyproxy.pgv.StringValidation.pattern(".adamant.global.v1.UpdateWalletFlushSettingRequest.destination_wallet_id", proto.getDestinationWalletId(), DESTINATION_WALLET_ID__PATTERN);
	// no validation rules for FlushThreshold

	
	}

}

