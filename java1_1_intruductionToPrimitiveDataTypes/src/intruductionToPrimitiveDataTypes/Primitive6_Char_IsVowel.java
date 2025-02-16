package intruductionToPrimitiveDataTypes;

public class Primitive6_Char_IsVowel {
	
	private char ch;
	public Primitive6_Char_IsVowel(char ch) {
		this.setCh(ch);
	}
	public char getCh() {
		return ch;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}
	public boolean isVowel() {
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
			ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
			return true;
		}
		return false;
	}
	public boolean isDigit() {
		if (ch >= 48 && ch<=57) {
			return true;
		}
		return false;
	}
	public boolean isAlphabet() {
		if ((ch>=97 && ch<=122) || (ch>=65 && ch<=90)) {
			return true;
		}
		return false;
	}
	public char printLowerCaseAlphabets() {
		if (ch>=97 && ch<=122) {
			return ch;
		}
		return (char) -1;
	}
	public char printUpperCaseAlphabets() {
		if (ch>=65 && ch<=90) {
			return ch;
		}
		return (char) -1;
	}
	public boolean isConsonent() {
		if ( isAlphabet() && !isVowel() ) {
			return true;
		}
		return false;
	}
	public char printAllUpperCaseAlphabets() {
		for (ch='A';ch<='Z';ch++) {
			System.out.printf("%c",ch);
		}
		return (char) -1;
	}
	public char printAllLowerCaseAlphabets() {
		for (ch='a';ch<='z';ch++) {
			System.out.printf("%c",ch);
		}
		return (char) -1;
	}
}
