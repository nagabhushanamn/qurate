package com;

import java.util.Scanner;

class Employee {

	int id;
	String name;
	double salary;

	public Employee(int id) {
		if (id > 0)
			this.id = id;
	}

}

public class Ex1 {

	public static void main(String[] args) {

		Employee employee = new Employee(101);

		System.out.println(employee.id);
		System.out.println(employee.name);
		System.out.println(employee.salary);

		Scanner scanner=new Scanner(System.in);
		
	}

}
