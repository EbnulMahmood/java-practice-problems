package generics3;

public class GenMethod {
	
	public static <T> void printArray(T[] arr) {
		for (T s : arr) {
			System.out.printf(" %s,", s);
		}
	}

	public static void main(String[] args) {

		Integer[] intArr = { 1, 2, 3, 4, 5 };
		Double[] dArr = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Character[] chArr = { 'H', 'E', 'L', 'L', 'O' };
		String[] sArr = {"W", "o", "r", "l", "d"};
		
		System.out.println(" Integer Array: ");
		
		printArray(intArr);
		System.out.println("\n Double Array: ");
		printArray(dArr);
		System.out.println("\n Character Array: ");
		printArray(chArr);
		System.out.println("\n String Array: ");
		printArray(sArr);
	}
}
