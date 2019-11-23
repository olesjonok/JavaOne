package lv.javaguru.demo.HomeWork.Animal;

import java.util.Objects;

public class Mammal extends Animal {
    protected String color;

    public Mammal(String name, int bornYear, String placeOfBirth, String color) {
        super(name, bornYear, placeOfBirth);
        this.color = color;
    }

    public String getAnimalName() {
        return getAnimalName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return Objects.equals(color, mammal.color);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "color='" + color + '\'' +
                ", name='" + getAnimalName() + '\'' +
                ", bornYear=" + bornYear +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                '}';
    }
}
