package codingExercises8JavaCollections;

public class Ex2_HexStringChecker {

	public String str;

	public Ex2_HexStringChecker(String str) {
		this.str = str;
	}

	public boolean isHexadecimalChar(char ch) {
		return (ch >= 'a' && ch <= 'f' || ch >= 'A' && ch <= 'F');
	}

	public boolean isHexadecimal(String str) {

		if (str == null || str == "") {
			return false;
		}

		char[] charArray = str.toCharArray();

		for (char character : charArray) {

			if (!isHexadecimalChar(character) && !Character.isDigit(character)) {
				return false;
			}
		}
		return true;
	}
}
