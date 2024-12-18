package codingExercises4Loops;

public class All_LoopExercises {

	public int calculateFactorial(int factOf) {
		/**
		 * This method calculates and returns the Factorial of a given integer. If the
		 * number is negative, it returns -1. If the number is zero, it returns 1( as 0!
		 * = 1).
		 * 
		 * @param number: an integer
		 * @return number of digits in number, or -1.
		 */

		int factorial = 1;

		if (factOf < 0) {
			return -1;
		}

		for (int i = 2; i <= factOf; i++) {
			factorial = factorial * i;
		}

		return factorial;

	}

	public int calculateLstDigit(int userNumber) {
		/**
		 * This method calculates and returns the Last digits of a given integer. If the
		 * number is negative, it returns -1. If the number is zero, it returns 0(zero).
		 * 
		 * @param number: an integer
		 * @return number of digits in number, or -1.
		 */

		if (userNumber < 0) {
			return -1;
		}

		return userNumber % 10;
	}

	public int calculateNoOfDigits(int userNumber) {
		/**
		 * This method calculates and returns the number of digits in a given integer.
		 * If the number is negative, it returns -1. If the number is zero, it returns 1
		 * as zero is considered to have one digit.
		 * 
		 * @param number: an integer
		 * @return number of digits in number, or -1 if number is negative, or 1 if
		 *         number is zero.
		 */

		int count = 0;

		if (userNumber < 0) {
			return -1;
		}

		if (userNumber == 0) {
			return 1;
		}

		while (userNumber > 0) {
			userNumber /= 10;
			count++;
		}
		return count;
	}

	public int getSumOfDigits(int userNumber) {
		/**
		 * This method calculates and returns the sum of number of digits in a given
		 * integer. If the number is negative, it returns -1. If the number is zero, it
		 * returns zero as the sum is zero.
		 * 
		 * @param number: an integer
		 * @return sum of number of digits of a number, or -1 if number is negative.
		 */
		if (userNumber < 0) {
			return -1;
		}

		int sumOfDigits = 0;

		do {
			sumOfDigits += userNumber % 10;
			userNumber = userNumber / 10;
		} while (userNumber > 0);

		return sumOfDigits;
	}

	public int getReverseNumber(int userNumber) {
		/**
		 * This method reverses a given integer and returns the reversed number. If the
		 * number is negative, it returns -1 as the reverse of a negative number is
		 * undefined. If the number is zero, it returns 0 as the reverse of 0 is 0.
		 * 
		 * @param number: an integer
		 * @return reversed number, or -1 if number is negative, or 0 if number is zero.
		 */

		if (userNumber < 0) {
			return -1;
		}

		int reverseNumber = 0;

		while (userNumber > 0) {
			reverseNumber = reverseNumber * 10 + userNumber % 10;
			userNumber /= 10;
		}

		return reverseNumber;
	}

	public int calculateLCM(int userNumber1, int userNumber2) {
		/**
		 * Calculates and returns the least common multiple (LCM) of the two numbers. If
		 * either number is negative, returns -1 as the LCM for negative numbers is
		 * undefined. If either number is zero, returns 0 as the LCM of 0 and any other
		 * number is 0.
		 * 
		 * @return LCM of the two numbers, or -1 if either number is negative, or 0 if
		 *         either number is zero.
		 */
		int max = Math.max(userNumber1, userNumber2);
		int lcm = max;
		boolean LCMCalculated = false;

		if (userNumber1 < 0 || userNumber2 < 0) {
			return -1;
		}
		if (userNumber1 == 0 || userNumber2 == 0) {
			return 0;
		}

		// Logic to find LCM
		do {
			LCMCalculated = (lcm%userNumber1==0 && lcm%userNumber2==0);
			if(LCMCalculated) {
				return lcm;
			}
			lcm += max;
		} while (true);
	}

	public int calculateGCD(int userNumber1, int userNumber2) {
		/**
	     * Calculates and returns the greatest common divisor (GCD) of the two numbers.
	     * Edge case: If either number is negative, returns 1 as the GCD for negative numbers is 1.
	     * Edge case: If either number is zero, returns 0 as the GCD of 0 and any other number is 0.
	     * Edge case: If two numbers are equal, returns the number as the GCD of two equal numbers is the number itself.
	     * @return GCD of the two numbers, or 1 if either number is negative, or 0 if either number is zero.
	     */
		int min = Math.min(userNumber1, userNumber2);
		int gcd = min;
		boolean GCDCalculated = false;

		if (userNumber1 < 0 || userNumber2 < 0) {
			return 1;
		}
		if (userNumber1 == 0 || userNumber2 == 0) {
			return 0;
		}
		
		if (userNumber1 == userNumber2) {
			return userNumber1;
		}

		// Logic to find LCM
		do {
			GCDCalculated = (userNumber1%gcd==0 && userNumber2%gcd==0);
			if(GCDCalculated) {
				return gcd;
			}
			gcd--;
		} while (true);
	}

}
