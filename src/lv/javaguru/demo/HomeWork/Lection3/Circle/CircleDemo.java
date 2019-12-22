package lv.javaguru.demo.HomeWork.Lection3.Circle;


public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 3;
        double area = circle.calculateArea();
        System.out.println("r = " + circle.radius);
        System.out.println("S = " + Math.PI + " * " + circle.radius * circle.radius + " = " + circle.calculateArea());
    }
}
