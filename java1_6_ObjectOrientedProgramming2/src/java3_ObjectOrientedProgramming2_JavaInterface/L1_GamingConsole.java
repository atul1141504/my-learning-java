package java3_ObjectOrientedProgramming2_JavaInterface;

public interface L1_GamingConsole {
	/*A field can be created as a constant only. Its value can't be changed at a later stage.
	**A variable can't be created. Example=> String interfaceFunction;
	*/
	String interfaceFunction = "Gaming console operations triggered..";
	
	//Interfaces can't have constructors
	// ==> public default L1_GamingConsole(String abc) {};
	
	//This is a default method created with implementation
	public default void gameFunction() {
		System.out.println(interfaceFunction);
		System.out.println("\tDefault Method triggered!");
		
		keyFunctionUP();
		keyFunctionDown();
		keyFunctionLeft();
		keyFunctionRight();
		staticMethod(3);
	}

	//this is a static method, created with implementation
	static void staticMethod(int num) {
		//interfaceFunction = "Static Method triggered!";
		System.out.println("\tStatic Method triggered! =>"+(num*num));
	}
	
	//Below are the Abstract Methods.
	public void keyFunctionUP();

	public void keyFunctionDown();

	public void keyFunctionRight();

	public void keyFunctionLeft();
	
}
