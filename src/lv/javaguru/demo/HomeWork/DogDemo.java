package lv.javaguru.demo.HomeWork;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.age = 5;
        dog.color = "white";
        dog.name = "Fluffy";

        System.out.println("Dog's name: " + dog.name);
        System.out.println("Dog's color: " + dog.color);
        System.out.println("Dog's age: " + dog.age);

        dog.sleep();
        dog.eat();
        dog.voice();

            }
}
