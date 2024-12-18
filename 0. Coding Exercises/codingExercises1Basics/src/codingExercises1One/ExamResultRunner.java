package codingExercises1One;

public class ExamResultRunner {

	public static void main(String[] args) {
		//Create a new instance of the class > OBJECT
		ExamResult result = new ExamResult();
		
		//Response from Method isPass
		if (result.isPass(60) == true) {
			System.out.println("isPass > Hurray..!! Student is passed.");
		}
		else {
			System.out.println("isPass > Better luck next time!");
		}
		
		//Response from Method isPass1
		if (result.isPass1(30) == true) {
			System.out.println("isPass1> Hurray..!! Student is passed.");
		}
		else {
			System.out.println("isPass1> Better luck next time!");
		}
	}

}
