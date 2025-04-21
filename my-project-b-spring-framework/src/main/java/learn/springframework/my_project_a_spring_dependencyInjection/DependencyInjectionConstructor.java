package learn.springframework.my_project_a_spring_dependencyInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessClassC {
	Dependency1C dependency1;
	Dependency2C dependency2;
	
	public BusinessClassC(Dependency1C dependency1, Dependency2C dependency2) {
		super();
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
		System.out.println("Dependency Injection using Constructor");
		
	}

	public String toString() {
		return "Dependency Injection using " + dependency1 + "and " + dependency2;
	}
}

@Component
class Dependency1C {

}

@Component
class Dependency2C {

}

@Configuration
@ComponentScan
public class DependencyInjectionConstructor {

	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext(DependencyInjectionConstructor.class)) {

			System.out.println(context.getBean(BusinessClassC.class));
			//System.out.println(context.getBeanDefinitionNames());

		}

	}

}
