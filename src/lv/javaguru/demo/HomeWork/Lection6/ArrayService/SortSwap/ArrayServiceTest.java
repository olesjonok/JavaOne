package lv.javaguru.demo.HomeWork.Lection6.ArrayService.SortSwap;

import java.util.Arrays;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest tests = new ArrayServiceTest();
        tests.test1sort();
        tests.test2sort();
        tests.test1swap();
        tests.test2swap();
    }

    public void test1sort() {
        int[] actualResult = {4, 7, 2, 3, 8, 9, 5, 1, 6};
//        System.out.println(Arrays.toString(actualResult));
        ArrayService svc = new ArrayService();
        svc.sort(actualResult);
//        System.out.println(Arrays.toString(actualResult));
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        boolean areEqual = Arrays.equals(actualResult, expectedResult);
        if (areEqual) {
            System.out.println("Test1 has passed!!");
        } else {
            System.out.println("Test1 hasn't passed!!");
        }
    }

    public void test2sort() {
        int[] actualResult = {1, 3, 8, 5, 4, 7, 9, 6, 2};
//        System.out.println(Arrays.toString(actualResult)); //[1, 3, 8, 5, 4, 7, 9, 6, 2]
        ArrayService svc = new ArrayService();
        svc.sort(actualResult);
//        System.out.println(Arrays.toString(actualResult)); //[1, 2, 3, 4, 5, 6, 7, 8, 9]
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        boolean areEqual = Arrays.equals(actualResult, expectedResult);
        if (areEqual) {
            System.out.println("Test2 has passed!!");
        } else {
            System.out.println("Test2 hasn't passed!!");
        }
    }

    public void test1swap() {
        int[] actualResult = {4, 7, 2, 3, 8, 9, 5, 1, 6};
        ArrayService svc = new ArrayService();
        svc.swap(actualResult);
        int[] expectedResult = {6, 1, 5, 9, 8, 3, 2, 7, 4};

        boolean areEqual = Arrays.equals(actualResult, expectedResult);
        if (areEqual) {
            System.out.println("Test3 has passed!!");
        } else {
            System.out.println("Test3 hasn't passed!!");
        }
    }

    public void test2swap() {
        int[] actualResult = {1, 3, 8, 5, 4, 7, 9, 6, 2};
        ArrayService svc = new ArrayService();
        svc.swap(actualResult);
        int[] expectedResult = {2, 6, 9, 7, 4, 5, 8, 3, 1};

        boolean areEqual = Arrays.equals(actualResult, expectedResult);
        if (areEqual) {
            System.out.println("Test3 has passed!!");
        } else {
            System.out.println("Test3 hasn't passed!!");
        }
    }

}
