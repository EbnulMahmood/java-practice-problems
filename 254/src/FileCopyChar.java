import java.io.*;

public class FileCopyChar {

	public static void main(String[] args) throws IOException {

		FileReader in = null;
		FileWriter out = null;
		
		try {
			in = new FileReader("input2.txt");
			out = new FileWriter("output2.txt");
			int c;
			int i = 1;
			while ((c = in.read()) != -1) {
				out.write(i);
				out.write(c);
				i++;
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
