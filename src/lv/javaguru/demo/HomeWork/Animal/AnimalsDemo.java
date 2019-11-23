package lv.javaguru.demo.HomeWork.Animal;

public class AnimalsDemo {
    public static void main(String[] args) {
        Animal dog = new Dog("Leta", 2008, "Latvia", "white", "Yorkshire");
        Animal dogTwo = new Dog("Leta", 2019, "Russia", "red", "Yorkshire");
        Animal cat = new Cat("Mika", 2017, "Latvia", "black", "English");
        Animal catTwo = new Cat("Oreo", 2016, "Latvia", "grey", "Russian blue");
        Animal parrot = new Parrot("Popka", 2018, "Africa", 1, "male");
        Parrot parrot1 = new Parrot("Popka", 2018, "Africa", 1, "male");
        parrot1.changeName("Kesha");

        System.out.println(dog);
        System.out.println(" ");
        System.out.println(dogTwo);
        System.out.println("Dogs is Animal and Mammal subclass? It is " + dog.equals(dogTwo));
        System.out.println(" ");
        System.out.println(cat);
        System.out.println(" ");
        System.out.println(catTwo);
        System.out.println("Cats is Animal and Mammal subclass? It is " + cat.equals(catTwo));
        System.out.println("Cats is Animal and Bird subclass? It is " + cat.equals(parrot));
        System.out.println(" ");
        System.out.println(parrot);
        System.out.println(" ");
        System.out.println(parrot1);
        System.out.println("Parrots is Animal and Bird subclass? It is " + parrot.equals(parrot1));
        System.out.println("Parrots is Animal and Mammal subclass? It is " + parrot.equals(cat));
    }
}
