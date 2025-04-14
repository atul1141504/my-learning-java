package nioOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/*	How to search a file/folder in a directory
 * 	created a folder called - 'resources' where we will add or access the files
 * 	to refer the current directory use dot(.) 
 */
public class ST1n2_listFilesAndFoldersInDirectoriesAndFilter {

	public static void main(String[] args) throws IOException {
		//	Step-1: List the content of the current directory
		Path currentDirectoryPath = Paths.get("."); //get path of current directory
		
		/*	list returns a stream of files. 
		 * 	therefore, all the concepts of stream() API are applicable
		 */
		System.out.println("List the content of current directory");
		Files.list(currentDirectoryPath).forEach(System.out::println);
		
		/*	Step2 - print the whole hierarchy of a path (parent & child folders/files)
		 * 	We can also specify up to which level we need to list the folder/files
		 * 
		 * 	API used = walk(path,upToLevel)
		 */
		System.out.println("\nList the content of current directory upto 4 levels deep");
		Files.walk(currentDirectoryPath,4).forEach(System.out::println);
		
		/*	Filter the files/folder
		 * 	method-1 : using Predicate
		 * 			   This provides only one filter option => path
		 * 	method-2 : using BiPredicate (it uses Find API with matcher)
		 * 			   This provides two filter options => path & attributes
		 * 			   Attributes like - isDirectory(), size(), creationTime()
		 * 				lastAccessTime(), lastAccessTime() etc.
		 */
		System.out.println("\nList the filtered content(.java) of current directory upto 4 levels deep");
		System.out.println("Filter using Predicate");
		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
		Files.walk(currentDirectoryPath,4)
					.filter(predicate)
					.forEach(System.out::println);
		
		System.out.println("\nFilter using Find API & java matcher");
		BiPredicate<Path, BasicFileAttributes> matcher
							= (path,attribute) -> String.valueOf(path).contains(".java");
		Files.find(currentDirectoryPath, 4, matcher)
					.forEach(System.out::println);
		
		System.out.println("\nFilter using Find API & java attriutes");
		BiPredicate<Path, BasicFileAttributes> javaDirectories
							= (path,attributes) -> attributes.isDirectory();
		Files.find(currentDirectoryPath, 4, javaDirectories)
					.forEach(System.out::println);
		
	}

}
