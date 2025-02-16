package java7_JavaExceptionHandling;

public class L1_2_NullPointerException {

	public static void main(String[] args) {
		/* This will call Method-1 which further calls Method-2
		 * In Method-2,NullPointerException occurs. 
		 * Therefore due to the exception rest of the code will not be executed
		 * 
		 */
		method1();
		System.out.println("Main Completed!");

	}

	private static void method1() {
		method2();
		System.out.println("Method-1 Completed!");
	}

	@SuppressWarnings("null")
	private static void method2() {
		String str = null;
		str.length();
		System.out.println("Method-2 Completed!");
	}

}
