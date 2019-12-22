package lv.javaguru.demo;


public class SimpleTest {
    protected String brand;
    protected int speed;

    public SimpleTest(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    public void accelerate() {
        this.speed++;
    }
    public void decelerate() {
        this.speed--;
    }
    @Override
    public String toString() {
        return "Bicycle{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }
}
