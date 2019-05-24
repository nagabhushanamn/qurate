package com;

import emp.Employee;

public class App2 {

	public static void main(String[] args) {

		Employee employee = new Employee(101);

		employee.setName("Nag");
		employee.setSalary(1000.00);

		System.out.println(employee.toString());

		System.out.println(employee.toString());

	}

}
