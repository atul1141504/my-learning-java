package java7_JavaExceptionHandling;

public class L1_3_NullPointerExceptionResolution_TryCatch {

	public static void main(String[] args) {
		method1();
		System.out.println("Main Completed!");

	}

	private static void method1() {
		method2();
		System.out.println("Method-1 Completed!");
	}

	@SuppressWarnings("null")
	private static void method2() {
		/* try-catch is used to handle the different types of exceptions
		 * We can have multiple catch blocks handling multiple exception at a time.
		 * Exception specific catch block will be executed when an exception occurs
		 */
		try {
			String str = null;
			str.length();
		} catch (Exception ex) {
			/* printStackTrace: Prints the exception details 
			 * 					Also allows further code execution
			 * 
			 * If not given, it won't show exception details but run rest of the codes
			 * so it is recommended to use it
			 * 
			 * Since we have handled the exception, 
			 * 	calling methods will never know about the exception
			 */
			ex.printStackTrace();
			System.out.println("Statement: str.length(); Exception Handled!");
		}
		System.out.println("Method-2 Completed!");

	}
}
