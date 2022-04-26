
public class ThreadDemo extends Thread {

	Thread t;
	String name;
	PrintDemo PD;

	public ThreadDemo(String threadname, PrintDemo pd) {
		name = threadname;
		PD = pd;
	}

	public void run() {
		synchronized (PD) {
			PD.print();
		}
		System.out.println(name + " exiting.");
	}

	public void start() {
		System.out.println("Starting " + name);
		if (t == null) {
			t = new Thread(this, name);
			t.start();
		}
	}
}
