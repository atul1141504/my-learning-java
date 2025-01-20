package codingExercises9JavaFunctionalProgramming;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

public class Ex2_GetCubesOfFirstNNumbers {
	/**
	 * This method generates the cubes of the first n natural numbers.
	 * 
	 * @param n The number of natural numbers for which cubes are to be calculated.
	 * @return List<Integer> This returns a list of cubes of the first n natural
	 *         numbers.
	 */
	public List<Integer> getCubesOfFirstNNumbers(int n) {
		return IntStream.range(1,n+1)
						.map(element->element*element*element)
						.boxed()
						.collect(Collectors.toList());
	}
}
