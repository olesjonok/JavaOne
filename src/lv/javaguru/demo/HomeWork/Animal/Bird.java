package lv.javaguru.demo.HomeWork.Animal;

import java.util.Objects;

public class Bird extends Animal {
    protected int age;


    public Bird(String name, int bornYear, String placeOfBirth, int age) {
        super(name, bornYear, placeOfBirth);
        this.age = age;
    }

    public String getAnimalName() {
        return getAnimalName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return age == bird.age;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "age = " + age +
                ", name='" + name + '\'' +
                ", bornYear=" + bornYear +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                '}';
    }
}
