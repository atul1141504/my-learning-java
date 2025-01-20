package java5_JavaFunctionalProgramming;

import java.util.List;

public class ST12_OptionalClassInJava {
	/*
	 * 	OPtional Class returns an Optional incase no valid data is getting returned or to null return
	 * 		> .get()	=> returns value out of OPTIONAL
	 * 		> .orElse(0)=> returns 0 if no null is getting returned
	 * 					   If we use <.get()> method in this case below Exception will occur
	 * 						>> No value present at java.base/java.util.Optional.get
	 */
	public static void main(String[] args) {
		List<Integer> intList = List.of(13,8,19,15,17,28,14,7);
		System.out.println("Integer List==>"+intList.toString());
		
		//get odd Minimum number present in the list
		getMinOddNumberInList(intList);
		
		//get even Maximum number present in the list
		getMinEvenNumberInList(intList);
		
		List<Integer> newIntOddList = List.of(13,19,15,17,7);
		System.out.println("Odd Integer List==>"+intList.toString());
		
		//get odd Minimum number present in the list
		getMinOddNumberInList(newIntOddList);
				
		//get even Maximum number present in the list
		getMinEvenNumberInList(newIntOddList);


	}
	
	static void getMinOddNumberInList(List<Integer> List) {
		Integer min = List.stream()
				.filter(e->e%2==1)			//Intermediate Operation
				.min( 						// Terminal Operation
					(n1, n2) -> Integer.compare(n1, n2))
				.get();		//get() is performed on the Optional function

		System.out.println("\t  Min Number present in the list....==>" + min);
	}
	
	static void getMinEvenNumberInList(List<Integer> List) {
		Integer min = List.stream()
				.filter(e->e%2==0)			//Intermediate Operation
				.min( 						// Terminal Operation
					(n1, n2) -> Integer.compare(n1, n2))
				.orElse(-1);		//get() is performed on the Optional function

		System.out.println("\t  Max Number present in the list....==>" + min);
	}

}
