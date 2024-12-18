package printTables;

public class PrintTableWithArg {
	public static void main(String[] args) {
		printTableWithArg(6);
	}

	private static void printTableWithArg(int i) {
		System.out.printf("Printing table of %d:",i).println();
		for(int j=1;j<=10;j++) {
			System.out.printf("%d x %d = %d",i,j,i*j).println();
		
		}
	}

}
