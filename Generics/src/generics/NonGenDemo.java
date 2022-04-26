package generics;

public class NonGenDemo {

	public static void main(String[] args) {

		NonGen iob = new NonGen(123);
		
		iob.showType();
//		System.out.println(iob.getOb());
		int v = (Integer) iob.getOb();
		System.out.println("value: " + v);
		
		NonGen strOb = new NonGen("Non-Generics Test");
		
		strOb.showType();
		String str = (String) strOb.getOb();
		System.out.println("value: " + str);
	}
}
