
public class Cockroach extends Bug {
	
	public Cockroach(String name, boolean hasWings) {
		super(name, hasWings);
	}

	public boolean canFly() {
		System.out.println("Cockroach can Fly");
		return true;
	}
}
