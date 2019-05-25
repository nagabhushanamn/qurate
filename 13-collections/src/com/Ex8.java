package com;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ex8 {

	public static void main(String[] args) {

//		Map<String, String> map = new TreeMap<>();
//		Map<String, String> map = new HashMap<>();
		Map<String, String> map = new LinkedHashMap<>();
		map.put("10", "ten");
		map.put("1", "one");
		map.put("01", "one");
		map.put("4", "four");
		map.put("3", "three");
		map.put("4", "FOUR");

		System.out.println(map);

	}

}
