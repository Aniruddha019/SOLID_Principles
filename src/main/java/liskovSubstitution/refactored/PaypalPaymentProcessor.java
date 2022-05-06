package liskovSubstitution.refactored;

import liskovSubstitution.init.OrderInit;

public class PaypalPaymentProcessor extends AbstractPaymentProcessor {

	private final String email;

	public PaypalPaymentProcessor(String email) {
		this.email = email;
	}

	@Override
	public void pay(OrderRefactored order) {
		System.out.println("Processing paypal paymentType");
		System.out.println("Verifying Security code: " + email);
		order.setStatus("paid");
	}
}
