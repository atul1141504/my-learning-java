package java3_ObjectOrientedProgramming2;

public class L1_Fan {
	
	//State
	private String manufacturer;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;

	//Constructor
	public L1_Fan(String manufacturer, double radius, String color) {
		super();
		this.manufacturer = manufacturer;
		this.radius = radius;
		this.color = color;
	}
	
	//Behavior - Turning On/Off fan with default speed 5/0 respectively.
	public void switchOn() {
		this.isOn = true;
		setSpeed((byte)5);
	}
	public void switchOff() {
		this.isOn = false;
		setSpeed((byte)0);
	}
	
	//Behavior - Set required speed.
	public void setSpeed(byte speed) {
		this.speed = speed;
	}
	
	//Print State of the Fan class
	public String toString() {
		return String.format("Manufacturer:%s, radius:%f, color:%s, isOn:%b, speed:%d"
							 ,manufacturer,radius,color,isOn,speed);
		
	}
}
