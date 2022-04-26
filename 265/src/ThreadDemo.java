
class ThreadDemo3 extends Thread {
	private Thread t;
	private String threadName;
	PrintDemo PD;

	ThreadDemo3(String name, PrintDemo pd) {
		threadName = name;
		PD = pd;
	}

	public void run() {
		// PD.printCount();
		synchronized (PD) {
			PD.printCount();

		}
		System.out.println("Thread " + threadName + " exiting.");
	}

	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}