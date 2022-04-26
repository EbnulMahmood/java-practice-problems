
public class Utility {
	
	int x, y;
	int addX() {
		x++;
		return x;
	}
	int subY() {
		y--;
		return y;
	}
	synchronized void print() {
		x = 0;
		y = 3;
		for (int i = 0; i < 2; i++) {
			System.out.println("x : " + addX());
			System.out.println("y : " + subY());
		}
	}
}
