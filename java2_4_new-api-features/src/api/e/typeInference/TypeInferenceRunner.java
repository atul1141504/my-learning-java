package api.e.typeInference;

import java.util.List;

public class TypeInferenceRunner {

	public static void main(String[] args) {
		System.out.println("<< Examples of operations without using Type Inference >>");
		System.out.println("a. List Operations");
		List<String> listA = List.of("Atul","Patel");
		List<String> listB = List.of("Garima","Verma");
		List<List<String>> namesList = List.of(listA,listB);
		namesList.stream().forEach(System.out::println);
		
		System.out.println("b. Enhanced for loop");
		for(List<String> names:namesList) {
			System.out.println(names);
		}
		
		System.out.println("c. Stream API Operations");
		List.of("Atul","Garima").stream().filter(s->s.length()<5).forEach(System.out::println);
		
		System.out.println("\n<< Examples of operations using Type Inference >>");
		System.out.println("a. List Operations");
		var listA1 = List.of("Atul","Patel");
		var listB1 = List.of("Garima","Verma");
		var namesList1 = List.of(listA1,listB1);
		namesList1.stream().forEach(System.out::println);
		
		System.out.println("b. Enhanced for loop");
		for(var names:namesList) {
			System.out.println(names);
		}
		
		/* Here the type of extracted variable is "Stream<String>"
		 * which is replaced by var & the type is inferred automatically based on the expression
		 */
		System.out.println("c. Stream API Operations");
		var filter = List.of("Atul","Garima").stream().filter(s->s.length()<5);
		filter.forEach(System.out::println);
		
	}

}
