package java7_JavaExceptionHandling;

public class L5_2_AddAmountWithoutCurrencyCheck {

	public static void main(String[] args) {
		/*	Method: add1() is created to add the amount in different currencies
		 *  		It ignores currencies & adds amount.
		 */
		Amount amt1 = new Amount("INR",86);
		Amount amt2 = new Amount("USD",3);
		Amount amt3 = new Amount("INR",3);
		
		System.out.println("Method add1()=> Sum of Amounts: Matching Currencies..");
		amt1.add1(amt3);
		System.out.println(amt1);
		
		System.out.println("Method add1()=> Sum of Amounts: Different Currencies..");
		amt1.add1(amt2);
		System.out.println(amt1);

	}

}
