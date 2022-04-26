package p2;

public class OtherPackage {
	
	OtherPackage() {
		p1.Protection p = new p1.Protection();
		System.out.println("Other package constructor");
		System.out.println("Base constructor");
//		System.out.println("n = " + p.n);
//		System.out.println("n_pri = " + p.n_pri);
//		System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}
}
