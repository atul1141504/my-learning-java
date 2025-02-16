package java4_JavaCollections_2_Set;

import java.util.*;

public class L1_2_HashSet_Methods {

	public static void main(String[] args) {

		Set<Integer> hashSetA = new HashSet<Integer>();
		// Add Method
		hashSetA.add(31);
		hashSetA.add(21);
		hashSetA.add(41);
		hashSetA.add(11);
		System.out.println("Method <add>       : created hashSetA        ==>" + hashSetA);

		Set<Integer> hashSetB = new HashSet<Integer>();
		hashSetB.add(91);
		hashSetB.add(71);
		hashSetB.add(11);
		hashSetB.add(41);
		// addAll Method
		hashSetA.addAll(hashSetB);
		System.out.println("Method <add>       : created hashSetB        ==>" + hashSetB);
		System.out.println("Method <addAll>    : hashSetB to hashSetA    ==>" + hashSetA);

		// remove Method
		Set<Integer> hashSetC = new HashSet<Integer>(hashSetA);
		hashSetC.addAll(hashSetB);
		System.out.println("Method <add>       : created hashSetC        ==>" + hashSetC);
		hashSetC.remove(11);
		System.out.println("Method <remove>    : 11 removed from hashSetC==>" + hashSetC);

		// remove Method
		hashSetC.removeAll(hashSetB);
		System.out.println("Method <removeAll> : hashSetC - hashSetB     ==>" + hashSetC);

		// contains Method
		System.out.println();
		System.out.println("Method <contains>   : SetA contains 41       ==>" 
								+ hashSetA.contains(41));
		System.out.println("Method <contains>   : SetA contains 101      ==>" 
								+ hashSetA.contains(101));
		
		// containsAll Method
		System.out.println("Method <containsAll>: SetA contains SetC     ==>" 
								+ hashSetA.containsAll(hashSetC));
		System.out.println("Method <containsAll>: SetC contains SetA     ==>" 
							+ hashSetC.containsAll(hashSetA));
		
		// containsAll Method
		System.out.println("Method <isEmpty>    : is SetA Empty          ==>" 
							+ hashSetA.isEmpty());
		System.out.println("Method <isEmpty>    : is SetC Empty          ==>" 
							+ hashSetC.isEmpty());
				
		//hashCode Method
		System.out.println();
		System.out.println("Method <hashcode>   : hshcode of SetA        ==>"
							+hashSetA.hashCode());
		System.out.println("Method <hashcode>   : hshcode of SetB        ==>"
							+hashSetB.hashCode());
		System.out.println("Method <hashcode>   : hshcode of SetC        ==>"
							+hashSetC.hashCode());
		
		//iterator Method
		Iterator<Integer> iterator = hashSetA.iterator();
		System.out.println("\nPrinting elements of SetA using iterator");
		while(iterator.hasNext()) {
			System.out.println("\t"+iterator.next());
		}
				
	}

}
