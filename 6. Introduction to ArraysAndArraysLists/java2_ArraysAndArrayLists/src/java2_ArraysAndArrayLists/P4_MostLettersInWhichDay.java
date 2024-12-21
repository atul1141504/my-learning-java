package java2_ArraysAndArrayLists;

import java.util.Arrays;

public class P4_MostLettersInWhichDay {

	public static void main(String[] args) {
		String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		System.out.println("most  characters are in "+mostCharacters(days));
		System.out.println("least characters are in "+Arrays.toString(leastCharacters(days)));

	}
	
	//Method is declared to accept Variable Arguments.
	private static String mostCharacters(String... days){
		String dayWithMostCharacters = "";
		for(String day:days) {
			if(day.length()>dayWithMostCharacters.length())
				dayWithMostCharacters = day;
		}
		return dayWithMostCharacters;
	}
	
	private static String[] leastCharacters(String... days){
		String[] dayWithLeastCharacters = new String[days.length];
		String dayCharacters = days[0];
		int i = 0;
		for(String day:days) {
			if(day.length() <= dayCharacters.length()){
				dayWithLeastCharacters[i] = day;
				//dayWithLeastCharacters = day;
				i++;
			}
		}
		String[] dayWithLeastCharactersNew = new String[i];
		for(int j = 0;j<i;j++) {
			dayWithLeastCharactersNew[j] = dayWithLeastCharacters[j];
		}
		return dayWithLeastCharactersNew;
	}

}
