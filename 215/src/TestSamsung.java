
public class TestSamsung {

	public static void main(String[] args) {

		SamsungS6 s6 = new SamsungS6("Samsung", "S6");
		SamsungS3 s = new SamsungS6("Samsung", "S3");
		
		s.update1();
		s.update2();
		s.update3();
		System.out.println("guarantee " + s.guarantee() + " years.");
		System.out.println(s);
		s6.update1();
		s6.update2();
		s6.update3();
		System.out.println("guarantee " + s6.guarantee() + " years.");
		System.out.println(s6);
	}
}
