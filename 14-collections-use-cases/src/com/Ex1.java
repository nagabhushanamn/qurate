package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.model.Product;

public class Ex1 {

	public static void main(String[] args) {

		// --------------------------------------------------------
		List<Product> products = new ArrayList<>();
		products.add(new Product(12312233, "item1", 198000.00));
		products.add(new Product(12321312, "item2", 98000.00));
		products.add(new Product(23423434, "item3", 178000.00));
		products.add(new Product(12321312, "item2", 98000.00));
		products.add(new Product(52423443, "item4", 58000.00));

		// -----------------------------------------------------
		// Local Named Inner class
		// --------------------------------------------------------
//		class ProductsByPrice implements Comparator<Product> {
//			@Override
//			public int compare(Product o1, Product o2) {
//				return Double.compare(o2.getPrice(), o1.getPrice());
//			}
//		}
//		Comparator<Product> priceComarator = new ProductsByPrice();

		// -----------------------------------------------------
		// Local Anonymous Inner class
		// --------------------------------------------------------

//		Comparator<Product> priceComarator = new Comparator<Product>() {
//			@Override
//			public int compare(Product o1, Product o2) {
//				return Double.compare(o2.getPrice(), o1.getPrice());
//			}
//		};

		// -----------------------------------------------------
		// Lambda / function
		// --------------------------------------------------------

//		Comparator<Product> priceComarator = (Product o1, Product o2) -> {
//			return Double.compare(o2.getPrice(), o1.getPrice());
//		};
//		
//		Comparator<Product> priceComarator = (o1, o2) -> {
//			return Double.compare(o2.getPrice(), o1.getPrice());
//		};

		Comparator<Product> priceComarator = (o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice());
		Collections.sort(products, priceComarator);

		display(products);

		// --------------------------------------------------------
	}

	private static void display(List<Product> products) {
		for (Product product : products) {
			System.out.println(product);
		}
	}

}
