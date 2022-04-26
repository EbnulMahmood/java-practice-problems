
public class Main {

	public static void main(String[] args) {

		Test t1 = new Test("Sho", "Von");
		Test t2 = new Test("Mah", "Mood");
		t1.print();
		t2.print();
		t1 = t2;
		t1.print();
		t2.print();
		Test t3 = new Test("Mirza", "Ebnul");
		t2 = t3;
		t1.print();
		t2.print();
		t3.universeFriend(t2);
		t3.print();
		t2.print();
	}
}
