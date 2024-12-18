package codingExercises1One;

public class TimeConverter {
    public int convertHoursToMinutes(int hours) {
    	if(hours < 0) {
    		return -1;
        } else {
            if(hours == 0) {
                return 0;
            }
        }
    	int minsInHours = hours*60;
    	return minsInHours;
    }
    
    public int convertDaysToMinutes(int days) {
    	if(days < 0) {
    		return -1;
        } else {
            if(days == 0) {
                return 0;
            }
        }
    	int minsIndays = days*24*60;
    	return minsIndays;
    }
}