package java4_JavaCollections_2_Set;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class L2_3_LinkedHashSet_getUniqueCharacters {

	public static void main(String[] args) {
		List<Character> charList = List.of('A', 'Z', 'A', 'B', 'F', 'Z', 'K');

		Set<Character> uniqueCharSet = new LinkedHashSet<>();
		uniqueCharSet.addAll(charList);

		// Note: LinkedHashSet cares only for Insertion order not for Sorting Order
		System.out.println("Input  character List :: " + charList);
		System.out.println("Unique Character Set  :: " + uniqueCharSet);

	}

}
