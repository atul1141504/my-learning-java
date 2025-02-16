package introductionToLoops;

public class Puzzle_3_doWhileLoop {

	private int userInput;

	public int getUserInput() {
		return userInput;
	}

	public void setUserInput(int userInput) {
		this.userInput = userInput;
	}
	
	public Puzzle_3_doWhileLoop(int userInput) {
		this.setUserInput(userInput);
	}

	public void squaresUptoDoWhile(int userInput) {
		int i = 1;
		System.out.print("doWhile Squares : ");
		
		do {
			System.out.print(i*i + "\t");
			i++;
		} while (i*i<this.userInput);
		
		System.out.println();
		
	}
	
	public void squaresUptoWhile(int userInput) {
		int i = 1;
		System.out.print("While   Squares : ");
		
		do {
			System.out.print(i*i + "\t");
			i++;
		} while (i*i<this.userInput);
		
		System.out.println();
		
	}

	public void qubesUpto(int userInput) {
		int i = 1;
		System.out.print("        Qubes : ");
		
		do {
			System.out.print(i*i*i + "\t");
			i++;
		} while (i*i*i < this.userInput);
		
		System.out.println();
		
	}

}
