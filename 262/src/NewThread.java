
public class NewThread implements Runnable {
	
	String name;
	Thread t;
	
	NewThread(String threadname) {
		name = threadname;
		t = new Thread(this, name);
		System.out.println("New Thread: " + t);
		t.start();
	}
	
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Exiting child thread.");
	}
}
