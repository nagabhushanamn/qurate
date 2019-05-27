package com;

import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class Ex1 {

	// ---------------------------------------------------------------------
	// imperative style  ==> what + how
	// ---------------------------------------------------------------------

	public static List<Product> getProductsByPrice(List<Product> in, double price) {
		List<Product> out = new ArrayList<>();
		for (Product product : in) {
			if (product.getPrice() == price) {
				out.add(product);
			}
		}
		return out;
	}

	public static List<Product> getProductsByBetweenPrice(List<Product> in, double min, double max) {
		List<Product> out = new ArrayList<>();
		for (Product product : in) {
			if (product.getPrice() >= min && product.getPrice() <= max) {
				out.add(product);
			}
		}
		return out;
	}

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product(234567, "laptop", 198000.00));
		list.add(new Product(343423, "mobile", 18000.00));
		list.add(new Product(543534, "ipad", 1000.00));
		list.add(new Product(123133, "headphone", 1000.00));
		list.add(new Product(234234, "other", 2000.00));

		// --------------------------------------------------
//		List<Product> result = getProductsByPrice(list, 1000.00);
		List<Product> result = getProductsByBetweenPrice(list, 1000.00, 8000.00);
		display(result);
		// --------------------------------------------------

	}

	private static void display(List<Product> result) {
		for (Product product : result)
			System.out.println(product);
	}

}
