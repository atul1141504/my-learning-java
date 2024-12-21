package codingExercises6ArranAndArrayList;

public class Ex2_GetSecondLargestNumberRunner {

	public static void main(String[] args) {
		Ex2_GetSecondLargestNumber getLargestNum = new Ex2_GetSecondLargestNumber();
		
		//Get Second largest number using Sort process
		System.out.println("\nSort Process >>");
		int[] numArray1 = {20};
		int largestNum = getLargestNum.findSecondLargestElement(numArray1);
		System.out.println("response: "+largestNum);
		
		int[] numArray2 = {10,10};
		largestNum = getLargestNum.findSecondLargestElement(numArray2);
		System.out.println("response: "+largestNum);
		
		int[] numArray3 = {20,10};
		largestNum = getLargestNum.findSecondLargestElement(numArray3);
		System.out.println("response: "+largestNum);
		
		int[] numArray4 = {10,10,10,10,10,10,10,10};
		largestNum = getLargestNum.findSecondLargestElement(numArray4);
		System.out.println("response: "+largestNum);

		int[] numArray15 = {5,5,5,4,4};
		largestNum = getLargestNum.findSecondLargestElement(numArray15);
		System.out.println("response: "+largestNum);
		
		int[] numArray5 = {20,10,88,70,12,40,90,50,55,45,89};
		largestNum = getLargestNum.findSecondLargestElement(numArray5);
		System.out.println("response: "+largestNum);
				
		//Get Second largest number using loop process
		System.out.println("\nLoop Process >>");
		int[] numArray6 = {20};
		largestNum = getLargestNum.findSecondLargestElementLoop(numArray6);
		System.out.println("response: "+largestNum);
		
		int[] numArray7 = {10,10};
		largestNum = getLargestNum.findSecondLargestElementLoop(numArray7);
		System.out.println("response: "+largestNum);
		
		int[] numArray8 = {20,10};
		largestNum = getLargestNum.findSecondLargestElementLoop(numArray8);
		System.out.println("response: "+largestNum);
		
		int[] numArray9 = {10,10,10,10,10,10,10,10};
		largestNum = getLargestNum.findSecondLargestElementLoop(numArray9);
		System.out.println("response: "+largestNum);
		
		int[] numArray10 = {5,5,5,4,4};
		largestNum = getLargestNum.findSecondLargestElementLoop(numArray10);
		System.out.println("response: "+largestNum);
		
		int[] numArray11 = {20,10,88,70,12,40,90,50,55,45,89};
		largestNum = getLargestNum.findSecondLargestElementLoop(numArray11);
		System.out.println("response: "+largestNum);
	}

}
