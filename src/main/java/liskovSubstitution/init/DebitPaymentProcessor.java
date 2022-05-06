package liskovSubstitution.init;

public class DebitPaymentProcessor extends AbstractPaymentProcessor {
	@Override
	public void pay(OrderInit order, String securityCode) {
		System.out.println("Processing debit paymentType");
		System.out.println("Verifying Security code: " + securityCode);
		order.setStatus("paid");
	}
}
