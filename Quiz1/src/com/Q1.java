package com;

public class Q1 {

	static int staVar = 1;
	int insVar = 2;

	public static void staMethod(Q1 q1) {
		System.out.println(staVar);
		System.out.println(q1.insVar);
	}

	public void insMethod() {
		System.out.println(staVar);
		System.out.println(insVar);
	}

	public static void main(String[] args) {

		Q1 q1 = new Q1();
		q1.insMethod();

		Q1.staMethod(q1);

	}

}
