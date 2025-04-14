package api.k.sequencedCollection.java21;

import java.util.LinkedHashSet;
import java.util.List;

public class SequencedSetRunner {

	public static void main(String[] args) {
		/* interface sequencedSet extends Set<>,SequencedCollection<>{
		 * 		sequencedSet<E> reversed();  //Co-variant Override
		 * } 
		 * 
		 * In SequencedCollection, the reversed() method returns a SequencedCollection.
		 * 
		 * However in sequencedSet, the reversed() method returns a sequencedSet.
		 */

		var cources = List.of("Spring Boot");
		var courceDetailsSet = new LinkedHashSet<>(cources);
		courceDetailsSet.add("Spring Security");
		
		/* Here a Set is created with elements: "Spring Boot" & "Spring Security"
		 * Now we can add the elements at the start & at Last of the list
		 */
		courceDetailsSet.addFirst("Spring");
		courceDetailsSet.addLast("AWS");
		
		System.out.println("CourceDetailsSet=> "+courceDetailsSet);
		
		//Accessing the elements of the HashSet
		System.out.println("\t1st  element of CourceDetailsSet=> "
								+ courceDetailsSet.getFirst());
		System.out.println("\tLast element of CourceDetailsSet=> "
								+ courceDetailsSet.getLast());
		
		/* Now, lets add few more elements using add method
		 * This will by default add the elements at the end
		 */
		courceDetailsSet.add("Cloud Computing");
		courceDetailsSet.add("Azure");
		System.out.println("\nUpdated CourceDetailsSet => "+courceDetailsSet);
		System.out.println("\t1st  element of updated CourceDetailsSet=> "
								+ courceDetailsSet.getFirst());
		System.out.println("\tLast element of updated CourceDetailsSet=> "
								+ courceDetailsSet.getLast());
		
		
		//Reversing the Set
		System.out.println("\nReversed CourceDetailsSet=> "+courceDetailsSet.reversed());
		
		//Removing first & Last Elements from the Set
		courceDetailsSet.removeFirst();
		System.out.println("\ncourceDetailsSet after removing 1st  element=> "
								+ courceDetailsSet);
		courceDetailsSet.removeLast();
		System.out.println("\ncourceDetailsSet after removing Last element=> "
								+ courceDetailsSet);
		
	}

}
