package java4_JavaCollections_2_Set;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

public class L2_2_LinkedHashSet_Methods {

	public static void main(String[] args) {
		Set<Integer> lkdHashSetA = new LinkedHashSet<Integer>();
		// Add Method
		lkdHashSetA.add(31);
		lkdHashSetA.add(21);
		lkdHashSetA.add(41);
		lkdHashSetA.add(11);
		System.out.println("Method <add>       : created lkdHashSetA        ==>" + lkdHashSetA);

		Set<Integer> lkdHashSetB = new LinkedHashSet<Integer>();
		lkdHashSetB.add(91);
		lkdHashSetB.add(71);
		lkdHashSetB.add(11);
		lkdHashSetB.add(41);
		// addAll Method
		lkdHashSetA.addAll(lkdHashSetB);
		System.out.println("Method <add>       : created lkdHashSetB           ==>" + lkdHashSetB);
		System.out.println("Method <addAll>    : lkdHashSetB to lkdHashSetA    ==>" + lkdHashSetA);

		// remove Method
		Set<Integer> lkdHashSetC = new LinkedHashSet<Integer>(lkdHashSetA);
		lkdHashSetC.addAll(lkdHashSetB);
		System.out.println("Method <add>       : created lkdHashSetC        ==>" + lkdHashSetC);
		lkdHashSetC.remove(11);
		System.out.println("Method <remove>    : 11 removed from lkdHashSetC==>" + lkdHashSetC);

		// remove Method
		lkdHashSetC.removeAll(lkdHashSetB);
		System.out.println("Method <removeAll> : lkdHashSetC - lkdHashSetB  ==>" + lkdHashSetC);

		// contains Method
		System.out.println();
		System.out.println("Method <contains>   : SetA contains 41       ==>" 
								+ lkdHashSetA.contains(41));
		System.out.println("Method <contains>   : SetA contains 101      ==>" 
								+ lkdHashSetA.contains(101));
		
		// containsAll Method
		System.out.println("Method <containsAll>: SetA contains SetC     ==>" 
								+ lkdHashSetA.containsAll(lkdHashSetC));
		System.out.println("Method <containsAll>: SetC contains SetA     ==>" 
							+ lkdHashSetC.containsAll(lkdHashSetA));
		
		// containsAll Method
		System.out.println("Method <isEmpty>    : is SetA Empty          ==>" 
							+ lkdHashSetA.isEmpty());
		System.out.println("Method <isEmpty>    : is SetC Empty          ==>" 
							+ lkdHashSetC.isEmpty());
				
		//hashCode Method
		System.out.println();
		System.out.println("Method <hashcode>   : hshcode of SetA        ==>"
							+lkdHashSetA.hashCode());
		System.out.println("Method <hashcode>   : hshcode of SetB        ==>"
							+lkdHashSetB.hashCode());
		System.out.println("Method <hashcode>   : hshcode of SetC        ==>"
							+lkdHashSetC.hashCode());
		
		//iterator Method
		Iterator<Integer> iterator = lkdHashSetA.iterator();
		System.out.println("\nPrinting elements of SetA using iterator");
		while(iterator.hasNext()) {
			System.out.println("\t"+iterator.next());
		}
		

	}

}
