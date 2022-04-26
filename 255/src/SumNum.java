import java.io.*;

public class SumNum {

	public static void main(String[] args) throws IOException {

		FileReader fin = null;
		String line = null;
		
		try {
			fin = new FileReader("numbers.txt");
			BufferedReader in = new BufferedReader(fin);
			BufferedWriter out = new BufferedWriter(new FileWriter("sum.txt"));
			
			while ((line = in.readLine()) != null) {
				String num[] = line.split(", ");
				int count = 0, sum = 0, avg = 0;
				for (int i = 0; i < num.length; i++) {
					count++;
					sum += Integer.parseInt(num[i]);
				}
				avg = sum / num.length;
				out.write("Total number: " + count);
				out.newLine();
				out.write("Sum: " + sum);
				out.newLine();
				out.write("Avg: " + avg);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
