package com;

import java.io.File;
import java.io.IOException;

public class Ex2 {

	public static void main(String[] args) throws IOException, InterruptedException {

		File file = new File("tmp.txt");
		
		System.out.println(file.exists());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.canExecute());
		
		boolean b=file.createNewFile();
		System.out.println(b);
		
		file.deleteOnExit();
		
		Thread.sleep(5000);
		
		System.out.println("Exit");
	}

}
