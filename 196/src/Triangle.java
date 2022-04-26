
public class Triangle extends Shape {
    public Triangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    public void getArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("The Rectangle Area is: " + area);
    }
}
