
public class InnerOuter {

	public static void main(String[] args) {

		A oc = new A();
		
		A.B in = oc.new B();
		
		in.display();
		System.out.println("-----");
		oc.display();
	}
}
