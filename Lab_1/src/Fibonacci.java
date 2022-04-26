
public class Fibonacci {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		int fi;

		for (int i = 1; i <= 10; i++) {

		fi = n1 + n2;
		n1 = n2;
		n2 = fi;
		System.out.println(fi);
		}
	}
}
