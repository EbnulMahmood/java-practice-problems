
public class TestOuter {

	static int data = 30;
	
	static class Inner {
		void msg() {
			System.out.println("data is " + data);
		}
		
		static void msg(String msg) {
			System.out.println(msg);
		}
	}
	
	public static void main(String[] args) {

		TestOuter.Inner obj = new TestOuter.Inner();
		
		obj.msg();
		
		TestOuter.Inner.msg("Hello");
	}
}
