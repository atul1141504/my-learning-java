package java3_ObjectOrientedProgramming2_JavaInterface;

//Interface declaration: by first user  
interface PrintableB {
	void print();
}

//Interface Inheritance: by second user  
interface ShowableB extends PrintableB {
	void show();
}

//Implementation: by third user 
class TestInterface4 implements ShowableB {
	
	/* Note: SInce ShowableB interface is created by extending PrintableB,
	 *       Inherited Abstract Methods from both Interfaces must be implemented.
	 *       else it will throw error
	 */
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}
}

//Using interface: by end users  
public class L4_InterfaceInheritance {
	public static void main(String[] args) {
		TestInterface4 obj = new TestInterface4();
		obj.print();
		obj.show();
	}
}