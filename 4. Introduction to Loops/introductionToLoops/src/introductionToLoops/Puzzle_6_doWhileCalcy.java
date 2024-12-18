package introductionToLoops;

import java.util.Scanner;

public class Puzzle_6_doWhileCalcy {

	private int userChoice = 0;
	private int userNum1 = 0;
	private int userNum2 = 0;

	//Scanner system Object 
	Scanner scanner = new Scanner(System.in);
	
	//Get user inputs
	public boolean getUserData() {
		System.out.printf("\tNumber 1: ");
		userNum1 = scanner.nextInt();
		System.out.printf("\tNumber 2: ");
		userNum2 = scanner.nextInt();
		
		if(userChoice == 3 && userNum2 == 0) {
			System.out.println("\t"+userNum1+" can't be divided by zero!");
			return false;
		}
		
		return true;
	}
	
	// Logic for the Calculator
	public void returnCalcResult() {
		
		System.out.println("Java Calculator -->");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Division");
		System.out.println("4. Multiplication");
		System.out.println("5. Exit");

		do {
			System.out.printf("Select Operation: ");
			userChoice = scanner.nextInt();
			
			switch (userChoice) {
			case 1:
				// Addition of 2 numbers
				
				System.out.println("\tSelected => 1. Addition");
				// Print Output
				System.out.println("\t==> Sum of numbers is " + (userNum1 + userNum2) );
				
				break;
				
			case 2:
				// Subtraction of 2 numbers
				getUserData();
				
				System.out.println("\tSelected => 2. Subtraction");
				System.out.println("\t==> Different of numbers is " + (userNum1 - userNum2) );
				
				break;
				
			case 3:
				// Division of 2 numbers
				
				if (!getUserData()) {
					continue;
				}
				
				System.out.println("\tSelected => 3. Division");
				System.out.println("\t==> Division num1/num2 numbers is " + (userNum1 / userNum2) );
				
				break;
				
			case 4:
				// Multiplication of 2 numbers
				getUserData();
				
				System.out.println("\tSelected => 4. Multiplication");
				System.out.println("\t==> Multiplication of numbers is " + (userNum1 * userNum2) );
				
				break;
				
			default:
				break;
			}
		} while (userChoice < 5);

		System.out.println("Thankyou.. have fun!");

		scanner.close();
	}

}