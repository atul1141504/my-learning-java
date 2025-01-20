package codingExercises9JavaFunctionalProgramming;

import java.util.List;

public class Ex5_FindMaxEvenNumber {
	public int findMaxEvenNumber(List<Integer> numbers) {
        if(numbers==null) {
        	return 0;
        }
        return numbers.stream()
        			  .filter(e->e%2==0)
        			  .max(Integer::compare)
        			  .orElse(0);
    }
}
