package learn.springframework.my_project_a_spring_framework.helloWorld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03HelloWorldSpring {

	public static void main(String[] args) {
		/* To start with Spring Framework & auto-manage Dependency,
		 * we need to follow below step
		 * 
		 * 1. Create a configuration file with annotation -> @Configuration 
		 * 2. Create a Spring Context
		 * 3. Launch a configuration
		 * 4. Add/Update Spring Beans in the configuration file which needs to be auto handled
		 *    or will be managed by Spring
		 * 5. Retrieve Beans managed by Spring
		 * 		 
		*/
		
		var context = 
				new AnnotationConfigApplicationContext(App03HelloWorldConfiguration.class);
		
		System.out.println("Retrieve Bean using Bean-Name==>"+context.getBean("name"));
		System.out.println("Retrieve Bean using Bean-Name==>"+context.getBean("age"));
		System.out.println("Retrieve Bean using Bean-Name==>"+context.getBean("person"));
		System.out.println("Retrieve Bean using Bean-Name==>"+context.getBean("address"));
		System.out.println("Retrieve Bean using Bean-Type==>"+context.getBean(Address.class));
		System.out.println("Retrieve Bean created using existing Beans & Method Call     ==>"+context.getBean("person2MethodCall"));
		System.out.println("Retrieve Bean created using existing Beans & Method Parameter==>"+context.getBean("person3MethodParameters"));
		
		/*  List all the Beans managed by Spring Framework
		 *  Spring Context can be used to list all the Beans.
		 */
		
		System.out.println("\nListing all the Beans managed by Spring Framework");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		System.out.println("Count of Beans==>"+context.getBeanDefinitionCount());
		
		//Close the Spring Context
		context.close();
	}

}
