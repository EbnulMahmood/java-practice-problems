
public class TestAbstractClass {

	public static void main(String[] args) {

		Animal b = new Bird();
		Animal t = new Tiger("Tiger", "Black");
		
		b.eat();
		t.eat();
		
		b.makeSound();
		t.makeSound();
	}
}
