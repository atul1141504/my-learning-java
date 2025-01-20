# Coding Exercises for Java.

## Task1: Anagram Checker
**Instructions**:

          a. Create a Java program that checks if the two strings are anagram or not.
          b. An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
          c. For example, the word "listen" is an anagram of "silent", "hello" and "olelh" are anagrams.
          d. You need to implement the areAnagrams(String str1, String str2) method of the StringMagic class, which returns true if str1 and str2 are anagrams of each other, and false otherwise.
          
**Notes**:

          a. The comparison should be case insensitive. That is, "Listen" and "Silent" should be considered anagrams.
          b. If either str1 or str2 is null, the method should return false.
          c. The method should also return false if the lengths of str1 and str2 are not the same.
          d. This method should return the result of dividing x by y. But before performing the division, check if y is zero. If y is zero, return -1.
          e. Java Library Methods=>string.toLowerCase(); string.toCharArray(); Arrays.sort(charArray); Arrays.equals(charArray1, charArray2).
                
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
