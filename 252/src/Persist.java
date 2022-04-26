import java.io.*;

public class Persist {

	public static void main(String[] args) throws Exception {

		Student s1 = new Student("Shovon", "Dhaka", 01234);
		
		FileOutputStream fout = new FileOutputStream("Foutput.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(s1);
		out.close();
		out.flush();
		System.out.println("Success!");
	}
}
