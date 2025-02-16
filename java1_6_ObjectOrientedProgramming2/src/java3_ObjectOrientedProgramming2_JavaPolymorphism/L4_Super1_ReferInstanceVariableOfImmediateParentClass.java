package java3_ObjectOrientedProgramming2_JavaPolymorphism;

class Animal01 {
	String color = "white";
}

class Dog01 extends Animal01 {
	String color = "black";

	void printColor() {
		System.out.println(color);// prints color of Dog class
		System.out.println(super.color);// prints color of Animal class
	}
}

public class L4_Super1_ReferInstanceVariableOfImmediateParentClass {
	public static void main(String[] args) {
		Dog01 d = new Dog01();
		d.printColor();
	}
}
