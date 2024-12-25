package codingExercisesOops2;

public class Ex2_Runner {

	public static void main(String[] args) {
		
		// Here, "Circle" is the name and 5.0 is the radius
		Ex2_Shape circle = new Ex2_Circle("Circle", 5.0); 
		circle.displayInfo();
		
		// Here, "Rectangle" is the name, 4.0 is the length, and 6.0 is the width
		Ex2_Shape rectangle = new Ex2_Rectangle("Rectangle", 4.0, 6.0); 
		rectangle.displayInfo();;

	}

}
