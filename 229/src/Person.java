
public abstract class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}
	
	abstract void display();
	abstract void display(String mag);
}
