package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex3 {

	public static void compare(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			list.add("string-" + i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	public static void main(String[] args) {

		compare(new ArrayList<>(1000000));
		compare(new LinkedList<>());

	}

}
