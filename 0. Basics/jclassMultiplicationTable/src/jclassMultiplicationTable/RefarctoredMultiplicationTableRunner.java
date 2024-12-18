package jclassMultiplicationTable;

public class RefarctoredMultiplicationTableRunner {
	public static void main(String[] args) {
		//the object 'MultiplicationTable' will be imported here as table
		refarctoredMultiplicationTable table = new refarctoredMultiplicationTable();
		table.printTable();
		table.printTable(8);
		table.printTable(21,12,15);
	}
}