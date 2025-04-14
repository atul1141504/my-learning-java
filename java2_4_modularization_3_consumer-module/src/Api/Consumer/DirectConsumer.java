package Api.Consumer;

import java.util.List;
import java.util.logging.Logger;

import Api.Service.Sorting.Algorithm.BubbleSort;

public class DirectConsumer {
	
	private static Logger logger = Logger.getLogger(DirectConsumer.class.getName());
	
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		List<String> directSorted = bubbleSort.sort(List.of("Garima", "Atul", "Ankit", "Satyam"));

		//System.out.println(directSorted);
		logger.info(directSorted.toString());

	}

}
