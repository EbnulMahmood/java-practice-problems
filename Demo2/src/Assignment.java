import java.io.*;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment {

	public static void main(String[] args) {

		String input = "input.txt";
		String output = "output.txt";
		String line = null;

		try {
			FileReader fileReader = new FileReader(input);
			FileWriter fileWriter = new FileWriter(output);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			while ((line = bufferedReader.readLine()) != null) {
				String[] n = line.split(",");
				int j = 0, cnt = 0;
				int s = 0, a = 0;
				while (j < n.length) {
					cnt ++;
					s += Integer.parseInt(n[j]);
					a = s / n.length;
					j++;
				}
				bufferedWriter.write("Total = " + cnt);
				bufferedWriter.newLine();
				bufferedWriter.write("Summation = " + s);
				bufferedWriter.newLine();
				bufferedWriter.write("Average = " + a);
			}
			
			bufferedReader.close();
			bufferedWriter.close();

		} catch (FileNotFoundException e) {
			System.out.println("Unable to open file '" + input + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + input + "'");
			System.out.println("Error writing to file '" + output + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}
	}
}
