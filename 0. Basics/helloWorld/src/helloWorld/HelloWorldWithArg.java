package helloWorld;

public class HelloWorldWithArg {

	public static void main(String[] args) {
		printHelloWorld(6);

	}

	private static void printHelloWorld(int i) {
		System.out.printf("Printing by passing argument:",i).println();
		for(int j=1;j<=i;j++) {
			System.out.printf("%d. Hello World!!",j).println();
		}
		
	}

}
