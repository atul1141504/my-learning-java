package codingExercisesOops2;

public class Ex1_Runner {

	public static void main(String[] args) {
		int num1 = 17;
		int num2 = 3;
		
		System.out.println("The two numbers are " +num1+ " & " +num2);
		Ex1_Add addOperation = new Ex1_Add();
		System.out.println("\t==>Sum:"+addOperation.perform(num1, num2));
		
		Ex1_Subtract subtractOperation = new Ex1_Subtract();
		System.out.println("\t==>Subtract:"+subtractOperation.perform(num1, num2));

		Ex1_Divide divideOperation = new Ex1_Divide();
		System.out.println("\t==>Divide:"+divideOperation.perform(num1, num2));
	}

}
