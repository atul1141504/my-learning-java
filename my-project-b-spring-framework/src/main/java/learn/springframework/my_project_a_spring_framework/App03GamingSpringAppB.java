package learn.springframework.my_project_a_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import learn.springframework.my_project_a_spring_framework.gameUsingInterface.GameRunner;
import learn.springframework.my_project_a_spring_framework.gameUsingInterface.GamingConsole;

@Configuration
@ComponentScan("learn.springframework.my_project_a_spring_framework.gameUsingInterface")
public class App03GamingSpringAppB {

	@Bean
	public GameRunner gamerunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;

	}

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(App03GamingSpringAppB.class)) {

			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();
		}
	}

}
