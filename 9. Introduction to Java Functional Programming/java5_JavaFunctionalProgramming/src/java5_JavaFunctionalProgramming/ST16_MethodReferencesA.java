package java5_JavaFunctionalProgramming;

import java.util.List;

public class ST16_MethodReferencesA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printLengthOfListElements();
		
		//Replace Static Method with a Method Reference
		printLengthOfListElementsSimplifiedSysout();
		
		//Replace Instance Method with a Method Reference
		printLengthOfListElementsSimplifiedMapper();
		
		//Create a User/Custom Method reference
		printLengthOfListElementsUsingPrintMethodReference();

	}
	
	static void printLengthOfListElements() {
		System.out.print("Length Of elements are ");
		List.of("Apple","Boy","cat","Double","Elephant")
			.stream()
			.map(s->s.length())
			.forEach(s->System.out.print(s+" "));
	}
	
	/*	Now for .forEach Method Lambda Function is : s->System.out.print(s+" ")
	 * 	It takes parameter 's' as input & prints it.
	 * 	So this can be further Simplified to below:
	 * 		==>	.forEach(System.out::print)
	 * 		==>	This will do exact same thing for each value passed by the .map() function..  
	 * 
	 */
	static void printLengthOfListElementsSimplifiedSysout() {
		System.out.print("\nLength Of elements using simplified Sysout & System.out class are ");
		List.of("Apple","Boy","cat","Double","Elephant")
			.stream()
			.map(s->s.length())
			.forEach(System.out::print);	//The class=> System.out
	}
	
	/*
	 * 	Now Further .map(s->s.length()) can be simplified to below function:
	 * 		==>	.map(s->s.length())
	 */
	static void printLengthOfListElementsSimplifiedMapper() {
		System.out.print("\nLength Of elements using simplified Mapper are ");
		List.of("Apple","Boy","cat","Double","Elephant")
			.stream()
			.map(String::length)			//s->s.length() => converted to => String::length
			.forEach(System.out::print);	//The class=> System.out
	}
	
	static void printLengthOfListElementsUsingPrintMethodReference() {
		System.out.print("\nLength Of elements using Method Reference are ");
		List.of("Apple","Boy","cat","Double","Elephant")
			.stream()
			.map(String::length)
			
			/*	ST16_MethodReferences is the Class
			 * 	printMethodReference present in the class 'ST16_MethodReferences'
			 * 	This shows that 'System.out' class have a method called print/println
			 * 	That's why we can directly Simplify System.out.println() to (System.out::println)
			*/
			.forEach(ST16_MethodReferencesA::printMethodReference);	//The class=> System.out
	}
	
	/*
	 * 	Reference Print Method has been created.
	 */
	static void printMethodReference(Integer number) {
		System.out.print(number+" ");
	}
}
