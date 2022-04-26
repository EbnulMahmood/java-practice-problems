import java.util.*;

public class ArrayListClass {

	public static void main(String[] args) {

		ArrayList<String> arSt = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			String name = "CookieMonstor" + i;
			arSt.add(name);
		}
		for (int i = 0; i < 3; i++) {
			String name = "CookieMonstor" + i * 5;
			if (!arSt.contains(name)) {
				arSt.add(name);
			}
		}
		
		arSt.add("CerealKiller420");
		
		arSt.add("Mojojojo");
		arSt.remove(4);
		arSt.remove(5);
		arSt.remove("CookieMonstor1");
		for (int i = 0; i < arSt.size(); i++) {
			System.out.println(arSt.get(i) + ", ");
		}
	}
}
