package generics;

public class Gen <T> {
	
	T ob;

	public Gen(T ob) {
		this.ob = ob;
	}
	
	T getOb() {
		return ob;
	}
	
	public void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}
