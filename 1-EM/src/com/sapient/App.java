package com.sapient;

import com.sapient.hr.HR;

public class App {

	public static void main(String[] args) {
		
		System.out.println("start....");
		
		HR hr=new HR();
		hr.manageEmployees();
		
		System.out.println("end....");
		
	}
	
}
