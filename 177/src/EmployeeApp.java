
public class EmployeeApp {

	public static void main(String[] args) {
		
		Employee pe = new PlatinumEmployee("Toukir", 30000.0, 15);
		Employee se = new SilverEmployee("Shovon", 20000.0, 7);
		
		pe.printSalary();
		se.printSalary();
	}
}
