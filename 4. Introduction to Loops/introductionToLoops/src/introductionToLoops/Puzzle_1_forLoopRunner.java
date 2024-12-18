package introductionToLoops;

import java.util.Scanner;

public class Puzzle_1_forLoopRunner {

	public static void main(String[] args) {
		//create object for System Scanner class to get user input
		Scanner scanner = new Scanner(System.in);

		System.out.println("Available Puzzles -->");
		System.out.println("1. Prime Number Checker");
		System.out.println("2. Sum upto N numbers from 1");
		System.out.println("3. Sum of Divisors of a Number");
		System.out.println("4. Print a Number Triangle");
		System.out.printf("Your Choice: ");
		int userChoice = scanner.nextInt();
		
		//Create object for the puzzles		
		int userInput = 0;
		Puzzle_1_forLoop puzzleClass = new Puzzle_1_forLoop(userInput);
		
		switch(userChoice) {
		case 1:
			//Prime Number Checker
			System.out.println("\t1. Prime Number Checker");
			System.out.printf("\tPlease enter an Integer number: ");
			userInput = scanner.nextInt();
			puzzleClass.setUserInput(userInput);
			// boolean response = puzzleClass.isPrime(userInput);
			if (puzzleClass.isPrime(userInput)) {
				System.out.println("\t" + userInput + " is a Prime number!");
			}else {
				System.out.println("\t" + userInput + " is not a Prime number!");
			}
			break;
		case 2:
			//Sum up to N numbers from 1
			System.out.println("\t2. Sum upto N numbers from 1");
			System.out.printf("\tPlease enter an Integer number: ");
			userInput = scanner.nextInt();
			puzzleClass.setUserInput(userInput);
			int result = puzzleClass.sumUptoN(userInput);
			System.out.println("Sum of integers upto " + userInput + " is " + result);
			break;
		case 3:
			//Sum of Divisors of a Number
			System.out.println("\t3. Sum of Divisors of a Number");
			System.out.printf("\tPlease enter an Integer number: ");
			userInput = scanner.nextInt();
			puzzleClass.setUserInput(userInput);
			int sumOfDiv = puzzleClass.sumOfDivisors(userInput);
			System.out.println("Sum of Divisors of " + userInput + " is " + sumOfDiv);
			break;
		case 4:
			//Print a Number Triangle
			System.out.println("\t4. Print a Number Triangle");
			System.out.printf("\tPlease enter an Integer number: ");
			userInput = scanner.nextInt();
			puzzleClass.setUserInput(userInput);
			puzzleClass.printNumberTriangle(userInput);
			break;
		default:
			break;
		}
		
		//close system scanner
		scanner.close();	
	}

}
