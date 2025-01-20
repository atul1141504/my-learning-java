package codingExercises8JavaCollections;

public class Ex3_WordReverser {

    public String reverseWordsInSentence(String sentence) {
        // TODO: Check if the sentence is null.
        // If the sentence is null, return "INVALID"
        if(sentence==null){
            return "INVALID";
        }

        // TODO: Check if the sentence is empty.
        // If the sentence is empty, return an empty string
        if(sentence==""){
            return "";
        }

        // TODO: Split the sentence into words using the split method. 
        // Use " " as the delimiter to match space.
        String[] strArray = sentence.split(" ");

        // TODO: Create a StringBuilder to hold the reversed sentence.
        StringBuilder strBuilder = new StringBuilder("");
        // TODO: Loop through each word in the words array.
        int i=1;
        for(String string:strArray) {
            // TODO: For each word, create a StringBuilder and reverse the word.
            // Append the reversed word, followed by a space, to the reversed sentence.
    		while(i <= string.length()) {
    			strBuilder.append(string.charAt(string.length()-i));
    			i++;
    		}
    		strBuilder.append(" ");
    		i=1;
        }
        
        // TODO: After reversing all the words, trim the trailing space and return the reversed sentence.
        return strBuilder.toString().trim();
    }
}
