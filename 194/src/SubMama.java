
public class SubMama extends SuperMama {
	
	void print() {
		System.out.println("I'm Choto Mama");
	}
	
	public String decode(String quote) {
		String reverse = new StringBuffer(quote).reverse().toString();
		System.out.println(reverse);
		return reverse;
	}
	
	public String encode(String quote) {
		String reverse = new StringBuffer(quote).reverse().toString();
		System.out.println(reverse);
		return reverse;
	}
}
