package com;

interface IGender {
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";
}

enum Gender {
	MALE, FEMALE
}

enum Month {

}

enum Level {

}

enum Status {
	INIT, PENDING, APPROVED;
}

class Employee<T> {
	String name;
	T gender;
	String gender1;
}

public class Ex1 {

	public static void main(String[] args) {

		Employee<Gender> employee = new Employee<Gender>();
		employee.name = "Nag";
		employee.gender = Gender.MALE;
		employee.gender1 = IGender.MALE;

		// ------------------------------

		employee.name = "she employee";
		employee.gender = Gender.FEMALE;
		employee.gender1 = "bla bla";

		if (employee.gender == Gender.MALE) {
			// ..
		}

		Gender g = Gender.MALE;
		switch (g) {
		case MALE:

			break;

		case FEMALE:

			break;

		default:
			break;
		}

	}

}
