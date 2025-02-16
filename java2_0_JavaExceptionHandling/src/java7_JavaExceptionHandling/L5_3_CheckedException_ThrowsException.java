package java7_JavaExceptionHandling;

/*	Checked Exceptions can be handled in 2 ways:
 * 		1. Using throws Exception in the method signature
 * 		2. Using the try-catch block
 */
public class L5_3_CheckedException_ThrowsException {

	public static void main(String[] args) throws Exception {
		System.out.println("Method-main started & calling Method-2>>");
		method2();
		
		System.out.println("Method-main running & calling Method-1>>");
		method1();
		
		System.out.println("Method-main completed >>");
	}

	private static void method1() throws Exception  {
		System.out.println("Method-1 started >>");
		
		/*	Method: add1() is created to add the amount in different currencies
		 *  It ignores currencies & adds amount.
		 */
		Amount amt1 = new Amount("INR",86);
		Amount amt2 = new Amount("USD",3);
		
		System.out.println("Sum of Amount in different currencies: Without Exception Handling..");
		amt1.add1(amt2);
		System.out.println(amt1);
		
		/* 	Method: add3()is created to handle Checked exception
		 * 			> By adding Throws Exception in the method signature
		 * 			> When we add the "throws Exception" in method signature,
		 * 			  it also informs calling/main method about the risk of exceptions
		 * 			> Thus, calling/main methods also need to handle it in its method signature
		 * 			> But in large application try-catch block is preferred to handle the exception
		 * 			  Take a look into Method-2 where try-catch block is used
		 */
		System.out.println("Sum of Amount in different currencies: With CheckedException Handling..");
		amt1.add3(amt2);
		System.out.println(amt1);
		
		System.out.println("Method-1 started >>");
	}

	private static void method2() {
		System.out.println("Method-2 started & calling Method-1 >>");
		
		/*	Handling exception using try-catch block 
		 * 	instead of using throws Exception in Method signature
		 */
		try{
			method1();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Method-1 terminated(not completed) due to exception");
			System.out.println("Method-2 will continue as exception is handled using try-catch block!");
		}
		
		System.out.println("Method-2 completed >>");
	}
	
}
