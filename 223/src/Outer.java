
public class Outer {
	
	private int data = 10;
	
	void show() {
		Inner i = new Inner();
		i.display();
		System.out.println("Inner: ");
		System.out.println("a = " + i.a);
		System.out.println("b = " + i.b);
		System.out.println("c = " + i.c);
		System.out.println("d = " + i.d);
	}
	
	class Inner {
		
		private int a = 12;
		protected int b = 22;
		int c = 144;
		public int d = 1234;
		public void display() {
			System.out.println("Outer : data = " + data);
		}
	}
}
