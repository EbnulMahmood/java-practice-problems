
public class DemoJoin {

	public static void main(String[] args) {

		NewThread t1 = new NewThread("One");
		NewThread t2 = new NewThread("Two");
		NewThread t3 = new NewThread("Three");
		
		System.out.println("Thread One is alive: " + t1.t.isAlive());
		System.out.println("Thread Two is alive: " + t2.t.isAlive());
		System.out.println("Thread Three is alive: " + t3.t.isAlive());
		
		try {
			System.out.println("Waiting for threads to finish.");
			t1.t.join();
			t2.t.join();
			t3.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread One is alive: " + t1.t.isAlive());
		System.out.println("Thread Two is alive: " + t2.t.isAlive());
		System.out.println("Thread Three is alive: " + t3.t.isAlive());
		
		System.out.println("Main Thread exiting.");
	}
}
