import java.io.*;

public class Student implements Serializable {
	
	String name;
	transient String add;
	String id;
	
	public Student(String name, String add, String id) {
		this.name = name;
		this.add = add;
		this.id = id;
	}
}
