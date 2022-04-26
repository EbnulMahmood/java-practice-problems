
public abstract class BankAccount {
	
	public String id;
	public double balance;
	
	public BankAccount(String id) {
		this.id = id;
	}
	
	public abstract double calculateInterest();
}
