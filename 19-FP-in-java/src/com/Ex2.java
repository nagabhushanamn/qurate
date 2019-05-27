package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.lib.ProductsLib;
import com.model.Product;

public class Ex2 {

	// ---------------------------------------------------------------------
	// declarative style ==> what
	// ---------------------------------------------------------------------

	public static List<Product> getProductsByPrice(List<Product> in, double price) {

//		// ----------------------------------------------
//		// Local Inner class
//		// ----------------------------------------------
//		class ByPrice implements Predicate<Product> {
//			@Override
//			public boolean test(Product t) {
//				return t.getPrice() == price;
//			}
//		}
//		Predicate<Product> predicate = new ByPrice();

		// ----------------------------------------------
		// Anonymous Inner class
		// ----------------------------------------------
//		Predicate<Product> predicate = new Predicate<Product>() {
//			@Override
//			public boolean test(Product t) {
//				return t.getPrice() == price;
//			}
//		};
//
//		return ProductsLib.filter(in, predicate);
//		

		// ----------------------------------------------
		// function
		// ----------------------------------------------

		return ProductsLib.filter(in, item -> item.getPrice() == price);
	}

	public static List<Product> getProductsByBetweenPrice(List<Product> in, double min, double max) {
		return ProductsLib.filter(in, item -> item.getPrice() >= min && item.getPrice() <= max);
	}

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product(234567, "laptop", 198000.00));
		list.add(new Product(343423, "mobile", 18000.00));
		list.add(new Product(543534, "ipad", 1000.00));
		list.add(new Product(123133, "headphone", 1000.00));
		list.add(new Product(234234, "other", 2000.00));

		// --------------------------------------------------
		List<Product> result = getProductsByPrice(list, 1000.00);
		display(result);
		// --------------------------------------------------

	}

	private static void display(List<Product> result) {
		for (Product product : result)
			System.out.println(product);
	}

}
