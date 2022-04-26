import java.io.*;

public class Depersist {

	public static void main(String[] args) {

		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Foutput.txt"));
			Student s = (Student) in.readObject();
			System.out.println("Name: " + s.name + " Address: " + s.address + " ID: " + s.id);
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
