package java3_ObjectOrientedProgramming2_JavaInterface;

//Interface Class
interface printable {
	void print();
}

//Class Inherits Interface class
class InterfaceExample implements printable {
	public void print() {
		System.out.println("Hello");
	}
}

//Runner Class
public class L2_InterfaceExample1 {
	public static void main(String args[]) {
		InterfaceExample obj = new InterfaceExample();
		obj.print();
	}
}
