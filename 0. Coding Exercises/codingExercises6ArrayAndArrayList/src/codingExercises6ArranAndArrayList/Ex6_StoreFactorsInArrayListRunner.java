package codingExercises6ArranAndArrayList;

public class Ex6_StoreFactorsInArrayListRunner {

	public static void main(String[] args) {
		Ex6_StoreFactorsInArrayList getFactors = new Ex6_StoreFactorsInArrayList();
		
		System.out.println("Factors of 6  are "+getFactors.determineAllFactors(6));
		System.out.println("Factors of 12 are "+getFactors.determineAllFactors(12));
		System.out.println("Factors of 15 are "+getFactors.determineAllFactors(15));

	}

}
