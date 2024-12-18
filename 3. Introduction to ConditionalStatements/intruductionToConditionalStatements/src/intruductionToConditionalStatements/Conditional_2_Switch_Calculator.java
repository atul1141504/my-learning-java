package intruductionToConditionalStatements;

import java.util.Scanner;

public class Conditional_2_Switch_Calculator {
	public static void main(String[] args) {
		System.out.println("Started Switch logic!");
		//Create an Object to system Scanner class to take user input of integer type
		Scanner scanner = new Scanner(System.in);
		
		//get number1 from user
		System.out.print("Enter first number: ");
		int number1 = scanner.nextInt();
		
		//get number2 from user
		System.out.print("Enter first number: ");
		int number2 = scanner.nextInt();
		
		//Display user choices
		System.out.println("1-Add");
		System.out.println("2-Subtract");
		System.out.println("3-Divide");
		System.out.println("4-Modulus");
		System.out.println("5-Multiplication");
		
		//get user choice
		System.out.print("Enter first number: ");
		int userChoice = scanner.nextInt();
		
		//Evaluate user choice, calculate & return result
		switch(userChoice) {
		case 1:
			System.out.println("Result: "+(number1+number2));
			break;
		case 2:
			System.out.println("Result: "+(number1-number2));
			break;
		case 3:
			System.out.println("Result: "+(number1/number2));
			break;
		case 4:
			System.out.println("Result: "+(number1%number2));
			break;
		case 5:
			System.out.println("Result: "+(number1*number2));
			break;
		default:
			System.out.println("Invalid user selection!");
			break;
		}
		
		//close scanner
		scanner.close();
	}
}
