
public class PlatinumEmployee extends Employee {

	double bonus = 0.0;
	double totalSalary = 0.0;
	public PlatinumEmployee(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}

	@Override
	public void printSalary() {
		bonus = getSalary() * (bonus / 100);
		totalSalary = getSalary() + bonus;
		System.out.println("Platinum Employee's Total Salary: " + totalSalary);
	}
}
