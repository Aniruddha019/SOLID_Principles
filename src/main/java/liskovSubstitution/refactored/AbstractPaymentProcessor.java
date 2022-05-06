package liskovSubstitution.refactored;

import liskovSubstitution.init.OrderInit;

public abstract class AbstractPaymentProcessor {

	public abstract void pay(OrderRefactored order);
}
