package codingExercises3Three;

public class Ex_1_TriangleValidatorRunner {

	public static void main(String[] args) {
		Ex_1_TriangleValidator validator = new Ex_1_TriangleValidator();
		
		if (validator.isValidTriangle(40, 30, 100)) {
			System.out.println("Its a valid triangle!");
		}else {
			System.out.println("Given angles can not form a valid triangle!");
		}
		
		if (validator.isRightAnglrTriangle(4, 3,5)) {
			System.out.println("Its a Right angle triangle!");
		}else {
			System.out.println("Given sides can not form a right angle triangle!");
		}
	}

}
