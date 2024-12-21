package codingExercises6ArranAndArrayList;

import java.util.Arrays;

public class Ex4_IsArraySortedRunner {

	public static void main(String[] args) {
		Ex4_IsArraySorted isSorted = new Ex4_IsArraySorted();
		
		int[] array = {10,20,50,60};
		
		if(isSorted.isSorted(array)) {
			System.out.println(Arrays.toString(array) + "==> Array is Sorted!!");
		}else {
			System.out.println(Arrays.toString(array) + "==> Array is not Sorted!!");
		}
		
		int[] array1 = {60,50,20,10};
		
		if(isSorted.isSorted(array1)) {
			System.out.println(Arrays.toString(array1) + "==> Array is Sorted!!");
		}else {
			System.out.println(Arrays.toString(array1) + "==> Array is not Sorted!!");
		}
		
		int[] array2 = {60,50,90,10};
		
		if(isSorted.isSorted(array2)) {
			System.out.println(Arrays.toString(array2) + "==> Array is Sorted!!");
		}else {
			System.out.println(Arrays.toString(array2) + "==> Array is not Sorted!!");
		}
		
		int[] array3 = {};
		
		if(isSorted.isSorted(array3)) {
			System.out.println(Arrays.toString(array3) + "==> Array is Sorted!!");
		}else {
			System.out.println(Arrays.toString(array3) + "==> Array is not Sorted!!");
		}
		
		int[] array4 = {60};
		
		if(isSorted.isSorted(array4)) {
			System.out.println(Arrays.toString(array4) + "==> Array is Sorted!!");
		}else {
			System.out.println(Arrays.toString(array4) + "==> Array is not Sorted!!");
		}
		
		int[] array5 = {5,2};
		
		if(isSorted.isSorted(array5)) {
			System.out.println(Arrays.toString(array5) + "==> Array is Sorted!!");
		}else {
			System.out.println(Arrays.toString(array5) + "==> Array is not Sorted!!");
		}
		
		int[] array6 = {5,5,5,5,5,5,5};
		
		if(isSorted.isSorted(array6)) {
			System.out.println(Arrays.toString(array6) + "==> Array is Sorted!!");
		}else {
			System.out.println(Arrays.toString(array6) + "==> Array is not Sorted!!");
		}

	}

}
