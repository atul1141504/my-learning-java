package codingExercises5ReferenceTypes_JavaWrapper_Dates;

public class Ex_1_StringMagic {
    
    /**
     * This method counts the number of upper case letters in a given string.
     *
     * @param str The string to count upper case letters in.
     * @return The number of upper case letters in the string.
     */
    public int countUppercaseLetters(String str) {
    	
    	if (str.isEmpty()) {
			return 0;
		}
		
		int i = 0;
		int counter = 0;
		
		do {
			if (Character.isUpperCase(str.charAt(i))) {
				counter++;
			}
			i++;
		}while (i<str.length());
		
		return counter;
        
    }
}
