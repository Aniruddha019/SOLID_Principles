package openClosed.refactored;

public class DebitPaymentProcessor extends AbstractPaymentProcessor{
	@Override
	public void pay(OrderRefactored order, Integer securityCode) {
		System.out.println("Processing debit paymentType");
		System.out.println("Verifying Security code: " + securityCode);
		order.setStatus("paid");
	}
}
