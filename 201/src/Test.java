
public class Test {

	public static void main(String[] args) {

		C c = new C();
		c.meth1();
		c.meth2();
		c.meth3();
		c.meth4();
		
		A b = new C();
		b.meth1();
		b.meth2();
		
		B a = new C();
		a.meth1();
		a.meth2();
		a.meth3();
		a.meth4();
	}
}
