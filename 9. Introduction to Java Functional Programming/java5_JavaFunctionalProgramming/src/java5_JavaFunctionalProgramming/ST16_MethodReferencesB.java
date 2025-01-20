package java5_JavaFunctionalProgramming;

import java.util.List;

//Convert Some Custom Methods to Method references
public class ST16_MethodReferencesB {

	public static void main(String[] args) {
		List<Integer> intList = List.of(16,8,3,14,5,6,7,9,11,12,13,4,15);
		System.out.println("Input List=>"+intList.toString());
		
		System.out.println("1. Printing Without Using Method references");
		getOddMaxNumberInList(intList);
		
		System.out.println("2. Printing by Using Method references");
		getOddMaxNumberInListUsingMethodReference(intList);

	}
	
	static void getOddMaxNumberInList(List<Integer> List) {
		Integer max = List
				.stream()
				.filter(e->e%2==1)		//"e%2==1" is a custom calculation 
				.max((n1, n2) -> Integer.compare(n1, n2))
				.get();

		System.out.println("\t  Max Number present in the list....==>" + max);
	}
	
	static void getOddMaxNumberInListUsingMethodReference(List<Integer> List) {
		Integer max = List
				.stream()
				.filter(ST16_MethodReferencesB::isEven)
				.max(Integer::compare)
				.get();

		System.out.println("\t  Max Number present in the list....==>" + max);
	}
	
	//Method is created to convert custom operations to Method references
	static boolean isEven(Integer number) {
		return number%2==1;
	}

}
