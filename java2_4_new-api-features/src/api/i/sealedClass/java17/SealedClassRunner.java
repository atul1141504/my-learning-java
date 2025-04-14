package api.i.sealedClass.java17;

sealed class Vehicle permits Car, Truck, Bike{}

final class Car extends Vehicle {}

non-sealed class Truck extends Vehicle {}

sealed class Bike extends Vehicle permits EBike {}

final class EBike extends Bike {}

public class SealedClassRunner {

	public static void main(String[] args) {
		System.out.println("Sealed Class!!");
	}

}
