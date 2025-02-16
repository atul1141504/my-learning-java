package java7_JavaExceptionHandling;

public class L5_2_RuntimeException {

	public static void main(String[] args) {
		/*	Method: add1() is created to add the amount in different currencies
		 *  		It ignores currencies & adds amount.
		 */
		Amount amt1 = new Amount("INR",86);
		Amount amt2 = new Amount("USD",3);
		
		System.out.println("Sum of Amount in different currencies: Without Exception Handling..");
		amt1.add1(amt2);
		System.out.println(amt1);
		
		/*	Method: add2()is created to handle Runtime exception
		 * 			> restrict addition of amount in different currencies
		 * 			> provide exception details
		 */
		
		System.out.println("Sum of Amount in different currencies: With RuntimeException Handling..");
		amt1.add2(amt2);
		System.out.println(amt1);
	}

}
