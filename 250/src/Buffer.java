import java.io.*;

public class Buffer {
	
	public static void main(String[] args) throws Exception {
		
		String thisLine = null;
		FileReader in = null;
		FileWriter out = null;
		
		try {
			in = new FileReader("input.txt");
			out = new FileWriter("output.txt");
			BufferedReader br = new BufferedReader(in);
			BufferedWriter bw = new BufferedWriter(out);
			int i = 1;
			while ((thisLine = br.readLine()) != null) {
				System.out.println(i + ". " + thisLine);
				bw.write(i + ". " + thisLine);
				bw.newLine();
				i++;
			}
			br.close();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
