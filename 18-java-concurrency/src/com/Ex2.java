package com;

import java.util.Scanner;

public class Ex2 {

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

		Runnable toTask = new Runnable() {
			@Override
			public void run() {
				io();
			}
		};

		Thread thread1 = new Thread(toTask);

		Runnable computationTask = new Runnable() {
			@Override
			public void run() {
				computation();
			}
		};

		Thread thread2 = new Thread(computationTask);

		thread1.start();
		thread2.start();

		System.out.println(threadName + " cont with other work...");

	}

}
