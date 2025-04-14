package api.c.notPredicate;

import java.util.List;
import java.util.function.Predicate;

public class notPredicateApiRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(3,4,5,67,89,88,64);
		
		/* Create a Predicate to filter even numbers & process
		 * Using the negate() function we can print the odd elements as well
		 */
		Predicate<Integer> isEvenPredicate = number -> number%2==0;
		System.out.println("Printing Even numbers using Predicate");
		numbers.stream().filter(isEvenPredicate).forEach(System.out::println);
		System.out.println("Printing Odd numbers using Predicate");
		numbers.stream().filter(isEvenPredicate.negate()).forEach(System.out::println);
		
		/* But if we use Method reference we can't use negate function.
		 * & thats why "Predicate.not(<Method_reference>)" is introduced.
		 */
		System.out.println("Printing Even numbers using Method Reference");
		numbers.stream()
				.filter(notPredicateApiRunner::isEven)
				.forEach(System.out::println);
		System.out.println("Printing Odd numbers using Method Reference");
		numbers.stream()
				.filter(Predicate.not(notPredicateApiRunner::isEven))
				.forEach(System.out::println);
	}
	
	public static boolean isEven(int number) {
		return number%2==0;
		
	}

}
