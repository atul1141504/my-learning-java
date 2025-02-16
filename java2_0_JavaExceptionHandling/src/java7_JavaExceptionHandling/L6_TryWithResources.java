package java7_JavaExceptionHandling;

import java.util.Scanner;

public class L6_TryWithResources {

	public static void main(String[] args) {
		//Scanner scanner = null;
		/*	Try With Resources
		 * 	This will automatically close the resources when any exception occurs
		 * 	In this case, finally & other catch blocks are not mandatory
		 */
		try (Scanner scanner = new Scanner(System.in)){
			System.out.print("Please enter your name: ");
			String name = scanner.next();
			System.out.println("Hello "+name);
			
			int[] intArray = { 1, 2, 3, 4 };
			int element = intArray[5];
			System.out.println("element is: "+element);
			
		} catch (IndexOutOfBoundsException ex) {
			ex.printStackTrace();
			System.out.println("Exception Handled: IndexOutOfBoundsException");
		} catch (NullPointerException ex) {
			ex.printStackTrace();
			System.out.println("Exception Handled: NullPointerException");
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Exception Handled");
		}finally {
			/* Note: This Block will always be executed irrespective of exception occurs or not
			 * Therefore we can do necessary tasks within this block
			 * Like: scanner close, file close etc.
			 * 
			 * Since Scanner class implements Closable which extends AutoCloseable
			 * AutoCloseable has a method close() which closes the resource if exceptions occurs
			 * 
			 * So any class which is auto-closeable can be used as the try resource for auto closure. 
			 */
			System.out.println("Finally Block triggered!");
		}
		
		System.out.println("Main Completed!");

	}

}
