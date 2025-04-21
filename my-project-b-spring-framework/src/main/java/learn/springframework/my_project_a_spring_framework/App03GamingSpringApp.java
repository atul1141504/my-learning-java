package learn.springframework.my_project_a_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import learn.springframework.my_project_a_spring_framework.gameUsingInterface.GameRunner;
import learn.springframework.my_project_a_spring_framework.gameUsingInterface.GamingConsole;
import learn.springframework.my_project_a_spring_framework.gameUsingInterface.MarioGame;

@Configuration
public class App03GamingSpringApp {

	@Bean
	public GamingConsole game() {
		var game = new MarioGame();
		return game;
	}

	@Bean
	public GameRunner gamerunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;

	}

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(App03GamingSpringApp.class)) {

			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();
		}
	}

}
