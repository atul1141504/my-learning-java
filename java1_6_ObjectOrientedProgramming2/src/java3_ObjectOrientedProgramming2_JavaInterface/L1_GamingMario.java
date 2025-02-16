package java3_ObjectOrientedProgramming2_JavaInterface;

public class L1_GamingMario implements L1_GamingConsole{
	
	/*Unimplemented methods has been inherited to this class:
	 * 	==> keyFunctionUP(),keyFunctionDown(),
	 *  ==> keyFunctionLeft(),keyFunctionRight()
	*/
	
	@Override
	public void keyFunctionUP() {
		System.out.println("\t\tJump..");
		
	}

	@Override
	public void keyFunctionDown() {
		System.out.println("\t\tEnter into the hole..");
		
	}

	@Override
	public void keyFunctionRight() {
		System.out.println("\t\tMove forward..");
		
	}

	@Override
	public void keyFunctionLeft() {
		System.out.println("\t\tMove backward..");
		
	}

    //Override Static Method
	static void staticMethod(int num) {
		//interfaceFunction = "Static Method triggered!";
		System.out.println("\tStatic Method triggered! =>"+(num*num*num*num));
	}
	
	//The constant can be accessed & returned along with class String representation
	public String toString() {
		return String.format("Return String Constant from Interface accessed in another class:%s",interfaceFunction);
	}
}
