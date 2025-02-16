package introductionToObjectOrientedProgramming;

public class MotorBike1Runner {

	public static void main(String[] args) {
		//Create instances of the MotorBike class
		MotorBike1 ducatiBike = new MotorBike1();
		MotorBike1 hondaBike = new MotorBike1();
		
		//Invoke start bikes method
		ducatiBike.start();
		hondaBike.start();
		
		//set the initial state of the object by using state variable
		// each instance has its own image/copy of speed variable
		ducatiBike.speed = 100;
		hondaBike.speed = 80;
		
	}
}
