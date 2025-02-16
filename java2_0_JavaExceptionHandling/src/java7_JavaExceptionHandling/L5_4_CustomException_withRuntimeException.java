package java7_JavaExceptionHandling;

public class L5_4_CustomException_withRuntimeException {

	public static void main(String[] args) {
		System.out.println("Method-main started & calling Method-2>>");
		method2();
		
		System.out.println("Method-main completed >>");
	}

	private static void method1(){
		System.out.println("Method-1 started >>");
		
		Amount amt1 = new Amount("INR",86);
		Amount amt2 = new Amount("INR",3);
		Amount amt3 = new Amount("USD",3);
		
		System.out.println("Sum of Amount: Matching Currencies..");
		amt1.add5(amt2);
		System.out.println(amt1);
		
		System.out.println("Sum of Amount: Different currencies with RuntimeException Handling..");
		amt1.add5(amt3);
		System.out.println(amt1);
		
		System.out.println("Method-1 started >>");
	}
	
	private static void method2() {
		System.out.println("Method-2 started & calling Method-1 >>");
		method1();
		System.out.println("Method-2 completed >>");
	}

}
