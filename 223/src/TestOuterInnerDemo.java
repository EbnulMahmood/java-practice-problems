
public class TestOuterInnerDemo {

	public static void main(String[] args) {

		Outer outer = new Outer();
		
		outer.show();
		Outer.Inner inner = outer.new Inner();
		
		inner.display();
		System.out.println("Inner b = " + inner.b + " Inner c = " + inner.c + " Inner d = " + inner.c);
	}
}
