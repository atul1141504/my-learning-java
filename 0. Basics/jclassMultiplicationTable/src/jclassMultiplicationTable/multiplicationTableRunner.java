package jclassMultiplicationTable;

public class multiplicationTableRunner {

	public static void main(String[] args) {
		//the object 'MultiplicationTable' will be imported here as table
		MultiplicationTable table = new MultiplicationTable();
		table.printTable();
		table.printTable(8);
		table.printTable(21,12,15);
	}

}
