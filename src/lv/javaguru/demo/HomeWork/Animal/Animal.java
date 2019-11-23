package lv.javaguru.demo.HomeWork.Animal;

import java.util.Objects;

public class Animal {
    protected String name;
    protected int bornYear;
    protected String placeOfBirth;

    public Animal(String name, int bornYear, String placeOfBirth) {
        this.name = name;
        this.bornYear = bornYear;
        this.placeOfBirth = placeOfBirth;
    }

    public String getAnimalName() {
        return getAnimalName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return bornYear == animal.bornYear &&
                Objects.equals(name, animal.name) &&
                Objects.equals(placeOfBirth, animal.placeOfBirth);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", bornYear=" + bornYear +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                '}';
    }
}
