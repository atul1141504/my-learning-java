package java3_ObjectOrientedProgramming2_JavaInterface;

interface DrawableA {
	void draw();

	default void msg() {
		System.out.println("default method");
	}
}

class RectangleA implements DrawableA {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

public class L5_DefaultMethodInInterface {
	public static void main(String args[]) {
		DrawableA d = new RectangleA();
		d.draw();
		d.msg();
	}

}
