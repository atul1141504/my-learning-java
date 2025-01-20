package java4_JavaCollections_2_Set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L1_3_HashSet_getUniqueCharacters {

	public static void main(String[] args) {
		List<Character> charList = List.of('A','Z','A','B','F','Z','K');
		
		Set<Character> uniqueCharSet = new HashSet<>();
		uniqueCharSet.addAll(charList);
		
		//Note: Set doesn't care about either Insertion or Sorting Order
		System.out.println("Input  character List :: "+charList);
		System.out.println("Unique Character Set  :: "+uniqueCharSet);
	}

}
