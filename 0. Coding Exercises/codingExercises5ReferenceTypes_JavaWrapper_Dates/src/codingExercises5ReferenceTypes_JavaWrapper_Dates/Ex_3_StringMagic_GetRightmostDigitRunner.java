package codingExercises5ReferenceTypes_JavaWrapper_Dates;

import java.util.Scanner;

public class Ex_3_StringMagic_GetRightmostDigitRunner {

	public static void main(String[] args) {
		Ex_3_StringMagic_GetRightmostDigit stringMagic= new Ex_3_StringMagic_GetRightmostDigit();
		
		Scanner scanner = new Scanner(System.in);
		
		String userString = scanner.nextLine();
		
		int rightMostDigit = stringMagic.getRightmostDigit(userString);
		
		if (rightMostDigit == -1) {
			System.out.println("No digit found in the string!");
		} else {
			System.out.println("Right most digit in the string: "+rightMostDigit);
		}
		
		scanner.close();
		
	}

}
