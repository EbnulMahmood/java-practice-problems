
public class TestOuterInnerDemo2 {

	public static void main(String[] args) {

		Outer2 o2 = new Outer2();
		
		System.out.println("Outer Call: ");
		o2.show2();
		System.out.println("a = " + o2.a);
		System.out.println("b = " + o2.b);
		System.out.println("a = " + o2.c);
		
		Outer2.Inner2 i2 = o2.new Inner2();
		
		System.out.println("Inner Call: ");
		i2.display2();
		System.out.println("a = " + i2.a);
		System.out.println("b = " + i2.b);
		System.out.println("a = " + i2.c);
		
	}
}
