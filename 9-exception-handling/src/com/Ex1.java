package com;

class Employee {
	public void doWork() {
		System.out.println("emp work..");
	}
}

public class Ex1 {

	public static void main(String[] args) {

		System.out.println("A");

		try {
			System.out.println("B");
			int ari = 1 / 1;
			int[] nums = { 10, 20 };
			System.out.println(nums[1]);

			Employee e = null;
			e.doWork();

			System.out.println("C");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("D");
			System.out.println("Arith Ex " + e.getMessage());
		} catch (Exception e) {
			System.out.println("D");
			System.out.println("Ex " + e.getMessage());
		}

		System.out.println("E");

	}

}
