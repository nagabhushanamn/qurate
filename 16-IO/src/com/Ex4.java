package com;

import java.io.FileWriter;
import java.io.IOException;

public class Ex4 {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("report.txt");

		fw.write("item-1\n");
		fw.write("item-2\n");
		fw.write("item-3\n");
		fw.flush();
		fw.write("item-4");
		fw.close();
		System.out.println("done");

	}

}
