import java.util.StringTokenizer;

public class Sample2 {

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("Welcome to OOP");
		
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}
