package dependencyInversion.refactored;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SMSAuthorizer extends Authorizer {

	private boolean isAuthorized = false;

	public void authSMS(Integer otp){
		System.out.println("Verifying OTP : " + otp);
		isAuthorized = true;
	};
}
