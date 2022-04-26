package arrayList;

import java.util.*;

public class TestCollection {

	public static void main(String[] args) {

		ArrayList <String> ar = new ArrayList<>();
		
		ar.add("Shovon, ");
		ar.add("Ebnul ");
		ar.add("Mahmood ");
		ar.add("Shovon ");
		ar.add("Ebnul ");
		
		Iterator itr = ar.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
		
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(i + ", " + ar.get(i));
		}
		
		ar.add(1, "Mirza");
		ar.remove(2);
		ar.remove("Mahmood ");
		System.out.println(ar);
	}
}
