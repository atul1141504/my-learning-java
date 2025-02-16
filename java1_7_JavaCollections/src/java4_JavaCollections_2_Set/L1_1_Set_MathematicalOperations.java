package java4_JavaCollections_2_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class L1_1_Set_MathematicalOperations {
	public static void main(String args[]) {
		Integer[] A = { 22, 45, 33, 66, 55, 34, 77 };
		Integer[] B = { 33, 2, 83, 45, 3, 12, 55 };

		//Creating HashSet fir above Integers arrays
		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(A));
		System.out.println("Set1 :: "+set1);

		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(B));
		System.out.println("Set2 :: "+set2);

		// Finding Union of set1 and set2
		Set<Integer> union_data = new HashSet<Integer>(set1);
		union_data.addAll(set2);
		System.out.println("Set1 <union> 	    Set2 :"+union_data);

		// Finding Intersection of set1 and set2
		Set<Integer> intersection_data = new HashSet<Integer>(set1);
		intersection_data.retainAll(set2);
		System.out.println("Set1 <intersection> Set2 :"+intersection_data);

		// Finding Difference of set1 and set2
		Set<Integer> difference_data = new HashSet<Integer>(set1);
		difference_data.removeAll(set2);
		System.out.println("Set1 <difference>   Set2 :"+difference_data);
	}
}
