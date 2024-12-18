package codingExercises3Three;

import java.util.Scanner;

public class Ex_3_PerfectNumberCheckerRunner {

	public static void main(String[] args) {
		//create object for System Scanner class to get user input
		Scanner scanner = new Scanner(System.in);

		System.out.println("Perfect Number Checker Utility -->");
		System.out.printf("\tPlease enter a number: ");
		int userInput = scanner.nextInt();

		//Create object for number checker class
		Ex_3_PerfectNumberChecker numberChecker = new Ex_3_PerfectNumberChecker();
		
		if (numberChecker.isPerfectNumber(userInput)) {
			System.out.println("\tIt's a Perfect Number!");
		}else {
			System.out.println("\tIt's not a Perfect Number!");
		}

		//close system scanner
		scanner.close();
	}

}
