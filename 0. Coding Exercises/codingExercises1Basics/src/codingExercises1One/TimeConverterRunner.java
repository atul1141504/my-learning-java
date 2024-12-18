package codingExercises1One;

public class TimeConverterRunner {

	public static void main(String[] args) {
		//Create a new instance of the class > OBJECT
		TimeConverter timeInMinutes = new TimeConverter();
		
		int mins = timeInMinutes.convertHoursToMinutes(1);
		System.out.printf("convertHoursToMinutes: %d",mins).println();
		
		mins = timeInMinutes.convertDaysToMinutes(2);
		System.out.printf("convertDaysToMinutes : %d",mins).println();

	}

}
