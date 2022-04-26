
public class Runner {

	public static void main(String[] args) {

		Rectangle sq = new Rectangle(10.0);
		Rectangle rect = new Rectangle(10.0, 1.0);
		
		System.out.println(sq.returnLength(54.0));
		System.out.println(rect.returnLength(50));
		sq.height = 9;
		rect.height = 10;
		Rectangle.height = 12;
		sq.width = 45;
		rect.width = 35;
		//sq.color = "Light" + sq.color;
		sq.test();
		rect.test();
//		Rectangle.test();
		System.out.println(sq.test(5));
		System.out.println(rect.test(19));
		
		System.out.println(sq.test(13.0));
		System.out.println(rect.test(1.34));
		rect.test(14, 459.0);
		System.out.println(rect.test("Shovon"));
	}
}
