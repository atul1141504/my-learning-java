package java5_JavaFunctionalProgramming;

import java.util.List;

public class ST11_A_All_StreamIntermediateOperations {
	/*	
	 * 				S T R E A M.. I N T E R M E D I A T E.. O P E R A T I O N S
	 * 			-------------------------------------------------------------------	
	 *  This Section focuses on the Intermediate Operations that can e performed on Stream() method
	 *  	a. distinct()
	 *  	b. filter()	->
	 *  	c. sorted()	->
	 *  	d. map()	->
	 *  	e. skip()	->
	 *  	f. limit()	-> 
	 *  	g. boxed() 	-> Converts pipeline to stream, used after map() which generated a pipeline
	 */
	public static void main(String[] args) {
		List<Integer> intList = List.of(5,7,3,1,2,3,4,5,6,7,8,9,10); 
		
		intList.stream()
				.distinct()
				.filter(e -> e%2==1)
				.sorted()
				.map(e -> e*3)
				.skip(1)			//Skips first n elements specified as .skip(n)	
				.limit(3)    		//it limits the numbers of elements by the specified numbers
				.forEach(e->System.out.println(e));

	}

}
