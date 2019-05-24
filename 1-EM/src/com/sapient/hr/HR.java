package com.sapient.hr;

import com.sapient.emp.Employee;

public class HR {

	public void manageEmployees() {

		// create employees & provide training & get work from them

		Employee.tnrName = "Nag";

		Employee e1 = new Employee();
		e1.id = 101;
		e1.name = "A";
		e1.salary = 1000;

		Employee e2 = new Employee();
		e2.id = 102;
		e2.name = "B";
		e2.salary = 1000;

		Employee.doTraining();

		e1.doListenAndWork();
		e2.doListenAndWork();

	}

}
