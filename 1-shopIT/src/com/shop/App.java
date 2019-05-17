package com.shop;

import com.shop.bill.BillingImpl;

public class App {

	public static void main(String[] args) {

		// init

		BillingImpl billingImpl = new BillingImpl();

		// use
		String[] cart = { "234345", "0987654", "34568" };
		double totalPrice = billingImpl.getTotalPrice(cart);
		System.out.println("Total " + totalPrice);
		System.out.println("Thanks for shopping");

	}

}
