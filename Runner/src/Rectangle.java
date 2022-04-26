
public class Rectangle {
	
	final String color = "red";
	static int height;
	private double length;
	protected double width;
	
	double returnLength(double length) {
		System.out.println("In double");
		return this.length;
	}
	
	double returnLength(int length) {
		System.out.println("In int");
		return this.length;
	}

	public Rectangle(double l) {
		this.length = l;
		this.width = l;
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public void test() {
		System.out.println("No param");
	}
	
	public double test(int num) {
		return num;
	}
	
	public int test(double num) {
		return (int) num;
	}
	
	public void test(int a, double b) {
		a = (int) b;
		System.out.println("a = b = " + a);
	}
	
	public String test(String name) {
		return name;
	}
}
