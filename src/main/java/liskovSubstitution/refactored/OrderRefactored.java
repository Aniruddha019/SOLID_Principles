package liskovSubstitution.refactored;

import java.util.ArrayList;
import java.util.List;

import lombok.Setter;

@Setter
public class OrderRefactored {

	private List<String> items = new ArrayList<String>();
	private List<Integer> quantities = new ArrayList<Integer>();
	private List<Double> prices = new ArrayList<Double>();
	private String status = "open";

	public void addItem(String item, int quantity, double price) {
		items.add(item);
		quantities.add(quantity);
		prices.add(price);
	}

	public Double calculateTotalPrice() {
		double totalPrice = 0.0;
		for (int i = 0; i < items.size(); i++) {
			totalPrice += quantities.get(i) * prices.get(i);
		}
		return totalPrice;
	}
	
	public static void main(String[] args) {
		OrderRefactored order = new OrderRefactored();
		order.addItem("Apple", 2, 1.5);
		order.addItem("Orange", 3, 2.5);
		order.addItem("Banana", 1, 0.5);
		System.out.println("Total price: " + order.calculateTotalPrice());
		AbstractPaymentProcessor paymentProcessor = new PaypalPaymentProcessor("aniruddha.s@perfios.com");
		paymentProcessor.pay(order);
		System.out.println("Order status: " + order.status);
	}

}
