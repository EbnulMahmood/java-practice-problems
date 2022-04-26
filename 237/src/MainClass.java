
public class MainClass {

	public static void main(String[] args) {

		ParentClass oc = new ParentClass();
		
		oc.display();
		
		ParentClass.NewClass in = oc.new NewClass();
		
		in.display();
	}
}
