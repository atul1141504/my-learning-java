package java7_JavaExceptionHandling;

import java.util.Scanner;

public class L4_AllExceptionsInOneExample {

	public static void main(String[] args) {
		method1();
		System.out.println("Main Completed!");
	}
	
	private static void method1() {
		method2();
		System.out.println("Method-1 Completed!");
	}

	@SuppressWarnings({ "null" })
	private static void method2() {
		Scanner scanner = null;
		
		try {
			//create an instance of scanner to get user input
			scanner = new Scanner(System.in);
			System.out.println("Enter your name: ");
			String name = scanner.next();
			System.out.println("Hello " + name + "! This is demo for the Exception Handling..");
			
			//Below Piece of code will generate IndexOutOfBoundsException
			int[] intArray = {1,2,3};
			int element = intArray[4];
			System.out.println("element is: "+element);
			
			//Below Piece of code will generate NullPointerException
			String str = null;
			System.out.println("Length of string is " + str.length());
			
		}catch (NullPointerException ex) {
			ex.printStackTrace();
			System.out.println("Exception Handled: NullPointerException");
		}catch (IndexOutOfBoundsException ex) {
			ex.printStackTrace();
			System.out.println("Exception Handled: IndexOutOfBoundsException");
		}catch (Exception ex) {
			ex.printStackTrace();
		}finally {
			/* Note: This Block will always be executed irrespective of exception occurs or not
			 * Therefore we can do necessary tasks within this block
			 * Like: scanner close, file close etc.
			 */
			System.out.println("Finally Block triggerred!");
			if(scanner!=null) {
				scanner.close();
				System.out.println("Scanner Closed");
			}
		}
		
		System.out.println("Method-2 Completed!");
		
	}
}

