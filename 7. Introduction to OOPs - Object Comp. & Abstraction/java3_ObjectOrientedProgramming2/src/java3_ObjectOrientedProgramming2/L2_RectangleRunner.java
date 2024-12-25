package java3_ObjectOrientedProgramming2;

public class L2_RectangleRunner {

	public static void main(String[] args) {
		L2_Rectangle rectangle = new L2_Rectangle(0,0);
		System.out.println("Initial State: \n\t==> "+rectangle);
		
		rectangle.setLength(9);
		rectangle.setWidth(12);
		System.out.println("Next State: \n\t==> "+rectangle);
		
	}

}
