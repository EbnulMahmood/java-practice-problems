import java.util.StringTokenizer;

public class Simple {

	public static void main(String[] args) {
		
		String st = "Welcome to OOP";
		String[] words = st.split(" ");
		
		for (String s: words)
			System.out.println(s);
	}
}
