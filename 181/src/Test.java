
public class Test {

	public static void main(String[] args) {
		
		Parent p = new Parent(10, 20, 30, 40);
		System.out.println(p.d + ", " + p.c + ", " + p.b);
		p.display();
		
		Child c = new Child(50, 60, 70, 80);
		System.out.println(c.d + ", " + c.c + ", " + c.b);
		c.display();
		Parent c2 = new Child(7, 8, 9, 100);
		System.out.println(c2.d + ", " + c2.c + ", " + c2.b);
		c2.display();
	}
}
