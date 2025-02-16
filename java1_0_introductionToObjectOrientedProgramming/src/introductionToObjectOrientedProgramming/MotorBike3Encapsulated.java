package introductionToObjectOrientedProgramming;

public class MotorBike3Encapsulated {
	void start() {
		System.out.println("Bike Started!");
	}
	
	private int speed;
	
	MotorBike3Encapsulated(){
		setSpeed(5); //Default Constructor
	}
	
	MotorBike3Encapsulated(int speed){
		//this.speed = speed; //> this will set speed without validation!!
		setSpeed(speed); //this will call setSpeed method, validate & set the speed
	}
	
	void setSpeed(int speed) {
		System.out.printf("\tSpeed     :%d",speed).println();
		System.out.printf("\tThis Speed:%d",this.speed).println();
		if (speed > 0) {
			this.speed = speed;
		}
	}
	
	int getSpeed() {
		return this.speed;
	}
}
