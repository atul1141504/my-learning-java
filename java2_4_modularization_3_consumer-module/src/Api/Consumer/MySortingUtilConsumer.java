package Api.Consumer;

import java.util.List;
import java.util.logging.Logger;

import Api.Service.Sorting.Util.MySortingUtil;

public class MySortingUtilConsumer {
	
	private static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());
	
	public static void main(String[] args) {
		MySortingUtil util = new MySortingUtil();
		List<String> sortedNames = util.sort(List.of("Garima","Atul","Ankit","Satyam"));
		
		logger.info(sortedNames.toString());
	}

}
