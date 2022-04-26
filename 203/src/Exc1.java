
public class Exc1 {

	static void subroutine() throws ArithmeticException {
		int a = 0;
		int b = 123/a;
	}
	
	public static void main(String[] args) {

		try {
		subroutine();
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}
