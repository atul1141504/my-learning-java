package learn.springframework.my_project_a_spring_framework.gameUsingInterface;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PackmanGame implements GamingConsole {
	
	public void up() {
		System.out.println("Up");
	}

	public void down() {
		System.out.println("Down");
	}

	public void left() {
		System.out.println("Left");
	}

	public void right() {
		System.out.println("Right");
	}
}
