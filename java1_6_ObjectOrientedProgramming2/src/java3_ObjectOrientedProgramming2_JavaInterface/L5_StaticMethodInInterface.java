package java3_ObjectOrientedProgramming2_JavaInterface;

interface DrawableB {
	void draw();

	static int cube(int x) {
		return x * x * x;
	}
}

class RectangleB implements DrawableB {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

public class L5_StaticMethodInInterface {
	public static void main(String args[]) {
		DrawableB d = new RectangleB();
		d.draw();
		System.out.println(DrawableB.cube(3));
	}

}
