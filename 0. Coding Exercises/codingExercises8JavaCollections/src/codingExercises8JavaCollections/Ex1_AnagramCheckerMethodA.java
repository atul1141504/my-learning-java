package codingExercises8JavaCollections;

public class Ex1_AnagramCheckerMethodA {
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
				
        char[] CharactersInString1 = str1.toCharArray();
        char[] CharactersInString2 = str2.toCharArray();
        
        boolean characterFound = false;
        for(char character1:CharactersInString1) {
        	for(char character2:CharactersInString2) {
        		if(	character1==character2
        				|| ((char) (character1+32))==character2 
        				|| ((char) (character1-32))==character2) {
        			characterFound = true;
        			break;
        		}
        	}
        	
        	if(!characterFound) {
        		return false;
        	}
        }
        return true;
        
    }
	
}
