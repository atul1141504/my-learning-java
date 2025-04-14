package api.i.sealedInterface.java17;

sealed interface Vehicle permits Car, Truck, Bike {
}

final class Car implements Vehicle {
}

non-sealed class Truck implements Vehicle {
}

sealed class Bike implements Vehicle permits EBike {
}

final class EBike extends Bike {
}

public class SealedInterfaceRunner {
	public static void main(String[] args) {
		System.out.println("Sealed Interface!!");
	}
}
