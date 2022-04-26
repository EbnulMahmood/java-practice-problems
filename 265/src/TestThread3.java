
class TestThread3 {
	public static void main(String args[]) {

		PrintDemo PD = new PrintDemo();

		ThreadDemo3 T1 = new ThreadDemo3("Thread - 1 ", PD);
		ThreadDemo3 T2 = new ThreadDemo3("Thread - 2 ", PD);

		T1.start();
		T2.start();

		// wait for threads to end
		try {
			T1.join();
			T2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
	}
}