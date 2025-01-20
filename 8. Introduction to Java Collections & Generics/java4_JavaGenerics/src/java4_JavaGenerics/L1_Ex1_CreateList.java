package java4_JavaGenerics;

import java.util.ArrayList;

public class L1_Ex1_CreateList {
	/* Below List is created to hold only String elements
	 * Therefore it cannot hold Integer data-type elements
	 * 
	 * If we need another Data type then we need to create another list & methods to add.
	 */
	ArrayList<String> list = new ArrayList<>();
	
	public void add(String string) {
		list.add(string);
	}
	
	public void remove(String string) {
		list.add(string);
	}

}
