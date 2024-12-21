package codingExercises6ArranAndArrayList;

public class Ex3_IsSumOfArraysEqualRunner {

	public static void main(String[] args) {
		
//		int[] array1 = {1, 2};
//		int[] array2 = {4, -2, 1};
		int[] array1 = {-1, -1, -1};
		int[] array2 = {-2, 1};
		Ex3_IsSumOfArraysEqual isSumEquals = new Ex3_IsSumOfArraysEqual(array1, array2);
		
		if(isSumEquals.areSumsEqual()) {
			System.out.println("Sum of elements of array elements is equal");
		}else {
			System.out.println("Sum of elements of array elements is not equal");
		}

	}

}
