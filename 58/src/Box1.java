
public class Box1 {
	double width;
	double height;
	double depth;
	
	double volume() {
		return width * height * depth;
	}
	
	Box1() {
		System.out.println("Constructing Box");
		width = 10;
		height = 10;
		depth = 10;
	}
}
