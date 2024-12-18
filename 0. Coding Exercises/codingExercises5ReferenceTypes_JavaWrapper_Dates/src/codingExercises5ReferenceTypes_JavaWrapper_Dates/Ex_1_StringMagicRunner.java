package codingExercises5ReferenceTypes_JavaWrapper_Dates;

public class Ex_1_StringMagicRunner {

	public static void main(String[] args) {
		Ex_1_StringMagic stringMagic = new Ex_1_StringMagic();
		
		int uppercaseLetters = stringMagic.countUppercaseLetters("Hello WORLd");
		
		if (uppercaseLetters == 0) {
			System.out.println("Upper case is not found in enetered string!");
		}else if (uppercaseLetters>0) {
			System.out.println(uppercaseLetters + " upper case characters found in enetered string!");
		}
	}

}
