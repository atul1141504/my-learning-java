package introductionToLoops;

public class Puzzle_4_doWhile_vs_while {

	public static void main(String[] args) {
		int i = 10;
		System.out.println("doWhile Loop:");
		
		do {
			System.out.println(i*i);
			i++;
		} while (i < 10);
		
		i = 10;
		System.out.println("While Loop:");
		
		while(i < 10) {
			System.out.println(i*i);
			i++;
		}

	}

}
