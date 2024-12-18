package codingExercises2Two;

public class DimensionRunner {

	public static void main(String[] args) {
		// 
		Dimension dim = new Dimension(25);
		System.out.println(dim.getFeet());
		System.out.println(dim.getInches()); 
		
		Dimension dim1 = new Dimension(-25);
		System.out.println(dim1.getFeet());
		System.out.println(dim1.getInches());
	}

}
