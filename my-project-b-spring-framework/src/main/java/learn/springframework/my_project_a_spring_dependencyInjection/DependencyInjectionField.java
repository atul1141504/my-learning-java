package learn.springframework.my_project_a_spring_dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessClass {
	@Autowired
	Dependency1 dependency1;
	
	@Autowired
	Dependency2 dependency2;

	public String toString() {
		return "Dependency Injection using " + dependency1 + "and " + dependency2;
	}
}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DependencyInjectionField {

	public static void main(String[] args) {
		try (var context = 
				new AnnotationConfigApplicationContext(DependencyInjectionField.class)) {

			System.out.println(context.getBean(BusinessClass.class));
			//System.out.println(context.getBeanDefinitionNames());

		}

	}
}
