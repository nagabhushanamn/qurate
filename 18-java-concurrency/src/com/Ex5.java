package com;

import java.util.concurrent.TimeUnit;

public class Ex5 {

	public static void main(String[] args) throws Exception {

		Thread playerThread = new Thread(() -> {
			while (!Thread.interrupted()) {
				System.out.println("la la ho ho");
			}
		});

		playerThread.start();

		TimeUnit.SECONDS.sleep(5);

		playerThread.interrupt();

	}

}
