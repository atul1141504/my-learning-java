package java4_JavaGenerics;

import java.util.ArrayList;
import java.util.List;

public class L1_Ex3_GenericsRestriction<T> {

	// Below is a Generic List with Type=T
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

	static <X> X doubleValue(X value) {
		return value;
	}

	/* If we extend any specific package, all the methods will be accessible.
	 * This is the commonly used Generic.
	 */
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	static <X extends List> X duplicate(X list) {
		list.addAll(list);
		return null;
	}

}
