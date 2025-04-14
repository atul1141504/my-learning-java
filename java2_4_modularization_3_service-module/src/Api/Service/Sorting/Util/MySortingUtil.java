package Api.Service.Sorting.Util;

import java.util.List;

import Api.Service.Sorting.Algorithm.BubbleSort;

public class MySortingUtil {
	public List<String> sort(List<String> names){
		BubbleSort bubbleSort = new BubbleSort();
		return bubbleSort.sort(names);
		
	}
	
}
