package java7_JavaExceptionHandling;

public class L5_1_AmountClass {

}

class Amount{
	private String currency;
	private int amount;
	
	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	
	/*	Method: add1() is created to add the amount in different currencies
	 *  		It ignores currencies & adds amount.
	 */
	public void add1(Amount that) {
		this.amount = this.amount + that.amount;
	}
	
	/*	Method: add2()is created to handle Runtime exception
	 * 			> restrict addition of amount in different currencies
	 * 			> provide exception details
	 */
	public void add2(Amount that) {
		if(this.currency!=that.currency) {
			throw new RuntimeException("Currencies " + this.currency + " & " 
										+ that.currency + " do not match");
		}
		this.amount = this.amount + that.amount;
	}
	
	/* 	Method: add3()is created to handle Checked exception
	 * 			> By adding Throws Exception in the method signature
	 * 			> When we add the "throws Exception" in method signature,
	 * 			  it also informs calling/main method about the risk of exceptions
	 * 			> Thus, calling/main methods also need to handle it in its method signature
	 * 			> But in large application try-catch block is preferred to handle the exception
	 * 			  Take a look into Method-2 where try-catch block is used
	 */
	
	public void add3(Amount that) throws Exception {
		if(this.currency!=that.currency) {
			throw new Exception("Currencies " + this.currency + " & " 
										+ that.currency + " do not match");
		}
		this.amount = this.amount + that.amount;
	}
	
	/*	This is a Custom Exception handling which extends Exception interface
	 * 	Therefore this needs an explicit exception Handling using any of the below:
	 * 		like - "throws Exception in Method Signature" or try-catch block
	 */
	@SuppressWarnings("serial")
	class CustomCurrencyDoNotMatchException extends Exception{
		public CustomCurrencyDoNotMatchException(String msg) {
			super(msg);
		}
	}
	
	public void add4(Amount that) throws CustomCurrencyDoNotMatchException {
		if(this.currency!=that.currency) {
			throw new CustomCurrencyDoNotMatchException("Currencies " + this.currency + " & " 
										+ that.currency + " do not match");
		}
		this.amount = this.amount + that.amount;
	}
	
	/*	This is a Custom Exception handling which extends RuntimeException interface
	 * 	Therefore this is not required explicit exception Handling:
	 * 		like - "throws Exception in Method Signature" or try-catch block
	 */
	@SuppressWarnings("serial")
	class CustomCurrencyDoNotMatchRuntimeException extends RuntimeException{
		public CustomCurrencyDoNotMatchRuntimeException(String msg) {
			super(msg);
		}
	}
	
	public void add5(Amount that) {
		if(this.currency!=that.currency) {
			throw new CustomCurrencyDoNotMatchRuntimeException("Currencies " + this.currency + " & " 
										+ that.currency + " do not match");
		}
		this.amount = this.amount + that.amount;
	}

	public String toString(){
		return this.amount+this.currency;
	}
	
}