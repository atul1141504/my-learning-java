package codingExercises3Three;

import java.util.Scanner;

public class Ex_5_WeatherAdvisoryRunner {

	public static void main(String[] args) {
		//create object for System Scanner class to get user input
		Scanner scanner = new Scanner(System.in);

		System.out.println("Weather Advisory Utility -->");
		System.out.printf("\tPlease enter surrounding temp.: ");
		int userInput = scanner.nextInt();

		
		//Create object for Grade checker class
		Ex_5_WeatherAdvisory weatherAdvisory = new Ex_5_WeatherAdvisory(userInput);
		System.out.println("\t"+weatherAdvisory.provideWeatherAdvisory());

		//close system scanner
		scanner.close();
	}

}
