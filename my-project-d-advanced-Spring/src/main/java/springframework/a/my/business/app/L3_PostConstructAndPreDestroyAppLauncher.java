package springframework.a.my.business.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class MainClass{
	
	private DependencyClass dependencyClass;

	public MainClass(DependencyClass dependencyClass) {
		super();
		this.dependencyClass = dependencyClass;
		System.out.println("All the Dependencies are ready..");
	}
	
	@PostConstruct
	public void initialize() {
		
		dependencyClass.getReady();
		
	}
	
	@PreDestroy
	public void cleanup() {
		dependencyClass.cleanup();
	}
	
}

@Component
class DependencyClass{

	public void getReady() {
		System.out.println(
				"""
				==> The required initialization is being done post Bean creation & initialization
				==> -- DB connected successfully
				==> -- All the files are available & opened for access.
				==> Initialization Completed !!
					"""	);
		
	}

	public void cleanup() {
		System.out.println(
				"""
				==> The resource cleanup is being done prior to the Bean destruction.
				==> -- DB connection closed.
				==> -- All the files have been closed.
				==> The Resource cleanup Completed !!
					"""	);
		
	}

}

@Configuration
@ComponentScan
public class L3_PostConstructAndPreDestroyAppLauncher {

	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
								(L3_PostConstructAndPreDestroyAppLauncher.class)) {
			System.out.println(context.getBean(MainClass.class));
		}
	}
}
