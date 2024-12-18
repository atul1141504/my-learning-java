package printSquares;

public class PrintSquares {

	public static void main(String[] args) {
		System.out.printf("Printing squares of first 10 numbers:").println();
		for(int i=1;i<=10;i++) {
			System.out.printf("Square of %d is %d.",i,i*i).println();
		}
		System.out.printf("Printing squares of first 10 even numbers:").println();
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				System.out.printf("Square of %d is %d.",i,i*i).println();
			}
		}
		System.out.printf("Printing squares of first 10 odd numbers:").println();
		for(int i=1;i<=20;i++) {
			if(i%2==1) {
				System.out.printf("Square of %d is %d.",i,i*i).println();
			}
		}

	}

}
