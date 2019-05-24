package wheel;

public class MRFWheel implements Wheel {

	public MRFWheel() {
		System.out.println("MFRWheel instance created..");
	}

	public int rotate(int speed) {
		System.out.println("MRF wheel rotating...");
		return 100;
	}

}
