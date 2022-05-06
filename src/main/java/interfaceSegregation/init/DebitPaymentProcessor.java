package interfaceSegregation.init;

import lombok.Setter;

@Setter
public class DebitPaymentProcessor extends AbstractPaymentProcessor {

	private Integer securityCode;
	private boolean verified = false;

	public DebitPaymentProcessor(Integer securityCode) {
		System.out.println("Verifying Security code: " + securityCode);
		this.securityCode = securityCode;
		this.verified = false;
	}

	@Override
	public void pay(OrderInit order) {
		System.out.println("Processing debit paymentType");
		if (verified)
			order.setStatus("paid");
	}

	@Override
	public void authSMS(Integer otp) {
		System.out.println("OTP Verified : " + otp);
		verified = true;
	}
}
