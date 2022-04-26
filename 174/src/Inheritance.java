
public class Inheritance {

	public static void main(String[] args) {
		
		Parent f = new Parent(10000, 13, 15, 200000);
		Son s = new Son(234005, 188, 454, 298566, 454, 34);
		f.printParent();
		s.printSon();
		s.printParent();
	}
}
