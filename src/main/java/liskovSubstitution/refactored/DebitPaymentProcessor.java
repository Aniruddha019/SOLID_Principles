package liskovSubstitution.refactored;

import liskovSubstitution.init.OrderInit;

public class DebitPaymentProcessor extends AbstractPaymentProcessor {

	private final Integer securityCode;

	public DebitPaymentProcessor(Integer securityCode) {
		this.securityCode = securityCode;
	}

	@Override
	public void pay(OrderRefactored order) {
		System.out.println("Processing debit paymentType");
		System.out.println("Verifying Security code: " + securityCode);
		order.setStatus("paid");
	}
}
