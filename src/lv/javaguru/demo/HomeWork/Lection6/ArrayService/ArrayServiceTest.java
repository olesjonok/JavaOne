package lv.javaguru.demo.HomeWork.Lection6.ArrayService;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.testOne();
        arrayServiceTest.testTwo();
        arrayServiceTest.testThree();
        arrayServiceTest.testFour();
        arrayServiceTest.testFive();

    }

    public void testOne() {
        ArrayService arrayService = new ArrayService();
        int[] newArray = arrayService.create(3);
        int length = newArray.length;
        int expectedResult = 3;
        check(length, expectedResult, "Test1");
    }

    public void testTwo() {
        ArrayService arrayService = new ArrayService();
        int[] numbers = new int[1];
        arrayService.fillRandomly(numbers);
        boolean right = true;
        for (int number : numbers) {
            if (number >= 0 && number <= 100) {
                right = true;
            } else {
                right = false;
            }
        }
        if (right) {
            System.out.println("Test2 has passed!");
        } else {
            System.out.println("Test2 hasn't passed!");
        }
    }

    public void testThree() {
        int[] array = { 1, 3, -7, 2, 8, 23, 21, 54, 4, 5 };
        ArrayService arrayService = new ArrayService();
        arrayService.printArray(array);
        if (array != null) {
            System.out.println("Test3 has passed!");
        } else {
            System.out.println("Test3 hasn't passed!");
        }
    }

    public void testFour() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 4};
        int sum = arrayService.sum(array);
        int expectedResult = 7;
        check(sum, expectedResult, "Test4");
    }

    public void testFive() {
        ArrayService arrayService = new ArrayService();
        int[] actualResult = {3, 4};
        double actualResult2 = arrayService.avg(actualResult);
        double expectedResult = 3.5;

        checkDouble(actualResult2, expectedResult, "Test5");
    }

    public void checkDouble(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
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
