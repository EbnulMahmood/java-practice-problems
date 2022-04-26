
public class RunnableDemo implements Runnable {
	
	private String name;
	private Thread t;
	
	public RunnableDemo(String threadname) {
		name = threadname;
		System.out.println("Creating " + name);
	}
	
	public void run() {
		System.out.println("Running " + name);
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Thread: " + name + ", " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread " + name + " exiting.");
	}
	
	public void start() {
		System.out.println("Starting " + name);
		if (t == null) {
			t = new Thread(this, name);
			t.start();
		}
	}
}
