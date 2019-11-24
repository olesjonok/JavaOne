package lv.javaguru.demo.HomeWork.Shape;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        shapes[0] = new Square(5);
        shapes[1] = new Circle(10);
        shapes[2] = new Triangle(6, 4, 8);
        shapes[3] = new Square(8);
        shapes[4] = new Circle(25);
        shapes[5] = new Triangle(8, 2, 8);

        for (Shape shape : shapes) {
            System.out.println(shape.getName() + " : " + shape.getArea());
        }
    }
}
