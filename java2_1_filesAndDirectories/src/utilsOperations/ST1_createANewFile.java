package utilsOperations;

import java.io.File;
import java.io.IOException;

public class ST1_createANewFile {
	public static void main(String[] args) {
		// Creating the File also Handling Exception
		try {
			File Obj = new File("./resources/1.myFileCreated.txt");

			// Creating File
			if (Obj.createNewFile()) {
				System.out.println("File created: " + Obj.getName());
			} else {
				System.out.println("File already exists.");
			}
		}

		// Exception Thrown
		catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}
}
