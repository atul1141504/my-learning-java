package codingExercises3Three;

import java.util.Scanner;

public class Ex_2_IsLeapYearRunner {

	public static void main(String[] args) {

		//create object for System Scanner class to get user input
		Scanner scanner = new Scanner(System.in);

		System.out.println("Leap Year Checker Utility -->");
		System.out.printf("\tPlease a year: ");
		int userInput = scanner.nextInt();
		
		//Create object for Leap Year checker class
		Ex_2_IsleapYear calendar = new Ex_2_IsleapYear();
		
		if (calendar.isLeapYear(userInput)) {
			System.out.println("\tIts a Leap year!");
		} else {
			System.out.println("\tIts a non-Leap year!");
		}
		
		//close system scanner
		scanner.close();
	}

}
