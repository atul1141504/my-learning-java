package java4_JavaGenerics;

public class L1_Ex2_CreateListGenericsRunner {

	public static void main(String[] args) {
		L1_Ex2_CreateListGenerics<String> stringList = new L1_Ex2_CreateListGenerics<>();
		stringList.add("Apple");
		stringList.add("Orange");
		
		System.out.println("Print String List ==> "+stringList.list);
		System.out.println("Get String Element==> "+stringList.get(0));
		System.out.println("Get String Element==> "+stringList.get(1));
		
		L1_Ex2_CreateListGenerics<Integer> integerList = new L1_Ex2_CreateListGenerics<>();
		integerList.add(1);
		integerList.add(2);
		
		System.out.println("Print Integer List ==> "+integerList.list);
		System.out.println("Get Integer Element==> "+integerList.get(0));
		System.out.println("Get Integer Element==> "+integerList.get(1));
		
	}

}
