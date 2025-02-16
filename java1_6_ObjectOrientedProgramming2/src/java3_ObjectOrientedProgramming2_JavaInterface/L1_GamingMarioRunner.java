package java3_ObjectOrientedProgramming2_JavaInterface;

public class L1_GamingMarioRunner {
	public static void main(String[] args) {
		L1_GamingMario mario = new L1_GamingMario();

		// Default & Abstract functions can be directly accessed
		mario.gameFunction();
		mario.keyFunctionUP();

		// calling Static Method from interface
		System.out.println("\nCalling Static Method from Runner..");
		L1_GamingConsole.staticMethod(2);
		System.out.println("\nCalling Overriden Static Method from Runner..");
		L1_GamingMario.staticMethod(2);
		//mario.staticMethod(2);
		
		System.out.println();
		System.out.println(mario.toString());
	}
}
