package intruductionToPrimitiveDataTypes;

import java.math.BigDecimal;

public class Primitive4BigDecimlClass {

	public static void main(String[] args) {
		//Calculation with Float & Double => 68.79129875999999
		double num1 = 34.2234;
		double num2 = 34.56789876;
		
		double sum1 = num1 + num2;
		System.out.printf("Sum of float numbers      :");
		System.out.println(sum1);
		
		//Usage of Big Decimal for Accurate results => 68.79129876
		BigDecimal num3 = new BigDecimal("34.2234");
		BigDecimal num4 = new BigDecimal("34.56789876");
		System.out.printf("Sum of Big Decimal numbers:");
		System.out.println(num3.add(num4));
		
		//Added integer to Big Decimal numbers
		int i =10;
		System.out.printf("Added    integer to   Big Decimal numbers:");
		System.out.println(num3.add(new BigDecimal(i)));
		
		//Subtract integer from Big Decimal numbers
		System.out.printf("Subtract integer from Big Decimal numbers:");
		System.out.println(num3.subtract(new BigDecimal(i)));
		
		//Multiply integer to a Big Decimal numbers
		System.out.printf("Multiply integer to a Big Decimal numbers:");
		System.out.println(num3.multiply(new BigDecimal(i)));
		
		//Multiply integer to a Big Decimal numbers
		System.out.printf("Divide integer from a Big Decimal numbers:");
		System.out.println(num3.divide(new BigDecimal(i)));
		
	}

}
