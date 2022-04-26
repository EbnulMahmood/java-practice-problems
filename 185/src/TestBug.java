
public class TestBug {
	
	public static void showInfo(Bug b) {
		b.canFly();
		b.sting();
	}
	
	public static void main(String[] args) {
		
		Bug a = new Ant("Ant", false);
		Bug c = new Cockroach("Cochroach", true);
		showInfo(c);
		showInfo(a);
	}
}
