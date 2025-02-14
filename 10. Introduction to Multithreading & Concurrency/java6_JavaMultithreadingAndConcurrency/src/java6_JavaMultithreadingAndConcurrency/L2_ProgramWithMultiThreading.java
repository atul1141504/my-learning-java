package java6_JavaMultithreadingAndConcurrency;

public class L2_ProgramWithMultiThreading {

	public static void main(String[] args) {

		// Task-1
		L2_Task1_ExtendsThread task1 = new L2_Task1_ExtendsThread();
		System.out.println("Task-1 Kicked-off");
		task1.start();
		System.out.println("Name of Task-1 thread ==>" + task1.getName());

		// Task-2
		L2_Task2_ImplementsRunnable task2Runnable = new L2_Task2_ImplementsRunnable();
		Thread task2 = new Thread(task2Runnable);
		System.out.println("Task-2 Kicked-off");
		task2.setName("Thread002");
		task2.start();
		System.out.println("Name of Task-2 thread ==>" + task2.getName());

		// Task-3
		L2_Task3_ImplementsRunnable task3Runnable = new L2_Task3_ImplementsRunnable();
		Thread task3 = new Thread(task3Runnable,"Thread003");
		System.out.println("Task-3 Kicked-off");
		task3.start();
		System.out.println("Name of Task-3 thread ==>" + task3.getName());

		// Task-4
		System.out.println("Task-4 Kicked-off");
		System.out.println("Task-4 Started");
		for (int l = 40; l < 50; l++) {
			System.out.println("Task-4:" + l);
		}
		System.out.println("Task-4 Completed");

	}

}
