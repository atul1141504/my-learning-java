package introductionToLoops;

public class Puzzle_2_whileLoop {
	private int userInput;
	
	public int getUserInput() {
		return userInput;
	}

	public void setUserInput(int userInput) {
		this.userInput = userInput;
	}
	
	// Constructor
	public Puzzle_2_whileLoop(int userInput) {
		this.setUserInput(userInput);
	}
	
	public void squaresUpto(int userInput) {
		int i = 1;
		System.out.print("Squares : ");
		while(i*i <= this.userInput) {
			System.out.print(i*i + "\t");
			i++;
		}
		System.out.println();
	}
	
	public void qubesUpto(int userInput) {
		int i = 1;
		System.out.print("Cubes   : ");
		while(i*i*i <= this.userInput) {
			System.out.print(i*i*i + "\t");
			i++;
		}
		System.out.println();
	}

}
