package packageA;

public class C extends B {
	
	int c;
	int x;

	public C(int c, int b, int x, int p, int q) {
		super(b, x, p, q);
		this.c = c;
		this.x = x*2;
	}
	
	public C(int c, int b, int x, int p, int q, int y) {
		super.b = b;
		super.q = q;
		super.x = x;
//		super.p = p;
		this.c = c;
		this.x = x;
	}
	
	void show() {
		super.show();
		System.out.println("c = " + c + "x = " + x);
	}
}
