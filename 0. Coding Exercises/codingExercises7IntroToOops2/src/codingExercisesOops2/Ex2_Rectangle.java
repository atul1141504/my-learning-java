package codingExercisesOops2;

//TODO: Create a Rectangle class that extends Shape
class Ex2_Rectangle extends Ex2_Shape {
	//The Rectangle class should have private double attributes for length and width, and a constructor to initialize them
	private double length;
	private double width;

	public Ex2_Rectangle(String name, double length, double width) {
		super(name);
		this.length = length;
		this.width = width;
	}

	//It should also implement the calculateArea() method
	public double calculateArea() {
		return this.length * this.width;
	}
}