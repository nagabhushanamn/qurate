package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		// Way-1
//		FileReader fr = new FileReader("menu.txt"); // stream opened
//		int code = -1;
//		while ((code = fr.read()) != -1) {
//			System.out.print((char) code);
//		}
//		fr.close();

		// Way-2
//		FileReader fr = new FileReader("menu.txt"); // stream opened
//		BufferedReader br = new BufferedReader(fr);
//		String line = null;
//		while ((line = br.readLine()) != null) {
//			System.out.println(line);
//		}
//		br.close();

		// Way-3
		File source = new File("menu.txt");
		Scanner scanner = new Scanner(source);
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();

	}

}
