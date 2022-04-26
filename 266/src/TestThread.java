
public class TestThread {

	public static void main(String[] args) {

		PrintDemo pd = new PrintDemo();
		ThreadDemo t1 = new ThreadDemo("Thread 1", pd);
		ThreadDemo t2 = new ThreadDemo("Thread 2", pd);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
