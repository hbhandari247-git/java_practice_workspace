package threaddemo;

//Java program to demonstrate the usage of
//setDaemon() and isDaemon() method.

public class DaemonThreadExample extends Thread {
	public DaemonThreadExample(String name) {
		super(name);
	}

	public void run() {
		// Checking whether the thread is Daemon or not
		if (Thread.currentThread().isDaemon()) {
			System.out.println(getName() + " is Daemon thread");
		}

		else {
			System.out.println(getName() + " is User thread");
		}
	}

	public static void main(String[] args) {

		DaemonThreadExample t1 = new DaemonThreadExample("t1");
		DaemonThreadExample t2 = new DaemonThreadExample("t2");
		DaemonThreadExample t3 = new DaemonThreadExample("t3");

		// Setting user thread t1 to Daemon
		t1.setDaemon(true);

		// starting first 2 threads
		t1.start();
		t2.start();

		// Setting user thread t3 to Daemon
		//t3.start();
		t3.setDaemon(true); //You cannot set daemon flag on a running thread.
		t3.start();
	}
}
