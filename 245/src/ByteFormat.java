import java.io.*;

public class ByteFormat {

	public static void main(String[] args) {

		InputStream is = System.in;
		int a = 0;
		System.out.println("Write Something or 'x' to exit.");
		
		while (a != 'x') {
			try {
				a = is.read();
				System.out.println((char) a + ":" + a);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Programs ends");
	}
}
