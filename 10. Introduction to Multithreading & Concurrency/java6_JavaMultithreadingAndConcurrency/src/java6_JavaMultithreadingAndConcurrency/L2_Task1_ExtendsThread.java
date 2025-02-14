package java6_JavaMultithreadingAndConcurrency;

public class L2_Task1_ExtendsThread extends Thread {

	public void run() {
		System.out.println("Task-1 Started");
		for (int i = 10; i < 20; i++) {
			System.out.println("Task-1:" + i);
		}
		System.out.println("Task-1 Completed");
	}

}
