package generics2;

public class Gen <T extends Father> {

	T ob;

	public Gen(T ob) {
		this.ob = ob;
	}
	
	public void print() {
		System.out.println(ob);
	}
}
