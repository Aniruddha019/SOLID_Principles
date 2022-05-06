package liskovSubstitution.refactored;

import liskovSubstitution.init.OrderInit;

public class CreditPaymentProcessor extends AbstractPaymentProcessor {

	private final Integer securityCode;

	public CreditPaymentProcessor(Integer securityCode) {
		this.securityCode = securityCode;
	}

	@Override
	public void pay(OrderRefactored order) {
		System.out.println("Processing credit paymentType");
		System.out.println("Verifying Security code: " + securityCode);
		order.setStatus("paid");
	}
}
