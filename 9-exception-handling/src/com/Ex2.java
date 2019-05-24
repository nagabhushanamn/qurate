package com;

import java.io.Closeable;

// file , socket , or any class which connect with external world
class Resource implements Closeable {

	public void init() {
		System.out.println("init()");
	}

	public void use() throws IllegalAccessException {
		System.out.println("use()");
		boolean b = true;
		if (!b)
			throw new IllegalAccessException("bla bla");
	}

	public void close() {
		System.out.println("close()");
	}

}

public class Ex2 {

	public static void main(String[] args) {

//		Resource resource = new Resource();
//		try {
//			resource.init();
//			resource.use();
//			return;
//			// resource.close();
//		} catch (IllegalAccessException e) {
////			resource.close();
//			System.out.println("Ex -" + e.getMessage());
//		} finally {
//			resource.close();
//		}

		// -----------------------------------------------------

		// java 1.8  ==> try with 'closable' resource

		try (Resource resource = new Resource()) {
			resource.init();
			resource.use();
			return;
		} catch (IllegalAccessException e) {
			System.out.println("Ex -" + e.getMessage());
		}
		
		// -----------------------------------------------------
		
		
		try {
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		try {
			
		}finally {
			
		}
		
		// -----------------------------------------------------
	}

}
