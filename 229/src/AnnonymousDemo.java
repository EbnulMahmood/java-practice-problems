
public class AnnonymousDemo {

	public static void main(String[] args) {

		Person p = new Person("Shovon") {
			
			@Override
			void display(String mag) {
				System.out.println("Hello " + mag);
			}
			
			@Override
			void display() {
				System.out.println("Hi");
			}
		};
		p.display();
		p.display("World");
	}
}
