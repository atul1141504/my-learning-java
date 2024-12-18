package codingExercises2Two;

public class SquareRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square square = new Square(5);
		System.out.printf("Area:%d",square.calculateArea()).println();; // prints: -1
		System.out.printf("Peri:%d",square.calculatePerimeter()).println(); // prints: -1
	
		Square squareWithZeroSide = new Square(0);
		System.out.printf("Area:%d",squareWithZeroSide.calculateArea()).println(); // prints: -1
		System.out.printf("Peri:%d",squareWithZeroSide.calculatePerimeter()).println(); // prints: -1

		Square squareWithNonPositiveSide = new Square(-5);
		System.out.printf("Area:%d",squareWithNonPositiveSide.calculateArea()).println(); // prints: -1
		System.out.printf("Peri:%d",squareWithNonPositiveSide.calculatePerimeter()).println(); // prints: -1
	}

}
