package lv.javaguru.demo.HomeWork.Animal;

import java.util.Objects;

public class Dog extends Mammal {
    private String breedOfDog;

    public Dog(String name, int bornYear, String placeOfBirth, String color, String breedOfDog) {
        super(name, bornYear, placeOfBirth, color);
        this.breedOfDog = breedOfDog;
    }

    public String getAnimalName() {
        return "Dog";
    }

    @Override
    public boolean equals(Object o) {
        if (this instanceof Animal && o instanceof Animal && this instanceof Mammal && o instanceof Mammal) return true;
        return false;
    }

    @Override
    public String toString() {
        return getAnimalName() + ": \n" +
                "name = " + name + ", \n" +
                "breed of dog = " + breedOfDog + ", \n" +
                "color = " + color + ", \n" +
                "born year = " + bornYear + " year(s), \n" +
                "place of birth = " + placeOfBirth;
    }
}
