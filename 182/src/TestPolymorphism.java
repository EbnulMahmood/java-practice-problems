
public class TestPolymorphism {

	public static void main(String[] args) {

		Animal b = new Bird(12.3, "Black");
		b.sleep();
		((Bird)b).canFly();
		
		Animal h = new Horse(123.3, "Blue");
		h.sleep();
	}
}
