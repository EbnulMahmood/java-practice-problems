
public class TestAdder {

	public static void main(String[] args) {

		Add A = new Add(3);
		DAdd DA = new DAdd(1, 5);
		
		A.addIt(2);
		System.out.println(A.getIt());
		A = DA;
//		System.out.println(A.getIt());
//		System.out.println(DA.getIt());
//		System.out.println(A.i);
		A.addIt(2);
//		System.out.println(A.i);
		System.out.println(A.getIt());
//		System.out.println(DA.getIt());
		DA.doubleIt(2);
		System.out.println(A.getIt());
//		System.out.println(DA.getIt());
	}
}
