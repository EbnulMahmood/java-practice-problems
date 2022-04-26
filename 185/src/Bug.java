
public class Bug {
	
	String name;
	boolean hasWings;
	
	public Bug(String name, boolean hasWings) {
		this.name = name;
		this.hasWings = hasWings;
	}

	public boolean canFly() {
		System.out.println("Can Fly");
		return true;
	}
	
	public void sting() {
		System.out.println("Sting");
	}
}
