
public class MainClass {

	public static void main(String[] args) {

		ParentClass oc = new ParentClass();
		
		oc.name = "Matata";
		oc.display();
		
		oc = new ParentClass() {
			void display() {
				show();
				System.out.println("Display");
				
			}
			
			void show() {
				System.out.println("Hello");
			}
		};
		oc.display();
		System.out.println(oc.name);
		
		ParentClass p = new ParentClass() {
			void display() {
				System.out.println("Anonymous");
			}
		};
		
		p.display();
		System.out.println(p.name);
	}
}
