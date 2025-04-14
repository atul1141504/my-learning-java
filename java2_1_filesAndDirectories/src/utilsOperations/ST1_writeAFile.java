package utilsOperations;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ST1_writeAFile {

	public static void main(String[] args) {
		// Writing Text File also Exception Handling
		try {
			FileWriter Writer = new FileWriter("myfile.txt");

			// Writing File
			Writer.write("Files in Java are seriously good!!");
			
			/*
			 * Object moreContent = new ArrayList<String>();
			 * moreContent..add("Hello Atul!"); moreContent1; Writer.Write(moreContent);
			 * Writer.close();
			 */

			System.out.println("Successfully written.");
		}

		// Exception Thrown
		catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}

}
