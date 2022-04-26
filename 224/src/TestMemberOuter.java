
public class TestMemberOuter {
	
	public void show() {
		System.out.println("Show Method");
		Inner inner = new Inner();
		inner.msg();
		System.out.println("_End of Show Method_");
	}
	
	class Inner {
		private void msg() {
			System.out.println("Inner Method");
		}
	}
	
	public static void main(String[] args) {
		
		TestMemberOuter outer = new TestMemberOuter();
		
		outer.show();
		
		TestMemberOuter.Inner in = outer.new Inner();
		
		in.msg();
	}
}
