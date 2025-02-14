package java6_JavaMultithreadingAndConcurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String>{

	private String name;
	
	CallableTask(String name){
		this.name = name;
	}
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello "+name;
	}
	
}

public class L6_ExecutorServiceA_Callable_Submit {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// This allows to run a single thread at a time
				ExecutorService executorService = Executors.newFixedThreadPool(1);
				
				Future<String> result = executorService.submit(new CallableTask("Atul"));
				
				System.out.println("Response from thread: "+ result.get());
				System.out.println("Main Completed!");
	}

}
