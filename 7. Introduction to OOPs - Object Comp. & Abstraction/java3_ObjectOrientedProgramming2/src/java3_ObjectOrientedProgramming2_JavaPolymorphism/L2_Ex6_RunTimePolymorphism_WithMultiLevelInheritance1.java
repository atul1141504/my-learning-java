package java3_ObjectOrientedProgramming2_JavaPolymorphism;

class AnimalA {
	void eat() {
		System.out.println("eating");
	}
}

class DogA extends AnimalA {
	void eat() {
		System.out.println("eating fruits");
	}
}

class BabyDog extends DogA {
	void eat() {
		System.out.println("drinking milk");
	}
}

public class L2_Ex6_RunTimePolymorphism_WithMultiLevelInheritance1 {
	public static void main(String args[]) {
		AnimalA a1, a2, a3;
		a1 = new AnimalA();
		a2 = new DogA();
		a3 = new BabyDog();
		a1.eat();
		a2.eat();
		a3.eat();
	}
}
