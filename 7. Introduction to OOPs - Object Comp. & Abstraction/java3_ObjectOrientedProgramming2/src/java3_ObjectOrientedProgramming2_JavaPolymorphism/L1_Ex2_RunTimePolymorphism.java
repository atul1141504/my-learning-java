package java3_ObjectOrientedProgramming2_JavaPolymorphism;

//Java Example: Run Time Poly-morphism
class Vehicle {
	public void displayInfo() {
		System.out.println("Some vehicles are there.");
	}
}

class Car extends Vehicle {
// Method overriding
	@Override
	public void displayInfo() {
		System.out.println("I have a Car.");
	}
}

class Bike extends Vehicle {
// Method overriding
	@Override
	public void displayInfo() {
		System.out.println("I have a Bike.");
	}
}

public class L1_Ex2_RunTimePolymorphism {
	public static void main(String[] args) {
		Vehicle v1 = new Car(); 	// Up-casting
		Vehicle v2 = new Bike(); 	// Up-casting

		// Calling the overridden displayInfo() method of Car class
		v1.displayInfo();

		// Calling the overridden displayInfo() method of Bike class
		v2.displayInfo();
	}

}
