package com;

public class Ex4 {

	public static void main(String[] args) {

		Thread trainerThread = new Thread(() -> {
			System.out.println("Tnr - got question");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Tnr - answered question");
		});

		Thread participantThread = new Thread(() -> {
			System.out.println("Part.. - listening");
			System.out.println("Part.. - asking question..");
			trainerThread.start();
			try {
				trainerThread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Part.. - thanks for ans..");
		});

		participantThread.start();

	}

}
