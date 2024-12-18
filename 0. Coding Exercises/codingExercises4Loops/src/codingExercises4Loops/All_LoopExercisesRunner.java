package codingExercises4Loops;

import java.util.Scanner;

public class All_LoopExercisesRunner {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);

		System.out.println("1. Calculate Factorial");
		System.out.println("2. Get last digit of a number");
		System.out.println("3. Get Number of Digits in a number");
		System.out.println("4. Get Sum of Digits of a number");
		System.out.println("5. Reverse a number");
		System.out.println("6. Find LCM of two numbers");
		System.out.println("7. GCD of two numbers");
		System.out.println("8. Exit");

		All_LoopExercises loopExercises = new All_LoopExercises();

		do {
			System.out.println();
			System.out.printf("Enter Operation: ");
			int userOperation = scanner.nextInt();
			int userNumber = 0;
			// String stopRun = "No";

			switch (userOperation) {
			case 1:
				System.out.println("\t1. Calculate Factorial\n");
				do {
					// Calculate Factorial
					System.out.printf("\t==>enter number: ");
					int factOf = scanner.nextInt();
					System.out.println("\t==>Factorial of " + factOf + " is " + loopExercises.calculateFactorial(factOf));

					if (!checkContinueOperation()) {
						break;
					}
				} while (true);

				break;

			case 2:
				// Get last digit of a number
				System.out.println("\t2. Get last digit of a number");
				do {
					System.out.printf("\t==>enter number: ");
					userNumber = scanner.nextInt();
					System.out.println(
							"\t==>Last digit of " + userNumber + " is " + loopExercises.calculateLstDigit(userNumber));

					if (!checkContinueOperation()) {
						break;
					}
				} while (true);

				break;

			case 3:
				// Get number of digits in a number
				System.out.println("\t3. Get Number of Digits in a number");
				do {
					System.out.printf("\t==>enter number: ");
					userNumber = scanner.nextInt();

					if (loopExercises.calculateNoOfDigits(userNumber) > 0) {
						System.out.println("\t==>Number of digits in " + userNumber + ": "
								+ loopExercises.calculateNoOfDigits(userNumber));
					} else {
						System.out.println("\t==>Invalid Input data: -1");
					}

					if (!checkContinueOperation()) {
						break;
					}
				} while (true);

				break;

			case 4:
				// Get number of digits in a number
				System.out.println("\t4. Get Sum of Digits of a number");
				do {
					System.out.printf("\t==>enter number: ");
					userNumber = scanner.nextInt();

					if (loopExercises.getSumOfDigits(userNumber) >= 0) {
						System.out.println("\t==>Sum of digits of " + userNumber + ": "
								+ loopExercises.getSumOfDigits(userNumber));
					} else {
						System.out.println("\t==>Invalid Input data: -1");
					}
					if (!checkContinueOperation()) {
						break;
					}
				} while (true);
				break;

			case 5:
				// Reverse a Number
				System.out.println("\t5. Reverse a number");
				do {
					System.out.printf("\t==>enter number: ");
					userNumber = scanner.nextInt();

					if (loopExercises.getReverseNumber(userNumber) >= 0) {
						System.out.println("\t==>Reverse number of " + userNumber + ": "
								+ loopExercises.getReverseNumber(userNumber));
					} else {
						System.out.println("\t==>Invalid Input data: -1");
					}
					if (!checkContinueOperation()) {
						break;
					}
				} while (true);

				break;

			case 6:
				// Find LCM of two Numbers
				int userNumber1 = 0;
				int userNumber2 = 0;
				System.out.println("\t6. Find LCM of two numbers");
				do {
					System.out.printf("\t==>enter number1: ");
					userNumber1 = scanner.nextInt();
					System.out.printf("\t==>enter number2: ");
					userNumber2 = scanner.nextInt();

					int lcmOfNumbers = loopExercises.calculateLCM(userNumber1, userNumber2);

					if (lcmOfNumbers >= 0) {
						System.out.println("\t==>LCM of " + userNumber1 + " & " + userNumber2 + ": " + lcmOfNumbers);
					} else {
						System.out.println("\t==>Invalid Input data: -1");
					}
					if (!checkContinueOperation()) {
						break;
					}
				} while (true);

				break;
			
			case 7:
				System.out.println("\t7. GCD of two numbers");
				do {
					System.out.printf("\t==>enter number1: ");
					userNumber1 = scanner.nextInt();
					System.out.printf("\t==>enter number2: ");
					userNumber2 = scanner.nextInt();

					int gcdOfNumbers = loopExercises.calculateGCD(userNumber1, userNumber2);

					if (gcdOfNumbers >= 0) {
						System.out.println("\t==>GCD of " + userNumber1 + " & " + userNumber2 + ": " + gcdOfNumbers);
					} else {
						System.out.println("\t==>Invalid Input data: -1");
					}
					if (!checkContinueOperation()) {
						break;
					}
				} while (true);
				
				break;
				
			case 8:
				break;

			default:
				System.out.println();
				System.out.println("Invalid selection!!");
				continue;
			}

			/*
			 * if exit option is selected, below logic will terminate loop execution
			 */
			if (userOperation == 8) {
				System.out.println();
				System.out.println("See you soon.. Thankyou!");
				break;
			}

		} while (true);

		scanner.close();

	}

	// below logic checks if user wish to perform multiple calculations or not.
	private static boolean checkContinueOperation() {
		System.out.printf("\tContinue for more calc..(Yes/No):");
		char continueLoop = scanner.next().charAt(0);
		System.out.println();

		if (continueLoop == 'N' || continueLoop == 'n') {
			System.out.println("\t==>exit...");
			return false;
		}
		return true;
	}

}