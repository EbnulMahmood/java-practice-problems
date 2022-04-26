
public class TestAccount {

	public static void main(String[] args) {

		StudentAccount ba = new StudentAccount("12", 12000, 304, 24);
		
		System.out.println(ba.calculateInterest());
		ba.taxCharged(100);
		System.out.println(ba.calculateInterest());
	}
}
