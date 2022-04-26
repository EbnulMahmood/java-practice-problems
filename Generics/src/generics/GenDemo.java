package generics;

public class GenDemo {

	public static void main(String[] args) {

		Gen<Integer> obi = new Gen<Integer>(190);
		
		obi.showType();
		int v = obi.getOb();
		System.out.println("value: " + v);
		System.out.println();
		
		Gen<String> strOb = new Gen<String>("Generics Test");
		
		strOb.showType();
		String str = strOb.getOb();
		System.out.println(str);
	}
}
