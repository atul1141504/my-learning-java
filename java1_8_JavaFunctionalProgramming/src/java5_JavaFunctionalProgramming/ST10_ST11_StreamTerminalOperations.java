package java5_JavaFunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ST10_ST11_StreamTerminalOperations {
	/*	
	 * 					S T R E A M.. T E R M I N A L.. O P E R A T I O N S
	 * 				-----------------------------------------------------------
	 *  This Section focuses on the TERMINAL Operations that can e performed on Stream() method
	 *  	a. reduce()
	 *  	b. forEach()
	 *  	c. collect()
	 *  	d. min()
	 *  	e. max()
	 */
	public static void main(String[] args) {
		List<Integer> intList = List.of(16,8,3,14,5,6,7,9,11,12,13,4,15);
		System.out.println("Input List=>"+intList.toString());
		
		//Method: <.reduce()> 	==> get Sum of numbers present in the List
		System.out.println("Method 1: <.reduce()>");
		getSumOfNumbers(intList);
		
		//Method: <.forEach()> 	==> get Sum of numbers present in the List
		System.out.println("Method 2: <.forEach()>");
		printSortedElementsOfList(intList);
				
		//Method: <.collect()>	==> get the list of Odd elements
		System.out.println("Method 3: <.collect()>");
		getListOfOddElements(intList);

		//Method: <.collect()>	==> Get the list of square of elements up to specified number
		System.out.println("Method 3: <.collect()>");
		getSquaresUpto(10);
		
		//Method: <.min()> 		==> get Minimum Number present in the List
		System.out.println("Method 4: <.min()>");
		getMinNumberInList(intList);
		
		//Method: <.max()> 		==> get Maximum Number present in the List
		System.out.println("Method 5: <.max()>");
		getMaxNumberInList(intList);
		
	}
	
	public static void getSumOfNumbers(List<Integer> list) {		
		int sum = list.stream().reduce(0,(num1,num2) -> num1+num2);
		
		System.out.println("\t  Sum Of Numbers present in the List==>"+sum);

	}
	
	public static void printSortedElementsOfList(List<Integer> list) {
		System.out.print("\t  Sorted Elements of the list==>");
		list.stream().sorted().forEach(e -> System.out.print(e + ", "));
		System.out.println();
	}
	
	public static void getListOfOddElements(List<Integer> list) {
		List<Integer> oddList= list.stream().filter(e->e%2==1).collect(Collectors.toList());
		System.out.println("\t  List Of Odd Elements==> "+oddList.toString());
	}
	
	static void getMinNumberInList(List<Integer> List) {
		Integer min = List.stream().min( 						// Terminal Operation
				(n1, n2) -> Integer.compare(n1, n2)).get();		//get() is performed on the Optional function

		System.out.println("\t  Min Number present in the list....==>" + min);
	}

	static void getMaxNumberInList(List<Integer> List) {
		Integer max = List.stream().max( 						// Terminal Operation
				(n1, n2) -> Integer.compare(n1, n2)).get();

		System.out.println("\t  Max Number present in the list....==>" + max);
	}
	
	static void getSquaresUpto(int upTo) {
		upTo++;
		
		/* Here needed to use method <.boxed()> as method <.map()> returns an Integer Pipeline
		** but not an Integer Stream.
		*/
		
		List<Integer> squareList = 
			IntStream.range(1, upTo).map(e -> e * e).boxed().collect(Collectors.toList());
		
		System.out.println("\t  Squares of numbers upto " + (upTo-1) + " ==>" + squareList.toString());
	}

}
