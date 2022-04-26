
public class Outer {
	
	private int x = 10;
	
	class Inner {
		private int x = 20;
		public void show(int x) {
			System.out.println("Parameter: " + x);
			System.out.println("Inner variable: " + this.x);
			System.out.println("Outer variable: " + Outer.this.x);
		}
	}
	
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		
		i.x = 14;
		i.show(30);
		
	}
}
