package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.model.Product;

public class Ex3 {

	public static void main(String[] args) {

		Set<Product> products = new HashSet<>();

		products.add(new Product(12312233, "item1", 198000.00));
		products.add(new Product(12321312, "item2", 98000.00));
		products.add(new Product(52423443, "item3", 178000.00));
		products.add(new Product(12321312, "item2", 98000.00));
		products.add(new Product(23423423, "item4", 58000.00));

		display(products);
		// --------------------------------------------------------
	}

	private static void display(Set<Product> products) {
		for (Product product : products) {
			System.out.println(product);
		}
	}

}
