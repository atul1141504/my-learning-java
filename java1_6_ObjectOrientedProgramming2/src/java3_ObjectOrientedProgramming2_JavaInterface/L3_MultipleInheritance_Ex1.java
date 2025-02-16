package java3_ObjectOrientedProgramming2_JavaInterface;

//Interface declaration: by first user  
interface PrintableA {
	void print();
}

//Interface declaration: by first user  
interface Showable {
	void show();
}

//Implementation: by second user  
//Both Interfaces has been inherited ==> Multiple Inheritance 
class A7 implements PrintableA, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}
}

//Using interface: by third user  
public class L3_MultipleInheritance_Ex1 {
	public static void main(String args[]) {
		A7 obj = new A7();
		obj.print();
		obj.show();
	}
}
