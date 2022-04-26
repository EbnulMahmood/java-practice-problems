
public class Rectangle extends Shape {
    public Rectangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    public void getArea() {
        int area = dim1 * dim2;
        System.out.println("The Rectangle Area is: " + area);
    }
}
