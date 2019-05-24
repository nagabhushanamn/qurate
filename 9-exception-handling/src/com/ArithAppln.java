package com;

import java.util.Scanner;

public class ArithAppln {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Enter num1");
			int n1 = scanner.nextInt();

			System.out.println("Enter num2");
			int n2 = scanner.nextInt();

			// 1. add
			System.out.println("1-add");

			// 2.sub
			System.out.println("2-sub");

			// 3.div
			int divResult = n1 / n2;
			System.out.println("3-div : " + divResult);

			// 3.Mul
			System.out.println("4-Mul");

			System.out.println("All is well");

		} catch (ArithmeticException ae) {
			System.out.println("Ex-" + ae.getMessage());
		}

		scanner.close();

	}

}
