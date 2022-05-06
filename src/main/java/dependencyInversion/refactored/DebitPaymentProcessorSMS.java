package dependencyInversion.refactored;

import lombok.Setter;

@Setter
public class DebitPaymentProcessorSMS extends PaymentProcessor {

	private Integer securityCode;
	private Authorizer authorizer;

	public DebitPaymentProcessorSMS(Integer securityCode, Authorizer authorizer) {
		System.out.println("Verifying Security code: " + securityCode);
		this.securityCode = securityCode;
		this.authorizer = authorizer;
	}

	@Override
	public void pay(OrderRefactored order) {
		System.out.println("Processing debit paymentType");
		if (authorizer.isAuthorized())
			order.setStatus("paid");
	}

}
