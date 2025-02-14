package java6_JavaMultithreadingAndConcurrency;

public class L2_Task2_ImplementsRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Task-2 Started");
		for (int j = 10; j < 20; j++) {
			System.out.println("Task-2:" + j);
		}
		System.out.println("Task-2 Completed");
	}

}
