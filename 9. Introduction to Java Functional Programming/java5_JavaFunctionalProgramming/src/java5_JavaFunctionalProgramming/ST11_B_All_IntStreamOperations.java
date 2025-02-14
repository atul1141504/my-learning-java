package java5_JavaFunctionalProgramming;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ST11_B_All_IntStreamOperations {

	public static void main(String[] args) {
		System.out.println("Meth.: range().................................==>"
							+IntStream.range(1, 11).sum());
		
		System.out.println("Meth.: rangeClosed()...........................==>"
							+IntStream.rangeClosed(1, 10).sum());
		
		System.out.println("Meth.: of() create int stream..................==>"
							+IntStream.of(1,2,3,4,5,6,7,8,9,10).sum());
		
		int [] intArray = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Meth.: Arrays.stream(intArray) create intStream==>"
				+Arrays.stream(intArray).sum());
		
	}

}
