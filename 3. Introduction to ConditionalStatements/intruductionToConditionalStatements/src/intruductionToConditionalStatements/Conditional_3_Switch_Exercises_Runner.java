package intruductionToConditionalStatements;

import java.util.Scanner;

public class Conditional_3_Switch_Exercises_Runner {

	public static void main(String[] args) {
		Conditional_3_Switch_Exercises calender = new Conditional_3_Switch_Exercises();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Primary Menu -->");
		System.out.println("\t1-Determine Weekday");
		System.out.println("\t2-determine Month Name");
		System.out.println("\t3-Determine Day Name");
		System.out.print("Make a choice to proceed: ");
		int userPrimaryChoice = scanner.nextInt();
		
		
		switch(userPrimaryChoice) {
		case 1:
			System.out.println("1-Determine Weekday Selected!");
			System.out.print("\tKindly enter day number: ");
			int dayNumber = scanner.nextInt();
			if (calender.isWeekDay(dayNumber)){
				System.out.println("\tIts a weekday.");
			} else {
				System.out.println("\tHoho..! Its a weekend.");
			}
			break;
		case 2:
			System.out.println("2-Determine Month Name Selected!");
			System.out.print("\tKindly enter month number: ");
			int monthNumber = scanner.nextInt();
			System.out.println("\tMonth: "+calender.determineNameOfMonth(monthNumber));
			break;
		case 3:
			System.out.println("3-Determine Day Name Selected!");
			System.out.print("\tKindly enter day number: ");
			int dayOfTheWeek = scanner.nextInt();
			System.out.println("\tMonth: "+calender.determineNameOfDay(dayOfTheWeek));
			break;
		default:
			break;
		}
		
		//close scanner
		scanner.close();
	}

}
