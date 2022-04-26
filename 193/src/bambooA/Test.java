package bambooA;
import bambooB.Car;
public class Test {

	public static int num;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person("", 4.5);
		System.out.println(num);
		
		Car c = new Car("Shovon", 45);
		c.carPlateNo = "3";
		c.printDetails("Sh");
	}

}
