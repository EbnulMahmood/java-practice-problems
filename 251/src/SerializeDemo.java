import java.io.*;

public class SerializeDemo {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.name = "Shovon";
		e.address = "Dhaka";
		e.SSN = 12135346;
		e.number = 123;
		
		Employee p = new Employee("Ebnul", "Dhaka", 13, 24235);
		
		try {
			FileOutputStream fileOut = new FileOutputStream("employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.writeObject(p);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in D:\\181\\Object-Oriented Programming\\Java\\251\\employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}
