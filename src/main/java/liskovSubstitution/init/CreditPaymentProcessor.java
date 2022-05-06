package liskovSubstitution.init;

public class CreditPaymentProcessor extends AbstractPaymentProcessor {
	@Override
	public void pay(OrderInit order, String securityCode) {
		System.out.println("Processing credit paymentType");
		System.out.println("Verifying Security code: " + securityCode);
		order.setStatus("paid");
	}
}
