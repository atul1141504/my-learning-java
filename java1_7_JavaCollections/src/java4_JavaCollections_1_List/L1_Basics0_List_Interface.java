package java4_JavaCollections_1_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class L1_Basics0_List_Interface {

	public static void main(String[] args) {
		// it is used to add an element in between or at the end of the list
		List<String> list1 = List.of();
		System.out.println("List-1 created==>"+list1 + " Size ==> "+list1.size());
		
		List<String> list2 = List.of("Apple","Banana","Orange","Pineapple");
		System.out.println("List-2 created==>"+list2 + " Size ==> "+list2.size());
		List<String> aa = new ArrayList<String>(list2);
		//check if list is empty
		System.out.println("List-1 is empty==>"+list1.isEmpty());
		System.out.println("List-2 is empty==>"+list2.isEmpty());
		
		//get element using index
		System.out.println("List-2 element at index 2==>"+list2.get(2));
		
		//check if list contains a specific data
		System.out.println("List-2 contains 'Banana'==>"+list2.contains("Banana"));
		System.out.println("List-2 contains 'Kite'  ==>"+list2.contains("Kite"));
		
		//find index/position of the data
		System.out.println("List-2 index of 'Banana'==>"+list2.indexOf("Banana"));
		System.out.println("List-2 index of 'Kite'  ==>"+list2.indexOf("Kite"));
		
		//Immutable List==> if we create a List using ".Of" function
		
		/*list1.add("Hello");		//ImmutableCollection Exception
		**System.out.println("List1 added element==>"+list1);
		*/
		
		/*
		 * If we need to create a Mutable List we can create below lists:
		 * 		1. Array List
		 * 		2. Linked List
		 * 		3. Vector
		 */
		
		//Iteration using fort loop
		System.out.println("Iteration using for loop");
		for(int i=0;i<list2.size();i++) {
			System.out.println("\tElement "+(i+1)+" in the list==>"+list2.get(i));
		}
		
		//Iteration using Enhanced for loop
		int i = 1;
		System.out.println("Iteration using enhanced - for loop");
		for(String elements:list2) {
			System.out.println("\tElement "+i+" in the list==>"+elements);
			i++;
		}
		
		//Iteration using Iterator class
		i=0;
		Iterator<String> iterator = aa.iterator();
		System.out.println(aa);
		System.out.println("Iteration using Iterator Class");
		
		while(iterator.hasNext()) {
			//System.out.println(iterator.next());
			i++;
			if(i==2) {
				iterator.next();
				iterator.remove();
			}
			System.out.println("\tElement "+i+" in the list==>"+iterator.next());
			
		}
		
//		System.out.println("Using remove method from Iterator");
//		while(iterator.hasNext()) {
//			iterator.remove();
//			System.out.println("\tElement in the list==>"+iterator.next());
//		}
		
		
	}

}
