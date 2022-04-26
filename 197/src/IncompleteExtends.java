
public class IncompleteExtends extends Incomplete {
	
	public void show() {
		System.out.println(a + " " + b);
	}

	@Override
	public void callback(int param) {
		System.out.println("Incomplete callback");
	}
}
