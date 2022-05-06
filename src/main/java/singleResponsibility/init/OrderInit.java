package main.java.singleResponsibility.init;

import java.util.ArrayList;
import java.util.List;

/**
 *  Example of a class that has multiple responsibilities.
 */
public class OrderInit {

	private final List<String> items = new ArrayList<String>();
	private final List<Integer> quantities = new ArrayList<Integer>();
	private final List<Double> prices = new ArrayList<Double>();
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

	public void pay(String paymentType, Integer securityCode) {
		if (paymentType.equals("credit")) {
			System.out.println("Processing credit paymentType");
			System.out.println("Verifying Security code: " + securityCode);
			status = "paid";

		} else if (paymentType.equals("debit")) {
			System.out.println("Processing debit paymentType");
			System.out.println("Verifying Security code: " + securityCode);
			status = "paid";
		} else {
			System.out.println("Invalid paymentType");
		}
	}

	public static void main(String[] args) {
		OrderInit order = new OrderInit();
		order.addItem("Apple", 2, 1.5);
		order.addItem("Orange", 3, 2.5);
		order.addItem("Banana", 1, 0.5);
		System.out.println("Total price: " + order.calculateTotalPrice());
		order.pay("credit", 123);
		System.out.println("Order status: " + order.status);
	}

}
