package springframework.my.business.app;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@SuppressWarnings("unused")
@Component
public class BusinessCalculationService {

	private DataService dataService;

	public BusinessCalculationService(@Qualifier("MySQLDataServiceQualifier") DataService dataService) {
	//public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
}
