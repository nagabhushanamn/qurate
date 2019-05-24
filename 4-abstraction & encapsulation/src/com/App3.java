package com;

import car.Car;
import wheel.CEATWheel;
import wheel.MRFWheel;
import wheel.Wheel;

public class App3 {

	public static void main(String[] args) {

		MRFWheel mrfWheel = new MRFWheel();
		Wheel ceatWheel = new CEATWheel();

		Car car = new Car();
		car.setWheel(mrfWheel);

		System.out.println();

		car.move();
		car.move();
		System.out.println();

		car.setWheel(ceatWheel);

		System.out.println();

		car.move();
		car.move();

		System.out.println();

	}

}
