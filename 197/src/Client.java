
class Client implements Callback {
	
	public void callback(int p) {
		System.out.println("Callback called with " + p);
	}
	
	void nonIfaceMeth() {
		System.out.println("non-Interface Method.");
	}
}
