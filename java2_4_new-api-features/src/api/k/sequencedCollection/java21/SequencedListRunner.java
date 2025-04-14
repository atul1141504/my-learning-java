package api.k.sequencedCollection.java21;

import java.util.ArrayList;

public class SequencedListRunner {

	public static void main(String[] args) {
		
		/* ArrayList is an implementation of List Interface.
		 * List Interface extends SequencedCollection Interface.
		 * 
		 * That's why ArrayList has all the features present in SequencedCollection
		 * 
		 * was released in Java-21
		 */
		var courceDetails = new ArrayList<>();
		courceDetails.add("Spring Security");
		
		/* Here a list is created with an element: "Spring Security"
		 * Now we can add the elements at the start & at Last of the list
		 */
		courceDetails.addFirst("Spring Boot");
		courceDetails.addLast("Spring AI");
		
		System.out.println("CourceDetails Array List=> "+courceDetails);
		
		//Accessing the elements of the ArrayList
		System.out.println("\t1st  element of CourceDetails Array List=> "
								+ courceDetails.getFirst());
		System.out.println("\tLast element of CourceDetails Array List=> "
								+ courceDetails.getLast());
		
		/* Now, lets add few more elements using add method
		 * This will by default add the elements at the end
		 */
		courceDetails.add("Cloud Computing with AWS");
		courceDetails.add("Cloud Computing with Azure");
		System.out.println("\nUpdated CourceDetails Array List=> "+courceDetails);
		System.out.println("\t1st  element of updated CourceDetails Array List=> "
								+ courceDetails.getFirst());
		System.out.println("\tLast element of updated CourceDetails Array List=> "
								+ courceDetails.getLast());
		
		
		//Reversing the list
		System.out.println("\nReversed CourceDetails Array List=> "+courceDetails.reversed());
		
		//Removing first & Last Elements from the Array List
		courceDetails.removeFirst();
		System.out.println("\nArray List after removing 1st  element=> "+courceDetails);
		courceDetails.removeLast();
		System.out.println("\nArray List after removing Last element=> "+courceDetails);
		
	}

}
