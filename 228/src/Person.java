
public class Person {
	
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Hello from Person " + name);
	}
	
	public void dispay(String msg) {
		System.out.println("Hello from Person " + name + " :" + msg);
	}
}
