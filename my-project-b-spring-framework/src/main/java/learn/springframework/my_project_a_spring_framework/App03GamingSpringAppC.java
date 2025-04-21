package learn.springframework.my_project_a_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import learn.springframework.my_project_a_spring_framework.gameUsingInterface.GameRunner;
import learn.springframework.my_project_a_spring_framework.gameUsingInterface.GamingConsole;

@Configuration
@ComponentScan("learn.springframework.my_project_a_spring_framework.gameUsingInterface")
public class App03GamingSpringAppC {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(App03GamingSpringAppC.class)) {

			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();
		}
	}

}
