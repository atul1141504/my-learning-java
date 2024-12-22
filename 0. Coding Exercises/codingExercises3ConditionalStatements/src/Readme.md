# Coding Exercises for Java.

## Task-1: Triangle Validator
* Create a Java program to 
	a. Validate if the given angles can form a valid Triangle.
	b. Validate if the given sides can form a valid Triangle.
* create Java Class with name ** TriangleValidator **
* Create below Java Methods
	** isValidTriangle(int angle1, int angle2, int angle3)**
	** isRightAnglrTriangle(int side1, int side2, int side3)**

* NOTE:
a. Ensure you return false if any of the input angles or sides are non-positive (i.e., less than or equal to zero).
b. Compute the sum of the angles and check if it equals 180 for a valid triangle.
c. Use Pythagoras Theorem to validate Right Angle Triangle.
c. Return true if all conditions are met, false otherwise.

## Task-2: Leap year check 
* Create a Java program to check if a given year is leap year or not.
* create Java Class with name ** LeapYearChecker **

* Create below Java Method
	** isLeapYear(int year)** : 
		This method calculates and returns the area of the square. 
		The area of a square is given by the formula: side * side. 	
		However, in the real world, a square cannot have a side length of zero or less. 
		So, if side is less than or equal to Zero, this method should return -1 to indicate an invalid value.

* Logic:
  A year is a leap year in the Gregorian calendar if:
	It is divisible by 4 (AND)
	It is NOT divisible by 100 (except when it is divisible by 400)
	Not Divisible by 4 - NOT Leap Year (2041)
	Divisible by 4 and NOT divisible by 100 - Leap Year (2048)
	Divisible by 4 and divisible by 100 - Additional check needed
	Divisible by 4, divisible by 100, divisible by 400 - Leap Year (2000, 2400)
	Divisible by 4, divisible by 100, NOT divisible by 400 - NOT Leap Year (2100, 2200, 2300)	

**Instructions**:
* Step 1: Implement the isLeapYear method to return true if the year is a leap year and false otherwise.
* Step 2: Need to account for the edge case where the year is less than 1. For such a case, the method should return false.

## Task-3: Check for a Perfect Number
* Create a Java program to check whether a number is a **"perfect number"**.
* A Perfect Number is a positive integer that is equal to the sum of all of its positive divisors, excluding itself.
* create Java Class with name ** PerfectNumberChecker **
* Create below Java Method
	** isPerfectNumber(int number)**

**Instruction**:
* Step 1: A perfect number is always a positive integer. If the number is zero or a negative number, return false.
* Step 2: Assume that the input number will always be an integer.

## Task-4: Assign Grades to student
* Write a Java program to get Student grade based on the marks obtained.
* create Java Class with name ** Ex_4_StudentGradeChecker **
* Create below Java Methods
	** assignGrade()**

**Instructions**:
* Step 1: constructor will take one parameter, **marks (an integer)**, and it should assign it to the marks instance variable.
* Step 2: **assignGrade()** - This method should return a character representing the grade of the student, based on the marks they have received.
* Step 3: If marks are:
			less than 0 or greater than 100, return 'X'
			greater than or equal to 90, return 'A'
			greater than or equal to 80, return 'B'
			greater than or equal to 70, return 'C'
			greater than or equal to 60, return 'D'
			greater than or equal to 50, return 'E'
			less than 50, return 'F'

## Task-5: Weather Advisor
* Write a Java program that provides advice on what to wear based on the current temperature.
* create Java Class with name ** Ex_5_WeatherAdvisory **
* Create below Java Methods
	** provideWeatherAdvisory()**

**Instructions**:
* If the temperature is less than 0, return "It's freezing! Wear a heavy coat."
* If the temperature is between 0 and 10, inclusive, return "It's cold! Bundle up."
* If the temperature is between 11 and 20, inclusive, return "It's cool! A light jacket will do."
* If the temperature is above 20, return "It's warm! Enjoy the day."

## Task-6: Weather Advisor
* Write a Java program to determine if a given character is a vowel.
* create Java Class with name ** Ex_6_IsVowelUsingSwitch**
* Create below Java Methods
	** isVowel(char ch) **

**Instructions**:
* Program should return true if the character is a vowel (either lowercase or uppercase) 
* false otherwise. 
* The vowels are: 'A', 'E', 'I', 'O', 'U', and their respective lowercase versions.
