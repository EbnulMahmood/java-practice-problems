
public class NewThread implements Runnable {
	
	Thread t;

	public NewThread() {
		t = new Thread(this, "Demo Thread");
		System.out.println("Child thread: " + t);
		t.start();
	}
	
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(400);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Exiting child thread.");
	}
}
