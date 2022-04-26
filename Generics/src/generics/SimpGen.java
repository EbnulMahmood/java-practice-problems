package generics;

public class SimpGen {

	public static void main(String[] args) {

		TwoGen<Integer, String> tgobj = new TwoGen<Integer, String>(123, "Generics");
		
		tgobj.showType();
		int v = tgobj.getOb1();
		System.out.println("value: " + v);
		String str = tgobj.getOb2();
		System.out.println("value: " + str);
	}
}
