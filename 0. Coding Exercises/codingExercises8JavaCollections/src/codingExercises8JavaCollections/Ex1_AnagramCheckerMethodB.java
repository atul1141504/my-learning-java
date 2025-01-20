package codingExercises8JavaCollections;

import java.util.Arrays;

public class Ex1_AnagramCheckerMethodB {
	public boolean areAnagrams(String str1, String str2) {
		
		if(str1==null || str2==null) {
			return false;
		}
		if(str1.length()!=str2.length()){
			return false;
		}
		if(str1.length()==0 && str2.length()==0) {
			return true;
		}
		
		char[] charArrOfStr1 = str1.toUpperCase().toCharArray();
		char[] charArrOfStr2 = str2.toUpperCase().toCharArray();
		Arrays.sort(charArrOfStr1);
		Arrays.sort(charArrOfStr2);
		
		return Arrays.equals(charArrOfStr1, charArrOfStr2);
        
    }
	
}
