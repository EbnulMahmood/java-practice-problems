
public class Animal {
	
	double width;
	String color;
	
	public Animal(double width, String color) {
		super();
		this.width = width;
		this.color = color;
	}

	public void eat() {
		System.out.println("Animal eats.");
	}
	
	public void sleep() {
		System.out.println("Animal sleeps.");
	}
}
