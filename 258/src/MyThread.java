import java.util.ArrayList;
import java.util.Random;

public class MyThread extends Thread {
	
	public static ArrayList<Integer> list = new ArrayList<Integer>();
	public int num;
	
	public MyThread(int num) {
		this.num = num;
		start();
	}
	
	public void run() {
		Random rand = new Random();
		for (int i = 0; i < num; i++) {
//			list.add(rand.nextInt(100));
//			System.out.println(Thread.currentThread().getName() + ":" + MyThread.list);
			synchronized (list) {
				list.add(rand.nextInt(100));
			}
		}
	}
}
