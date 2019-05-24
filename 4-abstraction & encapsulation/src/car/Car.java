package car;

import wheel.Wheel;

public class Car {

	private Wheel wheel;

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	
	public void move() {
		wheel.rotate(80);
		System.out.println("Car moving....");

	}

}
