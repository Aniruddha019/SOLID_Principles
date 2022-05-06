package interfaceSegregation.refactored;

import lombok.Setter;

@Setter
public class DebitPaymentProcessorSMS extends AbstractPaymentProcessor_SMS {

	private Integer securityCode;
	private boolean verified = false;

	public DebitPaymentProcessorSMS(Integer securityCode) {
		System.out.println("Verifying Security code: " + securityCode);
		this.securityCode = securityCode;
		this.verified = false;
	}

	@Override
	public void pay(OrderRefactored order) {
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
