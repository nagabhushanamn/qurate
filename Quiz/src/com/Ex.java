package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex {

	public static void main(String[] args) {

		// Input
		List<String> menu = new ArrayList<>();
		menu.add("veg");
		menu.add("nveg");
		menu.add("nveg");
		menu.add("veg");
		menu.add("nveg");
		menu.add("veg");

		// way-1 : imperative style

		List<String> nonVegMenu = new ArrayList<>();
		for (int i = 0; i < menu.size(); i++) {
			String item = menu.get(i);
			if (item.equals("nveg"))
				nonVegMenu.add(item);
		}

		System.out.println(nonVegMenu);
		
		
		// way-2 : declarative style
		nonVegMenu=menu
		.stream()
		.filter(item->item.equals("nveg"))
		.collect(Collectors.toList());
		
		System.out.println(nonVegMenu);

	}

}
