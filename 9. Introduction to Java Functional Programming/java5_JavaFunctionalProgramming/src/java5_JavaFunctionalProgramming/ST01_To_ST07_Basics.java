package java5_JavaFunctionalProgramming;

import java.util.List;

public class ST01_To_ST07_Basics {

	public static void main(String[] args) {
		List<String> strList = List.of("Apple","Banana","Dog","cat","Bat");
		
		//Step=1
		printBasicUsingEnhancedFor(strList);	//with Filter
		printWithFuncPgming(strList);			//Functional Programming Printing
		
		//Step=2
		printBasicWithFilter(strList);			//Basic Print with Filter
		printFuncPgmingWithFilter(strList); 	//Functional Programming Printing with Filter
		
		//Step=3
		List<Integer> intList = List.of(1,22,20,61,72,12,5,10,5,8,33,7);
		printFuncPgmingSumOfNumbers(intList);	//Functional Programming Printing sum of numbers
		
		//Print Sum of only Odd & Even Numbers
		printFuncPgmingSumOfOddNumbers(intList);//Functional Programming Printing sum of Odd numbers
		printFuncPgmingSumOfEvenNumbersA(intList);//Functional Programming Printing sum of even numbers
		printFuncPgmingSumOfEvenNumbersB(intList);//Functional Programming Printing sum of even numbers
	}

	/*
	 *  Below logic is created using OOPs concept - Enhanced For loop
	 */
	public static void printBasicUsingEnhancedFor(List<String> list) {
		System.out.println("Basic Print: Enhanced for loop:");
		for(String element:list) {
			System.out.println("\t==>"+element);
		}

	}
	
	/*  This is the first step to the Functional Programming
	 *  Below logic is created using Functional Programming
	 */
	public static void printWithFuncPgming(List<String> list) {
		System.out.println("Functional Programming: Printing elements of String List");
		list.stream().forEach(element -> System.out.println("\t==>"+element));

	}
	
	/*
	 *  Below logic is created using OOPs concept - Enhanced For loop
	 */
	public static void printBasicWithFilter(List<String> list) {		
		System.out.println("Basic Print: Print With Filter");

		for(String element:list) {
			if(element.endsWith("at")) {
				System.out.println("\t==>"+element);
			}
		}

	}
	
	public static void printFuncPgmingWithFilter(List<String> list) {		
		System.out.println("Functional Programming: Printing elements of String List with Filter");

		list.stream()
				.filter(element -> element.endsWith("at")
						)
				.forEach(
						element-> System.out.println("\t==>"+element)
				);

	}
	
	public static void printFuncPgmingSumOfNumbers(List<Integer> list) {		
		System.out.println("Functional Programming: Printing sum of integer numbers");

		int sum = list.stream().reduce(0,(num1,num2) -> num1+num2);
		
		System.out.println("\t==>"+sum);

	}
	
	public static void printFuncPgmingSumOfOddNumbers(List<Integer> list) {		
		System.out.println("Functional Programming: Printing sum of odd integer numbers");

		int sum = list.stream().filter(element -> element%2==1)
							   .reduce(0,(num1,num2) -> num1+num2);
		
		System.out.println("\t==>"+sum);

	}
	
	public static void printFuncPgmingSumOfEvenNumbersA(List<Integer> list) {		
		System.out.println("Functional Programming: Printing sum of even integer numbers");

		int sum = list.stream().filter(element -> element%2==0)
							   .reduce(0,(num1,num2) -> num1+num2);
		
		System.out.println("\t==>"+sum);

	}
	
	/* Above method can be written as below where lambda function have more sentences in the body
	 * that shows the structure of Lambda Function:
	 * 		Lambda Function ==> (parameters -> {Body; return statement;}) 
	 * 
	 * In the below example lambda function works as input to the function '.reduce()'.
	 */
	public static void printFuncPgmingSumOfEvenNumbersB(List<Integer> list) {		
		System.out.println("Functional Programming: Printing sum of even integer numbers");

		int sum = list.stream()
						.filter(element -> element%2==0)	//Intermediate Operation: returns another stream 
							.reduce(
								0,(num1,num2) -> {			//Terminal Operation: returns final output
								System.out.println("\t==>number1:"+num1+" number2:"+num2);
								return num1+num2;
							});
		
		System.out.println("\t==>Final Sum: "+sum);

	}
}
