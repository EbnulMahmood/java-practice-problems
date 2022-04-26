import java.io.*;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {

		Student s1 = new Student("Shovon", "Dhaka", "1234");
		Student s2 = new Student("Ebnul", "Shariatpur", "24234");
		
		FileOutputStream fout = new FileOutputStream("student.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.writeObject(s2);
		out.close();
		fout.close();
		System.out.println("Serialized data is saved!");
	}
}
