package java4_JavaCollections_1_List;

import java.util.LinkedList;
import java.util.List;

public class L1_Basics2_LinkedList_Class {

	public static void main(String[] args) {
		//Creating Immutable list
		List<String> list1 = List.of("Dog","cat");
		List<String> list2 = List.of("Apple","Banana","Orange","Pineapple");
		
		// creating ArrayList
		List<String> linkedList1 = new LinkedList<String>();
		List<String> linkedList2 = new LinkedList<String>(list2);
		
		System.out.println("Linked List1==>"+linkedList1+" Size==>"+linkedList1.size());
		System.out.println("Linked List2==>"+linkedList2+" Size==>"+linkedList2.size());
		
		//check if list is empty
		System.out.println("Linked List1 is empty==>"+linkedList1.isEmpty());
		System.out.println("Linked List2 is empty==>"+linkedList2.isEmpty());
				
		//get element using index
		System.out.println("Linked List2 element at index 2==>"+linkedList2.get(2));
				
		//check if list contains a specific data
		System.out.println("Linked List2 contains 'Banana'==>"+linkedList2.contains("Banana"));
		System.out.println("Linked List2 contains 'Kite'  ==>"+linkedList2.contains("Kite"));
				
		//find index/position of the data
		System.out.println("Linked List2 index of 'Banana'==>"+linkedList2.indexOf("Banana"));
		System.out.println("Linked List2 index of 'Kite'  ==>"+linkedList2.indexOf("Kite"));
				
		//Mutability of Linked List
		linkedList2.add("Guava");			//Adds data at the end of the Linked list
		linkedList2.add("Guava");			//Adds data at the end of the Linked list
		linkedList2.add(2,"Strawberry");	//Adds data at the specified index in the Linked list
		System.out.println("Linked List2 added   element==>"+linkedList2);
		
		//Update an element
		linkedList2.set(3,"Mango"); 		//updates data at the specified index in the Linked list
		linkedList2.set(5,"Orange");		//updates data at the specified index in the Linked list
		System.out.println("Linked List2 updated element==>"+linkedList2);
		
		//Remove element(s)
		linkedList2.remove("Guava");		//Adds data at the end of the Linked list
		System.out.println("Linked List2 removed element==>"+linkedList2);
		
		//Add all the elements from another list
		linkedList2.addAll(list1);			//Adds data at the end of the Linked list
		linkedList2.addAll(3,list1);		//Adds data at the specified index in the Linked list
		System.out.println("Linked List2 Add all element==>"+linkedList2);
		
		//Remove All element(s) present in another list
		linkedList2.removeAll(list1);		//Adds data at the end of the Linked list
		System.out.println("Linked List2 remove all element==>"+linkedList2);

	}

}
