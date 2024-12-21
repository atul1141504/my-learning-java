package codingExercises6ArranAndArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex7_GetMultiplesUpto {
	/**
     * This method generates a list of multiples of a given number less than a specified limit.
     * 
     * @param number the number to find multiples of
     * @param limit the upper bound for the multiples
     * @return a List of multiples of the number less than the limit
     */
    public List<Integer> determineMultiples(int number, int limit) {
    	
    	ArrayList<Integer> multiplesOf = new ArrayList<Integer>();
    	
    	if(number<=0 || limit<=0){
            return multiplesOf;
        }
    	
    	int i=1;
    	while((number*i)<limit) {
    		multiplesOf.add(number*i);
    		i++;
    	}
    	
    	return multiplesOf;

    }
}
