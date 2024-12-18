package intruductionToPrimitiveDataTypes;

import java.math.BigDecimal;

public class Primitive5SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		// Simple Interest = Principle + Principle*Interest*noOfYears/100
		Primitive5SimpleInterestCalculator calculator = new Primitive5SimpleInterestCalculator("4500","7.5");
		BigDecimal totalValue = calculator.calculateTotalValue(5);
		System.out.println(totalValue);
	}

}
