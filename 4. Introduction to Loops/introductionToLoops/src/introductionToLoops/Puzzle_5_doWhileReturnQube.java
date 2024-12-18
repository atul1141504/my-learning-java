package introductionToLoops;

import java.util.Scanner;

public class Puzzle_5_doWhileReturnQube {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int qubeOf = -1;
		
		do {
			System.out.print("Enter a number: ");
			qubeOf = scanner.nextInt();
			if(qubeOf>0) {
				System.out.println("=> qube: " + qubeOf*qubeOf*qubeOf);
			}
			
		}while (qubeOf > 0);
		
		System.out.println("Thankyou, Have fun!");
		
		//Close Scanner
		scanner.close();
	}
	
}
