package leetcode;

public class StringBufferExample {
	private static StringBuffer sharedBuffer = new StringBuffer("Start");

	public static void main(String[] args) {
		Runnable task = () -> {
			for (int i = 0; i < 5; i++) {
				// Append a string to the shared StringBuffer
				sharedBuffer.append("A");
				System.out.println(Thread.currentThread().getName() + ": " + sharedBuffer);
				try {
					Thread.sleep(50); // Sleep to simulate work and allow context switching
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		};

		// Creating multiple threads
		Thread thread1 = new Thread(task, "Thread-1");
		Thread thread2 = new Thread(task, "Thread-2");

		// Starting the threads
		thread1.start();
		thread2.start();
	}
}
