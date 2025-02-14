package java6_JavaMultithreadingAndConcurrency;

class ThreadTask extends Thread{
	private int from;

	ThreadTask(int from){
		this.from = from;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running with priority "+
							Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName()+ " started execution!");
		
		for(int i=from;i<from+10;i++) {
			System.out.println(i);
		}
		
		System.out.println(Thread.currentThread().getName()+ " completed!");
		
	}
}
public class L3_ThreadPriorities {

	public static void main(String[] args) {
		//Create Threads
		ThreadTask t0 = new ThreadTask(0);
		ThreadTask t1 = new ThreadTask(10);
		ThreadTask t2 = new ThreadTask(20);
		
		//get Initial priority of the threads created
		System.out.println("Initial Priority of the Threads =>");
		System.out.println("\tPriority of Thread-0 is " + t0.getPriority());
		System.out.println("\tPriority of Thread-1 is " + t1.getPriority());
		System.out.println("\tPriority of Thread-2 is " + t2.getPriority());
		
		//Set & print new priorities for the threads
		t0.setPriority(2);	//Lowest priority
		t1.setPriority(5);	//Normal Priority
		t2.setPriority(8);	//Highest Priority as compared to t0 & t1
		
		//This will result in exception as priority can't be > that max(10) 
		//t2.setPriority(12);   
		
		System.out.println("New Priorities of the Threads =>");
		System.out.println("\tPriority of Thread-0 is " + t0.getPriority());
		System.out.println("\tPriority of Thread-1 is " + t1.getPriority());
		System.out.println("\tPriority of Thread-2 is " + t2.getPriority());
		
		/*	Start Threads
		 * 	Expectation: First t2 should be completed followed by t1 & t0
		 * 	Note	   : But this is just a request, it may or may not be fulfilled!!
		 */
		t0.start();
		t1.start();
		t2.start();
	}

}
