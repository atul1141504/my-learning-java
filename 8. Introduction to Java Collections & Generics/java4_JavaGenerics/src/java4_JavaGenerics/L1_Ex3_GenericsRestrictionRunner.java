package java4_JavaGenerics;

public class L1_Ex3_GenericsRestrictionRunner {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		L1_Ex3_GenericsRestriction<String> stringList = new L1_Ex3_GenericsRestriction<>();
		stringList.add("Apple");
		stringList.add("Orange");
		System.out.println("Print String List ==> "+stringList.list);
		System.out.println("Get String Element==> "+stringList.get(0));
		System.out.println("Get String Element==> "+stringList.get(1));
		stringList.duplicate(stringList.list);
		System.out.println("Duplicate String List==> "+stringList.list);
		
		L1_Ex3_GenericsRestriction<Integer> integerList = new L1_Ex3_GenericsRestriction<>();
		integerList.add(1);
		integerList.add(2);
		System.out.println("Print Integer List ==> "+integerList.list);
		System.out.println("Get Integer Element==> "+integerList.get(0));
		System.out.println("Get Integer Element==> "+integerList.get(1));
		integerList.duplicate(integerList.list);
		System.out.println("Duplicate Integer List ==> "+integerList.list);
	}

}
