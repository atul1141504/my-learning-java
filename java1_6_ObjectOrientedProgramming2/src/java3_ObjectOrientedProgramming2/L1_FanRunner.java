package java3_ObjectOrientedProgramming2;

public class L1_FanRunner {

	public static void main(String[] args) {
		L1_Fan fan = new L1_Fan("Atomberg", 1200, "Off-White");
		System.out.println("Intial State of required fan: \n\t==>"+fan);
		
		fan.switchOn();
		System.out.println("Fan is turned on: \n\t==>"+fan);
		
		fan.setSpeed((byte)3);
		System.out.println("Fan speed is changed: \n\t==>"+fan);
		
		fan.switchOff();
		System.out.println("Fan is turned Off: \n\t==>"+fan);
		
	}

}
