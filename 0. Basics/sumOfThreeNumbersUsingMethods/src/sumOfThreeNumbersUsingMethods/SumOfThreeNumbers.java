package sumOfThreeNumbersUsingMethods;

public class SumOfThreeNumbers {

	public static void main(String[] args) {
		int sumReturned = sumOfThreeNumberUsingMethods(131,99,87);
		System.out.printf("Sum of three numbers is %d.",sumReturned).println();

	}
	private static int sumOfThreeNumberUsingMethods(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		return sum;
		
	}

}
