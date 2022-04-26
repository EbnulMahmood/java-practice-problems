
public class Outer {
	
	int outer_x = 100;
	
	void test() {
		Inner inner = new Inner();
		inner.display();
	}
	
	class Inner {
		int y = 10;
		
		void display() {
			System.out.println("display: outer_x = " + outer_x);
		}
	}
	
	void showy() {
		Inner inner = new Inner();
//		System.out.println(y);
		System.out.println("y = " + inner.y);
	}
}
