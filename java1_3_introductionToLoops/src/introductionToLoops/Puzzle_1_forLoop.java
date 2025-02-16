package introductionToLoops;

public class Puzzle_1_forLoop {
	
	private int userInput;

	public int getUserInput() {
		return userInput;
	}

	public void setUserInput(int userInput) {
		this.userInput = userInput;
	}
	
	public Puzzle_1_forLoop(int userInput) {
		this.setUserInput(userInput);
	}

	public boolean isPrime(int userInput) {
		for (int i=2;i<=((userInput/2)+1);i++) {
			if (userInput%i ==0) {
				return false;
			}
		}
		return true;
	}

	public int sumUptoN(int userInput) {
		int sumUpto = 0;
		for (int i=1;i<=userInput;i++) {
			sumUpto += i;
		}
		return sumUpto;
	}
	
	//Sum of divisors except 1 & number itself
	public int sumOfDivisors(int userInput) {
		int sum=0;
		for (int i=2;i<=((userInput/2)+1);i++) {
			if (userInput%i ==0) {
				sum += i;
			}
		}
		return sum;
	}

	public void printNumberTriangle(int userInput) {
		for (int i=1;i<=userInput;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

}
