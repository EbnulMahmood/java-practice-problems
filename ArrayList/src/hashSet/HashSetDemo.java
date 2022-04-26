package hashSet;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet <String> hs = new HashSet<>();
		
		hs.add("Mirza ");
		hs.add("Ebnul ");
		hs.add("Mahmood ");
		hs.add("Shovon");
		
		ArrayList<String> arr = new ArrayList<>();
		arr.addAll(hs);
		if (hs.contains("Shovon")) {
			System.out.println("YES");
		}
		System.out.println(hs);
		System.out.println(arr);
	}
}
