package com;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class Ex3 {

	public static void main(String[] args) {

		Thread timerThread = new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				LocalTime localTime = LocalTime.now();
				System.out.println(localTime);
			}
		});

		timerThread.start();

	}

}
