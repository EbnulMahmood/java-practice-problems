package generics3;

public class BoundedType {

	public static <T extends Comparable<T>> T minimum(T x, T y, T z) {
		
		T min = x;
		if (y.compareTo(min) < 0) {
			min = y;
		}
		if (z.compareTo(min) < 0) {
			min = z;
		}
		return min;
	}
	
	public static <T extends Number> void printArray(String[] arr) {
		for (String s: arr) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		
		String arr[] = {"Hello ", "World!"};
		System.out.println("Minimum: " + minimum(4, 2, 3));
		printArray(arr);
	}
}
