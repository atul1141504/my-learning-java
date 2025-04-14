package api.d.stringApiFeatures;

public class StringApiRunner {

	public static void main(String[] args) {
		/* new Features in String APIs
		 * 1. isBlank() - Checks if the string is blank or not
		 * 2. strip() - removes leading & trailing spaces
		 * 3. stripLeading() - removes leading spaces only
		 * 4. stripTrailing() - removes trailing spaces only
		 * 5. splitting lines
		 * 6. transform - to format the string as per requirement
		 * 7. formatted - formats string based on the passed arguments 
		 */
		
		System.out.println(" ".isBlank());
		System.out.println("_".isBlank());
		System.out.println("  AB c   ".strip().replace(" ", "@"));
		System.out.println("  AB c   ".stripLeading().replace(" ", "@"));
		System.out.println("  AB c   ".stripTrailing().replace(" ", "@"));
		
		"Line1\nLine2\nLine3\nLine4\nLine3".lines().forEach(System.out::println);
		
		System.out.println("ABCDEFGH".transform(s->s.toLowerCase()));
		System.out.println("My name is %s & my age is %d".formatted("Atul",30));
		
	}

}
