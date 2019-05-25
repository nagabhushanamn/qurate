package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author nag-training
 *
 *
 *         List collections
 */

public class Ex5 {

	public static void main(String[] args) {

		List<String> sheet1 = new ArrayList<>();
		sheet1.add("record1");
		sheet1.add("record2");
		sheet1.add("record3");

		List<String> sheet2 = new ArrayList<>();
		sheet2.add("record2");
		sheet2.add("record3");
		sheet2.add("record4");

//		sheet1.removeAll(sheet2);
		sheet1.retainAll(sheet2);
		System.out.println(sheet1);

		System.out.println(sheet1.isEmpty());
		System.out.println(sheet1.size());
	}

}
