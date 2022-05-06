package interfaceSegregation.init;

public abstract class AbstractPaymentProcessor {

	public abstract void pay(OrderInit order);

	public abstract void authSMS(Integer otp);
}
