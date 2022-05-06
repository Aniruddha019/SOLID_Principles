package dependencyInversion.init;

import lombok.Setter;

@Setter
public class PaypalPaymentAuthorizer extends PaymentProcessor {

	private final String email;
	private SMSAuthorizer smsAuthorizer;

	public PaypalPaymentAuthorizer(String email, SMSAuthorizer smsAuthorizer) {
		System.out.println("Verifying Security code: " + email);
		this.email = email;
		this.smsAuthorizer = smsAuthorizer;
	}

	@Override
	public void pay(OrderInit order) {
		System.out.println("Processing paypal paymentType");
		if(smsAuthorizer.isAuthorized())
		    order.setStatus("paid");
	}

}
