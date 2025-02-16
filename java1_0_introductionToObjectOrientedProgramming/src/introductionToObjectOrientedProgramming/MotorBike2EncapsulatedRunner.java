package introductionToObjectOrientedProgramming;

public class MotorBike2EncapsulatedRunner {
	public static void main(String[] args) {
		System.out.println("Script: MotorBike2EncapsulatedRunner!");
		//Create instances of the MotorBike class
		MotorBike2Encapsulated ducatiBike = new MotorBike2Encapsulated();
		MotorBike2Encapsulated hondaBike = new MotorBike2Encapsulated();
		
		//Invoke start bikes method
		ducatiBike.start();
		hondaBike.start();
		
		//set the initial state of the object by using function
		ducatiBike.setSpeed(100);
		System.out.printf("Intial state Ducati Bike:%dkm/hr.",ducatiBike.getSpeed()).println();
		
		hondaBike.setSpeed(80);
		System.out.printf("Intial state Honda Bike :%dkm/hr.",hondaBike.getSpeed()).println();
		
		//set the next state of the object by using function
		ducatiBike.setSpeed(-20);
		System.out.printf("Next state Ducati Bike:%dkm/hr.",ducatiBike.getSpeed()).println();
		
		hondaBike.setSpeed(120);		
		System.out.printf("Next state Honda Bike :%dkm/hr.",hondaBike.getSpeed()).println();
				
	}
}
