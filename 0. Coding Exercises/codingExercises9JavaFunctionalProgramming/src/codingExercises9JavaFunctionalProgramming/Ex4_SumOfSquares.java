package codingExercises9JavaFunctionalProgramming;

import java.util.List;

public class Ex4_SumOfSquares {
	public long sumOfSquares(List<Integer> numbers) {

		// Check if the list is null. If so, return 0.
		if(numbers==null) {
			return 0;
		}

		// Stream over the list of numbers, find squares and sum them up
		return numbers.stream()
					  .mapToLong(number->number*number)
					  .sum();
	}
}
