package api.g.textBlocks;

public class TextBlocksRunner {

	public static void main(String[] args) {
		/* It simplifies the text representation
		 * Text blocks starts & ends with 3 double quotes.
		 * after starts with 3 double quotes, the actual text must be starting in a new line
		 * 
		 */
		System.out.println("Printing a text without using Text Blocks!!");
		System.out.println("Line-1\n  \"Line-2\"\n  'Line-3'\n\tLine-4\nLine-5\nEnd-Of-Text");
		
		System.out.println("\nPrinting a text using Text Blocks!!");
		String text = """
				Line-1
				  "Line-2"
				  'Line-3'
					Line-4
				Line-5
				End-Of-Text""";
		System.out.println(text);
		
		String textBlock = """
				Hi %s,
				
					Welcome to the world of Text Blocks'
					It was introduced in Java-%d.
				
				Thankyou!
				""".formatted("Atul",15);
		System.out.println(textBlock);
	}

}
