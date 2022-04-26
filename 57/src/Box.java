public class Box {
	double width;
	double height;
	double depth;
	
	void volume1() {
		System.out.print("Volume1 is ");
		System.out.println(width * height * depth);
	}
	
	double volume2() {
		return width * height * depth;
	}
	
	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
}
