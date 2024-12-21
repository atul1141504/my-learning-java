package codingExercises6ArranAndArrayList;

import java.util.Arrays;

public class Ex5_reverseArrayRunner {

	public static void main(String[] args) {
		Ex5_reverseArray revArray = new Ex5_reverseArray();
		
		System.out.println("Reverse of array " 
							+ Arrays.toString(new int[] {1, 2, 3, 4}) + " : " 
							+ Arrays.toString(revArray.reverseArray(new int[] {1, 2, 3, 4}))
						   );
		System.out.println("Reverse of array " 
				+ Arrays.toString(new int[] {5, -10, 15, -20}) + " : " 
				+ Arrays.toString(revArray.reverseArray(new int[] {5, -10, 15, -20}))
			   );

		System.out.println("Reverse of array " 
				+ Arrays.toString(new int[] {100, 200, 300, 400, 500}) + " : " 
				+ Arrays.toString(revArray.reverseArray(new int[] {100, 200, 300, 400, 500}))
			   );

	}

}
