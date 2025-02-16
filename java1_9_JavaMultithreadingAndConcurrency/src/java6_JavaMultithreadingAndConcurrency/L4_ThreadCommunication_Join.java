package java6_JavaMultithreadingAndConcurrency;

public class L4_ThreadCommunication_Join {

	public static void main(String[] args) throws InterruptedException {
		//Create Threads
		ThreadTask t0 = new ThreadTask(0);
		ThreadTask t1 = new ThreadTask(10);
		ThreadTask t2 = new ThreadTask(20);
		ThreadTask t3 = new ThreadTask(30);
		
		//get Initial priority of the threads created
		System.out.println("Initial Priority of the Threads =>");
		System.out.println("\tPriority of Thread-0 is " + t0.getPriority());
		System.out.println("\tPriority of Thread-1 is " + t1.getPriority());
		System.out.println("\tPriority of Thread-2 is " + t2.getPriority());
		System.out.println("\tPriority of Thread-3 is " + t3.getPriority());
		
		//Set & print new priorities for the threads
		t0.setPriority(2);	//Lowest priority
		t1.setPriority(5);	//Normal Priority
		t2.setPriority(8);	//Higher Priority as compared to t0 & t1
		t3.setPriority(10);	//Highest Priority as compared to t0, t1, t2
		
		//This will result in exception as priority can't be > that max(10) 
		//t2.setPriority(12);   
		
		System.out.println("New Priorities of the Threads =>");
		System.out.println("\tPriority of Thread-0 is " + t0.getPriority());
		System.out.println("\tPriority of Thread-1 is " + t1.getPriority());
		System.out.println("\tPriority of Thread-2 is " + t2.getPriority());
		System.out.println("\tPriority of Thread-3 is " + t3.getPriority());
		
		/*	Start Threads
		 * 	Expectation: First t2 should be completed followed by t1 & t0
		 * 	Note	   : But this is just a request, it may or may not be fulfilled!!
		 */
		t0.start();
		t1.start();
		t2.start();
		
		/*	Suppose we want to run the t3 thread after completion of threads t1 & t2, we can use join method
		 * 	But we also need to add "InterruptedException" with the main method/method which contains it
		 * 	Example: public static void main(String[] args) throws InterruptedException
		 */
		t1.join();
		t2.join();
		
		//Here, even though t3 has highest priority, this will be executed only on completion of t1 & t2 threads
		t3.start();

	}

}
