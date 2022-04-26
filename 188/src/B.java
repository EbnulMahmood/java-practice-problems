
public class B extends A {
	
	public String name;

	public B(String name1, String name2) {
		this.name = name1;
		super.name = name2;
	}
	
	public void printName() {
		System.out.println("B: " + super.name);
	}
}
