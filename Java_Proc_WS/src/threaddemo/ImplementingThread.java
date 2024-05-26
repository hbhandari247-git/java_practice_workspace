package threaddemo;

/**
 * Way-1
 */
/*public class ImplementingThread extends Thread {

	public static void main(String[] args) {
		ImplementingThread implementingThread = new ImplementingThread();
		implementingThread.start();
		System.out.println("The thread is completed...");
	}

	@Override
	public void run() {
		System.out.println("The thread is getting executed..");
	}
}*/

/**
 * Way-2
 */
public class ImplementingThread implements Runnable {

	public static void main(String[] args) {
		ImplementingThread implementingThread = new ImplementingThread();
		Thread thread1 = new Thread(implementingThread);
		thread1.start();
		System.out.println("The thread is completed...");
	}

	@Override
	public void run() {
		System.out.println("The thread is getting executed..");
	}
}