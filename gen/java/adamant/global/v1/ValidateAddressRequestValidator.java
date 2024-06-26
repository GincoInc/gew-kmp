// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;


/**
* Validates {@code ValidateAddressRequest} protobuf objects.
*/
@SuppressWarnings("all")
public class ValidateAddressRequestValidator implements io.envoyproxy.pgv.ValidatorImpl<adamant.global.v1.ValidateAddressRequest>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(adamant.global.v1.ValidateAddressRequest.class)) return new ValidateAddressRequestValidator();
		
		return null;
	}
		
		private final gincoinc.global.v1.Enum.Coin[] COIN__NOT_IN = new gincoinc.global.v1.Enum.Coin[]{
			gincoinc.global.v1.Enum.Coin.forNumber(0),
		};
	
		
	
	

	public void assertValid(adamant.global.v1.ValidateAddressRequest proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.EnumValidation.definedOnly(".adamant.global.v1.ValidateAddressRequest.coin", proto.getCoin());
			io.envoyproxy.pgv.CollectiveValidation.notIn(".adamant.global.v1.ValidateAddressRequest.coin", proto.getCoin(), COIN__NOT_IN);
	// no validation rules for Address

	
	}

}

