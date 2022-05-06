package dependencyInversion.refactored;

import lombok.Setter;

@Setter
public class CreditPaymentProcessor extends PaymentProcessor {

	private Integer securityCode;

	public CreditPaymentProcessor(Integer securityCode) {
		System.out.println("Verifying Security code: " + securityCode);
		this.securityCode = securityCode;
	}

	@Override
	public void pay(OrderRefactored order) {
		System.out.println("Processing credit paymentType");
		order.setStatus("paid");
	}

//	@Override
//	public void authSMS(Integer otp) {
//		System.out.println("Not implemented");
//	}
}
