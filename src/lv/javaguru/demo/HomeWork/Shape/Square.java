package lv.javaguru.demo.HomeWork.Shape;

public class Square extends AbstractShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double getArea() {
        return side * side;
    }

}
