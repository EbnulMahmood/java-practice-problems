
public class Son extends Parent {

	public double business;
	public double sonLand;
	
	public Son(double land, double heirloom, double letter, double money, double business, double sonLand) {
		super(land, heirloom, letter, money);
		this.business = business;
		this.sonLand = sonLand;
	}
	
	public void printSon() {
		System.out.println("land = " + land + ", heirloom = " + heirloom + ", letter = " + ", money = " + money + 
				", business = " + business + ", sonLand = " + sonLand);
	}
}
