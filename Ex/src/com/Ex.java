package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ex {

	public static void main(String[] args) throws IOException {

//		String[] report = { 
//				"A,IT,1000", 
//				"B,MAINTAINANCE,1000", 
//				"D,IT,1000", 
//				"A,HR,1000", 
//				"C,SALES,1000",
//				"D,IT,1000", 
//				};

		FileReader fr = new FileReader("report1.csv");
		BufferedReader br = new BufferedReader(fr);
		String line = null;

		ArrayList<String> report = new ArrayList<>();
		while ((line = br.readLine()) != null) {
			report.add(line);
		}

		Map<String, Double> map = new HashMap<>();

		for (String record : report) {
			String[] tokens = record.split(",");
			String dep = tokens[1];
			double salary = Double.parseDouble(tokens[2]);
			if (map.containsKey(dep)) {
				double existing = map.get(dep);
				map.put(dep, existing + salary);
			} else {
				map.put(dep, salary);
			}
		}

		// -------------------------------------------------
		System.out.println(map);
		// -------------------------------------------------

	}

}
