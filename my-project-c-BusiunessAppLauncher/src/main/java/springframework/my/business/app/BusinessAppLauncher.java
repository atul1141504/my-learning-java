package springframework.my.business.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BusinessAppLauncher {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(BusinessAppLauncher.class)) {

			System.out.println("Max number is "+context.getBean(BusinessCalculationService.class).findMax());
		}
	}

}
