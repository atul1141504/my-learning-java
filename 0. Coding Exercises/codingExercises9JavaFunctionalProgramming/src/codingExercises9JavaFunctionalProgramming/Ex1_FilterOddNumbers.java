package codingExercises9JavaFunctionalProgramming;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1_FilterOddNumbers {

    /**
     * This method filters out the odd numbers from a given list of integers.
     * @param numbers This is the list of integers from which odd numbers are to be filtered out.
     * @return List<Integer> This returns a list of odd integers.
     */
    public static List<Integer> filterOddNumbersA(List<Integer> numbers) {
		List<Integer> oddNumbersArray = new ArrayList<>();
    	numbers.stream()
    			.filter(number -> number%2==1 ||number%2==-1)
    			.forEach(number -> oddNumbersArray.add(number));
    			
    	return oddNumbersArray;
    }
    
    public static List<Integer> filterOddNumbersB(List<Integer> numbers) {
		
		return numbers.stream()
						.filter(number -> number%2==1 ||number%2==-1)
						.collect(Collectors.toList());
    }
}
