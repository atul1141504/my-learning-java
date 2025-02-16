package introductionToObjectOrientedProgramming;

public class MotorBike2Encapsulated {
	
	void start() {
		System.out.println("Bike Started!");
	}
	
	private int speed;
	
	void setSpeed(int speed) {
		System.out.printf("Speed     :%d",speed).println();
		System.out.printf("This Speed:%d",this.speed).println();
		if (speed > 0) {
			this.speed = speed;
		}
	}
	
	int getSpeed() {
		return this.speed;
	}
}
