package com.lib;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.model.Product;

public class ProductsLib {

	// --------------------------------------------------------
	// How
	// --------------------------------------------------------

	public static List<Product> filter(List<Product> in, Predicate<Product> predicate) {
		List<Product> out = new ArrayList<>();
		for (Product product : in) {
			if (predicate.test(product)) {
				out.add(product);
			}
		}
		return out;
	}

}
