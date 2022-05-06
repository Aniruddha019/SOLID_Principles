package openClosed.refactored;

public abstract class AbstractPaymentProcessor {

	public abstract void pay(OrderRefactored order, Integer securityCode);
}
