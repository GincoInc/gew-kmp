// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/teller/v1/adamanttellerv1/teller_api.proto

package adamant.teller.v1;


/**
* Validates {@code ListColdFeeDepositAddressesResponse} protobuf objects.
*/
@SuppressWarnings("all")
public class ListColdFeeDepositAddressesResponseValidator implements io.envoyproxy.pgv.ValidatorImpl<adamant.teller.v1.ListColdFeeDepositAddressesResponse>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(adamant.teller.v1.ListColdFeeDepositAddressesResponse.class)) return new ListColdFeeDepositAddressesResponseValidator();
		
		return null;
	}
		
	
	

	public void assertValid(adamant.teller.v1.ListColdFeeDepositAddressesResponse proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.RepeatedValidation.forEach(proto.getCallerAddressesList(), item -> {
				
			// Validate caller_addresses
			if (true) index.validatorFor(item).assertValid(item);
			});
	
	}

}

