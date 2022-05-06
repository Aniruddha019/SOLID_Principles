package interfaceSegregation.refactored;

public abstract class AbstractPaymentProcessor_SMS extends AbstractPaymentProcessor {

	public abstract void authSMS(Integer otp);
}
