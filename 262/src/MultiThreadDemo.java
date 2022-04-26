
public class MultiThreadDemo {

	public static void main(String[] args) throws InterruptedException {

		new NewThread("One");
		new NewThread("Two");
		new NewThread("Three");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main thread exiting.");
	}
}
