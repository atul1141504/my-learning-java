package codingExercises6ArranAndArrayList;

import java.util.Arrays;

public class Ex2_GetSecondLargestNumber {
	/**
     * This method finds and returns the second largest element in the given array.
     * 
     * @param array the array in which to find the second largest element
     * @return the second largest element in the array
     */
     
    //Sort is used to get the second largest number
	public int findSecondLargestElement(int[] array) {
		if(array.length<2) {
			return -1;
		}
		
		Arrays.sort(array);
		
		if(array[0]==array[array.length-1]) {
			return -1;
		}
		
		for(int i=array.length-1;i>0;i--) {
			
			if(array[i]>array[i-1]) {
				return array[i-1];
			}
		}
		
		return -1;
    }
    
	//For loop is used to determine the second largest number
    public int findSecondLargestElementLoop(int[] array) {
		if(array.length<2) {
			return -1;
		}
		
		if(array.length==2) {
			if(array[0] == array[array.length-1]) {
				return -1;
			} else if(array[0] > array[array.length-1]) {
				return array[array.length-1];
			}else
				return array[0];
		}
		
		int largestNumber = array[0];//20,20,88,88,88
		int secondLargest = array[0];//20,10,20,70,12
		boolean isTrue = false;
		
		for(int i:array) {                          //{20,10,88,70,12,40,90,50,55,45,89};
			if(i>largestNumber) {
				secondLargest = largestNumber;
				largestNumber = i;
			}else if(i<secondLargest && i!=largestNumber && !isTrue){
				secondLargest = i;
				isTrue = true;
			}else if(i>secondLargest){
				secondLargest = i;
			}
		}
		
		if(secondLargest==array[0]) {
			return -1;
		}
		
		return secondLargest;
        
    }
}
