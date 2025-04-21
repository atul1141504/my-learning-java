package springframework.b.JakartaCDI.b;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
class BusinessServiceA{
	
	private DataServiceA dataServiceA;
	
	@Inject
	public void setDataService(DataServiceA dataServiceA) {
		System.out.println("Setter Injection done..");
		this.dataServiceA = dataServiceA;
	}

	public DataServiceA getDataServiceA() {
		return dataServiceA;
	}

}

@Named
class DataServiceA{

}

@Configuration
@ComponentScan
public class WithJakartaCDIContextAppLauncher {

	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
								(WithJakartaCDIContextAppLauncher.class)) {

			Arrays.stream(context.getBeanDefinitionNames())
					.forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessServiceA.class)
										.getDataServiceA());
			
		}
	}
}
