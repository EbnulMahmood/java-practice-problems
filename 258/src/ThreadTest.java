
public class ThreadTest {

	public static void main(String[] args) {

		MyThread t1 = new MyThread(3);
		MyThread t2 = new MyThread(4);
		MyThread t3 = new MyThread(2);
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(MyThread.list);
	}
}
