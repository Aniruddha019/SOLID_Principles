package dependencyInversion.refactored;

import lombok.Setter;

@Setter
public class PaypalPaymentAuthorizer extends PaymentProcessor {

	private final String email;
	private Authorizer authorizer;

	public PaypalPaymentAuthorizer(String email, Authorizer authorizer) {
		System.out.println("Verifying Security code: " + email);
		this.email = email;
		this.authorizer = authorizer;
	}

	@Override
	public void pay(OrderRefactored order) {
		System.out.println("Processing paypal paymentType");
		if(authorizer.isAuthorized())
		    order.setStatus("paid");
	}

}
