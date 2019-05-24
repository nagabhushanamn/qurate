package wheel;

public class CEATWheel implements Wheel {

	public CEATWheel() {
		System.out.println("CEATWheel instance created..");
	}

	public int rotate(int speen) {
		System.out.println("CEAT wheel rotating...");
		return 150;
	}

}
