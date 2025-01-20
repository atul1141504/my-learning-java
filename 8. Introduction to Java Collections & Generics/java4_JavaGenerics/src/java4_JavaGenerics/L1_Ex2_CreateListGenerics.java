package java4_JavaGenerics;

import java.util.ArrayList;

public class L1_Ex2_CreateListGenerics <T> {
	//Below is a Generic List with Type=T
	ArrayList<T> list = new ArrayList<>();
	
	public boolean add(T element) {
		return list.add(element);
	}
	
	public boolean remove(T element) {
		return list.add(element);
	}

	public T get(int i) {
		return (T) list.get(i);
		
	}
}
