package codingExercises2Two;

public class RGBColorRunner {

	public static void main(String[] args) {
		// Example - 1
		System.out.println("Case:1");
		RGBColor color = new RGBColor(255, 0, 0);
		System.out.println(color.getRed());   // Prints: 255
		System.out.println(color.getGreen()); // Prints: 0
		System.out.println(color.getBlue());  // Prints: 0
		color.invert();
		System.out.println(color.getRed());   // Prints: 0
		System.out.println(color.getGreen()); // Prints: 255
		System.out.println(color.getBlue());  // Prints: 255
		
		// Example - 2
		System.out.println("Case:2");
		RGBColor color1 = new RGBColor(0, 255, 0);
		color.invert();
		System.out.println(color1.getGreen()); // Prints: 0
		
		// Example - 3
		System.out.println("Case:3");
		RGBColor color2 = new RGBColor(128, 128, 128);
		color.invert();
		System.out.println(color2.getRed());   // Prints: 127
		System.out.println(color2.getGreen()); // Prints: 127
		System.out.println(color2.getBlue());  // Prints: 127
	}

}
