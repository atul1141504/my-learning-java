package java6_JavaMultithreadingAndConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class L5_ExecutorServiceB_FixedThreadPool {

	public static void main(String[] args) {
		// Create Threads
		ThreadTask t0 = new ThreadTask(0);
		ThreadTask t1 = new ThreadTask(10);
		ThreadTask t2 = new ThreadTask(20);
		ThreadTask t3 = new ThreadTask(30);
		ThreadTask t4 = new ThreadTask(40);
		ThreadTask t5 = new ThreadTask(50);

		// This allows to run a single thread at a time
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(t0);
		executorService.execute(t1);
		executorService.execute(t2);
		executorService.execute(t3);
		executorService.execute(t4);
		executorService.execute(t5);

		// To stop the Executor Service
		executorService.shutdown();

	}

}
