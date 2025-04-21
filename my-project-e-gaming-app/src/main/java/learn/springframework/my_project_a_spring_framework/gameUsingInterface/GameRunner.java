package learn.springframework.my_project_a_spring_framework.gameUsingInterface;

public class GameRunner {
	GamingConsole game;

	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running Game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
