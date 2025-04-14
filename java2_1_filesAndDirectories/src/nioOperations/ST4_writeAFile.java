package nioOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ST4_writeAFile {

	public static void main(String[] args) throws IOException {
		//AT this path we want to create a new file and write content in it
		Path pathOfFile = Paths.get("./resources/outputDataFile.txt"); 
		
		List<String> content = List.of(	"Apple","Banana","Cat","Dog","Disc","545661","844678");
		
		Files.write(pathOfFile, content);

	}

}
