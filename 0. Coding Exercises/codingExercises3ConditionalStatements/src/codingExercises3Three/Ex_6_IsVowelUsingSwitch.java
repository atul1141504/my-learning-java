package codingExercises3Three;

public class Ex_6_IsVowelUsingSwitch {
    // Method to determine if a character is a vowel
    public boolean isVowel(char ch) {
        // Use a switch statement to check for each vowel, both lowercase and uppercase
        switch (ch) {
        case 'a':
        case 'A':
        case 'e':
        case 'E':
        case 'i':
        case 'I':
        case 'o':
        case 'O':
        case 'u':
        case 'U':
        	return true;
        }
        return false;
    }
    
    public boolean isVowelMethod2(char ch) {
        // Use a switch statement to check for each vowel, both lowercase and uppercase
        switch (ch) {
        case 'a','e','i','o','u':
        case 'A','E','I','O','U':
        	return true;
        }
        return false;
    }
}
