
public class NestTry2 {

	public static void main(String[] args) {

		int a = 1;
		int b;
		try {
			b = 43/a;
			try {
				if (a == 1)
					b = 42/0;
				int c[] = {1};
				if (a == 2)
					c[42] = 99;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index Out Of Bounds Exception " + e);
			}
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception " + e);
		}
	}
}
