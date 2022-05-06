package dependencyInversion.refactored;

public abstract class PaymentProcessor {

	public abstract void pay(OrderRefactored order);

}
