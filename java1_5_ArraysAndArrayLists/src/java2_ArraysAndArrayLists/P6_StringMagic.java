package java2_ArraysAndArrayLists;

public class P6_StringMagic {
    /**
     * This method finds the longest word in a given sentence.
     *
     * @param sentence The sentence to find the longest word in.
     * @return The longest word in the sentence. If sentence is empty, return an empty string.
     */
    public String findLongestWord(String sentence) {
        
    	if(sentence==""){
            return "";
        }
        
        String[] words = sentence.split(" ");
        
        String temp = "";
        
        for(String word:words){
            if( word.length() > temp.length() ){
                temp = word;
            }
        }
        return temp;
    }
}
