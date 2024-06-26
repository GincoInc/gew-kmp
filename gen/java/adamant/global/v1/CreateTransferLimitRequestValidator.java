// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;


/**
* Validates {@code CreateTransferLimitRequest} protobuf objects.
*/
@SuppressWarnings("all")
public class CreateTransferLimitRequestValidator implements io.envoyproxy.pgv.ValidatorImpl<adamant.global.v1.CreateTransferLimitRequest>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(adamant.global.v1.CreateTransferLimitRequest.class)) return new CreateTransferLimitRequestValidator();
		
		return null;
	}
		
	
		
		private final gincoinc.global.v1.Enum.Coin[] COIN__NOT_IN = new gincoinc.global.v1.Enum.Coin[]{
			gincoinc.global.v1.Enum.Coin.forNumber(0),
		};
	
		
	
	

	public void assertValid(adamant.global.v1.CreateTransferLimitRequest proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.StringValidation.minLength(".adamant.global.v1.CreateTransferLimitRequest.name", proto.getName(), 1);
			io.envoyproxy.pgv.StringValidation.maxLength(".adamant.global.v1.CreateTransferLimitRequest.name", proto.getName(), 40);
	
			io.envoyproxy.pgv.EnumValidation.definedOnly(".adamant.global.v1.CreateTransferLimitRequest.coin", proto.getCoin());
			io.envoyproxy.pgv.CollectiveValidation.notIn(".adamant.global.v1.CreateTransferLimitRequest.coin", proto.getCoin(), COIN__NOT_IN);
	
			io.envoyproxy.pgv.RepeatedValidation.minItems(".adamant.global.v1.CreateTransferLimitRequest.transfer_limits", proto.getTransferLimitsList(), 1);
			io.envoyproxy.pgv.RepeatedValidation.forEach(proto.getTransferLimitsList(), item -> {
				
			// Validate transfer_limits
			if (true) index.validatorFor(item).assertValid(item);
			});
	
	}

}

