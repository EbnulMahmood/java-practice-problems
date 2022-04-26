package packageA;

public class Base {
	
	int x;
	private int p;
	protected int q;
	
	public Base() {
		
	}
	
	public Base(int x, int p, int q) {
		this.x = x;
		this.p = p;
		this.q = q;
	}
	
	void show() {
		System.out.println("The varables are: ");
		System.out.println("p = " + p + "q = " + q + "x = " + x);
	}
}
