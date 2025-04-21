package learn.springframework.my_project_a_spring_dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessClassB {
	private Dependency1B dependency1;
	private Dependency2B dependency2;

	@Autowired
	public void setDependency1(Dependency1B dependency1) {
		System.out.println("Dependency Injection using setDependency1");
		this.dependency1 = dependency1;
	}
	
	@Autowired
	public void setDependency2(Dependency2B dependency2) {
		System.out.println("Dependency Injection using setDependency2");
		this.dependency2 = dependency2;
	}


	public String toString() {
		return "Dependency Injection using " + dependency1 + "and " + dependency2;
	}
}

@Component
class Dependency1B {

}

@Component
class Dependency2B {

}

@Configuration
@ComponentScan
public class DependencyInjectionSetter {

	public static void main(String[] args) {
		try (var context = 
				new AnnotationConfigApplicationContext(DependencyInjectionSetter.class)) {

			System.out.println(context.getBean(BusinessClassB.class));
			//System.out.println(context.getBeanDefinitionNames());

		}

	}
}
