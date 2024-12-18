package introductionToLoops;

import java.util.Scanner;

public class Puzzle_2_whileLoopRunner {

	public static void main(String[] args) {
		//create object for System Scanner class to get user input
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Print squares & cudes upto: ");
		int userInput = scanner.nextInt();
		
		Puzzle_2_whileLoop numberGames = new Puzzle_2_whileLoop(userInput);
		numberGames.squaresUpto(userInput);
		numberGames.qubesUpto(userInput);
		
		numberGames.setUserInput(200);
		numberGames.squaresUpto(userInput);
		numberGames.qubesUpto(userInput);
		
		//close system scanner
		scanner.close();
	}

}
