package java4_JavaCollections_4_Map;

import java.util.TreeMap;

public class L3_TreeMap_NavigatableMapMethods {

	public static void main(String[] args) {
		/* Tree Maps are created in a Sorted order of Keys
		 * It Implements Map,NavigableMap
		 * 
		 */
		TreeMap<String,Integer> treeMap = new TreeMap<>();
		treeMap.put("F", 25);
		treeMap.put("Z", 5);
		treeMap.put("L", 250);
		treeMap.put("A", 15);
		treeMap.put("B", 35);
		treeMap.put("G", 35);
		
		System.out.println("TreeMap is Created ==>"+treeMap);
		System.out.println("\nExecuting Methods to get higher keys >>>");
		System.out.println("\tMethod-higherKey : Key higher than <B>             ==>"
							+treeMap.higherKey("B"));
		System.out.println("\tMethod-higherKey : Key higher than <C>             ==>"
							+treeMap.higherKey("C"));
		System.out.println("\tMethod-ceilingKey: Key higher than or equal to <B> ==>"
							+treeMap.ceilingKey("B"));

		System.out.println("\nExecuting Methods to get lower keys >>>");
		System.out.println("\tMethod-lowerKey  : Key lower than <B>              ==>"
							+treeMap.lowerKey("B"));
		System.out.println("\tMethod-lowerKey  : Key lower than <C>              ==>"
							+treeMap.higherKey("C"));
		System.out.println("\tMethod-floorKey  : Key lower than or equal to <B>  ==>"
							+treeMap.floorKey("B"));
		
		System.out.println("\nMethod-firstEntry  : Get 1st  entry from the TreeMap ==>"+treeMap.firstEntry());
		System.out.println("Method-lastEntry   : Get last entry from the TreeMap ==>"+treeMap.lastEntry());
		
		System.out.println("\nMethod-subMap() : Get range of Map data b/w Keys <B> & <Z> ==>"
							+treeMap.subMap("B", "Z"));
		
	}

}
