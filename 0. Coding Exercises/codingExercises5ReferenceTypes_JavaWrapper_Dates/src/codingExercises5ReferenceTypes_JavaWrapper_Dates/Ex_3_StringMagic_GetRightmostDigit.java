package codingExercises5ReferenceTypes_JavaWrapper_Dates;

public class Ex_3_StringMagic_GetRightmostDigit {

    /**
     * This method finds the rightmost digit in a given string.
     *
     * @param str The string to find the rightmost digit in.
     * @return The rightmost digit in the string. If no digit is found, return -1.
     */
    public int getRightmostDigit(String str) {
		
    	int rightMostDigit = 0;
    	
    	boolean digitFound = false;
        for (int i=0;i<str.length();i++) {
        	if(Character.isDigit(str.charAt(i))) {
        		rightMostDigit = Character.getNumericValue(str.charAt(i));
        		digitFound = true;
        	}
        }
        
        if (digitFound) {
        	return rightMostDigit;
        }
        return -1;
        
    }
}
