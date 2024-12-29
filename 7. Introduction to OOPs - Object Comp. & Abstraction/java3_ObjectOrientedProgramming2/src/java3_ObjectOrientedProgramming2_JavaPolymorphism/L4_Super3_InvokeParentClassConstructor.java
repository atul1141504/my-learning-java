package java3_ObjectOrientedProgramming2_JavaPolymorphism;

class Animal03 {
	Animal03() {
		System.out.println("animal is created");
	}
}

class Dog03 extends Animal03 {
	Dog03() {
		super();
		System.out.println("dog is created");
	}
}

public class L4_Super3_InvokeParentClassConstructor {
	public static void main(String args[]) {
		//Dog03 d; 
		new Dog03();
	}
}
