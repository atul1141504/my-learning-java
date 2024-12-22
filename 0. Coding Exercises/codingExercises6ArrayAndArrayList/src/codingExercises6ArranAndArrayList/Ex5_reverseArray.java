package codingExercises6ArranAndArrayList;

public class Ex5_reverseArray {
    /**
     * This method reverses an array.
     * 
     * @param array the array to reverse
     * @return a new array with elements in reverse order
     */
    public int[] reverseArray(int[] array) {
    	
    	int[] reverseArray = new int[array.length];
    	
    	for(int i=0;i<array.length;i++){
    		reverseArray[i] = array[(array.length-1)-i];
    	}
    	
		return reverseArray;

    }
}
