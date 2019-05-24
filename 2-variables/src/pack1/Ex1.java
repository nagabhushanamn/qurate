package pack1;

/*
 *  types of variables
 *  --------------------
 *  
 *  1. simple-types / primitives   ===> values
 *  
 *  
 *  	a. signed
 *  
 *  		i. integral
 *  
 *  			1. byte  ( 8  )
 *  			2. short ( 16 )
 *              3. int   ( 32 )
 *              4. long  ( 64 )
 *  
 *  		ii. real
 *  
 *  			1. float  ( 32 )
 *  			2. double ( 64 )
 *  
 *  	b. unsigned
 *  
 *  			1. char   ( 16 )
 *  		
 *  
 *  	c. boolean
 *  
 *  			1. boolean ( 1 )
 *  
 *  
 *  	-----------------------------------------
 *  
 *  	-2^n-1 to 2^n-1 -1
 *  
 *  	e.g
 *  
 *  	n ==> 8 bit
 *  
 *  	-128 to 127 	
 *  
 *  	-----------------------------------------
 *  
 *  
 *  	1. complex types / reference ==> objects
 *  
 *  
 *  		e.g
 *  
 *  				Person 
 *  				Mobile
 * 
 * 		-----------------------------------------
 */

class Mobile {
	String model;
	double price;
}

class Person {
	String name;
	String address;
	Mobile mobile; // reference
}

public class Ex1 {

	public static void main(String[] args) {

		byte byetVar = 12;
		short shortVart = 1212;
		int intVar = 12121212;
		long longVar = 1212121212;
		longVar = 12121212121212L;

		double doubleVar = 12.12;
		float floatVar = 12.12F;

		char charV1 = 'A';
		char charV2 = 65;
		char charV3 = '\u0041';
		char inrCurrencySymbol = '\u8377';

		boolean b = true;

		Mobile mobile = new Mobile();
		mobile.model = "iphone 6";

		Person p1 = new Person();
		p1.name = "Nag";
		p1.address = "chennai";
		p1.mobile = mobile;
		
		mobile.model="New Model";
		
		System.out.println(p1.mobile.model);

	}

}
