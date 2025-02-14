package java6_JavaMultithreadingAndConcurrency;

public class L1_ProgramWithoutThread {

	public static void main(String[] args) {
		// Task-1
		System.out.println("Task-1 Kicked-off");
		System.out.println("Task-1 Started");
		for (int i = 10; i < 20; i++) {
			System.out.println("Task-1:" + i);
		}
		System.out.println("Task-1 Completed");

		// Task-2
		System.out.println("Task-2 Kicked-off");
		System.out.println("Task-2 Started");
		for (int j = 10; j < 20; j++) {
			System.out.println("Task-2:" + j);
		}
		System.out.println("Task-2 Completed");

		// Task-3
		System.out.println("Task-3 Kicked-off");
		System.out.println("Task-3 Started");
		for (int k = 10; k < 20; k++) {
			System.out.println("Task-3:" + k);
		}
		System.out.println("Task-3 Completed");

	}

}
