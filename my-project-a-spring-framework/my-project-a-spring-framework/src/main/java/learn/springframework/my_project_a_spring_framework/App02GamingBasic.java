package learn.springframework.my_project_a_spring_framework;

import java.util.Scanner;

import learn.springframework.my_project_a_spring_framework.gameUsingInterface.GameRunner;
import learn.springframework.my_project_a_spring_framework.gameUsingInterface.SuperContraGame;
import learn.springframework.my_project_a_spring_framework.gameUsingInterface.MarioGame;
import learn.springframework.my_project_a_spring_framework.gameUsingInterface.PackmanGame;

public class App02GamingBasic {

	public static void main(String[] args) {
		var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var packmanGame = new PackmanGame();

		Scanner scanner = new Scanner(System.in);
		System.out.println("<<<<---Gaming Menu--->>>>");
		System.out.println("1. Mario Game");
		System.out.println("2. SuperContra Game");
		System.out.println("3. Packman Game");
		System.out.println("Select Game & hit enter to play!");

		System.out.print("Option==>");
		int userOption = scanner.nextInt();
		switch (userOption) {
		case 1:
			var gameRunnerA = new GameRunner(marioGame);
			gameRunnerA.run();
			break;
		case 2:
			var gameRunnerB = new GameRunner(superContraGame);
			gameRunnerB.run();
			break;
		case 3:
			var gameRunnerC = new GameRunner(packmanGame);
			gameRunnerC.run();
			break;

		default:
			System.out.println("Invalid Selection");
		}
		
		scanner.close();

	}

}
