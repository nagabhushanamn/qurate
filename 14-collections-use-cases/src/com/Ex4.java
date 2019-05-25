package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Owner {
	private String name;

	public Owner(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Owner other = (Owner) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

class Car {
	private String model;

	public Car(String model) {
		super();
		this.model = model;
	}
}

public class Ex4 {

	public static void main(String[] args) {

		Owner owner1 = new Owner("Nag");
		Owner owner2 = new Owner("Ria");

		Car car1 = new Car("fortuner");
		Car car2 = new Car("toy-car");

		Map<Owner, Car> map = new HashMap<>();
		map.put(owner1, car1);
		map.put(owner2, car2);

		// --------------------------------------

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Owner name ?");
		String name = scanner.nextLine();

		Owner keyOwner = new Owner(name);

		Car car = map.get(keyOwner);
		if (car != null) {
			System.out.println(car);
		} else {
			System.out.println("dream it");
		}

		scanner.close();

//		--------------------------------------

	}

}
