package jclassMultiplicationTable;

public class MultiplicationTable {
	void printTable() {
		for(int i=1;i<=10;i++) {
			System.out.printf("%d x %d = %d",5,i,5*i).println();		
		}
	}
	void printTable(int tableOf) {
		for(int i=1;i<=10;i++) {
			System.out.printf("%d x %d = %d",tableOf,i,tableOf*i).println();		
		}
	}
	void printTable(int tableOf,int from, int to) {
		for(int i=from;i<=to;i++) {
			System.out.printf("%d x %d = %d",tableOf,i,tableOf*i).println();		
		}
	}
}
