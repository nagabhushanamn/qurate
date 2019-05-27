
package com;

import java.util.Scanner;

public class Ex1 {

	public static void io() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " intiated io task");
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter name?");
		String name = scanner.nextLine();
		System.out.println("hello " + name);
		scanner.close();
		System.out.println(threadName + " completed io task");
	}

	public static void computation() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " intiated computation task");
		boolean b = true;
		while (b)
			System.out.println("num ");
		System.out.println(threadName + " completed computation task");

	}

	public static void main(String[] args) {

		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " start...");

		io();

		computation();

		System.out.println("do other work...");

	}

}
