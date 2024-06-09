package procparttwo;

import java.util.concurrent.atomic.LongAdder;

class IncrementTask implements Runnable {
	private LongAdder longAdder;

	public IncrementTask(LongAdder longAdder) {
		this.longAdder = longAdder;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			longAdder.increment();
		}
	}
}

public class LongAdderConcurrentExample {
	public static void main(String[] args) throws InterruptedException {
		LongAdder longAdder = new LongAdder();

		// Create an array of threads
		Thread[] threads = new Thread[10];

		// Start each thread
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new IncrementTask(longAdder));
			threads[i].start();
		}

		// Wait for all threads to finish
		for (Thread thread : threads) {
			thread.join();
		}

		// Get the sum
		long sum = longAdder.sum();

		System.out.println("Sum: " + sum); // Output: Sum: 10000
	}
}
