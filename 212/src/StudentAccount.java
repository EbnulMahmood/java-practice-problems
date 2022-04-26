
public class StudentAccount extends BankAccount implements Taxable {

	String id;
	double balance;
	int time;
	double rate;
	public StudentAccount(String id, double balance, int time, double rate) {
		super(id);
		this.balance = balance;
		this.time = time;
		this.rate = rate;
	}
	
	public void taxCharged(double amount) {
		this.balance = amount;
	}
	
	public double calculateInterest() {
		double amount = (balance * time * rate) / 100;
		return amount;
	}
}
