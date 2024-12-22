package codingExercises6ArranAndArrayList;

public class Ex4_IsArraySorted {
	
	/**
	 * This method checks if the input array is sorted in ascending order.
	 * if length of array<=1, consider array to be sorted, return True.
	 * if array is sorted in Ascending/Descending order, return true.
	 * 
	 * @param array the array to check
	 * @return true if the array is sorted, false otherwise
	 */
	
	public boolean isSorted(int[] array) {

		if (array.length <= 1) {				  //if length of array<=1, return true
			return true;
		}

		if (array[0] == array[1]) {				  //All elements are equal
			for (int i = 1; i < array.length; i++) {
				if (array[i] != array[i - 1]) {
					return false;
				}
			}
		} else if (array[0] < array[1]) {		  //Ascending Order Sorting
			for (int i = array.length - 1; i > 0; i--) {
				if (array[i] < array[i - 1]) {
					return false;
				}
			}
		} else {
			for (int i=1; i<array.length; i++) {  //Descending Order Sorting
				if (array[i] > array[i - 1]) {
					return false;
				}
			}
		}

		return true;

	}
}
