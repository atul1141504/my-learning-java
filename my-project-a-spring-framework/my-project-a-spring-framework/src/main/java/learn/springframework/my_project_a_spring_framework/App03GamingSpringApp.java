package learn.springframework.my_project_a_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learn.springframework.my_project_a_spring_framework.gameUsingInterface.GameRunner;
import learn.springframework.my_project_a_spring_framework.gameUsingInterface.GamingConsole;

public class App03GamingSpringApp {

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(App03GamingSpringAppConfiguration.class)){
			
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		}
	}

}
