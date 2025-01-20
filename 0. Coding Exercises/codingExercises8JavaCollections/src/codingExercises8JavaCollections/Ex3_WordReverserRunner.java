package codingExercises8JavaCollections;

public class Ex3_WordReverserRunner {

	public static void main(String[] args) {
		Ex3_WordReverser revWordOfSentence = new Ex3_WordReverser();
		String sentence = "Hey.. the world is so beautiful!!";
		System.out.println("Reverse a sentence  ==> "
								+revWordOfSentence.reverseWordsInSentence(sentence));
		
		System.out.println("Reverse null  string==> "+revWordOfSentence.reverseWordsInSentence(null));
		
		System.out.println("Reverse empty string==> "+revWordOfSentence.reverseWordsInSentence(""));

	}

}
