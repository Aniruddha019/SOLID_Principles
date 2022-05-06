package openClosed.init;
/**
 *  Example of a class that violates the Open Closed Principle.
 */
public class PaymentProcessor {
	public void payCredit(OrderInit order, Integer securityCode) {
		System.out.println("Processing credit paymentType");
		System.out.println("Verifying Security code: " + securityCode);
		order.setStatus("paid");
	}

	public void payDebit(OrderInit order, Integer securityCode) {
		System.out.println("Processing debit paymentType");
		System.out.println("Verifying Security code: " + securityCode);
		order.setStatus("paid");
	}
}
