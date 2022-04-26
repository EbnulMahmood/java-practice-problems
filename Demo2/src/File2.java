import java.io.*;

public class File2 {

	public static void main(String[] args) {

		String name = "Hello there";
		String output = "D:\\181\\Object-Oriented Programming\\Java\\Demo2\\File\\New-Text-Document-2.txt";

		try {
			FileWriter fileWriter = new FileWriter(output);
			
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
				bufferedWriter.write("Total Number: " + name);
				bufferedWriter.newLine();
				bufferedWriter.write("Summation: " + name);
				bufferedWriter.newLine();
				bufferedWriter.write("Average: " + name);
			
			bufferedWriter.close();

		} catch (FileNotFoundException e) {
			System.out.println("Unable to open file '" + output + "'");
		} catch (IOException ex) {
			System.out.println("Error writing to file '" + output + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}
	}
}
