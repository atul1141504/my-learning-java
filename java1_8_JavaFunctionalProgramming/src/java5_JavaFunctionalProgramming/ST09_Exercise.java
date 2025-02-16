package java5_JavaFunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ST09_Exercise {

	public static void main(String[] args) {
		// Print Squares of 1st upTo numbers
		getSquaresUpto(15);

		// Converts elements of a list to the Lower & Upper case
		List<String> strList = List.of("Apple", "Ant", "Bat", "Orange");
		convToLowerCase(strList);
		convToUpperCase(strList);

		// Print length of each elements
		getLengthOfElements(strList);
	}

	static void getSquaresUpto(int upTo) {
		List<Integer> squareListUpTo = new ArrayList<>();
		upTo++;
		IntStream.range(1, upTo) // Boundary is Exclusive =>
				.map(e -> e * e).forEach(e -> squareListUpTo.add(e));
		System.out.println("1. Squares of numbers upto " + upTo + " ==>" + squareListUpTo.toString());
	}

	static void convToLowerCase(List<String> list) {
		List<String> lowerCaseList = new ArrayList<>();
		list.stream().map(e -> e.toLowerCase()).forEach(e -> lowerCaseList.add(e));
		System.out.println("2. String List: Input ....==>" + list.toString());
		System.out.println("2. String List: lower case==>" + lowerCaseList.toString());
	}

	static void convToUpperCase(List<String> list) {
		List<String> upperCaseList = new ArrayList<>();
		list.stream().map(e -> e.toUpperCase()).forEach(e -> upperCaseList.add(e));
		System.out.println("2. String List: upper case==>" + upperCaseList.toString());
	}

	static void getLengthOfElements(List<String> list) {
		List<String> lengthOfElements = new ArrayList<>();
		list.stream().forEach(e -> lengthOfElements.add(e + ":" + e.length()));
		System.out.println("3. String List: length Of Elements==>" + lengthOfElements.toString());
	}

}
