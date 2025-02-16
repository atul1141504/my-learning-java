package java5_JavaFunctionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class isOddPredicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer number) {
		return number%2==1;
	}
	
}

class forEachConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer number) {
		System.out.print(number+", ");
		
	}
	
}

class SquareMapperFunction implements Function<Integer,Integer>{

	@Override
	public Integer apply(Integer number) {
		// TODO Auto-generated method stub
		return number*number;
	}
	
}

public class ST13_To_ST15_FunctionalInterface_BehindTheScene_Lamda {
	/*
	 * Lambda Expression => (e -> Syrtem.out.println(e))
	 * 		while passed to a method it gets converted to the equivalent parameter & then gets passed
	 * 
	 * 	It uses Predicate Interface which is a Functional interface & has a "Test" method which is undefined
	 * 		
	 * 		Example: for Filter method==> Stream<T> filter(Predicate<? super T> predicate);
	 * 		Interface=> @FunctionalInterface
	 * 					public interface Predicate<T>
	 * 		Method	 => boolean test(T t);
	 * 
	 * 		Example: for forEach method==> void forEach(Consumer<? super T> action);
	 * 		Interface=> @FunctionalInterface
	 * 					public interface Consumer<T>
	 * 		Method	 => void accept(T t);
	 * 
	 * 	So once a Lambda Function is passed, a test method gets build which returns the result
	 * 
	 * 	Similarly, all the Functional Methods are getting invoked..
	 * 
	 * 	Lets take one more example:
	 * 		Example: for .map<> method==>
	 * 		Interface=> @FunctionalInterface
	 * 					<R> Stream<R> map(Function<? super T, ? extends R> mapper);
	 * 					public interface Function<T, R> 
	 * 		Method	 => R apply(T t);
	 * 
	 */
	public static void main(String[] args) {
		
		printOddNumbersUsingLambdaFunction();
		printOddNumbersByImpletingFilterPredicate();
		printOddNumbersByImpletingForEachConsumer();
		
		printSquaresofOddNumbersUsingLambdaFunction();
		printSquaresofOddNumbersByImpletingMap();

	}
	
	static void printOddNumbersUsingLambdaFunction() {
		System.out.print("1. Response using Lambda function ==>");
		List.of(1,2,3,4,5,6,7,8)
			.stream()
			.filter(
					e->e%2==1
					)
			.forEach(e-> System.out.print(e+", "));
	}
	
	static void printOddNumbersByImpletingFilterPredicate() {
		System.out.print("\n2. Implemented Predicate Interface for Method <filter()> ==>");
		List.of(1,2,3,4,5,6,7,8)
			.stream()
			.filter(
					//This is replaced with a method that implements Predicate Interface
					new isOddPredicate()	
					)
			.forEach(e-> System.out.print(e+", "));
	}
	
	static void printOddNumbersByImpletingForEachConsumer() {
		System.out.print("\n3. Implemented Consumer Interface for Method <forEach()> ==>");
		List.of(1,2,3,4,5,6,7,8)
			.stream()
			.filter(
					//a method that implements Predicate Functional Interface
					new isOddPredicate()	
					)
			.forEach(
					//A method that implements Consumer Functional Interface
					new forEachConsumer()
					);
	}
	
	static void printSquaresofOddNumbersUsingLambdaFunction() {
		System.out.print("\n4. Square Of Elements of a list using Lambda function... ==>");
		List.of(1,2,3,4,5,6,7,8)
			.stream()
			.filter(
					//a method that implements Predicate Functional Interface
					new isOddPredicate()	
					)
			.map(e->e*e)
			.forEach(
					//A method that implements Consumer Functional Interface
					new forEachConsumer()
					);
	}
	
	static void printSquaresofOddNumbersByImpletingMap() {
		System.out.print("\n4. Square Of Elements of a list using "
							+ "Function Interface for method <map()> ==>");
		List.of(1,2,3,4,5,6,7,8)
			.stream()
			.filter(
					//a method that implements Predicate Functional Interface
					new isOddPredicate()	
					)
			.map(
					//A method that implements Function Functional Interface
					new SquareMapperFunction()
					)
			.forEach(
					//A method that implements Consumer Functional Interface
					new forEachConsumer()
					);
	}

}
