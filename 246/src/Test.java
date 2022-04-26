import java.util.InputMismatchException;

public class Test {

	public static void main(String[] args) {

		try {
			method1();
		} catch (Exception e) {
			System.out.println("main catch");
			System.out.println(e);
		}
		method2();
	}
	
	public static void method1() throws Exception {
		try {
			System.out.println("method1 try");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1 catch");
			throw new InputMismatchException();
		}
		finally {
			System.out.println("method1 finally");
		}
	}
	
	public static void method2() {
		try {
			System.out.println("method2 try");
		} catch (Exception e) {
			System.out.println("method2 catch");
		}
	}
}
