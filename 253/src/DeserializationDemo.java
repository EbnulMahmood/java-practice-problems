import java.io.*;

public class DeserializationDemo {

	public static void main(String[] args) throws Exception {

		Student s1 = null, s2 = null;
		
		try {
			FileInputStream fin = new FileInputStream("student.ser");
			ObjectInputStream in = new ObjectInputStream(fin);
			s1 = (Student) in.readObject();
			s2 = (Student) in.readObject();
			System.out.println("Name: " + s1.name + " Address: " + s1.add + " ID: " + s1.id);
			in.close();
			fin.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Name: " + s1.name + " Address: " + s1.add + " ID: " + s1.id);
		System.out.println("Name: " + s2.name + " Address: " + s2.add + " ID: " + s2.id);
	}
}
