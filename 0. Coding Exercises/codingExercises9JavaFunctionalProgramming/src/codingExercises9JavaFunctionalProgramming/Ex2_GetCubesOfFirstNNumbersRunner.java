package codingExercises9JavaFunctionalProgramming;

import java.util.Scanner;

public class Ex2_GetCubesOfFirstNNumbersRunner {

	public static void main(String[] args) {
		Ex2_GetCubesOfFirstNNumbers getCubeUpTo = new Ex2_GetCubesOfFirstNNumbers();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a numer to get qube==>");
		
		int number=scanner.nextInt();
		System.out.println("Cube upto "+ number + "==>" 
							+getCubeUpTo.getCubesOfFirstNNumbers(number));
		
		scanner.close();
	}

}
