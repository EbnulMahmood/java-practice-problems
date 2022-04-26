import java.io.*;

public class Employee implements Serializable {
	
	String name;
	transient String address;
	int SSN;
	int number;
	
	public Employee() {
		
	}
	
	public Employee(String name, String address, int sSN, int number) {
		this.name = name;
		this.address = address;
		SSN = sSN;
		this.number = number;
	}
}
