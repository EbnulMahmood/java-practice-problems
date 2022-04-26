
public class Test2 {

	public static void main(String[] args) {

		Callback c = new Client();
		AnotherClient ob = new AnotherClient();
		Callback c2 = new AnotherClient();
		Callback i = new IncompleteExtends();
		Incomplete i2 = new IncompleteExtends();
		IncompleteExtends i3 = new IncompleteExtends();
		c2 = c;
		c2.callback(23);
		c.callback(42);
		c = ob;
		c.callback(45);
		i.callback(34);
		//i1.show(); //error
		i2.show();
		i3.callback(13);
		i3.show();
	}
}
