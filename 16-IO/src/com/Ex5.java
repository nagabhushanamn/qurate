package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex5 {

	public static void main(String[] args) throws IOException {

		File file = new File("JAVA SE 8 Programming.pdf");
		byte[] byteAray = new byte[(int) file.length()];
		FileInputStream fis = new FileInputStream(file);
		fis.read(byteAray);
		fis.close();

		FileOutputStream fos = new FileOutputStream("new-file.pdf");
		fos.write(byteAray);
		fos.close();
		
		System.out.println("done");
	}

}
