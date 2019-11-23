package lv.javaguru.demo.HomeWork.Animal;

import java.util.Objects;

public class Cat extends Mammal {
    private String breedOfCat;

    public Cat(String name, int bornYear, String placeOfBirth, String color, String breedOfCat) {
        super(name, bornYear, placeOfBirth, color);
        this.breedOfCat = breedOfCat;
    }

    public String getAnimalName() {
        return "Cat";
    }

    @Override
    public boolean equals(Object o) {
        if (this instanceof Animal && o instanceof Animal && this instanceof Mammal && o instanceof Mammal) return true;
        return false;
    }

    @Override
    public String toString() {
        return getAnimalName() + ": \n" +
                "breed of cat = " + breedOfCat + ", \n" +
                "color = " + color + ", \n" +
                "name = " + name + ", \n" +
                "born year = " + bornYear + " year, \n" +
                "place of birth = " + placeOfBirth;
    }
}
