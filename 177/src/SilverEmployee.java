
public class SilverEmployee extends Employee {
	
	double bonus = 0.0;
	double totalSalary = 0.0;
	public SilverEmployee(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}

	@Override
	public void printSalary() {
		bonus = getSalary() * (bonus / 100);
		totalSalary = getSalary() + bonus;
		System.out.println("Silver Employee's Total Salary: " + totalSalary);
	}
}
