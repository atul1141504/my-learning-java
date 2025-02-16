package java7_JavaExceptionHandling;

import java.util.Scanner;

public class L3_1_ExceptionHandling_FinallyBlock {

	public static void main(String[] args) {
		System.out.println("Main Started..");
		
		method1();

		System.out.println("Main Completed!");

	}

	private static void method1() {
		System.out.println("Method-1 Started..");
		Scanner scanner = null;

		try {
			/*
			 * Scanner created to get user input It is important to close the scanner to
			 * avoid data leakage of the data or objects
			 */
			scanner = new Scanner(System.in);
			System.out.print("Please enter your name: ");
			String name = scanner.next();
			System.out.println("Hello " + name);
			
			method2();
			
			System.out.println("Returned to Method-1 from Method-2");
			
		} catch (NullPointerException ex) {
			ex.printStackTrace();
			System.out.println("Exception Handled: NullPointerException");
		} catch (IndexOutOfBoundsException ex) {
			ex.printStackTrace();
			System.out.println("Exception Handled: IndexOutOfBoundsException");
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Exception Handled");
		} finally {
			/*
			 * Note: This Block will always be executed irrespective of exception occurs or
			 * not Therefore we can do necessary tasks within this block Like: scanner
			 * close, file close etc.
			 */
			System.out.println("Finally Block triggerred!");
			if (scanner != null) {
				scanner.close();
				System.out.println("Scanner Closed");
			}
		}
		System.out.println("Method-1 Completed!");
	}

	private static void method2() {
		System.out.println("Method-2 Started..");
		
		int[] intArray = { 1, 2, 3, 4 };
		int element = intArray[5];
		System.out.println("element is: " + element);
		
		System.out.println("Method-2 Completed!");
	}

}
