package nioOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ST3_readContentOfFile {

	public static void main(String[] args) throws IOException {
		//from this path we want to read the files
		Path pathOfFile = Paths.get("./resources/inputDataFile.txt"); 
		
		/*	This returns the array of lines of entire file.
		 * 	This is useful only for the small files & inefficient for large files
		 */
		System.out.println("Printing content of file using Files.readAllLines API");
		List<String> linesOfFile = Files.readAllLines(pathOfFile);
		for(String line:linesOfFile) {
			System.out.println(line);
		}
		
		/*	Accessing file data line by line
		 * 	This is efficient for large files.
		 * 	It returns a stream of file lines & processes its content line by line
		 */
		System.out.println("\nPrinting content of file using Files.lines API");
		Files.lines(pathOfFile)
					.map(String::toLowerCase)		// Convert strings to lower case
					.filter(str->str.contains("a"))	// Filter lines which for char 'a'
					.forEach(System.out::println);	// Print lines that contains char 'a'

	}

}
