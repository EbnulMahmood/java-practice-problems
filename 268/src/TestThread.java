
public class TestThread {
	public static void main(String[] args) {
		Thread t = new MyThread() {
			public void run() {
				System.out.print(" are you running?");
			}
		};
		t.start();
	}
}

class MyThread extends Thread {
	MyThread() {
		System.out.print("MyThread");
	}

	public void run() {
		System.out.print(" running");
	}

	public void run(String s) {
		System.out.print(s + " is running again");
	}
}