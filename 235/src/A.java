
public class A {
	
	public String name1 = "Outer Class";
	
	void display() {
		new B().display();
		System.out.println("Outer");
	}
	
	class B {
		String name = "Inner Class";
		void display() {
			System.out.println(name1 + ":" + name);
		}
	}
}
