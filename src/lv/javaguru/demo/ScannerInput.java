package lv.javaguru.demo;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number");
        int inputNumber = sc.nextInt();
        switch (inputNumber) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
