package springframework.a.my.business.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	
}

@Component
@Lazy
class ClassB{
	@SuppressWarnings("unused")
	private ClassA classA;

	public ClassB(ClassA classA) {
		this.classA = classA;
		System.out.println("Initialization Completed !");
	}
	
	public void methodB() {
		System.out.println("Method is invoked from ClassB !!");
	}
}

@Configuration
@ComponentScan
public class L1_InitializationAppLauncher {

	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext(L1_InitializationAppLauncher.class)) {
			System.out.println("Context Initialized");
			
			context.getBean(ClassB.class);
		}
	}

}
