package learn.springframework.my_project_a_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import learn.springframework.my_project_a_spring_framework.gameUsingInterface.MarioGame;
import learn.springframework.my_project_a_spring_framework.gameUsingInterface.GameRunner;
import learn.springframework.my_project_a_spring_framework.gameUsingInterface.GamingConsole;

@Configuration
public class App03GamingSpringAppConfiguration {

	@Bean
	public GamingConsole game() {
		var game = new MarioGame();
		return game;
	}
	
	@Bean
	public GameRunner gamerunner() {
		var gameRunner = new GameRunner(game());
		return gameRunner;
				
	}
}
