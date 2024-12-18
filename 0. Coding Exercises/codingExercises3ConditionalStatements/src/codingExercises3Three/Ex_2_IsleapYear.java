package codingExercises3Three;

public class Ex_2_IsleapYear {
    public boolean isLeapYear(int year) {
    	if (year > 0) {
	    	if (year%400 == 0){
				return true;
			} else {
				if (year%4 == 0 && year%100 != 0){
		    		return true;
		    	}
			}
    	}
    	return false;
    }
}
