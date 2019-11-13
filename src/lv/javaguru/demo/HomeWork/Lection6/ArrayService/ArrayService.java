package lv.javaguru.demo.HomeWork.Lection6.ArrayService;

import java.util.Random;

public class ArrayService {
    public int[] create(int size) {
        int[] allCreate = new int[size];
        return allCreate;
    }

    public void fillRandomly(int[] numbers) {
        Random randomGenerator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomGenerator.nextInt(100);
        }
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public double avg(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        if (array.length == 0) {
            return 0;
        } else {
            return sum / array.length;
        }
    }
}
