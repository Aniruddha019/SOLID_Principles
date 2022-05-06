package dependencyInversion.init;

import lombok.Setter;

@Setter
public class DebitPaymentProcessorSMS extends PaymentProcessor {

	private Integer securityCode;
	private SMSAuthorizer smsAuthorizer;

	public DebitPaymentProcessorSMS(Integer securityCode, SMSAuthorizer smsAuthorizer) {
		System.out.println("Verifying Security code: " + securityCode);
		this.securityCode = securityCode;
		this.smsAuthorizer = smsAuthorizer;
	}

	@Override
	public void pay(OrderInit order) {
		System.out.println("Processing debit paymentType");
		if (smsAuthorizer.isAuthorized())
			order.setStatus("paid");
	}

}
