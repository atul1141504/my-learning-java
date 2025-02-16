package java2_ArraysAndArrayLists;

import java.util.Arrays;

public class P1_Basics {

	public static void main(String[] args) {
		// Declaring an array
		
		int[] marksArray = new int[8];
		System.out.println("marksArray     : "+Arrays.toString(marksArray));
		System.out.println("Length of array: "+marksArray.length);
		System.out.println("Memory Location: "+marksArray);
		
		System.out.println();
		int[] marksArray1 = {81,95,97,88,90};
		System.out.println("marksArray1    : "+Arrays.toString(marksArray1));
		System.out.println("Length of array: "+marksArray1.length);
		System.out.println("Memory Location: "+marksArray1);
		
		//Accessing element of array
		System.out.println();
		System.out.println("Accessing element of array");
		System.out.println("1st element of marksArray1: "+marksArray1[0]);
		System.out.println("2nd element of marksArray1: "+marksArray1[1]);
		System.out.println("3rd element of marksArray1: "+marksArray1[2]);
		
		//Updating element of Array
		System.out.println();
		System.out.println("Updating element of Array");
		
		marksArray1[1] = 92;
		marksArray1[2] = 85;
		System.out.println("after update marksArray1  : "+Arrays.toString(marksArray1));
		
	}

}
