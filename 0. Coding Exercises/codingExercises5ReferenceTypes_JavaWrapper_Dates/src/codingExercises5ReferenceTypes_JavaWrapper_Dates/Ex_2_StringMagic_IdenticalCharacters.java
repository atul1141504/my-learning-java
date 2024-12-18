package codingExercises5ReferenceTypes_JavaWrapper_Dates;

public class Ex_2_StringMagic_IdenticalCharacters {
	/**
     * This method checks if a given string has two consecutive identical characters.
     *
     * @param str The string to check for consecutive duplicates.
     * @return true if the string has consecutive duplicates, false otherwise.
     */
    public boolean hasConsecutiveDuplicates(String str) {
		int i = 0;
		
		for(i = 0; i < (str.length() - 1); i++){
		    char currentChar = str.charAt(i);
		    char nextChar = str.charAt(i+1);
			if (currentChar == nextChar) {
				return true;
			}
			i++;
		}
		
		return false;
    }
}
