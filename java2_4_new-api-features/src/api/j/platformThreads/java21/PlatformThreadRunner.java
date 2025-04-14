package api.j.platformThreads.java21;

import java.util.concurrent.TimeUnit;

class SleepingThread implements Runnable {

	@Override
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

public class PlatformThreadRunner {

	public static void main(String[] args) {
		System.out.println("Threads Kicked off!");
		
		for(int i=1;i<100_000;i++) {
			System.out.println("Platform Thread: " + i);
			new Thread(new SleepingThread()).start(); 
		}
	}

}
