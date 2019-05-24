package com;

class V {

}

class B extends V {

}

class C extends V {

}

public class Ex2 {

	public static void main(String[] args) {

//		---------------------------------
//		B b = new B();

//		V v = b; // implicit casting
//		v = new C();

		// ---------------------------------

		V v = new V();

		if (v instanceof B) {
			B b = (B) v; // explicit castings
			System.out.println("all is well");
		} else {
			System.out.println("stupid casting");
		}

	}

}
