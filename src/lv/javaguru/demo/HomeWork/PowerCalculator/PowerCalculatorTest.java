package lv.javaguru.demo.HomeWork.PowerCalculator;

import lv.javaguru.demo.HomeWork.NumberService.NumberService;

public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatortests = new PowerCalculatorTest();
        powerCalculatortests.test1();
        powerCalculatortests.test2();
        powerCalculatortests.test3();

    }

    public void test1() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int expectedResult = 8;
        int actualResult = powerCalculator.pow(2, 3);
        check(actualResult, expectedResult, "test1");
    }

    public void test2() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int expectedResult = 16;
        int actualResult = powerCalculator.pow(4, 2);
        check(actualResult, expectedResult, "test2");
    }

    public void test3() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int expectedResult = 4;
        int actualResult = powerCalculator.pow(-2, 2);
        check(actualResult, expectedResult, "test3");
    }

    public void check(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }
}
