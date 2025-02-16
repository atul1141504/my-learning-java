package java6_JavaMultithreadingAndConcurrency;

public class L2_Task3_ImplementsRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Task-3 Started");
		for (int l = 30; l < 40; l++) {
			System.out.println("Task-3:" + l);
		}
		System.out.println("Task-3 Completed");
	}

}
