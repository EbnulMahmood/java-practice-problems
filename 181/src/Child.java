
public class Child extends Parent {

	private int a;
	protected int b;
	public int c;
	int d;
	static int e = 889;
	
	public Child(int a, int b, int c, int d) {
		super(a, b, c, d);
	}
	
	public void display() {
		super.display();
		System.out.println("Child " + e);
	}
	
	public static int display(int s) {
		e = s;
		return 0;
	}
}
