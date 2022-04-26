
public class Circle extends Shape {
    public Circle(int dim1, int dim2) {
        this.dim1=dim1;
        this.dim2=dim2;
    }
    
    public void getArea() {
        double ar1 = 3.1416 * dim1 * dim1;
        double ar2 = 3.1416 * dim2 * dim2;
        System.out.println("The Conic Area for dim1 is: "+ar1);
        System.out.println("The Conic Area for dim2 is: "+ar2);
    }
}
