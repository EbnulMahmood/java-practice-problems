
public class Parent {
	
	public double land;
	protected double heirloom;
	private double letter;
	double money;
	
	public Parent(double land, double heirloom, double letter, double money) {
		this.land = land;
		this.heirloom = heirloom;
		this.letter = letter;
		this.money = money;
	}

	public void printParent() {
		System.out.println("land = " + land + ", heirloom = " + heirloom + ", letter = " + letter + ", money = " + money);
	}
}
