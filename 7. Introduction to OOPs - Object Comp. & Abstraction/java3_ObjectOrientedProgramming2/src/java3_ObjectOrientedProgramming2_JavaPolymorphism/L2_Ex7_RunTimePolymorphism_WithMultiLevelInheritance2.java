package java3_ObjectOrientedProgramming2_JavaPolymorphism;

class AnimalB {
	void eat() {
		System.out.println("==>animal is eating...");
	}
}

class DogB extends AnimalB {
	void eat() {
		System.out.println("==>dog is eating...");
	}
}

class BabyDog1 extends DogB {
	//Method is not overridden
	//Up-Casting will happen at runtime, & it will trigger method from DogB class
}

public class L2_Ex7_RunTimePolymorphism_WithMultiLevelInheritance2 {
	public static void main(String args[]) {
		AnimalB a = new BabyDog1();
		a.eat();
	}
}
