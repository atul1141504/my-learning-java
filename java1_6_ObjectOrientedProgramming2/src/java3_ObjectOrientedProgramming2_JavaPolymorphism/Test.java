package java3_ObjectOrientedProgramming2_JavaPolymorphism;

class A{
	void print() {
		System.out.println("Class A");
	}
}

class B extends A{
	void print() {
		System.out.println("Class B");
	}
}
public class Test {

	public static void main(String[] args) {
		B b = new B();
		b.print();
		
		A a = b;
		a.print();
		Object o = b;
		
		System.out.println(b instanceof B);
		System.out.println(a instanceof B);
		System.out.println(o instanceof B);
		
		System.out.println(b instanceof A);
	}

}
