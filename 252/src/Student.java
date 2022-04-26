import java.io.*;

public class Student implements Serializable {
	
	String name;
	String address;
	int id;
	
	public Student(String name, String address, int id) {
		this.name = name;
		this.address = address;
		this.id = id;
	}
}
