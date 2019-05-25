package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.model.Product;

public class Ex2 {

	public static void main(String[] args) {

		Comparator<Product> priceComarator = (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice());

		Set<Product> products = new TreeSet<>();

		products.add(new Product(12312233, "item1", 198000.00));
		products.add(new Product(12321312, "item2", 98000.00));
		products.add(new Product(52423443, "item3", 178000.00));
		products.add(new Product(12321312, "item2", 98000.00));
		products.add(new Product(52423443, "item4", 58000.00));

		List<Product> list = new ArrayList<>(products);
		Collections.sort(list, priceComarator);

		display(list);

		// --------------------------------------------------------
	}

	private static void display(List<Product> products) {
		for (Product product : products) {
			System.out.println(product);
		}
	}

}
