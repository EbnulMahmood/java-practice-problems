
public class PrintDemo {
	
	synchronized public void print() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("counter : " + i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
