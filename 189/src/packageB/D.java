package packageB;
import packageA.Base;

public class D extends Base {
	
	public int d = 10;
	
	void show() {
//		super.show();
//		System.out.println("x = " + x);
		System.out.println("q = " + q);
		System.out.println("d = " + d);
	}
	
	public String toString() {
		return "d = " + d;
	}
}
