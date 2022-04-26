
public class MemoryDemo {

	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();
		long men1, men2;
		Integer someints[] = new Integer[1000];
		
		System.out.println("Total memory is: " + r.totalMemory());
		
		men1 = r.freeMemory();
		System.out.println("Initial free memory: " + men1);
		
		r.gc();
		men1 = r.freeMemory();
		System.out.println("Free memory after garbage collection: " + men1);
		
		for (int i = 0; i < 1000; i++)
			someints[i] = new Integer(i);
		
		men2 = r.freeMemory();
		System.out.println("Free memory after allocation: " + men2);
		System.out.println("Memory used by allocation: " + (men1 - men2));
		
		for (int i = 0; i < 1000; i++)
			someints[i] = null;
		r.gc();
		
		men2 = r.freeMemory();
		System.out.println("Free memory after collection" + " discarded Integers: " + men2);
	}
}
