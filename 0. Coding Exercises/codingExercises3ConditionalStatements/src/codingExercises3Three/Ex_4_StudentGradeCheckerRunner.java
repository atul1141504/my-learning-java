package codingExercises3Three;

import java.util.Scanner;

public class Ex_4_StudentGradeCheckerRunner {

	public static void main(String[] args) {
		//create object for System Scanner class to get user input
		Scanner scanner = new Scanner(System.in);

		System.out.println("Student Grade Checker Utility -->");
		System.out.printf("\tPlease enter number obtained: ");
		int userInput = scanner.nextInt();

		//Create object for Grade checker class
		Ex_4_StudentGradeChecker gradeChecker = new Ex_4_StudentGradeChecker(userInput);
		System.out.println("student grade is " +gradeChecker.assignGrade());

		//close system scanner
		scanner.close();
	}

}
