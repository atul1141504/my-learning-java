package codingExercises9JavaFunctionalProgramming;

import java.util.List;

public class Ex1_FilterOddNumbersRunner {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Ex1_FilterOddNumbers filterOddNumbers = new Ex1_FilterOddNumbers();
		
		System.out.println("Using forEach Terminal Operation");
		System.out.println("\t"+filterOddNumbers.filterOddNumbersA(List.of(1,4,7,8,11,15,18)));
		System.out.println("\t"+filterOddNumbers.filterOddNumbersA(List.of(1, 2, 3, 4, 5)));
		System.out.println("\t"+filterOddNumbers.filterOddNumbersA(List.of(6, 7, 8, 9, 10)));
		System.out.println("\t"+filterOddNumbers.filterOddNumbersA(List.of(-3, -2, -1, 0, 1, 2, 3)));
		
		System.out.println("\nUsing collect Terminal Operation");
		System.out.println("\t"+filterOddNumbers.filterOddNumbersB(List.of(1,4,7,8,11,15,18)));
		System.out.println("\t"+filterOddNumbers.filterOddNumbersB(List.of(1, 2, 3, 4, 5)));
		System.out.println("\t"+filterOddNumbers.filterOddNumbersB(List.of(6, 7, 8, 9, 10)));
		System.out.println("\t"+filterOddNumbers.filterOddNumbersB(List.of(-3, -2, -1, 0, 1, 2, 3)));
		

	}

}
