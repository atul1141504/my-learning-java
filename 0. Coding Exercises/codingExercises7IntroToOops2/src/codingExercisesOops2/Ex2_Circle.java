package codingExercisesOops2;

//TODO: Create a Circle class that extends Shape
class Ex2_Circle extends Ex2_Shape {
	//The Circle class should have a private double radius attribute and a constructor to initialize it
	private double radius;

	public Ex2_Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	//It should also implement the calculateArea() method 
	public double calculateArea() {
		return Math.PI * this.radius * this.radius;
	}
}
