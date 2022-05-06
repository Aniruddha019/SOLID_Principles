package liskovSubstitution.init;

public abstract class AbstractPaymentProcessor {

	public abstract void pay(OrderInit order, String securityCode);
}
