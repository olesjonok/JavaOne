package lv.javaguru.demo;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(101);
        System.out.println("Random integer " + randomNumber);
    }
}
