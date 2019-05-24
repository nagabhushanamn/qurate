package com;

class Subject {
}

class Java extends Subject {
}

class JS extends Subject {
}

// JDK 1.5  ==> 
class Trainer<T extends Subject> {

	private T subject;

	public T getSubject() {
		return subject;
	}

	public void setSubject(T subject) {
		this.subject = subject;
	}

}

public class Ex1 {

	public static <E extends Number> void display(E e) {
		System.out.println(e);
	}

	public static void main(String[] args) {

		Trainer<Java> javaTrainer = new Trainer<Java>();
		javaTrainer.setSubject(new Java());

		// --------------------------------
//		javaTrainer.setSubject(new JS()); // type safety lost
		// --------------------------------

		// in class room
		Java java = javaTrainer.getSubject();
		System.out.println("all is well");

		display(12.12);

	}

}
