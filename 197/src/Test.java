
public class Test {

	public static void main(String[] args) {

		Callback cl = new Client();
		Client c = new Client();
		
		cl.callback(123);
		c.callback(456);
		c.nonIfaceMeth();
	}
}
