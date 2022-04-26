
public class DAdd extends Add {
	
	private int i;
	
	DAdd(int a, int b) {
		super(a);
		i = b;
	}
	
	protected void addIt(int amount) {
		i = i * super.i + amount;
	}
	
	protected int getIt() {
		return i + 1;
	}
	
	protected void doubleIt(int amount) {
		addIt(2 * amount);
	}
}
