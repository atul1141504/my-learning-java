package learn.springframework.my_project_a_spring_framework.helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};
record Address(String addressLine1, String city) {};
record AddressX(String addressLine1, String city) {};
record Person2(String name, int age, AddressX address) {};

@Configuration
public class App03HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Atul";
	}
	
	@Bean
	public int age() {
		return 29;
	}
	
	@Bean
	public Person person() {
		return new Person("Ankit",27);
		
	}
	
	@Bean
	public Address address() {
		return new Address("Murlipur Deva Road-1","Lucknow-1");
		
	}
	
	/*Customizing Bean name
	 * */
	@Bean("address2")
	public AddressX addressX() {
		return new AddressX("Murlipur Deva Road-2","Lucknow-2");
		
	}
	
	/* Creating new Beans using Existing Beans*/
	@Bean
	public Person2 person2MethodCall() {
		return new Person2(name(),age(),addressX());
		
	}
	
	@Bean
	public Person2 person3MethodParameters(String name, int age, AddressX addressX) {
		return new Person2(name,age,addressX);
		
	}
}