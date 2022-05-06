package openClosed.refactored;

public class CreditPaymentProcessor extends AbstractPaymentProcessor{
	@Override
	public void pay(OrderRefactored order, Integer securityCode) {
		System.out.println("Processing credit paymentType");
		System.out.println("Verifying Security code: " + securityCode);
		order.setStatus("paid");
	}
}
