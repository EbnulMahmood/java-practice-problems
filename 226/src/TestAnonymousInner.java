
public class TestAnonymousInner {
	
	public static void main(String[] args) {

		Person p = new Person() {
			void eat() {
				System.out.println("Nice fruits");
			}
		};
		
		p.eat();
	}
}
