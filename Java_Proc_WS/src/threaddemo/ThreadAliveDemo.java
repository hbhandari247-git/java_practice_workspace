package threaddemo;

public class ThreadAliveDemo extends Thread {

	public static int amount = 0;

	public static void main(String[] args) {
		ThreadAliveDemo thread = new ThreadAliveDemo();
		thread.start();
		// Wait for the thread to finish
		while (thread.isAlive()) {
			System.out.println("Waiting..." + thread.getId());
		}
		// Update amount and print its value
		System.out.println("ThreadAliveDemo: " + amount);
		amount++;
		System.out.println("ThreadAliveDemo: " + amount);
	}

	public void run() {
		amount++;
		//System.out.println("ThreadAliveDemo inside run : " + amount);
	}

}