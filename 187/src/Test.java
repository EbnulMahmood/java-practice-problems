
public class Test {
	
	public String n1;
	public String n2;
	public Test t;
	
	public Test(String n1, String n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public void print() {
		System.out.println(n1 + " " + n2);
	}
	
	public void universeFriend(Test p) {
		t = p;
		t.n2 = "Shovon";
	}
}
