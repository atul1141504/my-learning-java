package java7_JavaExceptionHandling;

public class L2_1_IndexOutOfBoundsExceptionResolution {

	public static void main(String[] args) {
		method1();
		System.out.println("Main Completed!");
	}
	
	private static void method1() {
		method2();
		System.out.println("Method-1 Completed!");
	}

	private static void method2() {
		/* try-catch is used to handle the different types of exceptions
		 * We can have multiple try-catch blocks handling multiple exception at a time.
		 * Exception specific catch block will be executed when an exception occurs
		 */
		try {
			
			int[] intArray = {1,2,3};
			int element = intArray[4];
			System.out.println("element is: "+element);
			System.out.println("Method-2 Completed!");
			
		}catch (NullPointerException ex) {
			/* This block is specific to the NullPointerException
			 * So when it occurs this block will be executed!!
			 * 
			 * printStackTrace: Prints the exception details 
			 * 					Also allows further code execution
			 * 
			 * If not given, it won't show exception details but run rest of the codes
			 * so it is recommended to use it
			 * 
			 * Since we have handled the exception, 
			 * 	calling methods will never know about the exception
			 */
			ex.printStackTrace();
			System.out.println("Exception Handled: NullPointerException");
		}catch (IndexOutOfBoundsException ex) {
			/* This block is specific to the IndexOutOfBoundsException
			 * So when it occurs this block will be executed!!
			 */
			ex.printStackTrace();
			System.out.println("Exception Handled: IndexOutOfBoundsException");
		}catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
