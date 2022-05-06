package singleResponsibility.refactored;

public class PaymentProcessor {
	public void payCredit(OrderRefactored order, Integer securityCode) {
		System.out.println("Processing credit paymentType");
		System.out.println("Verifying Security code: " + securityCode);
		order.setStatus("paid");
	}

	public void payDebit(OrderRefactored order, Integer securityCode) {
		System.out.println("Processing debit paymentType");
		System.out.println("Verifying Security code: " + securityCode);
		order.setStatus("paid");
	}
}
