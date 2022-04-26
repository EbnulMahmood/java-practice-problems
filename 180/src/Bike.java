import java.lang.Object;

public class Bike extends Vehicle {
	
	Bike() {
		super("Hero");
		System.out.println("Bike is created.");
	}
	
	public static void main(String[] args) {
		
		Bike b = new Bike();
//		Vehicle v = new Vehicle("Shovon");
//		int hc = v.hashCode();
//		System.out.println(v);
	}
}
