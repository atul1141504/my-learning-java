package intruductionToPrimitiveDataTypes;

import java.math.BigDecimal;

public class Primitive5SimpleInterestCalculator {
	
	BigDecimal principle;
	BigDecimal interest;
	
	public Primitive5SimpleInterestCalculator(String principle, String interest) {
		this.principle = new BigDecimal(principle);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}
	
	public BigDecimal calculateTotalValue(int noOfYears) {
		BigDecimal totalValue = principle.add(principle.multiply(interest.multiply(new BigDecimal(noOfYears))));
		return totalValue;
	}
	
}
