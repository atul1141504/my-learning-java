package learn.springframework.my_project_a_spring_framework;

import learn.springframework.my_project_a_spring_framework.game.GameRunner;
import learn.springframework.my_project_a_spring_framework.game.SuperContraGame;

public class App01GamingBasic {

	public static void main(String[] args) {
		//var marioGame = new MarioGame();
		//var gameRunner = new GameRunner(marioGame);
		
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		
		gameRunner.run();
	
	}

}
