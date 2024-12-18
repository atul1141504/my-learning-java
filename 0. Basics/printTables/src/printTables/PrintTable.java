package printTables;

public class PrintTable {
	public static void main(String[] args) {
		int k=0;
		for(int j=1;j<=2;j++) {
			if(j==1) {
				k=6;
				System.out.printf("Printing Table of 6:").println();
			}else {
				k=11;
				System.out.printf("Printing Table of 11:").println();
			}
			for(int i=1;i<=10;i++) {
				System.out.printf("%d x %d = %d",k,i,k*i).println();
			}
				
		}
	}

}
