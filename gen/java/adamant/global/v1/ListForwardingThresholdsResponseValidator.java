// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;


/**
* Validates {@code ListForwardingThresholdsResponse} protobuf objects.
*/
@SuppressWarnings("all")
public class ListForwardingThresholdsResponseValidator implements io.envoyproxy.pgv.ValidatorImpl<adamant.global.v1.ListForwardingThresholdsResponse>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(adamant.global.v1.ListForwardingThresholdsResponse.class)) return new ListForwardingThresholdsResponseValidator();
		
		return null;
	}
		
	
	

	public void assertValid(adamant.global.v1.ListForwardingThresholdsResponse proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.RepeatedValidation.forEach(proto.getForwardingThresholdsList(), item -> {
				
			// Validate forwarding_thresholds
			if (true) index.validatorFor(item).assertValid(item);
			});
	
	}

}

