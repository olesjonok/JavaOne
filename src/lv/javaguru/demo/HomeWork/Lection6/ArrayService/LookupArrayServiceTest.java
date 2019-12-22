package lv.javaguru.demo.HomeWork.Lection6.ArrayService;

public class LookupArrayServiceTest {
    public static void main(String[] args) {
        LookupArrayServiceTest lookupArrayServiceTest = new LookupArrayServiceTest();
        lookupArrayServiceTest.testOne();
        lookupArrayServiceTest.testTwo();
    }

    public void testOne() {
        LookupArrayService lookupArrayService = new LookupArrayService();
        int[] numbers = {21, 51, 32, 86};
        int max = lookupArrayService.findMax(numbers);
        if (max == 86) {
            System.out.println("test One ok");
        } else {
            System.out.println("test One NOT ok");
        }
    }

    public void testTwo() {
        LookupArrayService lookupArrayService = new LookupArrayService();
        int[] numbers = {100, 51, 32, 86};
        int max = lookupArrayService.findMax(numbers);
        if (max == 51) {
            System.out.println("test One ok");
        } else {
            System.out.println("test One NOT ok");
        }
    }

}
