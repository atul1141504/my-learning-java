package java6_JavaMultithreadingAndConcurrency;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class L6_ExecutorServiceB_Callable_InvokeAll {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// This allows to run a single thread at a time
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		List<CallableTask> tasks = List.of(new CallableTask("Atul"),
										new CallableTask("Patel"),
										new CallableTask("Mr. Atul"),
										new CallableTask("Mr. Patel"));
		List<Future<String>> responses = executorService.invokeAll(tasks);
		
		for(Future<String> response:responses) {
			System.out.println("Response from thread: "+ response.get());
		}
		
		System.out.println("Main Completed!");

	}

}
