// package dec
package com.sapient.emp;

// import statements
import java.lang.*;

//public type
public class Employee {
	// A. state definition ( variables )
	// a. class
	public final static String COMP_NAME = "Sapient";
	public static String tnrName;

	// b. obejct
	public int id;
	public String name;
	public double salary;

	// B. Contructor(s)
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Employee obj created..");
	}

	// C. // behavior ( methods )

	// a. class methods
	public static void doTraining() {
		System.out.println("Employee :: doTraining by "+tnrName);
	}

	// b. obj methods
	public void doListenAndWork() {
		System.out.println(name + " listening & working");
	}

}

//default types
class Abc {

}
