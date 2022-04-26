import java.io.*;

public class SplitNumber {

	public static void main(String[] args) {

		String input = "numbers.txt";
		String output = "output.txt";
		String line = null;

		try {
			FileReader fileReader = new FileReader(input);
			FileWriter fileWriter = new FileWriter(output);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			while ((line = bufferedReader.readLine()) != null) {
				String[] num = line.split(", ");
				int count = 0;
				int sum = 0, avg = 0;
				for (int i = 1; i < num.length; i++) {
					count ++;
					sum += Integer.parseInt(num[i]);	
				}
				avg = sum / num.length;
				bufferedWriter.write("Total Number: " + count);
				bufferedWriter.newLine();
				bufferedWriter.write("Summation: " + sum);
				bufferedWriter.newLine();
				bufferedWriter.write("Average: " + avg);
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
