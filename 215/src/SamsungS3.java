
public abstract class SamsungS3 {

	private String name;
	private String model;
	
	public SamsungS3(String name, String model) {
		this.name = name;
		this.model = model;
	}
	
	public int guarantee() {
		return 3;
	}
	
	public abstract void update1();
	public abstract void update2();
	public abstract void update3();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public String toString() {
		return "Samsung [name = " + name + ", model = " + model + "]";
	}
}
