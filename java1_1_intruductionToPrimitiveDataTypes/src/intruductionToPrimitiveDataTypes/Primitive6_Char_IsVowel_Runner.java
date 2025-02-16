package intruductionToPrimitiveDataTypes;

public class Primitive6_Char_IsVowel_Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Primitive6_Char_IsVowel myChar = new Primitive6_Char_IsVowel('g');
		
		System.out.printf("isVowel:");
		System.out.println(myChar.isVowel());
		
		System.out.printf("isNumber:");
		System.out.println(myChar.isDigit());
		
		System.out.printf("isAlphabet:");
		System.out.println(myChar.isAlphabet());
		
		System.out.printf("isLowerCase:");
		System.out.println(myChar.printLowerCaseAlphabets());
		
		System.out.printf("isUpperCase:");
		System.out.println(myChar.printUpperCaseAlphabets());
		
		System.out.printf("isConsonent:");
		System.out.println(myChar.isConsonent());
		
		System.out.printf("All upper Case Alphabets:");
		System.out.println(myChar.printAllUpperCaseAlphabets());
		
		System.out.printf("All lower Case Alphabets:");
		System.out.println(myChar.printAllLowerCaseAlphabets());
		
	}

}
