package com;

public class Ex3 {

	public static void main(String[] args) {

		String inp = "123-23-2342";

		// way-1:
		String ssnPattern = "\\d{3}-\\d{2}-\\d{4}";
		boolean b = inp.matches(ssnPattern);
		System.out.println(b);

		// way-2:
		boolean isValid = true;
		if (inp.length() == 11) {
			for (int i = 0; i < inp.length(); i++) {
				char ch = inp.charAt(i);
				if (i == 3 || i == 6) {
					if (ch != '-') {
						isValid = false;
						break;
					}
				} else {
					if (!Character.isDigit(ch)) {
						isValid = false;
						break;
					}
				}
			}
		}
		if (isValid)
			System.out.println("Valid SSN");
		else
			System.out.println("Invalid SSN");
	}

}
