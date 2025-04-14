package api.k.sequencedCollection.java21;

import java.util.LinkedHashMap;

public class SequencedMapRunner {

	public static void main(String[] args) {
		/* interface SequencedMap doesn't extend SequencedCollection interface
		 * 
		 * as it have [key,value] pair.
		 * 
		 * In addition to the implementations from the Map<k,v>, it has below operations:
		 * a. reversed() 		  => Reverse the Map
		 * b. sequencedKeySet()   => Get the Sequenced Key Set
		 * c. sequencedValues()   => Get the Sequenced values
		 * d. sequencedEntrySet() => Get the Entry Set
		 * e. putFirst<k,v> 	  => Add as First element in the Map
		 * e. putLast<k,v> 		  => Add as last  element in the Map
		 * 
		 */
		var courceDetailsMap = new LinkedHashMap<>();
		courceDetailsMap.put(1, "Spring Boot");
		
		/* Here a Map is created with an element: "Spring Boot"
		 * Now we can add the elements at the start & at Last of the list
		 */
		courceDetailsMap.putFirst(10, "Spring");
		courceDetailsMap.putLast(20, "Spring AI");
		
		//Accessing the elements of the HashMap
		System.out.println("LinkedHashMap=>"+courceDetailsMap);
		System.out.println("\t1st  entry of LinkedHashMap=>"+courceDetailsMap.firstEntry());
		System.out.println("\tLast entry of LinkedHashMap=>"+courceDetailsMap.lastEntry());
		
		System.out.println("sequencedKeySet=>"+courceDetailsMap.sequencedKeySet());
		System.out.println("sequencedValues=>"+courceDetailsMap.sequencedValues());
		System.out.println("sequencedEntrySet=>"+courceDetailsMap.sequencedEntrySet());
		
		//Reversing the Map
		System.out.println("\nReversed LinkedHashMap=>"+courceDetailsMap.reversed());
		
		//Removing the elements
		System.out.println("\nPoll first entry=>"+courceDetailsMap.pollFirstEntry());
		System.out.println("\nPoll last  entry=>"+courceDetailsMap.pollLastEntry());
		
		//LinkedHashMap after 
		System.out.println("\nLinkedHashMap after Poll 1st & Last entry=>"+courceDetailsMap);
		
	}

}
