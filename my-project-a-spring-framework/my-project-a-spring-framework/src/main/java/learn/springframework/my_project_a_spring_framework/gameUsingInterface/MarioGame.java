package learn.springframework.my_project_a_spring_framework.gameUsingInterface;

public class MarioGame implements GamingConsole {

	public void up() {
		System.out.println("Jump..!");
	}

	public void down() {
		System.out.println("Go into the hole..!");
	}

	public void left() {
		System.out.println("Go Back..!");
	}

	public void right() {
		System.out.println("Accelerate..!");
	}
}
