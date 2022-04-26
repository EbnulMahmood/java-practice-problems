
public class Simple {

	public static void main(String[] args) {

		String st = new String("Welcome, Hello, Friend.java");
		String[] words = st.split(",");
		
		for (String s: words)
			System.out.println(s);
	}
}
