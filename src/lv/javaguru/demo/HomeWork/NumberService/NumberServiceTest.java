package lv.javaguru.demo.HomeWork.NumberService;

public class NumberServiceTest {
    public static void main(String[] args) {
        NumberServiceTest checkTests = new NumberServiceTest();
        checkTests.test1();
        checkTests.test2();
        checkTests.test3();
        checkTests.test4();
    }

    public void test1() {
        NumberService numbers = new NumberService();
        int expectedResult = 21;
        int actualResult = numbers.rangeSum(1, 6);
        check(actualResult, expectedResult, "test1");
    }

    public void test2() {
        NumberService numbers = new NumberService();
        int expectedResult = 5;
        int actualResult = numbers.rangeEvenCount(10, 1);
        check(actualResult, expectedResult, "test2");
    }

    public void test3() {
        NumberService numbers = new NumberService();
        int expectedResult = 6;
        int actualResult = numbers.rangeSum(3, 1);
        check(actualResult, expectedResult, "test3");
    }

    public void test4() {
        NumberService numbers = new NumberService();
        int expectedResult = 3;
        int actualResult = numbers.rangeEvenCount(1, 6);
        check(actualResult, expectedResult, "test4");
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
