package liskovSubstitution.init;

public class PaypalPaymentProcessor extends AbstractPaymentProcessor{
	@Override
	public void pay(OrderInit order, String email) {
		System.out.println("Processing paypal paymentType");
		System.out.println("Verifying Security code: " + email);
		order.setStatus("paid");
	}
}
