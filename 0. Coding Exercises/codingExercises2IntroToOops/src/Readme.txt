# Coding Exercises for Java.

## Task-1: 	 Inches to Object (Feet, Inches)
* Create a Java program to convert dimension in to feet & inches.
* create Java Class with name ## Dimention
* Create 2 Java Methods
	## Dimension(int inches): This constructor will take one parameter, inches (an integer), and it should convert the given inches into feet and inches. If the input inches are less than 0, set feet and inches to -1 to indicate invalid input. One foot is equal to 12 inches.
	## getFeet(): This method should return the calculated feet from the constructor.
	## getInches(): This method should return the remaining inches (less than 12) from the constructor.
				  
* NOTE: -1 inch is an invalid input so both getFeet() and getInches() return -1.

## Task-2: Create a Square class 
* Create a Java program to implement a class called ## Square in Java. This class is responsible for modeling a geometric shape - a square.
* create Java Class with name ## Square
* A Square object has one private instance variable, side (of type int), which denotes the length of a side of the square.
* The Square class has a constructor that takes an integer argument. This argument should be used to initialize the side attribute.

* Create 2 Java Methods
	## calculateArea(): This method calculates and returns the area of the square. The area of a square is given by the formula: side * side. However, in the real world, a square cannot have a side length of zero or less. So, if side is less than or equal to zero, this method should return -1 to indicate an invalid value.
	## calculatePerimeter(): This method calculates and returns the perimeter of the square. The perimeter of a square is given by the formula: 4 * side. Similar to the above, if side is less than or equal to zero, this method should return -1 to indicate an invalid value.
	

**Instructions**:
* Step 1: Implement the Square constructor. This constructor should take an integer argument and initialize the side attribute with the value of this argument.
* Step 2: Implement the calculateArea() method. If the side attribute is less than or equal to zero, return -1. Otherwise, calculate and return the area of the square using the formula: side * side.
* Step 3: Implement the calculatePerimeter() method. If the side attribute is less than or equal to zero, return -1. Otherwise, calculate and return the Peri-meter of the square using the formula: 4 * side.

## Task-3: Create a Point class with 2 d co-ordinates x,y
* complete the implementation of the Point class in Java. A point is an entity that has an x-coordinate and a y-coordinate in a two-dimensional space.
* create Java Class with name ## Point
* Create 2 Java Methods
	## move(int dx, int dy):
		This method adjusts the current position of the point in the 2-dimensional space. The parameters dx and dy represent the changes in x-coordinate and y-coordinate respectively.
		After calling this method, the new coordinates of the point should be (current x + dx, current y + dy).
		Example: If we have a point at (3, 4) and call the move method with arguments 1 and 2, the new coordinates of the point should be (3+1, 4+2) i.e., (4, 6).

	## distanceTo(Point other)
		This method calculates and returns the Euclidean distance between the current point and another point other.
		The Euclidean distance d between two points (x1, y1) and (x2, y2) is calculated as: d = sqrt((x2-x1)^2 + (y2-y1)^2).
		Example: If we have a point at (3, 4) and want to calculate the distance to another point at (6, 8), the distance should be sqrt((6-3)^2 + (8-4)^2) i.e., sqrt(9+16) i.e., sqrt(25) i.e., 5.0.

		TIP: Use the Math.sqrt function to compute the square root of a number.

## Task-4: RGB Color Class
* The Red-Green-Blue (RGB) model is a popular way to represent colors in computer systems. In this model, each color is represented as a combination of the primary colors red, green, and blue. Each of these primary colors can have intensity values ranging from 0 to 255.
* create Java Class with name ## RGBColor
		GBColor class models a color in the RGB model. The class has fields for the red, green, and blue intensities, and methods to get these values.
* Create 2 Java Methods
	## move(int dx, int dy):
		invert method that changes the color to its complementary color (the inverse color on a color wheel).
		implement the constructor, the getter methods for the red, green, and blue values, and the invert method.
		The invert method should subtract the current intensity value of each primary color from 255 to get the inverted color.

**Instructions**:
* Step 1: Start by implementing the constructor of the RGBColor class. The constructor should take three arguments: red, green, and blue. These should be used to initialize the red, green, and blue fields of the class.
* Step 2: Implement the getRed, getGreen, and getBlue methods. These methods should return the current values of the red, green, and blue fields respectively.
* Step 3: Implement the invert method. This method should subtract the current value of each of the red, green, and blue fields from 255, and assign the result back to the respective field.

**Example**:
Below are three examples of creating an RGBColor object, getting the red, green, and blue values, and inverting the color.

* Example 1
	RGBColor color = new RGBColor(255, 0, 0);
	System.out.println(color.getRed());   // Prints: 255
	System.out.println(color.getGreen()); // Prints: 0
	System.out.println(color.getBlue());  // Prints: 0
	color.invert();
	System.out.println(color.getRed());   // Prints: 0
	System.out.println(color.getGreen()); // Prints: 255
	System.out.println(color.getBlue());  // Prints: 255
* Example 2
	RGBColor color = new RGBColor(0, 255, 0);
	color.invert();
	System.out.println(color.getGreen()); // Prints: 0
	
* Example 3
	RGBColor color = new RGBColor(128, 128, 128);
	color.invert();
	System.out.println(color.getRed());   // Prints: 127
	System.out.println(color.getGreen()); // Prints: 127
	System.out.println(color.getBlue());  // Prints: 127