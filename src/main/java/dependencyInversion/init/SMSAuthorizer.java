package dependencyInversion.init;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SMSAuthorizer {

	private boolean isAuthorized = false;

	public void authSMS(Integer otp){
		System.out.println("Verifying OTP : " + otp);
		isAuthorized = true;
	};
}
