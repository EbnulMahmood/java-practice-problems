package packageA;

public class B extends Base {
	
	int b;
	
	public B() {
		super();
	}

	public B(int x, int p, int q, int b) {
		super(x, p, q);
		this.b = b;
	}
	
	void show() {
		super.show();
		System.out.println("b = " + b);
	}
}
