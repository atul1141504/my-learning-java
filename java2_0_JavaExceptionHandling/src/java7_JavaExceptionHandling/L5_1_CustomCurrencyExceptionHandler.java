package java7_JavaExceptionHandling;

public class L5_1_CustomCurrencyExceptionHandler {

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