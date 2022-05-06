package interfaceSegregation.init;

import lombok.Setter;

@Setter
public class PaypalPaymentProcessor extends AbstractPaymentProcessor {

	private final String email;
	private boolean verified = false;

	public PaypalPaymentProcessor(String email) {
		System.out.println("Verifying Security code: " + email);
		this.email = email;
		this.verified = false;
	}

	@Override
	public void pay(OrderInit order) {
		System.out.println("Processing paypal paymentType");
		if(verified)
		    order.setStatus("paid");
	}

	@Override
	public void authSMS(Integer otp) {
		System.out.println("OTP Verified : " + otp);
		verified = true;
	}
}
