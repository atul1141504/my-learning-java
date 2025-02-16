package java6_JavaMultithreadingAndConcurrency;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class L6_ExecutorServiceC_Callable_InvokeAny {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// This allows to run a single thread at a time
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		List<CallableTask> tasks = List.of(new CallableTask("Atul"),
										new CallableTask("Patel"),
										new CallableTask("Mr. Atul"),
										new CallableTask("Mr. Patel"));
		
		/* This invokes all the tasks present in the list
		 * It returns the response of the fastest executed thread.
		 */
		String response = executorService.invokeAny(tasks);
		
		System.out.println("Response from thread: "+ response);
		
		System.out.println("Main Completed!");

	}

}
