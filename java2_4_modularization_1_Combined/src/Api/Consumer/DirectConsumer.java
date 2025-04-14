package Api.Consumer;

import java.util.List;

import Api.Service.Sorting.Algorithm.BubbleSort;

public class DirectConsumer {
	/* Here, We are calling the Bubble Sort service directly instead of via Sorting.Util
	 * But the, actual expectation is to call the BubbleSort via Sorting.Util only.
	 * 
	 * We will have a look how an external Consumer can access the service in the next step.
	 * 
	 */
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		List<String> directSorted = bubbleSort.sort(List.of("Garima","Atul","Ankit","Satyam"));
		
		System.out.println(directSorted);

	}

}
