package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ex6 {

	public static void main(String[] args) {

		List<String> sheet1 = new ArrayList<>();
		sheet1.add("record1");
		sheet1.add("record2");
		sheet1.add("record3");

		Set<String> sheet2 = new TreeSet<>();
		sheet1.add("record1");
		sheet1.add("record2");
		sheet1.add("record3");

//		// way-1: for loop
		for (int i = 0; i < sheet1.size(); i++) {
			String record = sheet1.get(i);
			System.out.println(record);
		}

		// way-2: iterator pattern
		Iterator<String> iterator = sheet2.iterator();
		while (iterator.hasNext()) {
			String record = iterator.next();
			System.out.println(record);
		}

		// way-3: for-each loop ( JDK 1.5 )
		for (String record : sheet1) {
			System.out.println(record);
		}

	}

}
