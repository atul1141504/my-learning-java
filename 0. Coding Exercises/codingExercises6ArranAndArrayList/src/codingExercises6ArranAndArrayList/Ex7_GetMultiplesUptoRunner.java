package codingExercises6ArranAndArrayList;

public class Ex7_GetMultiplesUptoRunner {

	public static void main(String[] args) {
		Ex7_GetMultiplesUpto getMultiples = new Ex7_GetMultiplesUpto();
		
		int num = 3;
		int limit = 20;
		System.out.println("Multiples of " + num + "upto " + limit +": " 
							+ getMultiples.determineMultiples(num, limit));
		
		num = 5;
		limit = 1;
		System.out.println("Multiples of " + num + "upto " + limit +": " 
							+ getMultiples.determineMultiples(num, limit));

	}

}
