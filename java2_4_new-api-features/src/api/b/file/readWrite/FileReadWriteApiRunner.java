package api.b.file.readWrite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteApiRunner {

	public static void main(String[] args) throws IOException {
		/* 1. Create Path variable for the file
		 * 2. Read the file into a fileContent variable
		 * 3. Print the content of the file
		 * 4. Update & Write updated content in the file--> A_SourceFile.txt
		 * 5. Write original content in a new file		--> B_OutputFile.txt
		 * 6. Write updated content in a new file		--> C_OutputFile.txt
		 */
		Path path = Paths.get("./src/api/b/resources/A_SourceFile.txt");
		String fileContent = Files.readString(path);
		System.out.println(fileContent);
		
		String updatedFileContent = fileContent.replace("Line Data - 1", "Start-Of-File");
		Files.writeString(path, updatedFileContent);
		
		Path newFilePathA = Paths.get("./src/api/b/resources/B_OutputFile.txt");
		Files.writeString(newFilePathA, fileContent);
		
		Path newFilePathB = Paths.get("./src/api/b/resources/C_OutputFile.txt");
		Files.writeString(newFilePathB, updatedFileContent);
		

	}

}
