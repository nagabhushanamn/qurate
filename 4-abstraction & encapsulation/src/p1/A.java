package p1;

public class A {

	// class variables
	public static int pubSta = 0;

	// instance variable
	private int pri = 1;
	int de = 2;
	protected int pro = 3;
	public int pub=4;
	
	
	public void aObjMethod() {
		System.out.println(pubSta);
		System.out.println(pri);
		System.out.println(de);
		System.out.println(pro);
		System.out.println(pub);
	}
	

}
