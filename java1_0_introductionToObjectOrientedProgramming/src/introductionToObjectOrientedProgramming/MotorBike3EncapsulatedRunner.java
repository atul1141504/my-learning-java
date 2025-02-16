package introductionToObjectOrientedProgramming;

public class MotorBike3EncapsulatedRunner {
	public static void main(String[] args) {
		System.out.println("Script: MotorBike3EncapsulatedRunner!");
		//Constructor instances of the MotorBike class & provide initial state
		MotorBike3Encapsulated ducatiBike = new MotorBike3Encapsulated(-100);
		MotorBike3Encapsulated hondaBike = new MotorBike3Encapsulated(80);
		
		System.out.printf("\nDucati Bike >>").println();
		System.out.printf("\tIntial state:%dkm/hr.",ducatiBike.getSpeed()).println();
		//set the next state of the object by using function
		ducatiBike.setSpeed(50);
		System.out.printf("\tNext state  :%dkm/hr.",ducatiBike.getSpeed()).println();
		
		System.out.printf("\nHonda Bike >>").println();
		System.out.printf("\tIntial state:%dkm/hr.",hondaBike.getSpeed()).println();
		//set the next state of the object by using function
		hondaBike.setSpeed(120);		
		System.out.printf("\tNext state  :%dkm/hr.",hondaBike.getSpeed()).println();
				
		System.out.printf("\nSuzuki Bike >>").println();
		MotorBike3Encapsulated suzukiBike = new MotorBike3Encapsulated();
		System.out.printf("\tIntial state:%dkm/hr.",suzukiBike.getSpeed()).println();
	
	}
}
