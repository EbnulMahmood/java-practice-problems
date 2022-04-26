
public class NewThread extends Thread {
	
	public NewThread() {
		
		super("Demo Thread");
		System.out.println("Child Thread: " + this);
		start();
	}
	
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child thread: " + i);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Exiting child thread.");
	}
}
