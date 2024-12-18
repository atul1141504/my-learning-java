package introductionToLoops;

import java.util.Scanner;

public class Puzzle_3_doWhileLoopRunner {

	public static void main(String[] args) {
		//create object for System Scanner class to get user input
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Print squares & cudes upto: ");
		int userInput = scanner.nextInt();
		
		Puzzle_3_doWhileLoop numberGames = new Puzzle_3_doWhileLoop(userInput);
		numberGames.squaresUptoDoWhile(userInput);
		numberGames.qubesUpto(userInput);
		
		numberGames.squaresUptoWhile(userInput);
		numberGames.qubesUpto(userInput);
		
		//close system scanner
		scanner.close();

	}

}
