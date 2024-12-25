# Coding Exercises for Java.

## Task1: Shapes and Area
**Instructions**:

          a. Create a Java program that create a mathematical operations application.
          b. This application should be able to perform the basic operations of addition, subtraction, and division.
          c. An Operation interface with a perform method, which should take two integers as arguments and return an integer.
          d. The goal is to implement three classes, Add, Subtract, and Divide, which implement the Operation interface and provide their specific implementations of the perform method.
          e. When performing division, if the divisor is zero, your program should return -1 to indicate an error.
          f. The output of the perform method should be an integer which is the result of performing the respective operation on x and y.
          
**Notes**:

          a. The Add class by implementing the perform method. This method should return the result of adding x and y.
          b. The Subtract class by implementing the perform method. This method should return the result of subtracting y from x.
          c. The Divide class by implementing the perform method. 
          d. This method should return the result of dividing x by y. But before performing the division, check if y is zero. If y is zero, return -1.
          
## Task2: Shapes and Area
**Instructions**:

          a. Create a Java program that calculate areas of Shapes, and print information about them.
          b. The program defines an abstract base class, Shape, with sub classes for specific types of shapes.
          c. The shapes we are considering for this exercise are Circle and Rectangle.
          d. Create the code by implementing the Circle and Rectangle classes that extend the Shape abstract class.
          e. Each of these classes must include a calculateArea() method that computes and returns the area of the shape.
          f. 
          
**Notes**:

          a. Use inheritance and abstract classes. The Shape class is an abstract class and it is extended by the Circle and Rectangle classes.
          b. super(name) is used to call the constructor of the superclass, Shape. 
          c. This is required as the first statement in the constructors of Circle and Rectangle.
          d. Math.PI is a constant that represents the value of PI, approximately 3.14159. It is used to calculate the area of a circle.
          e. calculateArea() is an abstract method in Shape and it is implemented (overridden) in the Circle and Rectangle classes.
          f. The this keyword refers to the current object, and it's used to access the object's attributes.
