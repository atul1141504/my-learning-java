package jclassMultiplicationTable;

public class refarctoredMultiplicationTable {
	void printTable() {
		printTable(13);
	}
	void printTable(int tableOf) {
		printTable(tableOf,1,10);
	}
	void printTable(int tableOf,int from, int to) {
		for(int i=from;i<=to;i++) {
			System.out.printf("%d x %d = %d",tableOf,i,tableOf*i).println();		
		}
	}
}
