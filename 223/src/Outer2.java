
public class Outer2 {

	int a = 1;
	public int b = 2;
	protected int c = 3;
	private int d = 4;
	
	void show2() {
		Inner2 in = new Inner2();
		in.display2();
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
	
	class Inner2 {
		int a = 5;
		public int b = 6;
		protected int c = 7;
		private int d = 8;
		
		void display2() {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
			System.out.println("d = " + d);
		}
	}
}
