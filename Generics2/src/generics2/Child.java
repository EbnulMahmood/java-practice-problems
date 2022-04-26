package generics2;

public class Child extends Father {
	
	String name;

	public Child(String name, String name2) {
		super(name);
		name = name2;
	}
	
	public void land() {
		System.out.println("Land");
	}
	
	public void job() {
		System.out.println("Job");
	}
}
