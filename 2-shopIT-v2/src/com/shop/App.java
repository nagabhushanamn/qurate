package com.shop;

import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrix_v1;
import com.shop.pm.PriceMatrix_v2;

public class App {

	public static void main(String[] args) {

		// init

		PriceMatrix priceMatrixV1 = new PriceMatrix_v1();
		PriceMatrix priceMatrixV2 = new PriceMatrix_v2();
		BillingImpl billingImpl = new BillingImpl(priceMatrixV2);

		// use
		String[] cart = { "234345", "0987654", "34568" };
		double totalPrice = billingImpl.getTotalPrice(cart);
		System.out.println("Total " + totalPrice);
		System.out.println("Thanks for shopping");

	}

}
