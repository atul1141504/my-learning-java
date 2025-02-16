package java2_ArraysAndArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class P5_ArrayLists_Basics {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		
		//Adding items to the array
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    //Adding item using index position of array
	    cars.add(4,"TATA");
	    cars.add(4,"TATA");
	    System.out.println(cars);
	    
	    //Size of array
	    System.out.println("Size of cars array: "+cars.size());
	    
	    //Accessing elements of Array
	    System.out.println();
	    System.out.println("Printing items of array >>");
	    int i = 0;
	    for(String car:cars) {
	    	System.out.println("\tArray item at index " + i + " : "+cars.get(i));
	    	i++;
	    }
	    
	    //Change an Item of Array
	    cars.set(2, "Mercedes");
	    System.out.println();
	    System.out.println("After updating 3rd item: "+cars);

	    //Removing An item
	    cars.remove(4);
	    System.out.println();
	    System.out.println("After removing 4th item: "+cars);
	    
	    //Sorting Array List
	    System.out.println();
	    System.out.println("Sorting Array List >>");
	    Collections.sort(cars);  // Sort cars
	    for (String car : cars) {
	      System.out.println("\t"+car);
	    }
	    
	  //Removing all the elements of array - Clear Array List
	    cars.clear();
	    System.out.println();
	    System.out.println("Clearing Array List: "+cars);
	}

}
