package java3_ObjectOrientedProgramming2_JavaPolymorphism;

class Animal02 {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog02 extends Animal02 {
	void eat() {
		System.out.println("eating bread...");
	}

	void bark() {
		System.out.println("barking...");
	}

	void work() {
		super.eat();
		bark();
	}
}

public class L4_Super2_InvokeParentClassMethod {
	public static void main(String args[]) {
		Dog02 d = new Dog02();
		d.work();
	}
}
