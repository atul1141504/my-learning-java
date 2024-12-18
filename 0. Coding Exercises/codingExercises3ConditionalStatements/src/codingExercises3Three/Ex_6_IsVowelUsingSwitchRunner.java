package codingExercises3Three;

import java.util.Scanner;

public class Ex_6_IsVowelUsingSwitchRunner {

	public static void main(String[] args) {
		//create object for System Scanner class to get user input
		Scanner scanner = new Scanner(System.in);

		System.out.println("Vowel Checker Utility -->");
		System.out.printf("\tPlease enter an alphabet: ");
		char userInput = scanner.next().charAt(0);
		
		//Create object for Grade checker class
		Ex_6_IsVowelUsingSwitch isVowel = new Ex_6_IsVowelUsingSwitch();
		
		if (isVowel.isVowel(userInput)) {
			System.out.println("\tMethod1: It's a vowel!");	
		}else {
			System.out.println("\tMethod1: It's not a vowel!");	
		}
		
		if (isVowel.isVowelMethod2(userInput)) {
			System.out.println("\tMethod2: It's a vowel!");	
		}else {
			System.out.println("\tMethod2: It's not a vowel!");	
		}
		
		//close system scanner
		scanner.close();		
	}

}
