package generics;

public class NonGen {
	
	Object ob;

	public NonGen(Object ob) {
		this.ob = ob;
	}
	
	Object getOb() {
		return ob;
	}
	
	public void showType() {
		System.out.println(ob.getClass().getName());
	}
}
