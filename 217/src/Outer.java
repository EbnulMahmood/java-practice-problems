
public class Outer {
	
	private int outer_x = 1000;
	
	void test() {
		Inner inner = new Inner();
		inner.display();
	}
	
	private class Inner {
		void display() {
			System.out.println("display: outer_x = " + outer_x);
		}
	}
}
