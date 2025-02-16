package java7_JavaExceptionHandling;

public class L1_1_NullPointerException {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String str = null;
		str.length();
		
		/* The above will throw below Exception & will not run the rest of the code.
		 * 	Exception in thread "main" java.lang.NullPointerException: 
		 * 					Cannot invoke "String.length()" because "str" is null
		**	at java7_JavaExceptionHandling/java7_JavaExceptionHandling
		*				.L1_1_NullPointerException.main(L1_1_NullPointerException.java:7)
		*
		*/
		
		//This will not be executed due to the above Exception
		System.out.println("Main Completed!");

	}

}
