package codingExercises8JavaCollections;

public class Ex1_AnagramCheckerRunner {

	public static void main(String[] args) {
		String str1 = "cinema";
		String str2 = "iceman";
		//str1 = str2 = "";
		//str1="a";
		//str2="b";
		Ex1_AnagramCheckerMethodA anagramChecker = new Ex1_AnagramCheckerMethodA();
		if(anagramChecker.areAnagrams(str1, str2)) {
			System.out.println("MethodA==>Strings are Anagram!");
		}else {
			System.out.println("MethodA==>Strings are not Anagram!");
		}
		
		Ex1_AnagramCheckerMethodB anagramCheckerB = new Ex1_AnagramCheckerMethodB();
		if(anagramCheckerB.areAnagrams(str1, str2)) {
			System.out.println("MethodB==>Strings are Anagram!");
		}else {
			System.out.println("MethodB==>Strings are not Anagram!");
		}
	}

}
