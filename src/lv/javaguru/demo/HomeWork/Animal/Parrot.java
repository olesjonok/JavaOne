package lv.javaguru.demo.HomeWork.Animal;

import java.util.Objects;

public class Parrot extends Bird {
    private String gender;

    public Parrot(String name, int bornYear, String placeOfBirth, int age, String gender) {
        super(name, bornYear, placeOfBirth, age);
        this.gender = gender;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public String getAnimalName() {
        return "Parrot";
    }

    @Override
    public boolean equals(Object o) {
        if (this instanceof Animal && o instanceof Animal && this instanceof Bird && o instanceof Bird) return true;
        return false;
    }

    @Override
    public String toString() {
        return getAnimalName() + " :\n" +
                "gender = " + gender + ", \n" +
                "age = " + age + " year(s), \n" +
                "name = " + name + ", \n" +
                "born year = " + bornYear + " year, \n" +
                "place of birth = " + placeOfBirth;
    }
}
