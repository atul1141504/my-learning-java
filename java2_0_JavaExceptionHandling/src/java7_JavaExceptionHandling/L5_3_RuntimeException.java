package java7_JavaExceptionHandling;

public class L5_3_RuntimeException {

	public static void main(String[] args) {
		Amount amt1 = new Amount("INR",86);
		Amount amt2 = new Amount("INR",3);
		Amount amt3 = new Amount("USD",3);
		
		/*	Method: add2()is created to handle Runtime exception
		 * 	> restrict addition of amount in different currencies
		 * 	> provide exception details
		 */
		
		System.out.println("Method add2()=> Sum of Amounts: Matching Currencies..");
		amt1.add2(amt2);
		System.out.println(amt1);
		
		System.out.println("Method add2()=> Sum of Amounts: "
						+ "Different currencies with RuntimeException Handling..");
		amt1.add2(amt3);
		System.out.println(amt1);
	}

}
