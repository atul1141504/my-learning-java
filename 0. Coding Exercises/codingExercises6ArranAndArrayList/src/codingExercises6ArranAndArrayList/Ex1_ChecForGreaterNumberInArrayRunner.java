package codingExercises6ArranAndArrayList;

public class Ex1_ChecForGreaterNumberInArrayRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1_ChecForGreaterNumberInArray checkNumber = new Ex1_ChecForGreaterNumberInArray();
		
		int userNumber;
		int[] numArray = {20,10,88,70,12,40,90,50,55,45};
		userNumber = 89;
		boolean isFound = checkNumber.doesHaveElementGreaterThan(numArray, userNumber);
		if(isFound) {
			System.out.println("Greater number is Found in Array!!");
		}else {
			System.out.println("Greater number is not Found in Array!!");
		}

	}

}
