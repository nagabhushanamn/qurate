package pack1;

/*
 * 
 *  variable scope
 *  ---------------
 *  
 *  
 *  	=> class / static scope
 *  	=> object / instance scope
 *  	=> local scope
 * 
 */

class Employee {

	static int count = 0; // object variable

	String name;
//	int count = 0; // object variable

	public void sayHello() {
//		int count = 0;  // Local variable
		count++;
		System.out.println(name + " hello.." + count);
	}
}

public class Ex2 {

	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.name = "E1";
		Employee employee2 = new Employee();
		employee2.name = "E2";

		employee1.sayHello();

		employee2.sayHello();
		employee2.sayHello();

	}

}
