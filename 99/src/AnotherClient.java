
public class AnotherClient implements Callback {
	
	public void Callback(int p) {
		System.out.println("Another version of Callback");
		System.out.println("p squared is " + (p * p));
	}
}
