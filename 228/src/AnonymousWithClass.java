
public class AnonymousWithClass {

	public static void main(String[] args) {

		Person p = new Person("Shovon") {
			public void display() {
				dispay("2");
				display(2);
				System.out.println("Hello from Annonymous");
			}
			
			public void display(int a) {
				System.out.println("Number: " + a);
			}
		};
		
		p.display();
		p.dispay("3");
	}
}
