package java5_JavaFunctionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class ST08_StreamIntermediateOperation {
	/*	
	 * 				S T R E A M.. I N T E R M E D I A T E.. O P E R A T I O N S
	 * 			-------------------------------------------------------------------	
	 *  This Section focuses on the Intermediate Operations that can e performed on Stream() method
	 *  	a. sorted()
	 *  	b. distinct()
	 *  	c. map()
	 */
	public static void main(String[] args) {
		//List<Integer> intList = List.of(1,22,5,20,8,61,72,12,5,10,5,8,33,7);
		List<Integer> intList = List.of(1,16,8,2,3,14,5,6,7,9,1,2,3,11,1,12,13,4,15);
		System.out.println("Number List: Input............==>"+intList.toString());
		
		//get sorted list using Lambda Function
		StreamSort(intList);
		
		//get Distinct elements of the list
		StreamDistinct(intList);
		
		//get Distinct & Sorted elements of the list
		StreamDistinctSorted(intList);
		
		//get Distinct, Sorted & square of elements of the list
		StreamDistinctSortedSquareElements(intList);
	}
	
	static void StreamSort(List<Integer> intList) {
		List<Integer> intSortedList = new ArrayList<>();
		intList.stream()
				.sorted()				//Intermediate Function
					.forEach(			//Terminal Function
						number ->{
							intSortedList.add(number);
						});
		System.out.println("Number List: Sorted.......... ==>"+intSortedList.toString());
	}
	
	static void StreamDistinct(List<Integer> intList) {
		List<Integer> intDistinctList = new ArrayList<>();
		intList.stream()
				.distinct()				//Intermediate Function
					.forEach(			//Terminal Function
						number->{
							intDistinctList.add(number);
						});
		System.out.println("Number List: Distict..........==>"+intDistinctList.toString());
	}
	
	static void StreamDistinctSorted(List<Integer> intList) {
		List<Integer> intDistinctSortedList = new ArrayList<>();
		intList.stream()
				.distinct()				//Intermediate Function
					.sorted()			//Intermediate Function
						.forEach(		//Terminal Function		
							number->{
								intDistinctSortedList.add(number);
							});
		System.out.println("Number List: Distict & Sorted ==>"+intDistinctSortedList.toString());
	}
	
	static void StreamDistinctSortedSquareElements(List<Integer> intList) {
		List<Integer> intDistinctSortedSquareList = new ArrayList<>();
		intList.stream()
				.distinct()								//Intermediate Function
					.sorted()							//Intermediate Function
						.map(element->element*element)	//Intermediate Function
						.forEach(						//Terminal Function
							number->{
								intDistinctSortedSquareList.add(number);
							});
		System.out.println("Number List: Distict & Sorted ==>"
							+ intDistinctSortedSquareList.toString());
	}
}
