package com;

import java.util.ArrayList;
import java.util.List;

class Employee {
	int id;

	public Employee(int id) {
		super();
		this.id = id;
	}

}

public class Ex4 {

	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime();
		System.out.println(runtime.totalMemory());
		System.out.println(runtime.freeMemory());

		List<Employee> employees = new ArrayList<>();

		for (int i = 0; i < 100000; i++) {
			Employee employee = new Employee(i);
			// employees.add(employee);
		}
		
		employees=null;

		System.out.println(runtime.freeMemory());

//		System.gc();

		System.out.println(employees.size());

		System.out.println(runtime.freeMemory());

	}

}
