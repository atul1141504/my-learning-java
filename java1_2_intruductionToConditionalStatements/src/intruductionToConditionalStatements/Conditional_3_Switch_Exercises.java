package intruductionToConditionalStatements;

public class Conditional_3_Switch_Exercises {

	public boolean isWeekDay(int dayNumber) {
		switch (dayNumber){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				return true;
			case 6:
			case 7:
			default:
			return false;
		}
		
	}

	public String determineNameOfMonth(int monthNumber) {
		switch (monthNumber){
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "Invalid user input!";
		}
	}

	public String determineNameOfDay(int dayOfTheWeek) {
		switch (dayOfTheWeek){
		case 1:
			return "You are looking for Monday!";
		case 2:
			return "You are looking for Tuesday!";
		case 3:
			return "You are looking for Wednesday!";
		case 4:
			return "You are looking for Thursday!";
		case 5:
			return "You are looking for Friday!";
		case 6:
			return "You are looking for Saturday!";
		case 7:
			return "You are looking for Sunday!";
		default:
			return "Invalid user input!";
		}
	}

}
