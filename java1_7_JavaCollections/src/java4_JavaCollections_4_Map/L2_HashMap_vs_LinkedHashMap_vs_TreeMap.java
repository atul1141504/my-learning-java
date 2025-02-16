package java4_JavaCollections_4_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class L2_HashMap_vs_LinkedHashMap_vs_TreeMap {

	public static void main(String[] args) {
		System.out.println("<<< Comparison Between HashMap, LinkedHashMap & TreeMap >>>");
		
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("P", 12);
		hashMap.put("Z", 22);
		hashMap.put("A", 567);
		hashMap.put("C", 57);
		hashMap.put("R", 68);
		System.out.println("HashMap: Doesn't care for either Inserstion/Sorting Order ==>"+hashMap);
		
		Map<String, Integer> linkedhashMap = new LinkedHashMap<String, Integer>();
		linkedhashMap.put("P", 12);
		linkedhashMap.put("Z", 22);
		linkedhashMap.put("A", 567);
		linkedhashMap.put("C", 57);
		linkedhashMap.put("R", 68);
		System.out.println("LinkedHashMap: Stores data in Insertion Order............ ==>"+linkedhashMap);
		
		Map<String, Integer> treeMap = new LinkedHashMap<String, Integer>();
		treeMap.put("P", 12);
		treeMap.put("Z", 22);
		treeMap.put("A", 567);
		treeMap.put("C", 57);
		treeMap.put("R", 68);
		System.out.println("TreeMap: Stores data in Sorted Order..................... ==>"+treeMap);
		
	}

}
