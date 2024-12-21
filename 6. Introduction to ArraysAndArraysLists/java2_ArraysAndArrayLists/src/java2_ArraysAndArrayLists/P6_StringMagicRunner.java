package java2_ArraysAndArrayLists;

public class P6_StringMagicRunner {

	public static void main(String[] args) {
		P6_StringMagic longestString = new P6_StringMagic();
		String sentence = "A quick brown fox jumps over the lazy dog";
		System.out.println("Longest word in the sentence: "+longestString.findLongestWord(sentence));

		sentence = "Java is an object oriented programming language";
		System.out.println("Longest word in the sentence: "+longestString.findLongestWord(sentence));
		
	}

}
