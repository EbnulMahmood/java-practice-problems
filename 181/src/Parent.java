
public class Parent {
	
	private int a;
	protected int b;
	public int c;
	int d;
	static int e = 89;
	
	public Parent(int a, int b, int c, int d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public void display() {
		System.out.println("Parent " + e);
	}
	
	public static int display(int s) {
		e = s;
		return 0;
	}
}
