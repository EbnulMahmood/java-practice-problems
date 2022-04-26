
public class NewThread implements Runnable {
	
	String name;
	Thread t;
	
	public NewThread(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		System.out.println("New Thread: " + t);
		t.start();
	}
	
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " exiting.");
	}
}