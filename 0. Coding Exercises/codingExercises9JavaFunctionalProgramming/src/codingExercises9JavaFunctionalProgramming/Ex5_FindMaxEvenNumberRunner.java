package codingExercises9JavaFunctionalProgramming;

import java.util.List;

public class Ex5_FindMaxEvenNumberRunner {

	public static void main(String[] args) {
		Ex5_FindMaxEvenNumber getMaxEven = new Ex5_FindMaxEvenNumber();
		
		System.out.println(getMaxEven
				.findMaxEvenNumber(List.of(23, 45, 67, 12, 34, 56, 78)));
		
		System.out.println(getMaxEven.findMaxEvenNumber(List.of(1, 3, 5, 7, 9)));
		System.out.println(getMaxEven.findMaxEvenNumber(List.of()));
		System.out.println(getMaxEven.findMaxEvenNumber(null));

	}

}
