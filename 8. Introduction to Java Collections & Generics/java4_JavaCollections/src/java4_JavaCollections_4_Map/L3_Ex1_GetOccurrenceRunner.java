package java4_JavaCollections_4_Map;

import java.util.HashMap;
import java.util.Map;

public class L3_Ex1_GetOccurrenceRunner {

	public static void main(String[] args) {
		/* Find a character is getting repeated how many times in a sentence.
		 * Find a word is getting repeated how many times in a sentence.
		 * 
		 */
	
		String str = "This is an owesome occassion. "
				+ "This has never happened before.";
		System.out.println("Input String==> "+str);
		
		System.out.print("Getting Occurrences of characters present in the Sentence:\n\t==>");
		Map<Character, Integer> charOccurencehashMap = new HashMap<>();
		
		//Creating an Character array
		char[] characters = str.toCharArray();
		
		//loop for character present in characters array
		for(char character:characters) {
			//check if a character is already present in the hashMap 
			Integer countOfCharacter = charOccurencehashMap.get(character);
			
			/*if null is returned => no character is found in the hash Map 
			 *						 & will be added as Key with Value 1
			 *
			 *If count>0 => key already present now increase the value by 1
			 *				(value represents count of the character)
			 */
			if (countOfCharacter==null) {
				charOccurencehashMap.put(character, 1);
			}else {
				charOccurencehashMap.put(character, countOfCharacter+1);
			}
		}
		
		System.out.println(charOccurencehashMap);
		
		//********************************************************************************
		System.out.print("Getting Occurrences of words present in the Sentence:\n\t==>");
		Map<String, Integer> wordOccurencehashMap = new HashMap<>();
		
		//Creating an Words array
		String[] words = str.split(" ");
		
		//loop for words present in characters array
		for(String word:words) {
			//check if a word is already present in the hashMap 
			Integer countOfWord = wordOccurencehashMap.get(word);
			
			/*if null is returned => word is not found in the hash Map 
			 *						 & will be added as Key with Value 1
			 *
			 *If count>0 => key already present now increase the value by 1
			 *				(value represents count of the character)
			 */
			if (countOfWord==null) {
				wordOccurencehashMap.put(word, 1);
			}else {
				wordOccurencehashMap.put(word, countOfWord+1);
			}
		}
		
		System.out.println(wordOccurencehashMap);
	}

}
