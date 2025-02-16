package java4_JavaCollections_2_Set;

import java.util.TreeSet;
import java.util.List;
import java.util.Set;

public class L3_3_TreeSet_getUniqueCharacters {

	public static void main(String[] args) {
		List<Character> charList = List.of('A', 'Z', 'A', 'B', 'F', 'Z', 'K');

		Set<Character> uniqueCharSet = new TreeSet<>();
		uniqueCharSet.addAll(charList);

		// Note: TreeSet doesn't care about Insertion order but for Sorting Order
		System.out.println("Input  character List :: " + charList);
		System.out.println("Unique Character Set  :: " + uniqueCharSet);

	}

}
