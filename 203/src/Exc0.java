
public class Exc0 {

	public static void main(String[] args) {

		int a = 0;
		int b;
		try {
			b = 123/a;
			System.out.println("This will not be printed.");
			System.out.println(b);
		} catch (ArithmeticException e) {
			System.out.println("Division by Zero " + e);
		}
		System.out.println("After catch statement.");
	}
}
