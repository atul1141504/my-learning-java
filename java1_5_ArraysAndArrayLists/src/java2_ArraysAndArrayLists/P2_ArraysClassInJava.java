package java2_ArraysAndArrayLists;

import java.util.Arrays;

public class P2_ArraysClassInJava {

	public static void main(String[] args) {
		//create an array
		int[] array1 = new int[5];
		System.out.println("array1 created: "+Arrays.toString(array1));
		
		// fill method of Arrays class - defaulting/initializing an array
		System.out.println();
		System.out.println("Array Initialization with a default value:80 ==>");
		Arrays.fill(array1,80);
		System.out.println("\t=>array1 initialized: "+Arrays.toString(array1));
		
		//Array Comparison
		int[] marksArray1 = {99,97,88,95,90};
		int[] marksArray2 = {99,97,88,95,90};
		int[] marksArray3 = {95,91,88,97,90};
		System.out.println();
		System.out.println("Array Comparison");
		System.out.println("\t=>marksArray 1      : "+Arrays.toString(marksArray1));
		System.out.println("\t=>marksArray 2      : "+Arrays.toString(marksArray2));
		System.out.println("\t=>marksArray 3      : "+Arrays.toString(marksArray3));
		System.out.println("\t=>marksArray 1vs2   : "+Arrays.equals(marksArray1,marksArray2));
		System.out.println("\t=>marksArray 1vs3   : "+Arrays.equals(marksArray1,marksArray3));
		
		//Array Sorting
		System.out.println();
		System.out.println("Array Sorting");
		Arrays.sort(marksArray1);
		System.out.println("\t=>marksArray1 Sorting-Simple Sorting : " + Arrays.toString(marksArray1));
		Arrays.sort(marksArray2, 1, 4);
		System.out.println("\t=>marksArray2 Sorting-from idx 1 to 3: " + Arrays.toString(marksArray2));
	}

}
