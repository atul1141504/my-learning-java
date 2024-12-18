package codingExercises5ReferenceTypes_JavaWrapper_Dates;

import java.util.Scanner;

public class Ex_2_StringMagic_IdenticalCharactersRunner {

	public static void main(String[] args) {
		
		Ex_2_StringMagic_IdenticalCharacters magicString = new Ex_2_StringMagic_IdenticalCharacters();
		
		Scanner scanner = new Scanner(System.in);
		String userString = scanner.nextLine();
		
		if (magicString.hasConsecutiveDuplicates(userString)) {
			System.out.println("Identical characters found in the string!");
		}else {
			System.out.println("Identical characters not found in the string!");
		}
		
		scanner.close();

	}

}
