package packageA;
import packageB.D;

public class Test {

	public static void main(String[] args) {

		C c = new C(1, 2, 3, 4, 5);
		c.show();
		D d = new D();
		System.out.println(d.toString());
		System.out.println(d);
	}
}
