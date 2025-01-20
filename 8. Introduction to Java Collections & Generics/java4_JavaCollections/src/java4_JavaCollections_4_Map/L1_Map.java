package java4_JavaCollections_4_Map;

import java.util.HashMap;
import java.util.Map;

public class L1_Map {

	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("3",33,"1",11,"2",22);
		System.out.println("Immutable Map created==> "+map);
		System.out.println("\tGet element for key:2 ==>"+map.get("2"));
		System.out.println("\tMap contains key:3   ==>"+map.containsKey("3"));
		System.out.println("\tMap contains key:5   ==>"+map.containsKey("5"));
		System.out.println("\tMap contains Value:33==>"+map.containsValue(33));
		System.out.println("\tMap contains Value:55==>"+map.containsValue(55));
		
		Map<String, Integer> hashMap = new HashMap<String, Integer>(map);
		System.out.println("Mutable HashMap created using Immutable map==> "+hashMap);
		System.out.println("\tAdd a new element with key:5 & Value:55 ==>"+hashMap.put("5",55));
		System.out.println("\tNew hashMap after adding element        ==>"+hashMap);
		
		System.out.println("\tUpdate element for key:2 & new Value:28 ==>"+hashMap.put("2",28));
		System.out.println("\tNew hashMap after updating element      ==>"+hashMap);
		


	}

}
