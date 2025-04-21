package learn.springframework.my_project_a_spring_framework;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import learn.springframework.my_project_a_spring_framework.gameUsingInterface.GameRunner;
import learn.springframework.my_project_a_spring_framework.gameUsingInterface.GamingConsole;

public class GamingApplicationLauncher {

	public static void main(String[] args) {

		try (var context = new ClassPathXmlApplicationContext("gamingConfig.xml")) {

			System.out.println("Beans Listing -->");
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println("\nUp key is pressed in Gaming Console -->");
			context.getBean(GamingConsole.class).up();
			
			System.out.println("\nRun method is invoked from Game Runner -->");
			context.getBean(GameRunner.class).run();
		}
	}

}
