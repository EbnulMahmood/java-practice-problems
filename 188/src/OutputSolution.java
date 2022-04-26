
public class OutputSolution {

	public static void main(String[] args) {

		A a = new A();
		B b = new B("Anik", "Ahmed");
		a.name = "Safat";
		a.printName();
		a = b;
		a.name = "Towhid";
		a.printName();
	}
}
