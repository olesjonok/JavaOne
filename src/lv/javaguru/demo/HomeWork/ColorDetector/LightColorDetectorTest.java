package lv.javaguru.demo.HomeWork.ColorDetector;

public class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest allTests = new LightColorDetectorTest();
        allTests.test1();
        allTests.test2();
        allTests.test3();
    }

    public void test1() {
        LightColorDetector victim = new LightColorDetector();
        int inputString = 450;
        String expectedResult = "Blue";
        String actualResult = victim.detect(inputString);
        check(actualResult, expectedResult, "Test 1");
    }

    public void test2() {
        LightColorDetector victim = new LightColorDetector();
        int inputString = 571;
        String expectedResult = "Yellow";
        String actualResult = victim.detect(inputString);
        check(actualResult, expectedResult, "Test 2");
    }

    public void test3() {
        LightColorDetector victim = new LightColorDetector();
        int inputString = 800;
        String expectedResult = "Invisible Light";
        String actualResult = victim.detect(inputString);
        check(actualResult, expectedResult, "Test 3");
    }

    private void check(String actualResult, String expectedResult, String testName) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Actual result was: " + actualResult + " expected: " + expectedResult);
        }
    }

}