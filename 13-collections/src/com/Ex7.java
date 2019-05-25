package com;

import java.util.LinkedHashSet;
import java.util.Set;

public class Ex7 {

	public static void main(String[] args) {

//		Set<String> set = new TreeSet<>();
//		Set<String> set = new HashSet<>();
		Set<String> set = new LinkedHashSet<>();

		set.add("A");
		set.add("C");
		set.add("D");
		set.add("R");
		set.add("F");
		set.add("X");
		set.add("E");
		set.add("Z");
		set.add("A");
		set.add("B");

		System.out.println(set);

	}

}
