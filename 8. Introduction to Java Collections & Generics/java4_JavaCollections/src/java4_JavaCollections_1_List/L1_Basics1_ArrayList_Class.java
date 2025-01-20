package java4_JavaCollections_1_List;

import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class L1_Basics1_ArrayList_Class {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		//Creating Immutable list
		List<String> list1 = List.of("Dog","cat");
		List<String> list2 = List.of("Apple","Banana","Orange","Pineapple");
		
		// creating Mutable ArrayList
		List<String> arrayList1 = new ArrayList<String>();
		List<String> arrayList2 = new ArrayList<String>(list2);
		System.out.println("Array List1==>"+arrayList1+"       Size==>"+arrayList1.size());
		System.out.println("Array List2==>"+arrayList2+"       Size==>"+arrayList2.size());
		
		//check if list is empty
		System.out.println("Array List1 is empty                   ==>"+arrayList1.isEmpty());
		System.out.println("Array List2 is empty                   ==>"+arrayList2.isEmpty());
				
		//get element using index
		System.out.println("Array List2 element at index 2         ==>"+arrayList2.get(2));
		System.out.println("Array List2 element using sublist method=>"+arrayList2.subList(1, 3));
				
		//check if list contains a specific data
		System.out.println("Array List2 contains 'Banana'          ==>"+arrayList2.contains("Banana"));
		System.out.println("Array List2 contains 'Kite'            ==>"+arrayList2.contains("Kite"));
				
		//find index/position of the data
		System.out.println("Array List2 index of 'Banana'          ==>"+arrayList2.indexOf("Banana"));
		System.out.println("Array List2 index of 'Kite'            ==>"+arrayList2.indexOf("Kite"));
				
		//Mutability of Array List
		arrayList2.add("Guava");			//Adds data at the end of the array list
		arrayList2.add("Guava");			//Adds data at the end of the array list
		arrayList2.add(2,"Strawberry");		//Adds data at the specified index in the array list
		System.out.println("Array List2 added   element            ==>"+arrayList2);
		
		//Add all the elements from another list
		arrayList2.addAll(list1);			//Adds data at the end of the array list
		arrayList2.addAll(3,list1);			//Adds data at the specified index in the array list
		System.out.println("Array List2 Add all element            ==>"+arrayList2);
				
		//Update an element
		arrayList2.set(3,"Mango");		//updates data at the specified index in the array list
		arrayList2.set(5,"Orange");		//updates data at the specified index in the array list
		System.out.println("Array List2 updated element            ==>"+arrayList2);
		
		//Remove element(s)
		arrayList2.remove("Guava");			//Removes specified data
		System.out.println("Array List2 removed element            ==>"+arrayList2);
		
		//Remove All element(s) present in another list
		arrayList2.removeAll(list1);			//Adds data at the end of the array list
		System.out.println("Array List2 remove all element         ==>"+arrayList2);
		
		//Remove IF (lambda Function)
		arrayList2.removeIf(element->element == "Strawberry");
		System.out.println("Array List2 remove if condition matches==>"+arrayList2);
		
		//compare lists
		System.out.println("Array List2 equals to Array List1      ==>"+arrayList2.equals(arrayList1));
		
		//*****************Creating a new Array ListA & ListB**********************
		ArrayList<String> arrListA = new ArrayList<String>(List.of("Mainframe","Cloud"));
		ArrayList<String> arrListB = new ArrayList<String>(arrListA);

		System.out.println("\nArray ListA ==>"+arrListA);	//Printing ListA
		arrListB.addAll(arrListA);							//creating Duplicates in the list
		System.out.println("Array ListB ==>"+arrListB);		//Printing ListB
		
		//getting Index Of elements
		System.out.println("\t** IndexOf     <Cloud>             ==>"+arrListB.indexOf("Cloud"));
		System.out.println("\t** lastIndexOf <Cloud>             ==>"+arrListB.lastIndexOf("Cloud"));
		
		//Creating a cloneList
		ArrayList<String> cloneList = new ArrayList<String>(arrListB);
		System.out.println("\t** clonedList using arrListB       ==>"+cloneList.clone());
		
		cloneList.remove(arrListB);
		System.out.println("\t** removed arrListB from clonedList==>"+cloneList);
		
		//Sorting elements of Array ListB
		arrListB.addAll(List.of("3","Python","5","1","Java","2","7","6"));
		System.out.println("New Array ListB==>"+arrListB);
		
		//Sort in Reversed Order using Lambda function
		arrListB.sort( (a, b) -> { return -1 * a.compareTo(b); } );
		System.out.println("\t** Reversed Sorted Array ListB using lambda function==>\n\t\t"+arrListB);
		
		arrListB.sort(null);
		System.out.println("\t** ASC Sorted Array ListB using <sort(null) method>==>\n\t\t"+arrListB);
		
		Collections.sort(arrListB);
		System.out.println("\t** ASC Sorted Array ListB using <Collections.sort(coll?) method>==>\n\t\t"+arrListB);

		//Remove Elements
		arrListB.remove(5);
		System.out.println("\t** Remove element '7' present at index 5==>\n\t\t"+arrListB);
		
		arrListB.remove("Cloud");
		System.out.println("\t** Remove 1st occurrence of specified element 'cloud'==>\n\t\t"+arrListB);
		
		arrListB.removeAll(arrListA);
		System.out.println("\t** Remove All the elements present in ListA==>\n\t\t"+arrListB);
		
		//Retain all the Elements present in arrayListA
		arrListB.retainAll(arrListA);
		System.out.println("\t** Retained all elements of ListA present in ListB==>\n\t\t"+arrListB);
		
		//Replace all the elements
		arrListA.replaceAll(str-> str = "AP");
		System.out.println("\t** Replaced all elements of ListA with specified element==>\n\t\t"+arrListA);
		
		/* Iteration
		** 1. using Iterator     class => Unidirectional Iteration
		** 2. using listIterator class => Bi-Directional Iteration
		**								  Index is also available to access the elements
		** 3. using for Loop
		** 4. using Enhanced For Loop > for-each
		*/
		Iterator<String> iterator = arrayList2.iterator();
		System.out.println("\nArray List2"+arrayList2);
		System.out.println("\tIteration of arrayList2 using Iterator Class");
		int i=0;
		while(iterator.hasNext()) {
//			if(iterator.next()=="Banana") {
//			System.out.println(">>"+iterator.next());
//			}
			System.out.println("\t\tElement "+i+" in the list==>"+iterator.next());
			i++;
		}
		
		ListIterator<String> arrListIterator = arrayList2.listIterator();
		System.out.println("\tIteration of arrayList2 in ASC order using listIterator Class");
		while(arrListIterator.hasNext()) {
			System.out.println("\t\tElement "+arrListIterator.nextIndex()+" in the list==>"+arrListIterator.next());
		}

		System.out.println("\tIteration of arrayList2 in DESC order using listIterator Class");
		while(arrListIterator.hasPrevious()) {
			System.out.println("\t\tElement "+arrListIterator.previousIndex()+" in the list==>"+arrListIterator.previous());
		}
		
		int j;
		System.out.println("\tIteration using for loop");
		for(j=0;j<arrayList2.size();j++) {
			System.out.println("\t\tElement "+j+" in the list==>"+arrayList2.get(j));
		}
		
		j=0;
		System.out.println("\tIteration using enhanced for loop");
		for(String element:arrayList2) {
			System.out.println("\t\tElement "+j+" in the list==>"+element);
			j++;
		}
	}

}
